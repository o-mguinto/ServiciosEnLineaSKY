package mx.com.sky.sel.services.beans.pagos.tarjetas;
import java.io.Serializable;

public class Bines implements Serializable {
    @SuppressWarnings("compatibility:-6617057227479995769")
    private static final long serialVersionUID = -6702470371347886824L;

    private boolean tarjetaValida;
    private String tipoTarjeta;
    private String creditoDebito;
    private String cd;
    private String clearingHouse;

    public Bines() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bines [");
        builder.append("tarjetaValida=");
        builder.append(tarjetaValida);
        builder.append(", ");

        if (tipoTarjeta != null) {
            builder.append("tipoTarjeta=");
            builder.append(tipoTarjeta);
            builder.append(", ");
        }
        if (creditoDebito != null) {
            builder.append("creditoDebito=");
            builder.append(creditoDebito);
            builder.append(", ");
        }
        if (cd != null) {
            builder.append("cd=");
            builder.append(cd);
        }
        if (clearingHouse != null) {
            builder.append("clearingHouse=");
            builder.append(clearingHouse);
        }
        builder.append("]");
        return builder.toString();
    }


    public void setTarjetaValida(boolean tarjetaValida) {
        this.tarjetaValida = tarjetaValida;
    }

    public boolean isTarjetaValida() {
        return tarjetaValida;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * Regresa tipo de tarjeta
     * VISA
     * MASTERCARD
     * AMEX
     * @return
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setCreditoDebito(String creditoDebito) {
        this.creditoDebito = creditoDebito;
        if (creditoDebito != null &&
            creditoDebito.equalsIgnoreCase("CREDITO")) {
            this.cd = "01";
        } else {
            this.cd = "02";
        }
    }

    /**
     * Regresa CREDITO - DEBITO
     * @return
     */
    public String getCreditoDebito() {
        return creditoDebito;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    /**
     * Regresa
     *  01 Cr\u00E9dito
     *  02 D\u00E9bito
     * @return
     */

    public String getCd() {
        return cd;
    }

    public void setClearingHouse(String clearingHouse) {
        this.clearingHouse = clearingHouse;
    }

    public String getClearingHouse() {
        return clearingHouse;
    }
}
