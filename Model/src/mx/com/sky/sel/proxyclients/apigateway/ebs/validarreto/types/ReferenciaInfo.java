package mx.com.sky.sel.proxyclients.apigateway.ebs.validarreto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReferenciaInfo implements Serializable {
    @SuppressWarnings("compatibility:4140521040268275303")
    private static final long serialVersionUID = 1L;


    private String codigo;
    
    public ReferenciaInfo() {
        super();
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @JsonProperty("Codigo")
    public String getCodigo() {
        return codigo;
    }
}
