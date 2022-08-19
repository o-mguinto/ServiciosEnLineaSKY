package mx.com.sky.sel.services.datosgenerales;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.utils.Direccion;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadireccionservicio.ConsultaDireccionDeServicio;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadireccionservicio.types.ConsultaDireccionDeServicioProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadireccionservicio.types.ConsultaDireccionDeServicioProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadireccionservicio.ConsultaDireccionDeServicio_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatosgenerales.ConsultaDatosGenerales;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatosgenerales.types.ConsultaDatosGeneralesIn;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatosgenerales.types.ConsultaDatosGeneralesOut;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatosgenerales.ConsultadatosgeneralesClientEp;


public class ServicioDatosGenerales implements Serializable {
    @SuppressWarnings("compatibility:6219146203723385209")
    private static final long serialVersionUID = -2852707988089715616L;

    public ServicioDatosGenerales() {
        super();
    }

    public Suscriptor getDatosGenerales(String cuentaSKY) {
        Suscriptor suscriptor = null;
        ConsultadatosgeneralesClientEp consultaDatosGenerales_Service;
        ConsultaDatosGenerales consultaDatosGenerales = null;
        ConsultaDatosGeneralesOut response = null;
        ConsultaDatosGeneralesIn payload = null;
        LogServicios.println(this,"getDatosGenerales CuentaSKY:"+cuentaSKY);
        try {
            consultaDatosGenerales_Service = new ConsultadatosgeneralesClientEp();
            consultaDatosGenerales = consultaDatosGenerales_Service.getConsultaDatosGeneralesPt();
            payload = new ConsultaDatosGeneralesIn();
            payload.setCuentaSKY(cuentaSKY);

            response = consultaDatosGenerales.process(payload);
            LogServicios.println(this,"getDatosGenerales Response:"+response.getRespuesta()+", Descripcion: "+response.getRespuestadesc());
            suscriptor = convert(response);

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }

        
        return suscriptor;
    }

    private Suscriptor convert(ConsultaDatosGeneralesOut response) {
        Suscriptor suscriptor = null;

        suscriptor = new Suscriptor();

        suscriptor.setBillingCode(response.getBillingCode());
        suscriptor.setContactoRowId(response.getRowIdContacto());
        suscriptor.setCuentaSKY(response.getCuentaSKY());
        suscriptor.setCurrencyCode(response.getCurrencyCode());
        suscriptor.setMarketClass(response.getMarketClass());
        suscriptor.setMarketType(response.getMarketType());
        suscriptor.setOrganizationType(response.getOrganizationType());
        suscriptor.setNombreSuscriptor(response.getNombreSuscriptor());
        suscriptor.setOrganizacion(response.getOrganizacion());
        suscriptor.setPromocionActivacion(response.getPromocionActivacion());
        suscriptor.setRespuesta(response.getRespuesta());
        suscriptor.setRespuestadesc(response.getRespuestadesc());
        suscriptor.setRowId(response.getRowId());
        suscriptor.setStatusCuenta(response.getStatusCuenta());
        suscriptor.setStatusRecarga(response.getStatusRecarga());
        suscriptor.setPais(response.getPais());
        suscriptor.setDiferenciaHoraria(response.getDiferenciaHoraria());
        suscriptor.setOppv(response.getBanderaNoOPPV().equalsIgnoreCase("N"));
        suscriptor.setIppv(response.getBanderaNoIPPV().equalsIgnoreCase("N"));
        suscriptor.setEquipoHD(response.getBanderaHD().equalsIgnoreCase("Y"));
        suscriptor.setSkyModemInternet(response.getSKYMODEMINTERNET());
        suscriptor.setSkyPaqueteInternet(response.getSKYPAQUETEINTERNET());
        //se valida si viene l paquete mini se asigna tal cual regresa el servicio
        if(response.getPaquete()!= null && response.getPaquete().contains("MINI")){
            suscriptor.setPaquete(response.getPaquete());
        }else{
            if (suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV PLUS")) {
                if (suscriptor.isEquipoHD()) {
                    suscriptor.setPaquete("VETV PLUS HD");
                }else{
                   suscriptor.setPaquete("VETV PLUS");
                }
            }else if (suscriptor.getMarketType().equalsIgnoreCase("Normal VeTV")) {
                if (suscriptor.isEquipoHD()) {
                    suscriptor.setPaquete("VETV HD");
                }else{
                    suscriptor.setPaquete("VETV");
                }
            }else{
                suscriptor.setPaquete(response.getPaquete());
            }
        }
        suscriptor.setPermitePagoTC(!response.getNOTC().equalsIgnoreCase("Y"));
        suscriptor.setNumeroRecargas(response.getNUMRECARGAVETV());
        suscriptor.setRazonSocialHotel(response.getRazonSocial().trim());
        suscriptor.setRfcHotel(response.getRFC().trim());
        return suscriptor;
    }


    public Direccion obtenerDireccionEnvio(String rowID) {
        Direccion direccion = new Direccion();
        ConsultaDireccionDeServicio_Service ConsultaDireccionDeServicio_Service;
        ConsultaDireccionDeServicio ConsultaDireccionDeServicio = null;
        ConsultaDireccionDeServicioProcessRequest payload;
        ConsultaDireccionDeServicioProcessResponse resultado = null;
        ConsultaDireccionDeServicioProcessResponse.Direccion dirWS = null;

        try {

            ConsultaDireccionDeServicio_Service = new ConsultaDireccionDeServicio_Service();
            ConsultaDireccionDeServicio = ConsultaDireccionDeServicio_Service.getConsultaDireccionDeServicio();

            payload = new ConsultaDireccionDeServicioProcessRequest();
            payload.setRowId(rowID);
            resultado = ConsultaDireccionDeServicio.process(payload);
            if (resultado != null && resultado.getDireccion().size() > 0) {
                dirWS = resultado.getDireccion().get(0);
                direccion.setCalleNumero(dirWS.getDIRECCION());
                direccion.setNumeroExt(dirWS.getNOEXT());
                direccion.setColonia(dirWS.getCOLONIA());
                direccion.setCp(dirWS.getCP());
                direccion.setDelMun(dirWS.getDELEGACIONMUNICIPIO());
                direccion.setPoblacion(dirWS.getCIUDAD());
                direccion.setTelefono(dirWS.getTELEFONOENVIO());
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }


        return direccion;
    }
}
