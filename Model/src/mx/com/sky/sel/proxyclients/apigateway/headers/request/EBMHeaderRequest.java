package mx.com.sky.sel.proxyclients.apigateway.headers.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class EBMHeaderRequest implements Serializable {
    @SuppressWarnings("compatibility:-5737384288941635749")
    private static final long serialVersionUID = -2357601499843073008L;
    
    private String operacion;
    private String sistemaOrigen;
    private ParametroList parametrosList;
    private SeguridadList seguridadList;
    
    public EBMHeaderRequest() {
        this.parametrosList = new ParametroList();
        this.seguridadList = new SeguridadList();
    }
    
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    @JsonProperty("Operacion")
    public String getOperacion() {
        return operacion;
    }

    public void setSistemaOrigen(String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }
    
    @JsonProperty("SistemaOrigen")
    public String getSistemaOrigen() {
        return sistemaOrigen;
    }

    public void setParametrosList(ParametroList parametrosList) {
        this.parametrosList = parametrosList;
    }
    
    @JsonProperty("ParametroList")
    public ParametroList getParametrosList() {
        return parametrosList;
    }

    public void setSeguridadList(SeguridadList seguridadList) {
        this.seguridadList = seguridadList;
    }
    
    @JsonProperty("SeguridadList")
    public SeguridadList getSeguridadList() {
        return seguridadList;
    }
}
