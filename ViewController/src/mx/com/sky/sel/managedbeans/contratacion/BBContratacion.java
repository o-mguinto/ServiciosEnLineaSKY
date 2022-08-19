package mx.com.sky.sel.managedbeans.contratacion;
import java.io.Serializable;

import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.utils.ADFUtils;

import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.model.BindingContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;


/**
 * BackingBean para contrataciones
 */
public class BBContratacion implements Serializable {
    @SuppressWarnings("compatibility:-401226380709655477")
    private static final long serialVersionUID = 8289691327320783243L;

    //la tarjeta inteligente
    private String ti;

    public BBContratacion() {
        super();
        try {
            ti = (String)ADFUtils.getValueBindings("bindings.tablaTI.tarjetaInteligente");
            LogPC.println(this, "Tarjeta Inteligente a mostrar: " + ti);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param valueChangeEvent
     */
    public void cambiarTarjetaInteligente(ValueChangeEvent valueChangeEvent) {
        // llamar calcular la tabla
        LogPC.println(this, "new Val>" + valueChangeEvent.getNewValue());
        calcularTabla();
    }

    /**
     *
     */
    private void calcularTabla() {
        LogPC.println(this, "Obtener tabla");
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("getPagoPorEventosContratados");
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PPV_CONTRATADOS);
        Object result = operationBinding.execute();
        if (!operationBinding.getErrors().isEmpty()) {
            LogPC.printlnWarn(this, "No se calculo tabla");
            return;
        }
    }

    /**
     *Obtiene el contenedor de bindings
     * @return
     */
    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

    public String getTi() {
        return ti;
    }
}
