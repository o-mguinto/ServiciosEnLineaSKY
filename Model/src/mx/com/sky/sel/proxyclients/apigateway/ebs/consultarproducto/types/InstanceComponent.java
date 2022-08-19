package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InstanceComponent implements Serializable {
    @SuppressWarnings("compatibility:7773324756740501932")
    private static final long serialVersionUID = -6555149369000186938L;


    private String productName;
    private String partNumber;
    private String category;
    private String description;
    private String penaltyFlag;
    private String provisionType;
    
    public InstanceComponent() {
        super();
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
    @JsonProperty("PartNumber")
    public String getPartNumber() {
        return partNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    public void setPenaltyFlag(String penaltyFlag) {
        this.penaltyFlag = penaltyFlag;
    }
    @JsonProperty("PenaltyFlag")
    public String getPenaltyFlag() {
        return penaltyFlag;
    }

    public void setProvisionType(String provisionType) {
        this.provisionType = provisionType;
    }
    @JsonProperty("ProvisionType")
    public String getProvisionType() {
        return provisionType;
    }
}
