package mx.com.sky.sel.managedbeans;

import java.io.Serializable;

import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.pagos.BBPago;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class BBIndex implements Serializable {
    @SuppressWarnings("compatibility:545168353642806451")
    private static final long serialVersionUID = -8831580562915381030L;

    private transient RichRegion dynamicRegion1;
    //private String taskFlowId = "/WEB-INF/pagoTF.xml#pagoTF";

    public BBIndex() {
    }

    public void itCuenta_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String cuentaSKY = (String)valueChangeEvent.getNewValue();
        LogPC.println(this, "itCuenta_ValueChange:" + cuentaSKY);
        if (cuentaSKY != null) {
            cambiarSuscriptorCuenta(cuentaSKY);
        }
    }

    public void socCuenta_ValueChange(ValueChangeEvent valueChangeEvent) {
        // Add event code here...
        String cuentaSKY = (String)valueChangeEvent.getNewValue();
        LogPC.println(this, "socCuenta_ValueChange:" + cuentaSKY);
        if (cuentaSKY != null) {
            cambiarSuscriptorCuenta(cuentaSKY);
        }
    }


    private void cambiarSuscriptorCuenta(String cuentaSKY) {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        sesion.getUsuario().setCuentaSKY(cuentaSKY);
        sesion.isCuentaJerarquia(sesion.getUsuario().getCuentaSKY());
        sesion.actualizarDatosSuscriptor();
        actualizarTabla();
        actualizarSaldo();
        actualizarFacturas();
        
        //refreshPage();
        //ADFUtils.addPartialTarget(dynamicRegion1);
    }
    
    public String refreshPage() {
        LogPC.println(this, "refrescando página por acción de cambio de cuenta");
        FacesContext fctx = FacesContext.getCurrentInstance();
        String refreshpage = fctx.getViewRoot().getViewId();
        ViewHandler ViewH = fctx.getApplication().getViewHandler();
        UIViewRoot UIV = ViewH.createView(fctx, refreshpage);
        UIV.setViewId(refreshpage);
        fctx.setViewRoot(UIV);
        return "";
    }
    
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String actualizarTabla() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding =
            bindings.getOperationBinding("ActualizarTabla");
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }
    public String actualizarSaldo() {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding =
                bindings.getOperationBinding("consultaSaldo");
            Object result = operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                return null;
            }
            return null;
        }
    public String actualizarFacturas() {
            BindingContainer bindings = getBindings();
            OperationBinding operationBinding =
                bindings.getOperationBinding("consultarFacturas");
            Object result = operationBinding.execute();
            if (!operationBinding.getErrors().isEmpty()) {
                return null;
            }
            return null;
        }
    public void setDynamicRegion1(RichRegion dynamicRegion1) {
        this.dynamicRegion1 = dynamicRegion1;
    }

    public RichRegion getDynamicRegion1() {
        return dynamicRegion1;
    }
/*
    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }
*/
}
