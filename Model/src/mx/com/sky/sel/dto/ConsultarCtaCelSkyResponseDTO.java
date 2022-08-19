package mx.com.sky.sel.dto;

public class ConsultarCtaCelSkyResponseDTO {
    private String codigoError;
    private String descError;
    private String numeroCuenta;
    private String msidn;
    
    public ConsultarCtaCelSkyResponseDTO(){}
    
    public ConsultarCtaCelSkyResponseDTO(String cuenta, String msidn) {
        super();
        this.numeroCuenta = cuenta;
        this.msidn = msidn;
    }
    
    public void setNumeroCuenta(String cuenta){
        this.numeroCuenta = cuenta;
    }
    
    public void setMsidn(String msidn){
        this.msidn = msidn;
    }
    
    public void setCodigoError(String codigo){
        this.codigoError = codigo;
    }
    
    public void setDescError(String desc){
        this.descError = desc;
    }
    
    public String getCodigoError(){
        return this.codigoError;
    }
    
    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }
    
    public String getDescError(){
        return this.descError;
    }
    
    public String getMsidn(){
        return this.msidn;
    }
}

