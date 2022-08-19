package mx.com.sky.sel.services.beans.cybersource;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.common.HeaderResponse;


public class ConsultarProductoResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:3098822532861392612")
    private static final long serialVersionUID = -343854501701772012L;


    private HeaderResponse header;
    public ConsultarProductoResponseDTO() {
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
