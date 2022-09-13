package mx.com.sky.sel.managedbeans.sesion;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import java.util.HashMap;
import java.util.List;

import mx.com.sky.sel.enums.EnumFormaPago;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.utils.Menu;
import mx.com.sky.sel.services.menu.ServicioMenu;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.render.ClientEvent;

public class ConfigMenu extends SesionMB implements Serializable {
    @SuppressWarnings("compatibility:1779975526832335669")
    private static final long serialVersionUID = -7406641913037176149L;

    private HashMap<String, Boolean> menu;
    //private transient RichPopup popUp_beneficioComboHbb;

    public ConfigMenu() {
        super();
        menu = new HashMap<String, Boolean>();
        if (!paginaFallo) {
            cargarConfigMenu();
        }
        LogPC.println(this, "ConfigMenu construido con exito");
    }


    private void cargarConfigMenu() {
        ServicioMenu sm = new ServicioMenu();
        List<Menu> menusCompleto = null;
        List<Menu> menus = null;

        menusCompleto = sm.obtenerMenuCompleto(userRole, pais);
        menus = sm.obtenerMenus(usuario.getUid(), "%%", pais);
        for (Menu menuM : menusCompleto) {
            this.put(menuM.getPmcode(), true);
        }
        for (Menu menuM : menus) {
            this.put(menuM.getPmcode(), menuM.isVisible());
        }
    }

    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ConfigMenu [suscriptor=");
        builder.append(suscriptorBoolean);
        builder.append(", ");
        if (userRole != null) {
            builder.append("userRole=");
            builder.append(userRole);
            builder.append(", ");
        }
        builder.append("cuentaActiva=");
        builder.append(cuentaActiva);
        builder.append(", ");
        builder.append("denegaracceso=");
        builder.append(denegaracceso);
        builder.append(", ");
        builder.append("admin=");
        builder.append(admin);
        builder.append(", ");
        if (pais != null) {
            builder.append("pais=");
            builder.append(pais);
            builder.append(", ");
        }
        if (menu != null) {
            builder.append("menu=");
            builder.append(menu);
        }
        builder.append("]");
        return builder.toString();
    }


    public void put(String code, Boolean value) {
        menu.put(code, value);
    }

    private boolean getPermiso(String code) {
        Boolean result = menu.get(code);
        if (denegaracceso) {
            return false;
        } else if (suscriptorBoolean) {
            if (result == null) {
                result = false;
            } else {
                result = true;
            }
        } else if (result == null) {
            result = false;
        }
        return result;
    }
    public boolean getPermisoCrecimiento(String code) {
        Boolean result = menu.get(code);
        if (denegaracceso) {
            return false;
        } else if (suscriptorBoolean) {
            if (result == null) {
                result = false;
            } else {
                result = true;
            }
        } else if (result == null) {
            result = false;
        }
        return result;
    }
    
    /// PERMISOS ESPECIALES
    public boolean isCARTA_RESPONSIVA() {
        boolean resultado = getPermiso("CARTA_RESPONSIVA");
        return resultado;
    }   
    //////////////////////

    public boolean isPAGOS_POR_EVENTO() {
        boolean resultado = getPermiso("PAGOS_POR_EVENTO");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !isPaqueteSolidaridad();
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }

    public boolean isSKY_PREMIERE() {
        boolean resultado = getPermiso("SKY_PREMIERE");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !isUserBar();
        return resultado;
    }

    public boolean isSKY_EVENT() {
        boolean resultado = getPermiso("SKY_EVENT");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && !isUserBar();
        resultado = resultado && !isUserVeTV();
        
        return resultado;
    }

    public boolean isADULTOS() {
        boolean resultado = getPermiso("ADULTOS");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !isUserBar();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isADULTOS_ALLDAY() {
        boolean resultado = getPermiso("ADULTOS_ALLDAY");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !isUserBar();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isADULTOS_A_LA_CARTA() {
        boolean resultado = getPermiso("ADULTOS_A_LA_CARTA");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isHISTORICO_DE_EVENTOS_CONTRATADOS() {
        boolean resultado = getPermiso("HISTORICO_DE_EVENTOS_CONTRATADOS");
        resultado = resultado && isCuentaActiva();
        return resultado;
    }
    
    public boolean isLUGARES_PAGO() {
        boolean resultado = getPermiso("LUGARES_PAGO");
        return resultado;
    }

    public boolean isMPROGRAMACION_TV() {
        boolean resultado = getPermiso("MPROGRAMACION_TV");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !isPaqueteSolidaridad();
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        return resultado;
    }

    public boolean isPROGRAMACION_TV() {
        boolean resultado = getPermiso("PROGRAMACION_TV");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !isPaqueteSolidaridad();
        return resultado;
    }
    
    public boolean isCANAL_A_LA_CARTA() {
        boolean resultado = getPermiso("CANAL_A_LA_CARTA");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }
    
    public boolean isCACADULTOS() {
        boolean resultado = getPermiso("CACADULTOS");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }
    
    public boolean isCACDEPORTES() {
        boolean resultado = getPermiso("CACDEPORTES");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }
    public boolean isCACPELICULAS() {
        boolean resultado = getPermiso("CACPELICULAS");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }
    
    public boolean isCACSTREAMING() {
        boolean resultado = getPermiso("CACSTREAMING");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        resultado = resultado && !isPaqueteSkySports() && !isUserHotel() && isMEX() && !this.getSuscriptor().getPaquete().contains("VETV") && !isUserMini();
        return resultado;
    }

    public boolean isCAMBIO_PAQUETES_PROGRAMACION() {
        boolean resultado = getPermiso("CAMBIO_PAQUETES_PROGRAMACION");
        resultado = resultado && isCuentaActiva();
        //resultado = resultado && !isUserVeTV();
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }

    public boolean isCAMBIO_PAQUETE() {
        boolean resultado = getPermiso("CAMBIO_PAQUETE");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && (isUserBar() || isUserSKY() || isUserVeTV());
        return resultado;
    }

    public boolean isCAMBIO_DE_MODULO() {
        boolean resultado = getPermiso("CAMBIO_DE_MODULO");
        resultado = resultado && isCuentaActiva() && (isUserModular());
        return resultado;
    }

    public boolean isCOMPRAS() {
        boolean resultado = getPermiso("COMPRAS");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }

    public boolean isREVISTA_SKY_VIEW() {
        boolean resultado = getPermiso("REVISTA_SKY_VIEW");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && (isUserSKY() || isUserBar());
        resultado = resultado && pais.equalsIgnoreCase("MEX");
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
        //JAM
           // return true;
    }

    public boolean isCONTROL_REMOTO() {
        boolean resultado = getPermiso("CONTROL_REMOTO");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !isUserVeTV();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
        //JAM
        //return true;
    }

    public boolean isCONTROL_REMOTOVeTV() {
        boolean resultado = getPermiso("CONTROL_REMOTO");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && isUserVeTV();
        return resultado;
    }

    public boolean isCONTROL_REMOTONoCompra() {
        boolean resultado = pais.equalsIgnoreCase("DOM");
        return resultado;
    }

    public boolean isCONTROL_REMOTOEnviaDireccionAlterna() {
        boolean resultado = pais.equalsIgnoreCase("CRICA");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        return resultado;
    }
    
    public boolean isMANUALES() {
        boolean resultado = false;
        List<String> modeloIDR;
        String rowID;
        SerivcioTarjetaInteligente sti = new SerivcioTarjetaInteligente();
        rowID = getSuscriptor().getRowId();
        modeloIDR = sti.getIRDConcatenado(rowID);
        for(String mIRD: modeloIDR){
            resultado = mIRD.equals("670B2C")||resultado; //670B2C es el IRD de equipos Sky Super Plus HD 
        }
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }
    /* Metodo para mostrar el cambio de costos de cuentas VETV y VETV PLUS*/
    public boolean isMensajeCDPVETV(){
        boolean resultado = getPermiso("MENSAJE_CDP_VETV");
        resultado = resultado && isCuentaVetv();
        return resultado;
    }
    public boolean isMensajeCDPVETVPLUS(){
        boolean resultado = getPermiso("MENSAJE_CDP_VETV");
        resultado = resultado && isCuentavetvPlus();
        return resultado;
    }
    public boolean isMensajeTextosTyA(){
        boolean resultado = false;
        resultado = resultado && isCuentaTextosTyA();
        return resultado;
    }
    public boolean isPAGO_LINEA() {
        boolean resultado = getPermiso("PAGO_LINEA");
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        return resultado;
    }
    
    public boolean isADELANTA_RECARGAS() {
        boolean resultado = getPermiso("PAGO_LINEA");
        resultado = resultado && isUserVeTV();
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        return resultado;
    }


    public boolean isSALDO_ACTUAL() {
        boolean resultado = getPermiso("SALDO_ACTUAL");
        resultado = resultado && (isUserSKY() || isUserHotel());
        return resultado;
    }

    public boolean isSALDO_ACTUALVeTV() {
        boolean resultado = getPermiso("SALDO_ACTUAL");
        resultado = resultado && (isUserVeTV() || isUserMini());
        return resultado;
    }

    public boolean isESTADO_CUENTA() {
        boolean resultado = getPermiso("ESTADO_CUENTA");
        resultado = resultado && (isCuentaActiva() || isCuentaBloqueoDuro() || isCuentaBloqueoSuave() || isCuentaReactivadaTemp());
        resultado = resultado && !isUserVeTV();
        return resultado;
    }
    public boolean isESTADO_CUENTAMobile() {
        boolean resultado = getPermiso("ESTADO_CUENTA");
        resultado = resultado && (isCuentaActiva() || isCuentaBloqueoDuro() || isCuentaBloqueoSuave() || isCuentaReactivadaTemp());
        resultado = resultado && !isUserHotel();
        resultado = resultado && !isUserVeTV();
        return resultado;
    }
    public boolean isREALIZAR_PAGO() {
        boolean resultado = getPermiso("REALIZAR_PAGO");
        resultado = resultado && !isUserVeTV();
        //resultado = resultado && !pais.equalsIgnoreCase("DOM");
        resultado = resultado && !vip;
        return resultado;
    }
        
    public boolean isPUNTO_VENTA(){
          boolean respuesta = false;
          if (suscriptor.getMarketType().equalsIgnoreCase("Puntos de Venta") && suscriptor.getOrganizationType().equalsIgnoreCase("Direct To Home")) {
                 respuesta= true;
          }else{
              respuesta= false;
          } 
          return respuesta;
    }
        
    public boolean isCUENTA_HOTEL(){
            boolean resultado;
            if (getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                resultado = false;
            }else{
                resultado = true;    
            }
            return resultado;
        }
        public boolean isHOTEL_ESTADO_CUENTA(){
            boolean respuesta;
            if (getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                respuesta=false;
            }else{
                respuesta = isESTADO_CUENTA();
            }
            return respuesta;
        }
        public boolean isHOTEL_SALDO_ACTUAL(){
            boolean respuesta;
            if (getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                respuesta=true;
            }else{
                respuesta = isSALDO_ACTUAL();
            }
            return respuesta;
        }
    public boolean isRECARGA_VETV() {
        boolean resultado = getPermiso("RECARGA_VETV");
        resultado = resultado && (isUserVeTV() || isUserMini());
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        
        return resultado;
    }

    public boolean isMIS_TARJETAS() {
        boolean resultado = getPermiso("MIS_TARJETAS");
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isCAMBIO_FORMA_PAGO() {
        boolean resultado = getPermiso("CAMBIO_FORMA_PAGO");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && isFPEFECTIVO();
        resultado = resultado && isCuentaDirectToHome();
        resultado = resultado && !isCuentaMarketTypeEmplStaVip();
        resultado = resultado && !corporativo;
        //resultado = resultado && !isDOM();
        return resultado;
    }

    /**
     * Promesa de Pago.
     * @return
     */
    public boolean isREPORTAR_UN_PAGO_REALIZADO() {
        boolean resultado = getPermiso("REPORTAR_UN_PAGO_REALIZADO");
        resultado = resultado && isUserVeTV();
        resultado = resultado && !statusRecarga.equalsIgnoreCase("Con Recarga");
        return resultado;
    }

    /**
     * Reenvio de SeÃƒÂ±al
     * @return
     */
    public boolean isREENVIO_SENAL_MENU() {
        boolean resultado = getPermiso("REENVIO_SENAL_MENU");
        resultado = resultado && isUserVeTV();
        resultado = resultado && isCuentaActiva();
        return resultado;
    }
    public boolean isCONSUMO_INTERNET() {
        boolean resultado = getPermiso("CONSUMO_INTERNET");
        resultado = resultado && isCuentaDualPlay();
        resultado = resultado && isCuentaAltan();
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }
    
    public boolean isCONSUMO_CELULAR() {
        boolean resultado = getPermiso("CONSUMO_INTERNET_CEL");
        resultado = resultado && this.suscriptor.isCuentaCelular();
        //resultado = resultado && !isPaqueteSkySports();
        
        return resultado;
    }
    
    public boolean isCAMBIO_PAQUETE_CELULAR() {
        LogPC.println(this, "In isCAMBIO_PAQUETE_CELULAR method");
        boolean resultado = getPermiso("CAMBIO_PAQUETE_CEL");
        resultado = resultado && this.suscriptor.isCuentaCelular() && isUserVeTV();
        //resultado = resultado && !isPaqueteSkySports();
        LogPC.println(this, "Se muestra el menu CAMBIO PAQUETE CELULAR: " + resultado);
        
        return resultado;
    }
    
    public boolean isSERVICIO_COMPARTE_CELULAR() {
        LogPC.println(this, "In isSERVICIO_COMPARTE_CELULAR method");
        
        //TODO cambiar la cadena por SERVICIO_COMPARTE_CEL y actualizar la BD
        boolean resultado = getPermiso("CAMBIO_PAQUETE_CEL");
        
        //TODO negar isUserVeTV
        resultado = resultado && this.suscriptor.isCuentaCelular() && !isUserVeTV();
        LogPC.println(this, "Se muestra el menu SERVICIO_COMPARTE_CELULAR: " + resultado);
        
        return resultado;
    }
    
    public boolean isCOMPRA_DATOS() {
        boolean resultado = getPermiso("COMPRA_INTERNET");
        resultado = resultado && isCuentaDualPlay();
        resultado = resultado && isCuentaAltan();
        resultado = resultado && isCuentaActiva();
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        
        return resultado;
    }
    public boolean isCON_RECARGA() {
        return statusRecarga.equalsIgnoreCase("Con Recarga");
    }
    public boolean isCOMPRA_SERVICIO_SUPLEMENTARIO_CELULAR() {
        boolean resultado = getPermiso("COMPRA_INTERNET_CEL");
        
        resultado = resultado && this.suscriptor.isCuentaCelular();
        //resultado = resultado && !isPaqueteSkySports();
        
        return resultado;
    }
    /**
     * Reenvio de SeÃƒÂ±al
     * @return
     */
    public boolean isREENVIO_SENAL() {
        boolean resultado = getPermiso("REENVIO_SENAL");
        resultado = resultado && isUserVeTV();
        resultado = resultado && isCuentaActiva();
        return resultado;
    }

    public boolean isSERVICIOS_TECNICOS_Y_CAMBIO_DE_DOMICILIO() {
        boolean resultado = getPermiso("SERVICIOS_TECNICOS_Y_CAMBIO_DE_DOMICILIO");
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        
        return resultado;
    }

    public boolean isREPARACIONES() {
        boolean resultado = getPermiso("REPARACIONES");
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isCAMBIO_DOMICILIO() {
        boolean resultado = getPermiso("CAMBIO_DOMICILIO");
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isDATOS_FISCALES() {
        boolean resultado = getPermiso("DATOS_FISCALES");
        resultado = resultado && !isUserVeTV();
       // resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && pais.equalsIgnoreCase("MEX");
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        
        return resultado;
    }

    public boolean isREG_ACTU_DATOS_FISCALES() {
        boolean resultado = getPermiso("REG_ACTU_DATOS_FISCALES");
        resultado = resultado && !isUserVeTV();
        resultado = resultado && pais.equalsIgnoreCase("MEX");
        return resultado;
    }

    public boolean isFACTURAS_ELECTRONICAS() {
        boolean resultado = getPermiso("FACTURAS_ELECTRONICAS");
        resultado = resultado && !isUserVeTV();
        resultado = resultado && pais.equalsIgnoreCase("MEX");
        return resultado;
    }
    
    public boolean isCAMBIO_TITULAR() {
        boolean resultado = getPermiso("CAMBIO_TITULAR");
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        
        return resultado;
    }

    public boolean isREPORTE_DANO_ROBO_EXTRAVIO() {
        boolean resultado = getPermiso("REPORTE_DANO_ROBO_EXTRAVIO");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        
        return resultado;
    }

    public boolean isIRD() {
        boolean resultado = getPermiso("IRD");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isSMARTCARD() {
        boolean resultado = getPermiso("SMARTCARD");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isSU_OPINION_NOS_INTERESA() {
        boolean resultado = getPermiso("SU_OPINION_NOS_INTERESA");
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        
        return resultado;
    }

    public boolean isENCUESTA_SATISFACCION() {
        boolean resultado = getPermiso("ENCUESTA_SATISFACCION");
        return resultado;
    }

    public boolean isSUGERENCIAS() {
        boolean resultado = getPermiso("SUGERENCIAS");
        return resultado;
    }
    public boolean isCrecimientoCuenta(){
        boolean resultado = getPermiso("EQUIPO_ADICIONAL");
        resultado = resultado && isCuentaActiva();
        //resultado = resultado && !isCuentaNewEra();
        resultado = resultado && isUserCrecimientoequipo();
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }
    public boolean isINTERNET_ADICIONAL() {
        boolean resultado = getPermiso("INTERNET_ADICIONAL");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && (isCuentaNewEra() || isCuentaVETVPLUSHD() || isCuentaVetv() || isCuentavetvPlus());
        resultado = resultado && isUserCrecimientoequipo();
        resultado = resultado && !isCuentaDualPlay();
        return resultado;
    }
    public boolean isEQUIPO_ADICIONAL() {
        boolean resultado = getPermiso("EQUIPO_ADICIONAL");
        resultado = resultado && isCuentaActiva();
        //resultado = resultado && !isCuentaNewEra();
        resultado = resultado && isUserCrecimientoequipo();
        return resultado;
    }
    public boolean isCONTACTO_SKY() {
        boolean resultado = getPermiso("CONTACTO");
        return resultado;
    }
    public boolean isCORREO_SKY() {
        boolean resultado = getPermiso("ENVIAR_CORREO");
        return resultado;
    }
    public boolean isCHAT_SKY() {
        boolean resultado = getPermiso("CHAT");
        return resultado;
    }
    public boolean isACLARACIONES_QUEJAS() {
        boolean resultado = getPermiso("ACLARACIONES_QUEJAS");
        resultado = resultado && isCuentaActiva();
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        
        return resultado;
    }

    public boolean isCARGOS_NO_RECONOCIDOS() {
        boolean resultado = getPermiso("CARGOS_NO_RECONOCIDOS");
        resultado = resultado && isCuentaActiva();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isQUEJAS() {
        boolean resultado = getPermiso("QUEJAS");
        return resultado;
    }

    /**
     * Otros Servicios
     * @return
     */
    public boolean isREQUIERE_OTRA_INFORMACION() {
        boolean resultado = getPermiso("REQUIERE_OTRA_INFORMACION");
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        //Paquete SKY SPORTS
        resultado = resultado || isPaqueteSkySports();
        
        return resultado;
    }

    /**
     * Otros Servicios
     * @return
     */
    public boolean isMANDE_SU_SOLICITUD() {
        boolean resultado = getPermiso("MANDE_SU_SOLICITUD");
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }


    /**
     * CREACION_DE_CUENTAS_ADICIONALES
     * PRIVILEGIOS_DE_CUENTAS_ADICIONALES
     * @return
     */
    public boolean isADMINSTRAR_CUENTAS() {
        boolean resultado = getPermiso("ADMON_CUENTAS");
        resultado = resultado && suscriptorBoolean;
        resultado = resultado && !isUserBar();
        resultado = resultado && !corporativo;
        resultado = resultado && !vip;
        return resultado;
    }

    public boolean isNOVEDADES() {
        boolean resultado = getPermiso("NOVEDADES");
        resultado = resultado && mostrarMenuNovedades;
        return resultado;
    }

    /**
     * NOVEDADES - BLUE_TO_GO
     * @return
     */
    public boolean isBLUE_TO_GO() {
        boolean resultado = getPermiso("BLUE_TO_GO");
        return resultado;
    }

    public boolean isTUTORIALES() {
        boolean resultado = getPermiso("TUTORIALES");
        return resultado;
    }
    
    /**
     *
     * @return resultado - Booleano para determinar si se muestra u oculta la
     * opci\u00F3n de Contacto para Preguntas Frecuentes
     */
    public boolean isCONTACTO_ANSWER() {
        boolean resultado = getPermiso("CONTACTO_ANSWER");
        return resultado;
    }
    
    /**
     *
     * @return resultado - Booleano para determinar si se muestra u oculta la
     * opci\u00F3n de Contacto para Mail
     */
    public boolean isCONTACTO_MAIL() {
        boolean resultado = getPermiso("CONTACTO_MAIL");
        return resultado;
    }

    /**
     *
     * @return resultado - Booleano para determinar si se muestra u oculta la
     * opci\u00F3n de Contacto para D\u00E9janos tus Datos
     */
    public boolean isCONTACTO_ASK() {
        boolean resultado = getPermiso("CONTACTO_ASK");
        return resultado;
    }
    
    /**
     *
     * @return resultado - Booleano para determinar si se muestra u oculta la
     * opci\u00F3n de Contacto para Chat
     */
    public boolean isCONTACTO_CHAT() {
        boolean resultado = getPermiso("CONTACTO_CHAT");
        return resultado;
    }
    
    public boolean isEnableWhatsAppLink() {
        boolean isEnabled = false;
        LogPC.println(this, "IN isEnableWhatsAppLink...");
        LogPC.println(this, "Pais del suscriptor: " + this.pais);
        LogPC.println(this, "isUserVeTV: " + isUserVeTV());
        
        if( this.pais != null &&
            (this.pais.equalsIgnoreCase("MEX") || this.pais.equalsIgnoreCase("DOM")) &&
            !isUserVeTV() ) {
            isEnabled = true;
        }
        
        LogPC.println(this, "MostraIconoWhatsApp: " + isEnabled);
        
        return isEnabled;
    }

    /**
     * Menu prinicipal Blue To GO
     *  Blue To Go Video Everywhere
     * @return
     */
    public boolean isMBLUE_TO_GO() {
        boolean resultado = getPermiso("MBLUE_TO_GO");
        resultado = resultado && permiteOTT;
        resultado = resultado && getTipoCuentaBTGVEW();
        resultado = resultado && isCuentaActiva();
        //Paquete SKY SPORTS
        resultado = resultado && !isPaqueteSkySports();
        return resultado;
    }
    
     /**
     * Sub Menu de Blue To Go Video Everywhere
     * - Eventos Disponibles
     * @return
     */
    public boolean isOTT() {
       
        boolean resultado = getPermiso("OTT");
        resultado = resultado && permiteOTT;
        return resultado;
    }


    /**
     * Sub Menu de Blue To Go Video Everywhere
     * - Contrata
     * - Contrata Blue To Go Everywhere
     * @return
     */
    public boolean isCONTRATA_BTGEW() {
        
        boolean resultado = getPermiso("CONTRATA_BTGEW");
        resultado = resultado && permiteOTT;
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        return resultado;
    }

    /**
     * Para permitir Contratar o Ingresar segun sea el caso a Blue To Go Video Everywhere
     * Porque VEO no tiene restricci\u00F3n de Paquete. Si ven el men\u00FA de MBLUE_TO_GO entonces deben poder contratar VEO.
     * @return
     */
    public boolean isMUESTRABOTON_CONTRATA_BTGEW() {
        
            
        boolean resultado = getPermiso("CONTRATA_BTGEW");
        resultado = resultado && permiteOTT;
        resultado = resultado && permiteCBTGVEW;
        resultado = resultado && (isPaqueteBTGVEW() || isPaqueteBTGVEWCA_DOM());
        resultado = resultado && !isPaqueteHDGOLD();
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        return resultado;
    }

    /**
     * Para permitir Contratar o Ingresar segun sea el caso a Blim
     * @return
     */
    public boolean isMUESTRABOTON_CONTRATA_BLIM() {
        boolean resultado = getPermiso("CONTRATA_BLIM");
        //resultado = resultado && permiteOTT;
        resultado = resultado && permiteCBTGVEW;
        resultado = resultado && isPaqueteBLIM();
        resultado = resultado && (isCuentaActiva() || isCuentaReactivadaTemp());
        return resultado;
    }    
    

    /**
     * Menu prinicipal Blim
     *  Blim
     * @return
     */
    public boolean isMBLIM() {
        boolean resultado = getPermiso("MBLIM");
        
        boolean mostrarBlim = false;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        if (sesion.getSuscriptor().getPais().equalsIgnoreCase("MEX") &&
            sesion.getSuscriptor().getOrganizationType().equalsIgnoreCase("Direct To Home") &&
            (sesion.getSuscriptor().getPaquete().contains("BASICO") ||
             sesion.getSuscriptor().getPaquete().contains("FUN") ||
             sesion.getSuscriptor().getPaquete().contains("FOX+") ||
             sesion.getSuscriptor().getPaquete().contains("HBO") ||
             sesion.getSuscriptor().getPaquete().contains("UNIVERSE") ||
             sesion.getSuscriptor().getPaquete().contains("BLACK") ||
             sesion.getSuscriptor().getPaquete().contains("PLATINUM"))) {
            mostrarBlim = true;
        }
        resultado = resultado && mostrarBlim;   
        
        resultado = resultado && isCuentaActiva();
        return resultado;
    }


    public boolean isAdmonEventos() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("E");
        return resultado;
    }
    
    //permiso para Editar y Borrar Eventos
    public boolean isAdmonABCEventos() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("X");
        LogPC.println(this, "-----------------permiso ABCEventos:" + resultado);
        return resultado;
    }

    public boolean isAdmonNovedades() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("N");
        return resultado;
    }

    public boolean isAdmonBanner() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("B");
        return resultado;
    }
    public boolean isAdmonMantenimiento() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("H");
        return resultado;
    }
    public boolean isAdmonMotorPago() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("P");
        return resultado;
    }
    
    public boolean isAdmonMagazine() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("M");
        return resultado;
    }

    public boolean isAdmonEventosBTGEW() {
        boolean resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("A");
        return resultado;
    }

    /**
     * @return TRUE cuando puede Replicar Eventos de OEM
     */
    public boolean isAdmonReplicar() {
        boolean resultado;
        resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("R");
        return resultado;
    }

    /**
     * @return TRUE cuando puede Cargar Eventos de California v\u00EDa archivo
     */
    public boolean isAdmonCargar() {
        boolean resultado;
        resultado = true;
        resultado = resultado && isAdmin();
        resultado = resultado && isPermiso("C");
        return resultado;
    }
    public String getTelefonoFax() {
        String telefonoFax = "01 (55) 54 48 40 95";
        if (pais.equalsIgnoreCase("MEX")) {
            telefonoFax = "01 (55) 54 48 40 95";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            telefonoFax = "800 027 2586, 4001-7449, 0800-052-1539";
        } else if (pais.equalsIgnoreCase("GT")) {
            telefonoFax = "23-76-75-25 (desde Guatemala) Ãƒâ€šÃ‚Â o al 1-800-835-0279 (desde el interior)";
        } else if (pais.equalsIgnoreCase("HON")) {
            telefonoFax = "800ÃƒÂ¢Ã¢â€šÂ¬Ã¢â‚¬Å“2-791-9015 / 800-2544-0878";
        } else if (pais.equalsIgnoreCase("NIC")) {
            telefonoFax = "7877-7979 /  2276-9060";
        } else if (pais.equalsIgnoreCase("PAN")) {
            telefonoFax = "833 6675, 832 3298 y 00 800 226 0270";
        } else if (pais.equalsIgnoreCase("DOM")) {
            telefonoFax = "829-946-5987 / 809-560-9842 (desde Santo Domingo) o al 829-200-1130 / 809-200-1010 (desde el interior del pa\u00EDs)";
        } else if (pais.equalsIgnoreCase("SAL")) {
            telefonoFax = "2136 8339 y del interior 800 6611";
        }
        return telefonoFax;
    }

    public String getEmailCAC() {
        String emailCAC = "servicioenlinea@sky.com.mx";

        if (pais.equalsIgnoreCase("MEX")) {
            emailCAC = "servicioenlinea@sky.com.mx";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            emailCAC = "servicioenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("GT")) {
            emailCAC = "servicioenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("HON")) {
            emailCAC = "servicioenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("NIC")) {
            emailCAC = "servicioenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("PAN")) {
            emailCAC = "servicioenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("DOM")) {
            emailCAC = "servicioenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("SAL")) {
            emailCAC = "servicioenlineaca@sky.com.mx";
        }

        return emailCAC;
    }

    public String getEmailSEL() {
        String emailCAC = "serviciosenlinea@sky.com.mx";

        if (pais.equalsIgnoreCase("MEX")) {
            emailCAC = "serviciosenlinea@sky.com.mx";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            emailCAC = "serviciosenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("GT")) {
            emailCAC = "serviciosenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("HON")) {
            emailCAC = "serviciosenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("NIC")) {
            emailCAC = "serviciosenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("PAN")) {
            emailCAC = "serviciosenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("DOM")) {
            emailCAC = "serviciosenlineaca@sky.com.mx";
        } else if (pais.equalsIgnoreCase("SAL")) {
            emailCAC = "serviciosenlineaca@sky.com.mx";
        }

        return emailCAC;
    }

    public String getMoneda() {
        String moneda = "pesos";

        if (pais.equalsIgnoreCase("MEX")) {
            moneda = "pesos";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            moneda = "USD";
        } else if (pais.equalsIgnoreCase("GT")) {
            moneda = "USD";
        } else if (pais.equalsIgnoreCase("HON")) {
            moneda = "USD";
        } else if (pais.equalsIgnoreCase("NIC")) {
            moneda = "USD";
        } else if (pais.equalsIgnoreCase("PAN")) {
            moneda = "USD";
        } else if (pais.equalsIgnoreCase("DOM")) {
            moneda = "pesos dominicanos";
        } else if (pais.equalsIgnoreCase("SAL")) {
            moneda = "USD";
        }

        return moneda;
    }
    
    
    public String getMonedaCyber() {
        String moneda = "MXN";

        if (pais.equalsIgnoreCase("MEX")) {
            moneda = "MXN";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            moneda = "CRC";
        } else if (pais.equalsIgnoreCase("GT")) {
            moneda = "GTQ";
        } else if (pais.equalsIgnoreCase("HON")) {
            moneda = "HNL";
        } else if (pais.equalsIgnoreCase("NIC")) {
            moneda = "NIO";
        } else if (pais.equalsIgnoreCase("PAN")) {
            moneda = "USD";
        } else if (pais.equalsIgnoreCase("DOM")) {
            moneda = "DOP";
        } else if (pais.equalsIgnoreCase("SAL")) {
            moneda = "USD";
        }

        return moneda;
    }

    public String getMonedaLocal() {
        String moneda = "pesos";

        if (pais.equalsIgnoreCase("MEX")) {
            moneda = "peso mexicano (MXN)";
        } else if (pais.equalsIgnoreCase("CRICA")) {
            moneda = "col\u00F3n costarricense (CRC)";
        } else if (pais.equalsIgnoreCase("GT")) {
            moneda = "quetzal de Guatemala (GTQ)";
        } else if (pais.equalsIgnoreCase("HON")) {
            moneda = "lempira hondureÃƒÂ±a (HNL)";
        } else if (pais.equalsIgnoreCase("NIC")) {
            moneda = "c\u00F3rdoba nicaragÃƒÂ¼ense (NIO)";
        } else if (pais.equalsIgnoreCase("PAN")) {
            moneda = "d\u00F3lar estadounidense (USD)";
        } else if (pais.equalsIgnoreCase("DOM")) {
            moneda = "peso dominicano (DOP)";
        } else if (pais.equalsIgnoreCase("SAL")) {
            moneda = "d\u00F3lar estadounidense (USD)";
        }

        return moneda;
    }

    public String getMenuPagoEnLinea() {
        //String nombre = "Pago en L\u00EDnea";
        String nombre = "Consulta de Saldo y Pago en L\u00EDnea";
        if (pais.equalsIgnoreCase("DOM")) {
            nombre = "Saldo Actual y Estado de Cuenta";
        }
        return nombre;
    }
    public String getcuentaHotelMenu(){
            String resultado="";
            if (getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                resultado="Saldo Actual";
            }else{
                resultado = "Saldo Actual y Estado de Cuenta";    
            }    
            return resultado;
        }
    public String getcuentaHotelMenuTablet(){
            String resultado="";
            if (getSuscriptor().getOrganizationType().equalsIgnoreCase("Hotel")) {
                resultado="Saldo Actual";
            }else{
                resultado = "Estado de Cuenta";    
            }    
            return resultado;
        }
    public String getMenuCompras() {
        //String nombre = "Pago en L\u00EDnea";
        String nombre = "Compra Control Remoto";
        if (pais.equalsIgnoreCase("MEX") && (!isUserVeTV())) {
            nombre = "Revista SKY VIEW / Control Remoto";
        }
        return nombre;
    }
    
    public String getMenuManuales() {
        String nombre = "Manuales";
        return nombre;
    }

    public String getImagenPagoEnLinea() {
        //
        String nombre = "/imagenes/48X48/servicios_48x48/sky_cargosTDC.png";
        if (pais.equalsIgnoreCase("DOM")) {
            nombre = "/imagenes/48X48/servicios_48x48/saldo.png";
        }
        return nombre;
    }

    public String getImagenPagoEnLineaMobile() {
        //
        String nombre = "/imagenes/35X35/servicios_35x35/sky_cargosTDC.png";
        if (pais.equalsIgnoreCase("DOM")) {
            nombre = "/imagenes/35X35/servicios_35x35/saldo.png";
        }
        return nombre;
    }

    private boolean isUserInRole(String roleTmp) {
        if (userRole.equalsIgnoreCase(roleTmp)) {
            return true;
        }
        return false;
    }

    private boolean isPermiso(String permiso) {
        if (permisosAdmin == null) {
            return false;
        }
        return permisosAdmin.contains(permiso);
    }

    public boolean isContratarPPV() {
        boolean resultado = true;
        if (isUserVeTV()) {
            resultado = statusRecarga.equalsIgnoreCase("Con Recarga");
            resultado = resultado && (dataVeTV.getDiasFinRecarga() > 2 || (-1 * saldoRealVeTV) >= montoRecargaVeTV);
            resultado = resultado && oppv;
        } else {
            resultado = oppv;
        }
        return resultado;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        LogPC.println(this, "Serializando ConfigMenu: " + suscriptor);
        LogPC.println(this, "Serializando ConfigMenu: " + usuario);
        LogPC.println(this, "Serializando ConfigMenu: " + userRole);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        try {
            in.defaultReadObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        LogPC.println(this, "DeSerializando ConfigMenu :" + suscriptor);
        LogPC.println(this, "DeSerializando ConfigMenu: " + usuario);
        LogPC.println(this, "DeSerializando ConfigMenu: " + userRole);
    }

    private boolean isFPEFECTIVO() {
        return (formaPagoActual.equals(EnumFormaPago.EFECTIVO));
        //|| formaPagoActual.equals(EnumFormaPago.EFEC_TDD) || formaPagoActual.equals(EnumFormaPago.TDD
    }

    public void cerrarChat() {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CANCELAR_CHAT);
    }
    public void iniciarChat(ClientEvent clientEvent) {
        // Add event code here...
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.INICIAR_CHAT);
    }

    public String iniciarChat() {
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.INICIAR_CHAT);
        return null;
    }
        /*public void listenerComboHbbMostrar(javax.faces.event.ComponentSystemEvent evt){
            if(!this.paginaFallo){//se valida primero si cargo la sesion correctamente
                String respuesta = getLoadBeneficioComboHbb();
                if (respuesta.equalsIgnoreCase("load")) {
                    popupBeneficioComboHbbMostrar = true;
                    ADFUtils.showPopup(popUp_beneficioComboHbb);
                } else {
                    popupBeneficioComboHbbMostrar = false;
                    ADFUtils.hidePopup(popUp_beneficioComboHbb);
                }
            }
        }*/

    /*public void setPopUp_beneficioComboHbb(RichPopup popUp_beneficioComboHbb) {
        this.popUp_beneficioComboHbb = popUp_beneficioComboHbb;
    }

    public RichPopup getPopUp_beneficioComboHbb() {
        return popUp_beneficioComboHbb;
    }*/

}
