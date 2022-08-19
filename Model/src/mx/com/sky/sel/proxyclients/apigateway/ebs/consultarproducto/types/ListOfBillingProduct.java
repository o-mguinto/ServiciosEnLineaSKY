package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.List;

public class ListOfBillingProduct implements Serializable {
    @SuppressWarnings("compatibility:2767554359218065066")
    private static final long serialVersionUID = -8492313535685348609L;


    private List<BillProduct> billProduct;
    public ListOfBillingProduct() {
        super();
    }

    public void setBillProduct(List<BillProduct> billProduct) {
        this.billProduct = billProduct;
    }
    @JsonProperty("BillProduct")
    public List<BillProduct> getBillProduct() {
        return billProduct;
    }
}
