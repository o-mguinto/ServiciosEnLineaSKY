package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InformacionDeAutenticacion implements Serializable {
    @SuppressWarnings("compatibility:-5974459909639166592")
    private static final long serialVersionUID = 1L;


    private String xid;
    private String authenticationTransactionId;
    private String veresEnrolled;
    private String specificationVersion;
    private String token;
    private String ecommerceIndicator;
    private String eciRaw;
    private String parRes;
    private String cavv;
    private String ucafCollectionIndicator;
    private String ucafAuthenticationData;
    private String directoryServerTransactionId;
    
    public InformacionDeAutenticacion() {
        super();
    }
    
    public void setXid(String xid) {
        this.xid = xid;
    }
    @JsonProperty("xid")
    public String getXid() {
        return xid;
    }

    public void setAuthenticationTransactionId(String authenticationTransactionId) {
        this.authenticationTransactionId = authenticationTransactionId;
    }
    @JsonProperty("authenticationTransactionId")
    public String getAuthenticationTransactionId() {
        return authenticationTransactionId;
    }

    public void setVeresEnrolled(String veresEnrolled) {
        this.veresEnrolled = veresEnrolled;
    }
    @JsonProperty("veresEnrolled")
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    public void setSpecificationVersion(String specificationVersion) {
        this.specificationVersion = specificationVersion;
    }
    @JsonProperty("specificationVersion")
    public String getSpecificationVersion() {
        return specificationVersion;
    }

    public void setToken(String token) {
        this.token = token;
    }
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    public void setEcommerceIndicator(String ecommerceIndicator) {
        this.ecommerceIndicator = ecommerceIndicator;
    }
    @JsonProperty("ecommerceIndicator")
    public String getEcommerceIndicator() {
        return ecommerceIndicator;
    }

    public void setEciRaw(String eciRaw) {
        this.eciRaw = eciRaw;
    }
    @JsonProperty("eciRaw")
    public String getEciRaw() {
        return eciRaw;
    }

    public void setCavv(String cavv) {
        this.cavv = cavv;
    }
    @JsonProperty("cavv")
    public String getCavv() {
        return cavv;
    }

    public void setUcafCollectionIndicator(String ucafCollectionIndicator) {
        this.ucafCollectionIndicator = ucafCollectionIndicator;
    }
    @JsonProperty("ucafCollectionIndicator")
    public String getUcafCollectionIndicator() {
        return ucafCollectionIndicator;
    }

    public void setUcafAuthenticationData(String ucafAuthenticationData) {
        this.ucafAuthenticationData = ucafAuthenticationData;
    }
    @JsonProperty("ucafAuthenticationData")
    public String getUcafAuthenticationData() {
        return ucafAuthenticationData;
    }

    public void setDirectoryServerTransactionId(String directoryServerTransactionId) {
        this.directoryServerTransactionId = directoryServerTransactionId;
    }
    @JsonProperty("directoryServerTransactionId")
    public String getDirectoryServerTransactionId() {
        return directoryServerTransactionId;
    }

    public void setParRes(String parRes) {
        this.parRes = parRes;
    }
    @JsonProperty("parRes")
    public String getParRes() {
        return parRes;
    }
}
