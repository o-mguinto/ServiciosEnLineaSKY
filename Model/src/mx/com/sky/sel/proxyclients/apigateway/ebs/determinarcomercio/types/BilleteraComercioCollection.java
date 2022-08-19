package mx.com.sky.sel.proxyclients.apigateway.ebs.determinarcomercio.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class BilleteraComercioCollection implements Serializable {
    @SuppressWarnings("compatibility:-3766487233143447412")
    private static final long serialVersionUID = -1459091354292733319L;


    private List<BilleteraComercio> billeteraComercio;
    public BilleteraComercioCollection() {
        super();
        billeteraComercio = new ArrayList<BilleteraComercio>();
    }

    public void setBilleteraComercio(List<BilleteraComercio> billeteraComercio) {
        this.billeteraComercio = billeteraComercio;
    }
    @JsonProperty("BilleteraComercio")
    public List<BilleteraComercio> getBilleteraComercio() {
        return billeteraComercio;
    }
}
