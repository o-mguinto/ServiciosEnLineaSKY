package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class RequestConsultarProducto implements Serializable {
    @SuppressWarnings("compatibility:-8847050370184431835")
    private static final long serialVersionUID = -1522054348675522043L;


    private List<ContratoSiebel> contratoSiebel;
    public RequestConsultarProducto() {
        super();
        contratoSiebel = new ArrayList<ContratoSiebel>();
    }

    public void setContratoSiebel(List<ContratoSiebel> contratoSiebel) {
        this.contratoSiebel = contratoSiebel;
    }
    @JsonProperty("ContratoSiebel")
    public List<ContratoSiebel> getContratoSiebel() {
        return contratoSiebel;
    }
}
