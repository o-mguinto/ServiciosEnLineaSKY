package mx.com.sky.sel.proxyclients.apigateway.ebs.actualizarestatusbilletera.types;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestActualizarEstatusBilletera implements Serializable {
    @SuppressWarnings("compatibility:-7353673094553521786")
    private static final long serialVersionUID = 1L;

    private EBMHeaderRequest header;
    private BilleteraEmailControlCollection billeteraEmailControlCollection;

    public RequestActualizarEstatusBilletera() {
        super();
    }

    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }

    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setBilleteraEmailControlCollection(BilleteraEmailControlCollection billeteraEmailControlCollection) {
        this.billeteraEmailControlCollection = billeteraEmailControlCollection;
    }

    @JsonProperty("BilleteraEmailControlCollection")
    public BilleteraEmailControlCollection getBilleteraEmailControlCollection() {
        return billeteraEmailControlCollection;
    }

}
