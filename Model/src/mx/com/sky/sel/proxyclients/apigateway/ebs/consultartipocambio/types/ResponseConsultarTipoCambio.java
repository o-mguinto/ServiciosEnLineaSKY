package mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;


import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseConsultarTipoCambio implements Serializable {
    @SuppressWarnings("compatibility:3993582617212029974")
    private static final long serialVersionUID = 578113092059920559L;

    private EBMHeaderResponse header;
    private BilleteraTipoCambioCollection billeteraTipoCambioCollection;
    
    public ResponseConsultarTipoCambio() {
        super();
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }

    public void setBilleteraTipoCambioCollection(BilleteraTipoCambioCollection billeteraTipoCambioCollection) {
        this.billeteraTipoCambioCollection = billeteraTipoCambioCollection;
    }
    @JsonProperty("BilleteraTipoCambioCollection")
    public BilleteraTipoCambioCollection getBilleteraTipoCambioCollection() {
        return billeteraTipoCambioCollection;
    }
}
