package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

public class Cabecera implements Serializable {
    @SuppressWarnings("compatibility:-4126300455605360705")
    private static final long serialVersionUID = 5921792520188175732L;


    private String operacion;
    private String aplicativo;
    private List<Parametro> parametro;
    public Cabecera() {
        super();
        parametro = new ArrayList<Parametro>();
        operacion = "";
        aplicativo = "";
    }

    public void setParametro(List<Parametro> parametro) {
        this.parametro = parametro;
    }
    @JsonProperty("PARAMETRO")
    public List<Parametro> getParametro() {
        return parametro;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    @JsonProperty("OPERACION")
    public String getOperacion() {
        return operacion;
    }

    public void setAplicativo(String aplicativo) {
        this.aplicativo = aplicativo;
    }
    @JsonProperty("APLICATIVO")
    public String getAplicativo() {
        return aplicativo;
    }
}
