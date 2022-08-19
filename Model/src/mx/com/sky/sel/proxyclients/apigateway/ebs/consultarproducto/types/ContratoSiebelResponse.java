package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ContratoSiebelResponse implements Serializable {
    @SuppressWarnings("compatibility:8979727031951022670")
    private static final long serialVersionUID = 3884569367371794715L;


    private String operacion;
    private String proceso;
    private String assetNumber;
    private String secondAssetNumber;
    private String categoria;
    private String cuenta;
    private String origen;
    private String errorCode;
    private String errorMessage;
    private ListOfProduct listOfProduct;
    private ListOfServiceInstance listOfServiceInstance;
    
    public ContratoSiebelResponse() {
        super();
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    @JsonProperty("Operacion")
    public String getOperacion() {
        return operacion;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }
    @JsonProperty("Proceso")
    public String getProceso() {
        return proceso;
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

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    @JsonProperty("Categoria")
    public String getCategoria() {
        return categoria;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    @JsonProperty("Cuenta")
    public String getCuenta() {
        return cuenta;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
    @JsonProperty("Origen")
    public String getOrigen() {
        return origen;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    @JsonProperty("ErrorCode")
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    @JsonProperty("ErrorMessage")
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setListOfProduct(ListOfProduct listOfProduct) {
        this.listOfProduct = listOfProduct;
    }
    @JsonProperty("ListOfProduct")
    public ListOfProduct getListOfProduct() {
        return listOfProduct;
    }

    public void setListOfServiceInstance(ListOfServiceInstance listOfServiceInstance) {
        this.listOfServiceInstance = listOfServiceInstance;
    }
    @JsonProperty("ListOfServiceInstance")
    public ListOfServiceInstance getListOfServiceInstance() {
        return listOfServiceInstance;
    }
}
