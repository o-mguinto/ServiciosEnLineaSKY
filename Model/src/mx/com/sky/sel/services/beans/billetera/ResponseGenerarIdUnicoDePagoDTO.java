package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class ResponseGenerarIdUnicoDePagoDTO implements Serializable {
    @SuppressWarnings("compatibility:4773719188310429206")
    private static final long serialVersionUID = 1L;


    private HeaderResponse header;
    private String idPagoSKY;
    public ResponseGenerarIdUnicoDePagoDTO() {
        super();
        this.header = new HeaderResponse();
    }

    public void setIdPagoSKY(String idPagoSKY) {
        this.idPagoSKY = idPagoSKY;
    }

    public String getIdPagoSKY() {
        return idPagoSKY;
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }
}
