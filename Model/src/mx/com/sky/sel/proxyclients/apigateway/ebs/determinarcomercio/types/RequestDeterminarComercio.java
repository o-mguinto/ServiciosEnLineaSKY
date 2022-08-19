package mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;
import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestDeterminarComercio implements Serializable {
    @SuppressWarnings("compatibility:3451699658996568759")
    private static final long serialVersionUID = -6373691958349149927L;


    private EBMHeaderRequest header;
    private ConsultarComercioInput inputParameters;
    
    public RequestDeterminarComercio() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }


    public void setInputParameters(ConsultarComercioInput inputParameters) {
        this.inputParameters = inputParameters;
    }
    
    @JsonProperty("ConsultarComercioInput")
    public ConsultarComercioInput getInputParameters() {
        return inputParameters;
    }

}
