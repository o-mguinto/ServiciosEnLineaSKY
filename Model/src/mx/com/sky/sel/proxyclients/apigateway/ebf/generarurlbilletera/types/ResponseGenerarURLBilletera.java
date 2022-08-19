package mx.com.sky.sel.proxyclients.apigateway.ebf.generarurlbilletera.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseGenerarURLBilletera implements Serializable {
    @SuppressWarnings("compatibility:5923774346409730129")
    private static final long serialVersionUID = -2758363365967601103L;
    
    private EBMHeaderResponse header;
    private String urlBilletera;
    
    public ResponseGenerarURLBilletera() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }

    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setUrlBilletera(String urlBilletera) {
        this.urlBilletera = urlBilletera;
    }

    @JsonProperty("URLBilletera")
    public String getUrlBilletera() {
        return urlBilletera;
    }
}
