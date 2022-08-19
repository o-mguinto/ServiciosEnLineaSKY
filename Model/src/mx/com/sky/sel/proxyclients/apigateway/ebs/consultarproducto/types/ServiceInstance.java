package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ServiceInstance implements Serializable {
    @SuppressWarnings("compatibility:6923300761836168168")
    private static final long serialVersionUID = 5668504055405028342L;


    private String slaveHierarchy;
    private String assetNumber;
    private String secondAssetNumber;
    private String integrationId;
    private String serviceProductType;
    private ListOfInstanceComponent listOfInstanceComponent;
    
    public ServiceInstance() {
        super();
    }

    public void setListOfInstanceComponent(ListOfInstanceComponent listOfInstanceComponent) {
        this.listOfInstanceComponent = listOfInstanceComponent;
    }
    @JsonProperty("ListOfInstanceComponent")
    public ListOfInstanceComponent getListOfInstanceComponent() {
        return listOfInstanceComponent;
    }

    public void setSlaveHierarchy(String slaveHierarchy) {
        this.slaveHierarchy = slaveHierarchy;
    }
    @JsonProperty("SlaveHierarchy")
    public String getSlaveHierarchy() {
        return slaveHierarchy;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }
    @JsonProperty("AssetNumber")
    public String getAssetNumber() {
        return assetNumber;
    }

    public void setSecondAssetNumber(String secondAssetNumber) {
        this.secondAssetNumber = secondAssetNumber;
    }
    @JsonProperty("SecondAssetNumber")
    public String getSecondAssetNumber() {
        return secondAssetNumber;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }
    @JsonProperty("IntegrationId")
    public String getIntegrationId() {
        return integrationId;
    }

    public void setServiceProductType(String serviceProductType) {
        this.serviceProductType = serviceProductType;
    }
    @JsonProperty("ServiceProductType")
    public String getServiceProductType() {
        return serviceProductType;
    }
}
