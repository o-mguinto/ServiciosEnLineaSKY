package mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import mx.com.sky.sel.proxyclients.apigateway.headers.request.EBMHeaderRequest;

public class RequestActualizarTDCBilletera implements Serializable {
    @SuppressWarnings("compatibility:-5182357949561449655")
    private static final long serialVersionUID = 1L;

    private EBMHeaderRequest header;
    private BilleteraDePagoCollection billeteraDePagoCollection;

    public RequestActualizarTDCBilletera() {
        super();
    }


    public void setHeader(EBMHeaderRequest header) {
        this.header = header;
    }
    
    @JsonProperty("EBMHeaderRequest")
    public EBMHeaderRequest getHeader() {
        return header;
    }

    public void setBilleteraDePagoCollection(BilleteraDePagoCollection billeteraDePagoCollection) {
        this.billeteraDePagoCollection = billeteraDePagoCollection;
    }
    
    @JsonProperty("BilleteraDePagoCollection")
    public BilleteraDePagoCollection getBilleteraDePagoCollection() {
        return billeteraDePagoCollection;
    }
}
