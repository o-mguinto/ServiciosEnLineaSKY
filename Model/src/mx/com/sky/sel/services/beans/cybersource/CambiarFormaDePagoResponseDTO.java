package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class CambiarFormaDePagoResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-3733856760494522659")
    private static final long serialVersionUID = -4656487950042770428L;


    private HeaderResponse header;
    
    public CambiarFormaDePagoResponseDTO() {
        super();
        this.header = new HeaderResponse();
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }
}
