package mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseGenerarIdUnicoDePago implements Serializable {
    @SuppressWarnings("compatibility:5897050604719310378")
    private static final long serialVersionUID = -6271522709347808989L;
    
    private EBMHeaderResponse header;
    private SalidaProcess salidaProcess;
    public ResponseGenerarIdUnicoDePago() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setSalidaProcess(SalidaProcess salidaProcess) {
        this.salidaProcess = salidaProcess;
    }
    @JsonProperty("Salida_Process")
    public SalidaProcess getSalidaProcess() {
        return salidaProcess;
    }
}
