package mx.com.sky.sel.proxyclients.apigateway.ebs.generaridunicodepago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestGenerarIdUnicoDePago implements Serializable {
    @SuppressWarnings("compatibility:7281350522944470605")
    private static final long serialVersionUID = -1247626936080444290L;
    
    private EBMHeaderRequest header;
    private EntradaProcess entradaProcess;
    
    public RequestGenerarIdUnicoDePago() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setEntradaProcess(EntradaProcess entradaProcess) {
        this.entradaProcess = entradaProcess;
    }
    @JsonProperty("Entrada_Process")
    public EntradaProcess getEntradaProcess() {
        return entradaProcess;
    }
}
