package mx.com.sky.sel.dto;

public class ConsultarCtaCelSkyRequestDTO {
    private String numeroCelular;
    
    public ConsultarCtaCelSkyRequestDTO() {
        super();
    }
    
    public ConsultarCtaCelSkyRequestDTO(String numero) {
        super();
        this.numeroCelular = numero;
    }
    
    public void setNumeroCelular(String numero){
        this.numeroCelular = numero;
    }
    
    public String getNumeroCelular(){
        return this.numeroCelular;
    }
}
