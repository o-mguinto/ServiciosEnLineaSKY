package mx.com.sky.sel.services.promociones;

import java.io.Serializable;

import java.math.BigInteger;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.services.beans.promociones.Pais;
import mx.com.sky.sel.services.beans.promociones.Promocion;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.ConsultaPaises;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types.ConsultaPaisesProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types.ConsultaPaisesProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.ConsultaPaises_Service;
import mx.com.sky.sel.proxyclients.pagweb.admonpromos.AdmonPromociones;
import mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.AdmonPromocionesProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.AdmonPromocionesProcessResponse;
import mx.com.sky.sel.proxyclients.pagweb.admonpromos.AdmonPromociones_Service;
import mx.com.sky.sel.proxyclients.selinterface.consultarcuentaacthd.ConsultarCuentaActHdSelInterface;
import mx.com.sky.sel.proxyclients.selinterface.consultarcuentaacthd.ConsultarCuentaActHdSelInterfaceEp;
import mx.com.sky.enterpriseobjects.soa.consultarcuentaacthdinterface.ConsultarCuentaActHdRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.consultarcuentaacthdinterface.ConsultarCuentaActHdResponseEBMType;
import mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio.CertificaConcesionBeneficioInputMessageType;
import mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio.CertificaConcesionBeneficioRequestEBMType;
import mx.com.sky.enterpriseflowmessage.sel.certificaconcesionbeneficio.CertificaConcesionBeneficioResponseEBMType;
import mx.com.sky.sel.proxyclients.selebf.certificaconcesionbeneficio.CertificaConcesionBeneficioSelEBF;
import mx.com.sky.sel.proxyclients.selebf.certificaconcesionbeneficio.CertificaConcesionBeneficioSelEBFEp;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


public class ServicioPromocion implements Serializable {
    @SuppressWarnings("compatibility:-2233921217855890814")
    private static final long serialVersionUID = -1235122769653394557L;

    public ServicioPromocion() {
        super();
    }

    public List<Pais> obtenerPaises() {
        List<Pais> paises = new ArrayList<Pais>();
        Pais pais = null;
        ConsultaPaises_Service consultaPaises_Service;
        ConsultaPaises consultaPaises = null;
        ConsultaPaisesProcessRequest payload;
        ConsultaPaisesProcessResponse response = null;
        try {
            consultaPaises_Service = new ConsultaPaises_Service();
            consultaPaises = consultaPaises_Service.getConsultaPaises();

            payload = new ConsultaPaisesProcessRequest();
            response = consultaPaises.process(payload);
            if (response != null) {
                for (mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types.Pais object : response.getListaPaises().getPais()) {
                    pais = new Pais();
                    pais.setIdPais(object.getIdPais());
                    pais.setOrganizationId(object.getOrgIdSiebel());
                    pais.setNombre(object.getNombre());
                    paises.add(pais);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return paises;
    }

    public List<Promocion> obtenerPromociones(String organizationId) {
        List<Promocion> promociones = null;
        promociones = consultarPromociones("ALL", organizationId, false);
        return promociones;
    }

    public List<Promocion> obtenerPromocionesPais(String organizationId) {
        List<Promocion> promociones = null;
        promociones = consultarPromociones("COUNTRY", organizationId, false);
        return promociones;
    }

    public List<Promocion> obtenerPromocionesActivas(String organizationId, boolean vetv, boolean isPopUp) {
        List<Promocion> promociones = null;
        promociones = consultarPromociones("ACTIVE_ON_DATE", organizationId, vetv);
        return promociones;
    }

    public List<Promocion> obtenerPromocionesActivasLogin() {
        List<Promocion> promociones = null;
        promociones = consultarPromociones("ACTIVE_ON_DATE_LOGIN", null, false);
        return promociones;
    }

    public List<Promocion> obtenerPromocionesActivasAdmon(String organizationId) {
        List<Promocion> promociones = null;
        Promocion promocionDefault = null;
        promociones = consultarPromociones("ACTIVE", organizationId, false);
        return promociones;
    }
    public boolean consultaPromocionPreciosTyAHD(String cuentaSKY){
        boolean respuesta = false;
        ConsultarCuentaActHdSelInterfaceEp ConsultarCuentaActHdSelInterfaceEp = new ConsultarCuentaActHdSelInterfaceEp();
    ConsultarCuentaActHdSelInterface consultarCuentaActHdSelInterface = ConsultarCuentaActHdSelInterfaceEp.getConsultarCuentaActHdSelInterfacePt();
      ConsultarCuentaActHdRequestEBMType request = new ConsultarCuentaActHdRequestEBMType();
      ConsultarCuentaActHdResponseEBMType response = null;
      mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType header = new mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType();
      header.setOperacion("ConsultarCuentaActHd");
      header.setSistemaOrigen("SEL");
      request.setEBMHeaderRequest(header);
      request.setNumeroCuenta(cuentaSKY);
      response = consultarCuentaActHdSelInterface.consultarPromoActCuentaHd(request);
      if (response != null && response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
       if (response.getPromocionActHD().equalsIgnoreCase("Y")) {
                respuesta = true;
       }else{
            respuesta = false;
        }     
      }
      return respuesta;
    }

    private List<Promocion> consultarPromociones(String opciones, String organizationId, boolean veTV) {
        List<Promocion> promociones = new ArrayList<Promocion>();
        Promocion promocionDefault;
        AdmonPromociones_Service admonPromociones_Service;
        AdmonPromociones admonPromociones = null;
        AdmonPromocionesProcessRequest payload;
        AdmonPromocionesProcessResponse response;

        try {
            admonPromociones_Service = new AdmonPromociones_Service();
            admonPromociones = admonPromociones_Service.getAdmonPromociones();
            payload = new AdmonPromocionesProcessRequest();
            if (opciones.equalsIgnoreCase("ALL")) {
                payload.setCodOperacion("1");
            } else if (opciones.equalsIgnoreCase("COUNTRY")) {
                payload.setCodOperacion("2");
            } else if (opciones.equalsIgnoreCase("ACTIVE_ON_DATE")) {
                // Regresa las promociones ACTIVAS que esten VIGENTES
                // Toma en cuenta el FLAG VeTV
                payload.setCodOperacion("6");
            } else if (opciones.equalsIgnoreCase("ACTIVE_ON_DATE_LOGIN")) {
                // Regresa las promociones ACTIVAS que esten VIGENTES para el LOGIN
                payload.setCodOperacion("7");
            } else {
                // Me regresa VeTV y NO VeTV ACTIVAS
                payload.setCodOperacion("5");
            }

            payload.setOrganizationId(organizationId);
            payload.setVeTV(veTV ? "Y" : "N");
            response = admonPromociones.process(payload);
            if (response != null) {
                for (mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.Promocion object : response.getListaPromociones().getPromocion()) {
                    promocionDefault = convert(object);
                    promociones.add(promocionDefault);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return promociones;
    }

    public Promocion agregarPromocion(Promocion promocion) {
        promocion = procesarAccion("INSERT", promocion);
        return promocion;
    }

    public Promocion actualizarPromocion(Promocion promocion) {
        promocion = procesarAccion("UPDATE", promocion);
        return promocion;
    }


    private Promocion procesarAccion(String accion, Promocion promocion) {
        AdmonPromociones_Service admonPromociones_Service;
        AdmonPromociones admonPromociones = null;
        AdmonPromocionesProcessRequest payload;
        AdmonPromocionesProcessResponse response;
        mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.Promocion promocionWS = null;

        try {
            admonPromociones_Service = new AdmonPromociones_Service();
            admonPromociones = admonPromociones_Service.getAdmonPromociones();
            payload = new AdmonPromocionesProcessRequest();
            if (accion.equalsIgnoreCase("INSERT")) {
                payload.setCodOperacion("3");
            } else {
                payload.setCodOperacion("4");
            }
            promocionWS = convert(promocion);
            payload.setPromocion(promocionWS);
            response = admonPromociones.process(payload);
        } catch (Exception e) {
            LogServicios.printlnError(e);
        }
        return promocion;
    }

    private Promocion convert(mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.Promocion promocionWS) {
        Promocion promocion = new Promocion();

        promocion.setDescripcion(promocionWS.getDescripcion());
        promocion.setFechaActualizacion(JavaUtils.asTimestamp(promocionWS.getFechaActualizacion()));
        promocion.setFechaCreacion(JavaUtils.asTimestamp(promocionWS.getFechaCreacion()));
        promocion.setFechaInicio(JavaUtils.asTimestamp(promocionWS.getFechaInicio()));
        promocion.setFechaFin(JavaUtils.asTimestamp(promocionWS.getFechaFin()));
        promocion.setHabilitada(promocionWS.getHabilitada().equalsIgnoreCase("Y"));
        promocion.setId(promocionWS.getIdPromocion());
        promocion.setIdPais(promocionWS.getIdPais());
        promocion.setImagen(promocionWS.getImagen());
        promocion.setNombre(promocionWS.getNombre());
        promocion.setPopUp(promocionWS.getPopUp().equalsIgnoreCase("Y"));
        promocion.setCarrusel(promocionWS.getCarrusel().equalsIgnoreCase("Y"));
        promocion.setVetv(promocionWS.getVeTV().equalsIgnoreCase("Y"));
        promocion.setLogin(promocionWS.getLogin().equalsIgnoreCase("Y"));


        return promocion;
    }


    private mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.Promocion convert(Promocion promocionWS) {

        mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.Promocion promocion = new mx.com.sky.sel.proxyclients.pagweb.admonpromos.types.Promocion();

        Timestamp fechaInicio = promocionWS.getFechaInicio();
        Timestamp fechaFin = promocionWS.getFechaFin();

        promocion.setDescripcion(promocionWS.getDescripcion());
        promocion.setHabilitada(promocionWS.getHabilitada() ? "Y" : "N");
        promocion.setIdPromocion(promocionWS.getId());
        promocion.setIdPais(promocionWS.getIdPais());
        promocion.setImagen(promocionWS.getImagen());
        promocion.setNombre(promocionWS.getNombre());
        promocion.setPopUp(promocionWS.getPopUp() ? "Y" : "N");
        promocion.setCarrusel(promocionWS.getCarrusel() ? "Y" : "N");
        promocion.setVeTV(promocionWS.getVetv() ? "Y" : "N");
        promocion.setLogin(promocionWS.isLogin() ? "Y" : "N");

        if (fechaInicio != null) {
            promocion.setFechaInicio(JavaUtils.asXMLGregorianCalendar(fechaInicio));
        }
        if (fechaFin != null) {
            promocion.setFechaFin(JavaUtils.asXMLGregorianCalendar(fechaFin));
        }
        return promocion;
    }
    public String validaPromocionVeTVActualizaDatos(String numeroCuenta) {
        String respuesta = "";
        try {
            CertificaConcesionBeneficioSelEBFEp CertificaConcesionBeneficioSelEBFEp;
            CertificaConcesionBeneficioSelEBFEp = new CertificaConcesionBeneficioSelEBFEp();
            CertificaConcesionBeneficioSelEBF certificaConcesionBeneficioSelEBF = CertificaConcesionBeneficioSelEBFEp.getCertificaConcesionBeneficioSelEBFPt();
            CertificaConcesionBeneficioRequestEBMType request = new CertificaConcesionBeneficioRequestEBMType();
            CertificaConcesionBeneficioResponseEBMType response = new CertificaConcesionBeneficioResponseEBMType();
            EBMHeaderRequestType header = new EBMHeaderRequestType();
            CertificaConcesionBeneficioInputMessageType input = new CertificaConcesionBeneficioInputMessageType();
            header.setOperacion("certificaConcesionBeneficio");
            header.setSistemaOrigen("WebSEL");
            request.setEBMHeaderRequest(header);
            input.setProceso("Recoleccion Datos");
            input.setCuenta(new BigInteger(numeroCuenta));
            input.setProceso("1");
            request.setCertificaConcesionBeneficioInputMessage(input);
            response = certificaConcesionBeneficioSelEBF.certificaConcesionBeneficio(request);
            respuesta = response.getEBMHeaderResponse().getErrorNegocio().getCodigoError();
            /*if (response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                respuesta = true;
            }else{
                respuesta = false;    
            }*/
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }
}
