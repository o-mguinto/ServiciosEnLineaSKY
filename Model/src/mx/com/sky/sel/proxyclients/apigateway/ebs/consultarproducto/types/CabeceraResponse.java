package mx.com.sky.sel.proxyclients.apigateway.ebs.consultarproducto.types;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CabeceraResponse implements Serializable {
    @SuppressWarnings("compatibility:6196112000091269034")
    private static final long serialVersionUID = -3392988514097017523L;


    private String codError;
    private String msgError;
    public CabeceraResponse() {
        super();
    }

    public void setCodError(String codError) {
        this.codError = codError;
    }
    @JsonProperty("COD_ERROR")
    public String getCodError() {
        return codError;
    }

    public void setMsgError(String msgError) {
        this.msgError = msgError;
    }
    @JsonProperty("MSG_ERROR")
    public String getMsgError() {
        return msgError;
    }
}
