package mx.com.sky.sel.proxyclients.apigateway.ebs.generarjwtoken.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class ReferenciaInfo implements Serializable {
    @SuppressWarnings("compatibility:-5099055157968711253")
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
