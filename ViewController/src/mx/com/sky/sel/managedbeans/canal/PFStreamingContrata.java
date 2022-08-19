package mx.com.sky.sel.managedbeans.canal;

import mx.com.sky.sel.services.beans.canal.CanalCarta;
import java.io.Serializable;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class PFStreamingContrata extends UtileriasMB implements Serializable{
    @SuppressWarnings("compatibility:7661042683892672217")
    private static final long serialVersionUID = -579329791017315955L;
    private CanalCarta canal;
    private boolean mostrarAviso;
    private String numeroSS;
    private String exception;
    private boolean aceptaTerminos;
    
    public PFStreamingContrata() {
        super();
        LogPC.println(this, "PFStreamingContrata()");
        this.canal = new CanalCarta();
        this.aceptaTerminos = false;
    }


    public void setAceptaTerminos(boolean aceptaTerminos) {
        this.aceptaTerminos = aceptaTerminos;
    }

    public boolean isAceptaTerminos() {
        return aceptaTerminos;
    }

    public void setCanal(CanalCarta canal) {
        this.canal = canal;
    }

    public CanalCarta getCanal() {
        return canal;
    }
    
    private void limpiarDatos() {
        canal = new CanalCarta();
    }

    public void setMostrarAviso(boolean mostrarAviso) {
        this.mostrarAviso = mostrarAviso;
    }

    public boolean isMostrarAviso() {
        return mostrarAviso;
    }
    
    public boolean isDisneyPlus(){
        return this.canal.getNombre().toLowerCase().contains("disney");
    }
    
    public void setException(String exception){
        this.exception = exception;
    }
    
    public String getException(){
        return this.exception;
    }

    public void setNumeroSS(String numeroSS) {
        this.numeroSS = numeroSS;
    }

    public String getnumeroSS() {
        return this.numeroSS;
    }

    // Metodos para eventos de botones
    public String cbSiguiente_action() {
        return "siguiente";
    }
    
    public String cbCancelar_action() {
        LogPC.println(this, "cbCancelar_action");
        limpiarDatos();
        return "closeTaskFlow";
    }
    
    public String cbContratar_action() {
        String resultado = null;
        mostrarAviso = false;
        if(!this.aceptaTerminos) {
            ADFUtils.showErrorMessage("Debe aceptar los t\u00E9rminos y condiciones de uso.");
            return resultado;
        }
        try {
            if (contratar()) {
                resultado = "siguiente";
            } else {
                ADFUtils.showErrorMessage("No puede contratar " + canal.getNombre() + " por favor llame a atenci\u00F3n a clientes.");
                resultado = "warning";
            }
        } catch (Exception e) {
            if(e.getMessage().contains("Estimado suscriptor el canal solicitado ya se encuentra activo en su cuenta")){
                ADFUtils.showInfoMessage(e.getMessage());
                this.setException(e.getMessage());
                mostrarAviso = true;
                resultado = "warning";
            }else{
                ADFUtils.showErrorMessage(getMensajeProperties("mensaje_PantallaError_generico"));
                this.setException(getMensajeProperties("mensaje_PantallaError_generico"));
                resultado = "warning";   
            }
        }
        LogPC.println(this, "Valor de var resultado:   ");
        LogPC.println(this, resultado);
        return resultado;
    }
    
    
    // Metodos que llaman Method Bindings
    private boolean contratar() throws Exception {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        try {
            BindingContainer bindings = getBindings();
            OperationBinding op = bindings.getOperationBinding("contratarServicioStreaming");
            op.getParamsMap().put("producto", canal.getId());
            op.getParamsMap().put("cuenta", sesion.getSuscriptor().getCuentaSKY());
            op.getParamsMap().put("assetNumber", sesion.getSuscriptor().getAssetNumberVideo());
            op.getParamsMap().put("secondAssetNumber", sesion.getSuscriptor().getSecondAssetNumberVideo());
            System.out.println("Enviando peticion desde PFStreamingContrata");
            this.numeroSS = String.valueOf(op.execute());
            System.out.println("SS PFStreamingContrata " + this.numeroSS);
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAC, "Compra CAC:" + this.numeroSS);
            if(this.numeroSS.isEmpty()){
                return false;
            } 
        } catch (Exception e) {
            System.out.println("Excepcion en PGStreamingContrata " + e.getMessage());
            LogPC.printlnError(this, e.getMessage(), e);
            throw e;
        }
        return true;
    }

}
