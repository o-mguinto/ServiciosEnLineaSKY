package mx.com.sky.sel.services.beans.pagos.formaspago;
import java.io.Serializable;


public class FormasDePago implements Serializable {
    @SuppressWarnings("compatibility:-5209633030510432037")
    private static final long serialVersionUID = 8751782296005637951L;
    protected String name;
    protected String paymtmethcd;
    protected String noCoincideConContrato;
    protected String cargoCambioDeFormaDePago;

    public FormasDePago() {
        super();
    }


    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FormasDePago [");
        builder.append("name=");
        builder.append(name);
        builder.append(", ");

        builder.append("paymtmethcd=");
        builder.append(paymtmethcd);
        builder.append(", ");

        builder.append("noCoincideConContrato=");
        builder.append(noCoincideConContrato);
        builder.append(", ");

        builder.append("cargoCambioDeFormaDePago=");
        builder.append(cargoCambioDeFormaDePago);
        builder.append("]");
        return builder.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPaymtmethcd(String paymtmethcd) {
        this.paymtmethcd = paymtmethcd;
    }

    public String getPaymtmethcd() {
        return paymtmethcd;
    }

    public void setNoCoincideConContrato(String noCoincideConContrato) {
        this.noCoincideConContrato = noCoincideConContrato;
    }

    public String getNoCoincideConContrato() {
        return noCoincideConContrato;
    }

    public void setCargoCambioDeFormaDePago(String cargoCambioDeFormaDePago) {
        this.cargoCambioDeFormaDePago = cargoCambioDeFormaDePago;
    }

    public String getCargoCambioDeFormaDePago() {
        return cargoCambioDeFormaDePago;
    }

}
