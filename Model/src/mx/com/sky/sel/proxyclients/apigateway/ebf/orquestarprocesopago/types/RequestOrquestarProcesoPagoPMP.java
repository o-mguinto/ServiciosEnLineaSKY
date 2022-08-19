package mx.com.sky.sel.proxyclients.apigateway.ebf.orquestarprocesopago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestOrquestarProcesoPagoPMP implements Serializable {
    @SuppressWarnings("compatibility:317142453028955841")
    private static final long serialVersionUID = -1685610665391219259L;
    
    private EBMHeaderRequest header;
    private DatosTarjeta_Entrada datosTarjeta_Entrada;
    private DatosTransaccion_Entrada datosTransaccion_Entrada;
    public RequestOrquestarProcesoPagoPMP() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setDatosTarjeta_Entrada(DatosTarjeta_Entrada datosTarjeta_Entrada) {
        this.datosTarjeta_Entrada = datosTarjeta_Entrada;
    }
    @JsonProperty("DatosTarjeta_Entrada")
    public DatosTarjeta_Entrada getDatosTarjeta_Entrada() {
        return datosTarjeta_Entrada;
    }

    public void setDatosTransaccion_Entrada(DatosTransaccion_Entrada datosTransaccion_Entrada) {
        this.datosTransaccion_Entrada = datosTransaccion_Entrada;
    }
    @JsonProperty("DatosTransaccion_Entrada")
    public DatosTransaccion_Entrada getDatosTransaccion_Entrada() {
        return datosTransaccion_Entrada;
    }
}
