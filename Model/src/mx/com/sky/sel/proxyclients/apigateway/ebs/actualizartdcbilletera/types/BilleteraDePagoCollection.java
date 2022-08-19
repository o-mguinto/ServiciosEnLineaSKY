package mx.com.sky.sel.proxyclients.apigateway.ebs.actualizartdcbilletera.types;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BilleteraDePagoCollection implements Serializable {
    @SuppressWarnings("compatibility:8556772858801881059")
    private static final long serialVersionUID = 1L;
    private List<BilleteraDePago> billeteraDePago;

    public BilleteraDePagoCollection() {
        super();
        this.billeteraDePago = new ArrayList<BilleteraDePago>();
    }

    public void setBilleteraDePago(List<BilleteraDePago> billeteraDePago) {
        this.billeteraDePago = billeteraDePago;
    }

    @JsonProperty("BilleteraDePago")
    public List<BilleteraDePago> getBilleteraDePago() {
        return billeteraDePago;
    }
}
