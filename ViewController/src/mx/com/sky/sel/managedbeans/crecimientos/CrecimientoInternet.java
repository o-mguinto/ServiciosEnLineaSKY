package mx.com.sky.sel.managedbeans.crecimientos;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.saldos.Saldo;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.crecimientos.ServicioCrecimientoEquipos;
import mx.com.sky.sel.services.dualplay.consulta.ServicioDualPlay;
import mx.com.sky.enterpriseobjects.soa.consultacoberturainterface.ConsultaCoberturaResponseEBMType;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.saldo.ServicioSaldo;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.enterpriseobjects.sec.datoscuentacrececombointerface.DatosCuentaCreceComboResponseEBMType;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientostya.types.ValidaCrecimientosTYAResponse;
import mx.com.sky.enterpriseobjects.sec.validacrecimientosppbtiinterface.ValidaCrecimientosPpBtiResponseEBMType;

import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.context.AdfFacesContext;

public class CrecimientoInternet implements Serializable{
    @SuppressWarnings("compatibility:-1164768154609417489")
    private static final long serialVersionUID = -6870605640974153964L;

    private String mensajeTya;
    private String mensajeVeTv;
    private String mensajeCrecimiento;
    private boolean cuentaValida;
    private boolean cuentaValidaVeTv;
    private String calle;
    private String numExt;
    private String numInt;
    private String colonia;
    private String delMun;
    private String cuidad;
    private String estado;
    private String cp;
    private boolean cuentaValidaCobertura;
    DatosCuentaCreceComboResponseEBMType responseCreceInternet = null;
    private RichPanelBox boxCobertura;
    private String mensajeCrecimientoVeTV;
    private boolean cuentaValidaCoberturaVeTV;
    private String precio;
    
    public CrecimientoInternet() {
        LogPC.println(this, "validaCrecimientos");
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CRECIMIENTO_INTERNET);
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
         
        try {
             if(sesion.isCuentaVETVPLUSHD() || sesion.isCuentaVetv() || sesion.isCuentavetvPlus()){ 
                 ValidaCrecimientosPpBtiResponseEBMType responde = null;
                 ServicioCrecimientoEquipos crecimiento = new ServicioCrecimientoEquipos();
                 
                 responde = crecimiento.consultaValidaCuentaVeTVInternet(sesion.getCuentaSKY());
                 responseCreceInternet = crecimiento.consultaDatosCuentaCreceCombo(sesion.getSuscriptor().getCuentaSKY());
                 if(responde != null && responseCreceInternet != null){
                     LogPC.println(this, "Valido " + responde.getOutputParameters().getVALIDO().getValue()); 
                    
                     LogPC.println(this, "Precio " + responde.getOutputParameters().getPRECIO().getValue()); 
                     
                     LogPC.println(this, "Cuenta VETV " + sesion.getSuscriptor().getMarketType()); 
                     
                     LogPC.println(this, "Codigo de error " + responde.getEBMHeaderResponse().getErrorNegocio().getCodigoError()); 
                     
                     if(!responde.getEBMHeaderResponse().getErrorNegocio().getCodigoError().toString().equalsIgnoreCase("0")){
                         mensajeVeTv = "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                         LogServicios.printlnError(this, responde.getEBMHeaderResponse().getErrorNegocio().getCodigoError());
                     }
                     else{
                     //else if (!responde.getValido().toString().equals("1")){  
                        if(responde.getOutputParameters().getVALIDO().getValue().toString().equalsIgnoreCase("0")){
                             cuentaValidaVeTv = true;
                             mensajeVeTv = ""; 
                             precio = "Costo de crecimiento a Internet: $" + JavaUtils.formatMoneda(responde.getOutputParameters().getPRECIO().getValue());
                            if (responseCreceInternet.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") && responseCreceInternet.getOutputParameters().getVCODIGO().getValue().equalsIgnoreCase("0")) {
                                cuentaValidaVeTv = true;
                                mensajeVeTv = ""; 
                                calle = responseCreceInternet.getOutputParameters().getVCALLE().getValue();
                                numExt = responseCreceInternet.getOutputParameters().getVNUMEXT().getValue();
                                numInt = responseCreceInternet.getOutputParameters().getVNUMINT().getValue();
                                colonia = responseCreceInternet.getOutputParameters().getVCOLONIA().getValue();
                                delMun = responseCreceInternet.getOutputParameters().getVMUNICIPIO().getValue();
                                cuidad = responseCreceInternet.getOutputParameters().getVCIUDAD().getValue();
                                estado = responseCreceInternet.getOutputParameters().getVESTADO().getValue();
                                cp = responseCreceInternet.getOutputParameters().getVCP().getValue();
                                
                            }else{
                                 cuentaValidaVeTv = false;
                                 mensajeVeTv = "Su cuenta no puede realizar la contrataci\u00F3n de internet, por favor llamar a servicio a clientes.";
                             }
                        }
                        else if(responde.getOutputParameters().getVALIDO().getValue().equals("2")){
                              mensajeVeTv = "La cuenta tiene m\u00E1s de un equipo."; 
                        }
                        else if(responde.getOutputParameters().getVALIDO().getValue().equals("3")){
                               mensajeVeTv = "La cuenta no tiene recarga."; 
                        }
                        else if(responde.getOutputParameters().getVALIDO().getValue().equals("4") ){
                              mensajeVeTv = "La cuenta tiene un SS abierta."; 
                        }
                        else{
                             mensajeVeTv = "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                             LogServicios.printlnError(this, responde.getEBMHeaderResponse().getErrorNegocio().getDescripcionError());
                        }
                        
                    //}
                    }
                 }  
             }else {
            ValidaCrecimientosTYAResponse responde = null;
            ServicioCrecimientoEquipos crecimiento = new ServicioCrecimientoEquipos();
            ///consulta de servicio de saldo
            ServicioSaldo servSaldo = new ServicioSaldo();
            Saldo saldo = servSaldo.consultaSaldo(sesion.getSuscriptor().getCuentaSKY(), sesion.getSistema());
            if ((Double.parseDouble(saldo.getSaldoTotal())*(-1) ) >= 0) {
            responde = crecimiento.validacrecimientos_tya(sesion.getSuscriptor().getCuentaSKY());
            responseCreceInternet = crecimiento.consultaDatosCuentaCreceCombo(sesion.getSuscriptor().getCuentaSKY());
            if(responde != null && responseCreceInternet != null){
                LogPC.println(this, "Valida " + responde.getValida()); 
                LogPC.println(this, "Estatus " + responde.getEstatus());
                LogPC.println(this, "Cuenta TYA " + sesion.getSuscriptor().getMarketType());  
                LogPC.println(this, "Codigo de error " + responde.getCodigoError());
                
                if(responde.getCodigoError().equals("1")){
                    mensajeTya = "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                    LogServicios.printlnError(this, responde.getDescError());
                }
                else if(responde.getValida().equals("N")){
                    if(responde.getEstatus().equals("1")){
                         mensajeTya = "La cuenta no se encuentra Activa."; 
                    }
                    else if(responde.getEstatus().equals("2") || responde.getEstatus().equals("3") || responde.getEstatus().equals("4")){
                          mensajeTya = "El tipo de cuenta no permita realizar el crecimiento."; 
                    }
                    else if(responde.getEstatus().equals("5") ){
                         mensajeTya = "La cuenta contiene equipos pendientes, no es posible realizar el crecimiento."; 
                    }
                    else if(responde.getEstatus().equals("6") ){
                         mensajeTya = "El estatus legal de la cuenta no permite realizar crecimientos."; 
                    }
                    else if(responde.getEstatus().equals("7") ){
                          mensajeTya = "Existe una solicitud de servicio abierta de crecimientos."; 
                    }
               }else{
                    if (responseCreceInternet.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") && responseCreceInternet.getOutputParameters().getVCODIGO().getValue().equalsIgnoreCase("0")) {
                        cuentaValida = true;
                        mensajeTya = ""; 
                        calle = responseCreceInternet.getOutputParameters().getVCALLE().getValue();
                        numExt = responseCreceInternet.getOutputParameters().getVNUMEXT().getValue();
                        numInt = responseCreceInternet.getOutputParameters().getVNUMINT().getValue();
                        colonia = responseCreceInternet.getOutputParameters().getVCOLONIA().getValue();
                        delMun = responseCreceInternet.getOutputParameters().getVMUNICIPIO().getValue();
                        cuidad = responseCreceInternet.getOutputParameters().getVCIUDAD().getValue();
                        estado = responseCreceInternet.getOutputParameters().getVESTADO().getValue();
                        cp = responseCreceInternet.getOutputParameters().getVCP().getValue();
                        
                    }else{
                         cuentaValida = false;
                         mensajeTya = "Su cuenta no puede realizar la contrataci\u00F3n de internet, por favor llamar a servicio a clientes.";
                     }
               }
           }
         }else {
             cuentaValida = false;
             mensajeTya = "Su cuenta no puede realizar la contrataci\u00F3n de internet, tiene un saldo pendiente, por favor llamar a servicio a clientes.";
         }    
        } 
        } catch (Exception e) {
              mensajeTya = "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
         }  
    }

    public void setMensajeTya(String mensajeTya) {
        this.mensajeTya = mensajeTya;
    }

    public String getMensajeTya() {
        return mensajeTya;
    }

    public void setCuentaValida(boolean cuentaValida) {
        this.cuentaValida = cuentaValida;
    }

    public boolean isCuentaValida() {
        return cuentaValida;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setDelMun(String delMun) {
        this.delMun = delMun;
    }

    public String getDelMun() {
        return delMun;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCp() {
        return cp;
    }

    public String validaCobertura() {
        try {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioDualPlay servicioDual = new ServicioDualPlay();
        ConsultaCoberturaResponseEBMType response = servicioDual.consultaCoberturaDualPlay(sesion.getSuscriptor().getCuentaSKY());
         if (response.getSCINTASConsultaCoberturaSalida().getCoverage().contains("10") || response.getSCINTASConsultaCoberturaSalida().getCoverage().contains("20")) {
             cuentaValidaCobertura= true;
         }else{
            mensajeCrecimiento = "Su cuenta no tiene cobertura para la contrataci\u00F3n de servicio de internet.";  
            cuentaValidaCobertura= false;
        }
        } catch (ServicioException e) {
            LogPC.println(this, e.getMessage());
        }
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(boxCobertura); // pass java binding of  ui component
        return "ok";
    }
    public String validaCoberturaVeTV() {
        try {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioDualPlay servicioDual = new ServicioDualPlay();
        ConsultaCoberturaResponseEBMType response = servicioDual.consultaCoberturaDualPlay(sesion.getSuscriptor().getCuentaSKY());
         if (response.getSCINTASConsultaCoberturaSalida().getCoverage().contains("5") || response.getSCINTASConsultaCoberturaSalida().getCoverage().contains("10") || response.getSCINTASConsultaCoberturaSalida().getCoverage().contains("20")) {
             cuentaValidaCoberturaVeTV= true;
         }else{
            mensajeCrecimientoVeTV = "Su cuenta no tiene cobertura para la contrataci\u00F3n de servicio de internet.";  
            cuentaValidaCoberturaVeTV= false;
        }
        } catch (ServicioException e) {
            LogPC.println(this, e.getMessage());
        }
        AdfFacesContext adfFacesContext = AdfFacesContext.getCurrentInstance();
        adfFacesContext.addPartialTarget(boxCobertura); // pass java binding of  ui component
        return "ok";
    }

    public void setMensajeCrecimiento(String mensajeCrecimiento) {
        this.mensajeCrecimiento = mensajeCrecimiento;
    }

    public String getMensajeCrecimiento() {
        return mensajeCrecimiento;
    }

    public void setCuentaValidaCobertura(boolean cuentaValidaCobertura) {
        this.cuentaValidaCobertura = cuentaValidaCobertura;
    }

    public boolean isCuentaValidaCobertura() {
        return cuentaValidaCobertura;
    }

    public void setBoxCobertura(RichPanelBox boxCobertura) {
        this.boxCobertura = boxCobertura;
    }

    public RichPanelBox getBoxCobertura() {
        return boxCobertura;
    }

    public void setMensajeVeTv(String mensajeVeTv) {
        this.mensajeVeTv = mensajeVeTv;
    }

    public String getMensajeVeTv() {
        return mensajeVeTv;
    }

    public void setCuentaValidaVeTv(boolean cuentaValidaVeTv) {
        this.cuentaValidaVeTv = cuentaValidaVeTv;
    }

    public boolean isCuentaValidaVeTv() {
        return cuentaValidaVeTv;
    }

    public void setMensajeCrecimientoVeTV(String mensajeCrecimientoVeTV) {
        this.mensajeCrecimientoVeTV = mensajeCrecimientoVeTV;
    }

    public String getMensajeCrecimientoVeTV() {
        return mensajeCrecimientoVeTV;
    }

    public void setCuentaValidaCoberturaVeTV(boolean cuentaValidaCoberturaVeTV) {
        this.cuentaValidaCoberturaVeTV = cuentaValidaCoberturaVeTV;
    }

    public boolean isCuentaValidaCoberturaVeTV() {
        return cuentaValidaCoberturaVeTV;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPrecio() {
        return precio;
    }
    }
