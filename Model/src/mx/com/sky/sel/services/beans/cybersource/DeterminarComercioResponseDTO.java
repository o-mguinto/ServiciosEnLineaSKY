package mx.com.sky.sel.services.beans.cybersource;


import java.io.Serializable;

import mx.com.sky.sel.services.beans.common.HeaderResponse;

public class DeterminarComercioResponseDTO implements Serializable {
    @SuppressWarnings("compatibility:616399409187435125")
    private static final long serialVersionUID = 590617683941154520L;


    private HeaderResponse header;
    private String afiliacion;
    private String merchanId;
    private String codigoMoneda;
    private String clearingHouse;

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setClearingHouse(String clearingHouse) {
        this.clearingHouse = clearingHouse;
    }

    public String getClearingHouse() {
        return clearingHouse;
    }

    public void setAfiliacionRecurrente(String afiliacionRecurrente) {
        this.afiliacionRecurrente = afiliacionRecurrente;
    }

    public String getAfiliacionRecurrente() {
        return afiliacionRecurrente;
    }
    private String afiliacionRecurrente;
    public DeterminarComercioResponseDTO() {
        super();
        this.header = new HeaderResponse();
    }
    
    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setMerchanId(String merchanId) {
        this.merchanId = merchanId;
    }

    public String getMerchanId() {
        return merchanId;
    }

    public void setHeader(HeaderResponse header) {
        this.header = header;
    }

    public HeaderResponse getHeader() {
        return header;
    }
}
