package mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class InformacionDeAutenticacion implements Serializable {
    @SuppressWarnings("compatibility:4117244046311110721")
    private static final long serialVersionUID = 1L;

    private String acsUrl;
    private String xid;
    private String stepUpUrl;
    private String authenticationTransactionId;
    private String pareq;
    private String veresEnrolled;
    private String proxyPan;
    private String authenticationPath;
    private String proofXml;
    private String specificationVersion;
    private String token;
    private String ecommerceIndicator;
    private String eciRaw;
    private String parRes;
    private String cavv;
    private String ucafAuthenticationData;
    private String ucafCollectionIndicator;
    private String directoryServerTransactionId;

    public InformacionDeAutenticacion() {
        super();
    }

    public void setAcsUrl(String acsUrl) {
        this.acsUrl = acsUrl;
    }

    @JsonProperty("acsUrl")
    public String getAcsUrl() {
        return acsUrl;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    @JsonProperty("xid")
    public String getXid() {
        return xid;
    }

    public void setStepUpUrl(String stepUpUrl) {
        this.stepUpUrl = stepUpUrl;
    }

    @JsonProperty("stepUpUrl")
    public String getStepUpUrl() {
        return stepUpUrl;
    }

    public void setAuthenticationTransactionId(String authenticationTransactionId) {
        this.authenticationTransactionId = authenticationTransactionId;
    }

    @JsonProperty("authenticationTransactionId")
    public String getAuthenticationTransactionId() {
        return authenticationTransactionId;
    }

    public void setPareq(String pareq) {
        this.pareq = pareq;
    }

    @JsonProperty("pareq")
    public String getPareq() {
        return pareq;
    }

    public void setVeresEnrolled(String veresEnrolled) {
        this.veresEnrolled = veresEnrolled;
    }

    @JsonProperty("veresEnrolled")
    public String getVeresEnrolled() {
        return veresEnrolled;
    }

    public void setProxyPan(String proxyPan) {
        this.proxyPan = proxyPan;
    }

    @JsonProperty("proxyPan")
    public String getProxyPan() {
        return proxyPan;
    }

    public void setAuthenticationPath(String authenticationPath) {
        this.authenticationPath = authenticationPath;
    }

    @JsonProperty("authenticationPath")
    public String getAuthenticationPath() {
        return authenticationPath;
    }

    public void setProofXml(String proofXml) {
        this.proofXml = proofXml;
    }

    @JsonProperty("proofXml")
    public String getProofXml() {
        return proofXml;
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

    public void setUcafAuthenticationData(String ucafAuthenticationData) {
        this.ucafAuthenticationData = ucafAuthenticationData;
    }

    @JsonProperty("ucafAuthenticationData")
    public String getUcafAuthenticationData() {
        return ucafAuthenticationData;
    }

    public void setUcafCollectionIndicator(String ucafCollectionIndicator) {
        this.ucafCollectionIndicator = ucafCollectionIndicator;
    }

    @JsonProperty("ucafCollectionIndicator")
    public String getUcafCollectionIndicator() {
        return ucafCollectionIndicator;
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
