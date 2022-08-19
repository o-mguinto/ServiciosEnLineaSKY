package mx.com.sky.sel.services.beans.pagos.formaspago;

import java.io.Serializable;

import mx.com.sky.sel.enums.EnumFormaPago;

public class FormaPagoActual implements Serializable {
    @SuppressWarnings("compatibility:-7343849619174409434")
    private static final long serialVersionUID = 7909525672040373108L;
    protected String cuenta;
    protected String paymtmethcd;
    private EnumFormaPago formaPagoActual;


    public FormaPagoActual() {
        super();
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FormaPagoActual [");
        if (cuenta != null) {
            builder.append("cuenta=");
            builder.append(cuenta);
            builder.append(", ");
        }
        if (paymtmethcd != null) {
            builder.append("paymtmethcd=");
            builder.append(paymtmethcd);
        }
        if (formaPagoActual != null) {
            builder.append("formaPagoActual=");
            builder.append(formaPagoActual);
        }
        builder.append("]");
        return builder.toString();
    }


    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setPaymtmethcd(String paymtmethcd) {
        this.paymtmethcd = paymtmethcd;
    }

    public String getPaymtmethcd() {
        return paymtmethcd;
    }

    public void setFormaPagoActual(EnumFormaPago formaPagoActual) {
        this.formaPagoActual = formaPagoActual;
    }

    public EnumFormaPago getFormaPagoActual() {
        return formaPagoActual;
    }
    }
