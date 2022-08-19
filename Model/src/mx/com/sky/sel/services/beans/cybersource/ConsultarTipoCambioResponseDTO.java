package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types.BilleteraTipoCambioCollection;
import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class ConsultarTipoCambioResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-4996938768780499407")
    private static final long serialVersionUID = -4823070947813359737L;

    private HeaderResponse header;
    private BilleteraTipoCambioCollection billeteraTipoCambioCollection;
    public ConsultarTipoCambioResponseDTO() {
        super();
        this.header = new HeaderResponse();
        this.billeteraTipoCambioCollection = new BilleteraTipoCambioCollection();
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }

    public void setBilleteraTipoCambioCollection(BilleteraTipoCambioCollection billeteraTipoCambioCollection) {
        this.billeteraTipoCambioCollection = billeteraTipoCambioCollection;
    }

    public BilleteraTipoCambioCollection getBilleteraTipoCambioCollection() {
        return billeteraTipoCambioCollection;
    }

}
