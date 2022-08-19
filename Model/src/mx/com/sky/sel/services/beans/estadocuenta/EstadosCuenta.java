package mx.com.sky.sel.services.beans.estadocuenta;

import java.io.Serializable;

import java.sql.Timestamp;

import mx.com.sky.sel.utils.JavaUtils;


public class EstadosCuenta implements Serializable {
    @SuppressWarnings("compatibility:-8517961926269432311")
    private static final long serialVersionUID = 6356788071948331282L;

    private String numCuenta;
    private String referenciaEdoCta;
    private String cargos;
    private String porPagar;
    private String ajustes;
    private String pagos;
    private Timestamp fechaEdoCuenta;
    private Timestamp fechaVencimiento;
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EstadosCuenta [");
        if (numCuenta != null) {
            builder.append("numCuenta=");
            builder.append(numCuenta);
            builder.append(", ");
        }
        if (referenciaEdoCta != null) {
            builder.append("referenciaEdoCta=");
            builder.append(referenciaEdoCta);
            builder.append(", ");
        }
        if (fechaEdoCuenta != null) {
            builder.append("fechaEdoCuenta=");
            builder.append(fechaEdoCuenta);
            builder.append(", ");
        }
        if (fechaVencimiento != null) {
            builder.append("fechaVencimiento=");
            builder.append(fechaVencimiento);
            builder.append(", ");
        }
        if (cargos != null) {
            builder.append("cargos=");
            builder.append(cargos);
            builder.append(", ");
        }
        if (porPagar != null) {
            builder.append("porPagar=");
            builder.append(porPagar);
            builder.append(", ");
        }
        if (ajustes != null) {
            builder.append("ajustes=");
            builder.append(ajustes);
            builder.append(", ");
        }
        if (pagos != null) {
            builder.append("pagos=");
            builder.append(pagos);
        }
        builder.append("]");
        return builder.toString();
    }


    public String getFechaEdoCuentaString() {
        return JavaUtils.asString(fechaEdoCuenta);
    }

    /**
     * @return the numCuenta
     */
    public String getNumCuenta() {
        return numCuenta;
    }

    /**
     * @param numCuenta the numCuenta to set
     */
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    /**
     * @return the referenciaEdoCta
     */
    public String getReferenciaEdoCta() {
        return referenciaEdoCta;
    }

    /**
     * @param referenciaEdoCta the referenciaEdoCta to set
     */
    public void setReferenciaEdoCta(String referenciaEdoCta) {
        this.referenciaEdoCta = referenciaEdoCta;
    }

    /**
     * @return the cargos
     */
    public String getCargos() {
        return cargos;
    }

    /**
     * @param cargos the cargos to set
     */
    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    /**
     * @return the porPagar
     */
    public String getPorPagar() {
        return porPagar;
    }

    /**
     * @param porPagar the porPagar to set
     */
    public void setPorPagar(String porPagar) {
        this.porPagar = porPagar;
    }

    /**
     * @return the ajustes
     */
    public String getAjustes() {
        return ajustes;
    }

    /**
     * @param ajustes the ajustes to set
     */
    public void setAjustes(String ajustes) {
        this.ajustes = ajustes;
    }

    /**
     * @return the pagos
     */
    public String getPagos() {
        return pagos;
    }

    /**
     * @param pagos the pagos to set
     */
    public void setPagos(String pagos) {
        this.pagos = pagos;
    }

    /**
     * @return the fechaEdoCuenta
     */
    public Timestamp getFechaEdoCuenta() {
        return fechaEdoCuenta;
    }

    /**
     * @param fechaEdoCuenta the fechaEdoCuenta to set
     */
    public void setFechaEdoCuenta(Timestamp fechaEdoCuenta) {
        this.fechaEdoCuenta = fechaEdoCuenta;
    }

    /**
     * @return the fechaVencimiento
     */
    public Timestamp getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Timestamp fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
