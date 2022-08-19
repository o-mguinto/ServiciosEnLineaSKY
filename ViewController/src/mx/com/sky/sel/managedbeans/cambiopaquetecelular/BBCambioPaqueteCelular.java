package mx.com.sky.sel.managedbeans.cambiopaquetecelular;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.utils.LineaCelularDTO;
import mx.com.sky.sel.services.cambiopaquetecelular.PaqueteCelularModelDTO;
import mx.com.sky.sel.services.cambiopaquetecelular.ServicioCambioPaqueteCelular;
import mx.com.sky.sel.utils.ADFUtils;

import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;

import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;

public class BBCambioPaqueteCelular extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:1462918365143159079")
    private static final long serialVersionUID = 6235586234642672145L;

    private List<PaqueteCelularDTO> paquetesCelulares;
    private PaqueteCelularDTO paqueteCelularSeleccionado;
    private DetalleProductoDTO detalleProductoSeleccionado;
    private transient RichPopup popupConfirmacion;
    
    //Nombres productos
    private static final String BT_CEL_COMPARTE = "Blue Telecomm Cel Comparte";
    private static final String BT_CEL = "Blue Telecomm Cel";
    private static final String BT_CEL_BASICO_COMPARTE = "Blue Telecomm Cel Básico Comparte";
    private static final String BT_CEL_LITE_COMPARTE = "Blue Telecomm Cel Lite Comparte";
    private static final String COMPARTE_3 = "Comparte 3 días";
    private static final String COMPARTE_7 = "Comparte 7 días";
    private static final String COMPARTE_15 = "Comparte 15 días";
    private static final String RI_NOR_LAT_500 = "RI Norteamérica / Latinoamérica 500 MB";
    private static final String RI_NOR_LAT_1000 = "RI Norteamérica / Latinoamérica 1000 MB";
    private static final String RI_EUR_ASI_AFR_OCE_500 = "RI Europa/Asia/Africa/Oceanía 500 MB";
    private static final String RI_EUR_ASI_AFR_OCE_1000 = "RI Europa/Asia/Africa/Oceanía 1000 MB";
    private static final String RI_NOR_LAT_EUR_ASI = "RI Norteamérica/Latinoamérica/Europa/Asia";
    private static final String LD_LAT = "LD Latinoamérica";
    private static final String LD_EUR = "LD Europa";
    private static final String LD_RESTO_MUNDO_1 = "LD Resto del Mundo 1";
    private static final String LD_RESTO_MUNDO_2 = "LD Resto del Mundo 2";
    
    //Descripciones, funcionalidad y coberturas
    private static final String DESCRIPCION_PLAN_MIN_SMS_DAT = "Plan con Minutos, SMS y Datos";
    private static final String DESCRIPCION_PAQUETE_MIN_SMS_DAT = "Paquetes con Minutos, SMS y Datos";
    private static final String DESCRIPCION_PAQUETE_DAT = "Paquete de Datos para navegar";
    private static final String DESCRIPCION_PAQUETE_MIN = "Paquetes de Minutos para llamadas";
    private static final String DESCRIPCION_PAQUETE_MIN_SMS = "Paquetes con Minutos y SMS";
    private static final String FUNCIONALIDAD_COMPARTE_DATOS = "Funcionalidad Comparte Datos";
    private static final String COBERTURA_MEX_USA_CAN = "Cobertura en México, Estados Unidos y Canadá.";
    private static final String COBERTURA_NOR_LAT_NCAR = "Cobertura en Norteamérica y Latinoamérica (Excepto El Caribe).";
    private static final String COBERTURA_EUR_ASI_AFR_OCE = "Cobertura en Europa, Asia, África y Oceanía.";
    private static final String COBERTURA_NOR_LAT_NCAR_EUR_ASI = "Cobertura en Norteamérica, Latinoamérica (Excepto El Caribe), Europa y Asia.";
    private static final String COBERTURA_LAT_NCAR = "Cobertura en Latinoamérica (Excepto El Caribe).";
    private static final String COBERTURA_EUR = "Cobertura en Europa.";
    private static final String COBERTURA_REST_MUNDO = "Cobertura en Resto del Mundo.";
    
    private static final String PAIS_MEX = "Sky Mexico";
    
    public BBCambioPaqueteCelular() {
        super();
        LogPC.println(this, "***************IN BBCambioPaqueteCelular CONSTRUCTOR**************************");
        this.consultarPaquetesCelulares();
    }
    
    private void consultarPaquetesCelulares() {
        ServicioCambioPaqueteCelular servicioCambioPaqueteCel = new ServicioCambioPaqueteCelular();
        String assetNumberMasterPrincipal = null;
        List<PaqueteCelularModelDTO> paquetesCelularesServicio;
        PaqueteCelularDTO paqCelular = null;
        
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            for(LineaCelularDTO lineaCel : sesion.getSuscriptor().getLineasCelulares()) {
                if( lineaCel.isMasterPaquetePrincipal() ) {
                    assetNumberMasterPrincipal = lineaCel.getAssetNumber();
                }
            }
        }
        
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PAQUETES_CELULARES);
        
        
        paquetesCelularesServicio = servicioCambioPaqueteCel.consultarPaquetesCelulares(sesion.getCuentaSKY(), assetNumberMasterPrincipal, PAIS_MEX);
        //DUMMY
        //paquetesCelularesServicio = servicioCambioPaqueteCel.consultarPaquetesCelularesDummy(sesion.getCuentaSKY(), assetNumberMasterPrincipal);
        //DUMMY
        
        
        paquetesCelulares = new ArrayList<PaqueteCelularDTO>();
        if( paquetesCelularesServicio != null && !paquetesCelularesServicio.isEmpty() ) {
            for(PaqueteCelularModelDTO paqCelModel : paquetesCelularesServicio) {
                paqCelular = new PaqueteCelularDTO();
                
                paqCelular.setNombreProducto(paqCelModel.getNombreProductoSEL());
                paqCelular.setNombreProductoCRM(paqCelModel.getNombreProductoCRM());
                paqCelular.setDescripcion(paqCelModel.getDescripcion());
                paqCelular.setPrecio(paqCelModel.getPrecio());
                paqCelular.setMinutos(paqCelModel.getMinutos());
                paqCelular.setSms(paqCelModel.getSms());
                paqCelular.setDatos(paqCelModel.getDatos());
                paqCelular.setVigencia(paqCelModel.getVigencia());
                
                paquetesCelulares.add(paqCelular);
            }
        }
        
        //DUMMY
        //paquetesCelulares = this.generarPaquetesCelularesDummy();
        //DUMMY
    }
    
    public String showPopupPaqueteCelular() {
        String result = "ok";
        LogPC.println(this, "In showPopupPaqueteCelular method. paqueteCelularSeleccionado: " + this.paqueteCelularSeleccionado.getNombreProducto());
        this.cargarDetalleProductoSeleccionado();
        ADFUtils.showPopup(popupConfirmacion);
        return result;
    }
    
    private void cargarDetalleProductoSeleccionado() {
        if( this.paqueteCelularSeleccionado != null && this.paqueteCelularSeleccionado.getNombreProducto() != null ) {
            detalleProductoSeleccionado = new DetalleProductoDTO();
            
            if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL_COMPARTE) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL_BASICO_COMPARTE) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL_LITE_COMPARTE) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(COMPARTE_3) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(COMPARTE_7) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(COMPARTE_15) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_NOR_LAT_500) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_NOR_LAT_1000) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_EUR_ASI_AFR_OCE_500) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_EUR_ASI_AFR_OCE_1000) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_NOR_LAT_EUR_ASI) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_LAT) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_EUR) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_RESTO_MUNDO_1) ||
                this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_RESTO_MUNDO_2) ) {
                
                LogPC.println(this, "El nombre del producto seleccionado se encuentra dentro del catalogo, se genera su detalle especifico.");
                
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL_COMPARTE) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PLAN_MIN_SMS_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setFuncionalidad(FUNCIONALIDAD_COMPARTE_DATOS);
                    detalleProductoSeleccionado.setCobertura(COBERTURA_MEX_USA_CAN);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PLAN_MIN_SMS_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_MEX_USA_CAN);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL_BASICO_COMPARTE) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PLAN_MIN_SMS_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setFuncionalidad(FUNCIONALIDAD_COMPARTE_DATOS);
                    detalleProductoSeleccionado.setCobertura(COBERTURA_MEX_USA_CAN);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());                
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(BT_CEL_LITE_COMPARTE) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PLAN_MIN_SMS_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setFuncionalidad(FUNCIONALIDAD_COMPARTE_DATOS);
                    detalleProductoSeleccionado.setCobertura(COBERTURA_MEX_USA_CAN);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(COMPARTE_3) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN_SMS_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_MEX_USA_CAN);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(COMPARTE_7) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN_SMS_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_MEX_USA_CAN);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(COMPARTE_15) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN_SMS_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_MEX_USA_CAN);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_NOR_LAT_500) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_NOR_LAT_NCAR);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_NOR_LAT_1000) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_NOR_LAT_NCAR);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_EUR_ASI_AFR_OCE_500) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_EUR_ASI_AFR_OCE);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_EUR_ASI_AFR_OCE_1000) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_DAT);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_EUR_ASI_AFR_OCE);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(RI_NOR_LAT_EUR_ASI) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_NOR_LAT_NCAR_EUR_ASI);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_LAT) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN_SMS);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_LAT_NCAR);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_EUR) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN_SMS);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_EUR);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_RESTO_MUNDO_1) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN_SMS);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_REST_MUNDO);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                if( this.paqueteCelularSeleccionado.getNombreProducto().equalsIgnoreCase(LD_RESTO_MUNDO_2) ) {
                    detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                    detalleProductoSeleccionado.setDescripcion(DESCRIPCION_PAQUETE_MIN_SMS);
                    detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                    detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                    detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                    detalleProductoSeleccionado.setCobertura(COBERTURA_REST_MUNDO);
                    detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
                }
                
            } else {
                LogPC.println(this, "El nombre del producto seleccionado no se encuentra dentro del catalogo, se genera su detalle default.");
                detalleProductoSeleccionado.setNombre(this.paqueteCelularSeleccionado.getNombreProducto());
                detalleProductoSeleccionado.setPrecio(this.paqueteCelularSeleccionado.getPrecio());
                detalleProductoSeleccionado.setMinutos(this.paqueteCelularSeleccionado.getMinutos());
                detalleProductoSeleccionado.setSms(this.paqueteCelularSeleccionado.getSms());
                detalleProductoSeleccionado.setDatos(this.paqueteCelularSeleccionado.getDatos());
                detalleProductoSeleccionado.setVigencia(this.paqueteCelularSeleccionado.getVigencia());
            }
        }
    }
    
    public String cancelarCambioPaqCel() {
        ADFUtils.hidePopup(popupConfirmacion);
        return null;
    }
    
    public String cambiarPaqeteCelular() {
        ServicioCambioPaqueteCelular servicioCambioPaqueteCel = new ServicioCambioPaqueteCelular();
        String assetNumberMasterPrincipal = null;
        String respuestaWS = null;
        
        ADFUtils.hidePopup(popupConfirmacion);
        
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            for(LineaCelularDTO lineaCel : sesion.getSuscriptor().getLineasCelulares()) {
                if( lineaCel.isMasterPaquetePrincipal() ) {
                    assetNumberMasterPrincipal = lineaCel.getAssetNumber();
                }
            }
        }
        
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_PAQUETE_CELULAR);
        respuestaWS = servicioCambioPaqueteCel.cambiarPaqueteCelular(sesion.getCuentaSKY(), assetNumberMasterPrincipal, this.paqueteCelularSeleccionado.getNombreProductoCRM());
        
        if( respuestaWS != null ) {
            this.consultarPaquetesCelulares();
            mostrarMensaje("El cambio de paquete fue exitoso. En su siguiente recarga deberá pagar $" + this.paqueteCelularSeleccionado.getPrecio() + " por su servicio celular más el costo mensual de su servicio de VeTV en combo", FacesMessage.SEVERITY_INFO);
        } else {
            mostrarMensaje("Ocurrio un error al procesar su cambio de paquete celular, llamar a atención a clientes para mayor información.", FacesMessage.SEVERITY_ERROR);
        }
        
        return null;
    }

    public List<PaqueteCelularDTO> getPaquetesCelulares() {
        return paquetesCelulares;
    }
    
    public boolean isCambioPaquetePosible() {
        boolean cambioPaqPosible = false;
        
        if( paquetesCelulares != null && !paquetesCelulares.isEmpty() ) {
            cambioPaqPosible = true;
        }
        
        LogPC.println(this, "Is cambio paquete celular posible: "  + cambioPaqPosible);
        return cambioPaqPosible;
    }

    public void setPaqueteCelularSeleccionado(PaqueteCelularDTO paqueteCelularSeleccionado) {
        this.paqueteCelularSeleccionado = paqueteCelularSeleccionado;
    }

    public PaqueteCelularDTO getPaqueteCelularSeleccionado() {
        return paqueteCelularSeleccionado;
    }

    public RichPopup getPopupConfirmacion() {
        return popupConfirmacion;
    }

    public void setPopupConfirmacion(RichPopup popupConfirmacion) {
        this.popupConfirmacion = popupConfirmacion;
    }

    public DetalleProductoDTO getDetalleProductoSeleccionado() {
        return detalleProductoSeleccionado;
    }
}
