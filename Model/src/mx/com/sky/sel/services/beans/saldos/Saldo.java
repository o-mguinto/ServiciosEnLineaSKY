package mx.com.sky.sel.services.beans.saldos;
import java.io.Serializable;

public class Saldo implements Serializable {
    @SuppressWarnings("compatibility:4783947019788633735")
    private static final long serialVersionUID = 2312426074838977496L;
    private String externalID;
    private String fechaPagoOportuno;
    private String saldoActMin;
    private String saldoTotal;
    private String totConPop;
    private String fecha_sig_corte;

    public Saldo() {
    }

    /* (non-Javadoc)
             * @see java.lang.Object#toString()
             */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Saldo [");
        if (externalID != null) {
            builder.append("externalID=");
            builder.append(externalID);
            builder.append(", ");
        }
        if (fechaPagoOportuno != null) {
            builder.append("fechaPagoOportuno=");
            builder.append(fechaPagoOportuno);
            builder.append(", ");
        }
        if (saldoActMin != null) {
            builder.append("saldoActMin=");
            builder.append(saldoActMin);
            builder.append(", ");
        }
        if (saldoTotal != null) {
            builder.append("saldoTotal=");
            builder.append(saldoTotal);
            builder.append(", ");
        }
        if (totConPop != null) {
            builder.append("totConPop=");
            builder.append(totConPop);
        }
        builder.append("]");
        return builder.toString();
    }


    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setFechaPagoOportuno(String fechaPagoOportuno) {
        this.fechaPagoOportuno = fechaPagoOportuno;
    }

    public String getFechaPagoOportuno() {
        return fechaPagoOportuno;
    }

    public void setSaldoActMin(String saldoActMin) {
        this.saldoActMin = saldoActMin;
    }

    public String getSaldoActMin() {
        return saldoActMin;
    }

    public void setSaldoTotal(String saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    public String getSaldoTotal() {
        return saldoTotal;
    }

    public void setTotConPop(String totConPop) {
        this.totConPop = totConPop;
    }

    public String getTotConPop() {
        return totConPop;
    }

    public void setFecha_sig_corte(String fecha_sig_corte) {
        this.fecha_sig_corte = fecha_sig_corte;
    }

    public String getFecha_sig_corte() {
        return fecha_sig_corte;
    }
}
