package mx.com.sky.sel.managedbeans.canal;

import java.io.Serializable;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.btgew.ActivacionBean;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class PFHotGoContrata implements Serializable{
    @SuppressWarnings("compatibility:4351419222682485694")
    private static final long serialVersionUID = 250309955365649019L;
    private boolean aceptaTerminosHotGo;
    private String mensaje;
    public PFHotGoContrata() {
        super();
        aceptaTerminosHotGo=false;
    }

    private String contratar() {
        mensaje = "";
        String respuesta="";
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String cuentaSKY = sesion.getUsuario().getCuentaSKY();
        String paqueteSKY = sesion.getSuscriptor().getPaquete();
        ActivacionBean activacionBean = new ActivacionBean();
        //se agrega idSesion
        activacionBean.setIdSesion(sesion.getIdSesion());
        activacionBean.setCuentaSKY(cuentaSKY);
        activacionBean.setPaqueteSKY(paqueteSKY);
        activacionBean.setVeo("NO");
        activacionBean.setOtt("NO");
        activacionBean.setProducto("HOT GO");
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONTRATA_HOTGO);
        BindingContainer bindings = getBindings();
        OperationBinding op = bindings.getOperationBinding("activarServiciosHOTGOPs");
        
        op.getParamsMap().put("activacionBean", activacionBean);
        respuesta = String.valueOf(op.execute());
        
        return respuesta;
    }
    public String contratarHotGo() {
        String respuesta = "";
        try {
            respuesta = contratar();
            if (respuesta.equalsIgnoreCase("0")) {
                respuesta="siguiente";
            }else{
                ADFUtils.showErrorMessage("No puede contratar HOT GO por favor llame a atenci\u00F3n a clientes.");
                respuesta="warning";
            }
        } catch (Exception e) {
            LogServicios.println(this, e);
        }
        return respuesta;
    }

    public String confirmarHotGo() {
    String respuesta ="";
    if (aceptaTerminosHotGo) {
            respuesta="siguiente";
    }else{
        ADFUtils.showErrorMessage("Debe aceptar los t\u00E9rminos y condiciones de uso.");
        respuesta = null;
    }
        return respuesta;
    }

    public void setAceptaTerminosHotGo(boolean aceptaTerminosHotGo) {
        this.aceptaTerminosHotGo = aceptaTerminosHotGo;
    }

    public boolean isAceptaTerminosHotGo() {
        return aceptaTerminosHotGo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
}

