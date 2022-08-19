package mx.com.sky.sel.managedbeans.quejas;

import java.io.Serializable;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.utils.SolicitudServicioUtils;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;
import oracle.adf.view.rich.component.rich.RichPopup;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

public class BBQuejas implements Serializable {
    @SuppressWarnings("compatibility:-2278924997215138038")
    private static final long serialVersionUID = 1389778252556032315L;
    private transient RichPopup popupQueja;

    /**
     * Constructor
     */
    public BBQuejas() {
    }

    /**
     *Obtiene el contenedor de bindings
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     *  Agregar queja y actualizar tabla
     * @return
     */
    public String cbAgregarQueja_action() {
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("agregarQueja");
        SolicitudServicioBean ssBean = null;
        String queja = null;
        queja = ADFUtils.getValueStringBindings("queja.inputValue");
        System.out.println("queja.inputValue: " + queja);
        
        ssBean = SolicitudServicioUtils.convert(ssBean, "Quejas: " + queja);
        operationBinding.getParamsMap().put("ssBean", ssBean);
        
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }

        bindings = getBindings();
        operationBinding = bindings.getOperationBinding("ActualizarTabla");
        result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.QUEJAS);
        ADFUtils.putValue("bindings.queja.inputValue", "");
        ADFUtils.hidePopup(popupQueja);
        return null;
    }

    public String cancelarAgregarQueja() {
        ADFUtils.hidePopup(popupQueja);
        return "";
    }
    
    public void setPopupQueja(RichPopup popupQueja) {
        this.popupQueja = popupQueja;
    }

    public RichPopup getPopupQueja() {
        return popupQueja;
    }
}
