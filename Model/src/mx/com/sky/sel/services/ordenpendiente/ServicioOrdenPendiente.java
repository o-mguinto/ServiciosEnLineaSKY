package mx.com.sky.sel.services.ordenpendiente;
import java.io.Serializable;

import javax.xml.ws.Holder;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaordenmod.ConsultaOrdenModificacion;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaordenmod.ConsultaOrdenModificacionEp;

public class ServicioOrdenPendiente implements Serializable{
    @SuppressWarnings("compatibility:-1616556174632142330")
    private static final long serialVersionUID = -6681007585161924099L;

    public ServicioOrdenPendiente() {
        super();
    }
    public String consultaOrdenModificacion (String numeroCuenta, String numeroTI){
        String respuesta="";
        ConsultaOrdenModificacionEp consultaOrdenModificacion_ep;
        consultaOrdenModificacion_ep = new ConsultaOrdenModificacionEp();
        ConsultaOrdenModificacion consultaOrdenModificacion = consultaOrdenModificacion_ep.getConsultaOrdenModificacionPt();
        Holder<String> errorCode = new Holder<String>();
        Holder<String> errorDesc = new Holder<String>();
        Holder<String> ordenModificacionPendiente =  new Holder<String>();
        
        consultaOrdenModificacion.consultaOrdenModificacion(numeroTI,numeroCuenta,errorCode,errorDesc,ordenModificacionPendiente);
        if (errorCode.value.equalsIgnoreCase("0")) {
            respuesta = ordenModificacionPendiente.value;
        }else{
            respuesta = "Y";
        }
        return respuesta;
    }
}