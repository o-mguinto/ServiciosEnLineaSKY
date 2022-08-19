package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Product implements Serializable {
    @SuppressWarnings("compatibility:2457517049261130689")
    private static final long serialVersionUID = -8681071263925394176L;


    private String productName;
    private String description;
    private String partNumber;
    private String category;
    private String dataBag;
    private String uomDataBag;
    private String requereRegionFlag;
    private String timePack;
    private String uomTimePack;
    private String smsPack;
    private ListOfBillingProduct listOfBillingProduct;
    
    public Product() {
        super();
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    @JsonProperty("ProductName")
    public String getProductName() {
        return productName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("Description")
    public String getDescription() {
        return description;
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

    public void setDataBag(String dataBag) {
        this.dataBag = dataBag;
    }
    @JsonProperty("DataBag")
    public String getDataBag() {
        return dataBag;
    }

    public void setUomDataBag(String uomDataBag) {
        this.uomDataBag = uomDataBag;
    }
    @JsonProperty("UOMDataBag")
    public String getUomDataBag() {
        return uomDataBag;
    }

    public void setRequereRegionFlag(String requereRegionFlag) {
        this.requereRegionFlag = requereRegionFlag;
    }
    @JsonProperty("RequereRegionFlag")
    public String getRequereRegionFlag() {
        return requereRegionFlag;
    }

    public void setTimePack(String timePack) {
        this.timePack = timePack;
    }
    @JsonProperty("TimePack")
    public String getTimePack() {
        return timePack;
    }

    public void setUomTimePack(String uomTimePack) {
        this.uomTimePack = uomTimePack;
    }
    @JsonProperty("UOMTimePack")
    public String getUomTimePack() {
        return uomTimePack;
    }

    public void setSmsPack(String smsPack) {
        this.smsPack = smsPack;
    }
    @JsonProperty("SMSPack")
    public String getSmsPack() {
        return smsPack;
    }

    public void setListOfBillingProduct(ListOfBillingProduct listOfBillingProduct) {
        this.listOfBillingProduct = listOfBillingProduct;
    }
    @JsonProperty("ListOfBillingProduct")
    public ListOfBillingProduct getListOfBillingProduct() {
        return listOfBillingProduct;
    }
}
