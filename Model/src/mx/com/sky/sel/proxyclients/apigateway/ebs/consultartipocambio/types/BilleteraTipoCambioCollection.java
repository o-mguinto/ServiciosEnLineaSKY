package mx.com.sky.sel.proxyclients.apigateway.ebs.consultartipocambio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class BilleteraTipoCambioCollection implements Serializable  {
    @SuppressWarnings("compatibility:6361562727845127718")
    private static final long serialVersionUID = -7485983162891689409L;

    private List<BilleteraTipoCambio> billeteraTipoCambio;

    public BilleteraTipoCambioCollection() {
        super();
        billeteraTipoCambio = new ArrayList<BilleteraTipoCambio>();
    }

    public void setBilleteraTipoCambio(List<BilleteraTipoCambio> billeteraTipoCambio) {
        this.billeteraTipoCambio = billeteraTipoCambio;
    }
    @JsonProperty("BilleteraTipoCambio")
    public List<BilleteraTipoCambio> getBilleteraTipoCambio() {
        return billeteraTipoCambio;
    }
}
