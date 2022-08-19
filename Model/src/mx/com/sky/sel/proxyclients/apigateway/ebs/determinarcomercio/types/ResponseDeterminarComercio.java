package mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseDeterminarComercio implements Serializable {
    @SuppressWarnings("compatibility:-382693106692140523")
    private static final long serialVersionUID = 59368652992447415L;


    private EBMHeaderResponse header;
    private BilleteraComercioCollection billeteraComercioCollection;
    public ResponseDeterminarComercio() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setBilleteraComercioCollection(BilleteraComercioCollection billeteraComercioCollection) {
        this.billeteraComercioCollection = billeteraComercioCollection;
    }
    @JsonProperty("BilleteraComercioCollection")
    public BilleteraComercioCollection getBilleteraComercioCollection() {
        return billeteraComercioCollection;
    }
}
