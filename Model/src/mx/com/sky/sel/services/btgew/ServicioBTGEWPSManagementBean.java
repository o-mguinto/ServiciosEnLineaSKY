package mx.com.sky.sel.services.btgew;

import java.io.Serializable;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.btgew.activacion.BTGEWActivacion;
import mx.com.sky.sel.proxyclients.btgew.activacion.BtgewActivacionClientEp;
import mx.com.sky.sel.proxyclients.btgew.activacion.types.BtgewActivacionInType;
import mx.com.sky.sel.proxyclients.btgew.activacion.types.BtgewActivacionOutType;
import mx.com.sky.sel.proxyclients.pagweb.admonbtgew.AdmonBTGEW;
import mx.com.sky.sel.proxyclients.pagweb.admonbtgew.AdmonbtgewClientEp;
import mx.com.sky.sel.proxyclients.pagweb.admonbtgew.types.AdmonBTGEWINType;
import mx.com.sky.sel.proxyclients.pagweb.admonbtgew.types.AdmonBTGEWOUTType;
import mx.com.sky.sel.proxyclients.pagweb.admonbtgew.types.BTGEWElementType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatmpbtgew.ConsultaTMPBTGEW;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatmpbtgew.ConsultatmpBtgewClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatmpbtgew.types.TmpBTGEWINType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatmpbtgew.types.TmpBTGEWOUTType;
import mx.com.sky.sel.services.beans.btgew.ActivacionBean;
import mx.com.sky.sel.services.beans.btgew.BTGEWElement;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.JavaUtils;


@Stateless(name = "ServicioBTGEWPSManagement", mappedName = "SEL-ServicioBTGEWPSManagement")
public class ServicioBTGEWPSManagementBean implements Serializable, ServicioBTGEWPSManagement, ServicioBTGEWPSManagementLocal {
    @SuppressWarnings("compatibility:8207471278899693485")
    private static final long serialVersionUID = 7394777067733714212L;
    @Resource
    SessionContext sessionContext;
    
        public ServicioBTGEWPSManagementBean() {
        }

        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public List<BTGEWElement> consultarAll() {
            List<BTGEWElement> elementos = null;
            try {
                elementos = procesarOperacion("3", "", "", null);
            } catch (ServicioException e) {
                elementos = new ArrayList<BTGEWElement>();
            }
            return elementos;
        }
        
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public List<BTGEWElement> consultarLoginCarrusel() {
            List<BTGEWElement> elementos = null;
            
            try {
                elementos = procesarOperacion("4", "", "", null);
            } catch (ServicioException e) {
                elementos = new ArrayList<BTGEWElement>();
            }
            return elementos;
        }
        
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public List<BTGEWElement> consultarActivasParametros(String paisISO, String tipoCuenta, String paquete, String vetv) {
            List<BTGEWElement> elementos = null;
            BTGEWElement element = new BTGEWElement();
            try {
                element.setPaquete(paquete);
                element.setTipoCuenta(tipoCuenta);
                element.setVetv(vetv);
                elementos = consultarActivasParametros(paisISO, element);
            } catch (ServicioException e) {
                elementos = new ArrayList<BTGEWElement>();
            }
            return elementos;
        }
        
        
        public List<BTGEWElement> consultarActivasParametros(String paisISO, BTGEWElement parametros) throws ServicioException {
            List<BTGEWElement> elementos = null;
            elementos = procesarOperacion("5", "", paisISO, parametros);
            return elementos;
        }
    
    
    public void insert(BTGEWElement element) throws ServicioException {
        procesarOperacion("1", "", "", element);
    }

    public void update(BTGEWElement element) throws ServicioException {
        procesarOperacion("2", "", "", element);
    }

    public void delete(String usernameElimino, BTGEWElement element) throws ServicioException {
        procesarOperacion("6", usernameElimino, "", element);
    }
    
    
    private List<BTGEWElement> procesarOperacion(String operacion, String usernameElimino, String paisISO, BTGEWElement element) throws ServicioException {
        List<BTGEWElement> elementosRespuesta = new ArrayList<BTGEWElement>();
        BTGEWElement elementTMP = null;
        AdmonbtgewClientEp admonbtgew_client_ep = null;
        AdmonBTGEW admonBTGEW = null;
        AdmonBTGEWINType input = null;
        BTGEWElementType btgewElementType = null;
        AdmonBTGEWOUTType response = null;
        try {
            admonbtgew_client_ep = new AdmonbtgewClientEp();
            admonBTGEW = admonbtgew_client_ep.getAdmonBTGEWPt();
            input = new AdmonBTGEWINType();
            input.setOperacion(operacion);
            input.setPaisISO(paisISO);
            input.setUserNameElimina(usernameElimino);
            if (element == null) {
                btgewElementType = new BTGEWElementType();
            } else {
                btgewElementType = convert(element);
            }
            input.setBTGEWElement(btgewElementType);
            response = admonBTGEW.process(input);
            if (response == null) {
                throw new ServicioException("Error al ejecutar el servicio AdmonBTGEW_pt");
            } else if (response.getResultado() == null) {
                throw new ServicioException("Error al procesar el servicio");
            } else if (!response.getResultado().equalsIgnoreCase("0")) {
                throw new ServicioException(response.getResultadodesc());
            }

            for (BTGEWElementType bTGEWElementType : response.getBTGEWs()) {
                elementTMP = convert(bTGEWElementType);
                elementosRespuesta.add(elementTMP);
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException(e.getMessage());
        }
        return elementosRespuesta;
    }


    /**
     * C\u00F3digo que se uÂ´so para dar permisos por BD a una cuenta para ver los men\u00FAs de BTGVEW y VEO
     * @param cuentaSKY
     * @return
     */
    public boolean permitirMenuBTGEW(String cuentaSKY) {
        boolean permiso = false;
        ConsultatmpBtgewClientEp consultatmp_btgew_client_ep = null;
        ConsultaTMPBTGEW consultaTMP_BTGEW = null;
        TmpBTGEWINType input = null;
        TmpBTGEWOUTType response = null;
        try {
            consultatmp_btgew_client_ep = new ConsultatmpBtgewClientEp();
            consultaTMP_BTGEW = consultatmp_btgew_client_ep.getConsultaTMPBTGEWPt();

            input = new TmpBTGEWINType();
            input.setCuentaSKY(cuentaSKY);
            response = consultaTMP_BTGEW.process(input);
            LogServicios.println(this, response.getRespuesta());
            if (response.getRespuesta().equalsIgnoreCase("0")) {
                if (response.getConsultaPWTEMPBTGEWOutput().size() > 0) {
                    permiso = true;
                }
            }
        } catch (Exception e) {
            permiso = false;
        }
        return permiso;
    }
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String activarServiciosHOTGO(ActivacionBean activacionBean) {
        BtgewActivacionClientEp btgew_activacion_client_ep = null;
        BTGEWActivacion bTGEW_Activacion = null;
        BtgewActivacionInType input = null;
        BtgewActivacionOutType response = null;
        try {
            btgew_activacion_client_ep = new BtgewActivacionClientEp();
            bTGEW_Activacion = btgew_activacion_client_ep.getBTGEWActivacionPt();
            input = new BtgewActivacionInType();
            input.setCuentaSKY(activacionBean.getCuentaSKY());
            input.setOTT(activacionBean.getOtt());
            input.setPaqueteSKY(activacionBean.getPaqueteSKY());
            input.setVEO(activacionBean.getVeo());
            input.setProducto(activacionBean.getProducto());
            input.setEnviaASiebel(true);
            input.setIntento(0);
            input.setPasoBpel(1);
            //input.setNombreProductoSiebel("HTGO1");
            input.setNumeroSs("");
            input.setOrigen("SEL");
            //se agrega idSesion
            input.setIdSesion(activacionBean.getIdSesion());

            response = bTGEW_Activacion.process(input);
            LogServicios.println(this, "response " + response);
            LogServicios.println(this, "response " + response.getRespuesta());
            LogServicios.println(this, "response " + response.getRespuestaCode());
            return response.getRespuesta();
        } catch (Exception e) {
            LogServicios.println(this, e);
            return "1";
        }
    }
    public String activarServicios(ActivacionBean activacionBean) {
        BtgewActivacionClientEp btgew_activacion_client_ep = null;
        BTGEWActivacion bTGEW_Activacion = null;
        BtgewActivacionInType input = null;
        BtgewActivacionOutType response = null;
        try {
            btgew_activacion_client_ep = new BtgewActivacionClientEp();
            bTGEW_Activacion = btgew_activacion_client_ep.getBTGEWActivacionPt();
            input = new BtgewActivacionInType();
            input.setCuentaSKY(activacionBean.getCuentaSKY());
            input.setOTT(activacionBean.getOtt());
            input.setPaqueteSKY(activacionBean.getPaqueteSKY());
            input.setVEO(activacionBean.getVeo());
            input.setProducto(activacionBean.getProducto());
            input.setEnviaASiebel(true);
            input.setIntento(0);
            input.setPasoBpel(1);
            input.setNombreProductoSiebel("");
            input.setNumeroSs("");
            input.setOrigen("SEL-");
            //se agrega idSesion
            input.setIdSesion(activacionBean.getIdSesion());

            response = bTGEW_Activacion.process(input);
            LogServicios.println(this, "response " + response);
            LogServicios.println(this, "response " + response.getRespuesta());
            LogServicios.println(this, "response " + response.getRespuestaCode());
            return response.getRespuesta();
        } catch (Exception e) {
            LogServicios.println(this, e);
            return "1";
        }
    }

    private BTGEWElementType convert(BTGEWElement element) {
        BTGEWElementType elemento = new BTGEWElementType();
        elemento.setCarruselLogin(element.getCarruselLogin());
        elemento.setDescripcion(element.getDescripcion());
        elemento.setFechaActualizacion(JavaUtils.asXMLGregorianCalendar(element.getFechaActualizacion()));
        elemento.setFechaCreacion(JavaUtils.asXMLGregorianCalendar(element.getFechaCreacion()));
        elemento.setFechaFin(JavaUtils.asXMLGregorianCalendar(element.getFechaFin()));
        elemento.setFechaInicio(JavaUtils.asXMLGregorianCalendar(element.getFechaInicio()));

        elemento.setHabilitada(element.getHabilitada());
        if (element.getId() == null) {
            elemento.setId(null);
        } else {
            elemento.setId(new BigDecimal(element.getId()));
        }
        if (element.getIdPais() == null) {
            elemento.setIdPais(null);
        } else {
            elemento.setIdPais(new BigDecimal(element.getIdPais()));
        }
        elemento.setImagen(element.getImagen());
        elemento.setLink(element.getLink());
        elemento.setLinkActivo(element.getLinkActivo());
        elemento.setNombre(element.getNombre());
        elemento.setPaquete(element.getPaquete());
        elemento.setTipoCuenta(element.getTipoCuenta());
        elemento.setUsernameCreador(element.getUsernameCreador());
        elemento.setUsernameModificador(element.getUsernameModificador());
        elemento.setVetv(element.getVetv());
        return elemento;
    }

    private BTGEWElement convert(BTGEWElementType bTGEWElementType) {
        BTGEWElement elemento = new BTGEWElement();

        elemento.setCarruselLogin(bTGEWElementType.getCarruselLogin());
        elemento.setDescripcion(bTGEWElementType.getDescripcion());
        elemento.setFechaActualizacion(JavaUtils.asTimestamp(bTGEWElementType.getFechaActualizacion()));
        elemento.setFechaCreacion(JavaUtils.asTimestamp(bTGEWElementType.getFechaCreacion()));
        elemento.setFechaFin(JavaUtils.asTimestamp(bTGEWElementType.getFechaFin()));
        elemento.setFechaInicio(JavaUtils.asTimestamp(bTGEWElementType.getFechaInicio()));
        elemento.setHabilitada(bTGEWElementType.getHabilitada());
        if (bTGEWElementType.getId() == null) {
            elemento.setId(null);
        } else {
            elemento.setId(bTGEWElementType.getId().intValue());
        }
        if (bTGEWElementType.getIdPais() == null) {
            elemento.setIdPais(null);
        } else {
            elemento.setIdPais(bTGEWElementType.getIdPais().intValue());
        }
        elemento.setImagen(bTGEWElementType.getImagen());
        elemento.setLink(bTGEWElementType.getLink());
        elemento.setLinkActivo(bTGEWElementType.getLinkActivo());
        elemento.setNombre(bTGEWElementType.getNombre());
        elemento.setPaquete(bTGEWElementType.getPaquete());
        elemento.setTipoCuenta(bTGEWElementType.getTipoCuenta());
        elemento.setUsernameCreador(bTGEWElementType.getUsernameCreador());
        elemento.setUsernameModificador(bTGEWElementType.getUsernameModificador());
        elemento.setVetv(bTGEWElementType.getVetv());

        return elemento;
    }
    }
