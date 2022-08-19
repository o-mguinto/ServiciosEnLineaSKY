package mx.com.sky.sel.services.beans.billetera;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class ConsultarIdBilleteraEmailResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:9119601769146780370")
    private static final long serialVersionUID = 1L;

    private HeaderResponse header;
    private String id;
    public ConsultarIdBilleteraEmailResponseDTO() {
        super();
        this.header = new HeaderResponse();
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
