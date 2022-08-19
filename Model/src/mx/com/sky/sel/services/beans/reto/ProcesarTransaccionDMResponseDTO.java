package mx.com.sky.sel.services.beans.reto;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class ProcesarTransaccionDMResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:-1991920896085514462")
    private static final long serialVersionUID = 1L;


    private HeaderResponse header;
    private String codigoRespuesta;
    private String codigoRespuestaAccion;
    public ProcesarTransaccionDMResponseDTO() {
        super();
        this.header = new HeaderResponse();
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuestaAccion(String codigoRespuestaAccion) {
        this.codigoRespuestaAccion = codigoRespuestaAccion;
    }

    public String getCodigoRespuestaAccion() {
        return codigoRespuestaAccion;
    }
}
