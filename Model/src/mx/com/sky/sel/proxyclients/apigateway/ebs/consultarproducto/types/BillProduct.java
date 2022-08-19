package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class BillProduct implements Serializable {
    @SuppressWarnings("compatibility:-7239460130623346566")
    private static final long serialVersionUID = 5717840402937652616L;


    private String billingProductName;
    private String billingPartNumber;
    
    public BillProduct() {
        super();
    }

    public void setBillingProductName(String billingProductName) {
        this.billingProductName = billingProductName;
    }
    @JsonProperty("BillingProductName")
    public String getBillingProductName() {
        return billingProductName;
    }

    public void setBillingPartNumber(String billingPartNumber) {
        this.billingPartNumber = billingPartNumber;
    }
    @JsonProperty("BillingPartNumber")
    public String getBillingPartNumber() {
        return billingPartNumber;
    }
}
