package mx.com.sky.sel.proxyclients.apigateway.ebs.actualizarestatusbilletera.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class BilleteraEmailControlCollection implements Serializable {
    @SuppressWarnings("compatibility:-8694441190901010640")
    private static final long serialVersionUID = 1L;
    private List<BilleteraEmailControl> billeteraEmailControl;
    
    public BilleteraEmailControlCollection() {
        super();
        billeteraEmailControl = new ArrayList<BilleteraEmailControl>();
    }

    public void setBilleteraEmailControl(List<BilleteraEmailControl> billeteraEmailControl) {
        this.billeteraEmailControl = billeteraEmailControl;
    }
    
    @JsonProperty("BilleteraEmailControl")
    public List<BilleteraEmailControl> getBilleteraEmailControl() {
        return billeteraEmailControl;
    }
}
