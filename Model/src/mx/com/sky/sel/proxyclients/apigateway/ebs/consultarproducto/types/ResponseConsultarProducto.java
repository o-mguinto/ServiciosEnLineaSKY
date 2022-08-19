package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

import mx.com.sky.sel.proxyclients.apigateway.headers.response.EBMHeaderResponse;

public class ResponseConsultarProducto implements Serializable {
    @SuppressWarnings("compatibility:8113093053578973894")
    private static final long serialVersionUID = 1L;


    private EBMHeaderResponse header;
    private CabeceraResponse cabecera;
    private ContratoSiebelResponse contratoSiebel;
    public ResponseConsultarProducto() {
        super();
    }

    public void setCabecera(CabeceraResponse cabecera) {
        this.cabecera = cabecera;
    }
    @JsonProperty("CABECERA")
    public CabeceraResponse getCabecera() {
        return cabecera;
    }

    public void setContratoSiebel(ContratoSiebelResponse contratoSiebel) {
        this.contratoSiebel = contratoSiebel;
    }
    @JsonProperty("ContratoSiebel")
    public ContratoSiebelResponse getContratoSiebel() {
        return contratoSiebel;
    }

    public void setHeader(EBMHeaderResponse header) {
        this.header = header;
    }
    @JsonProperty("EBMHeaderResponse")
    public EBMHeaderResponse getHeader() {
        return header;
    }
}
