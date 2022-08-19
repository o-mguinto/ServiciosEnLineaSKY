package mx.com.sky.sel.proxyclients.apigateway.ebf.eliminarmetododepago.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseEliminarMetodoDePago implements Serializable {
    @SuppressWarnings("compatibility:-6897160190471498759")
    private static final long serialVersionUID = 2615259440882664432L;


    private EBMHeaderResponse header;
    
    
    public ResponseEliminarMetodoDePago() {
        super();
    }


    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }
}
