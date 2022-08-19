package mx.com.sky.sel.services.beans.pagos;

import java.io.Serializable;
import mx.com.sky.sel.services.beans.pagos.tarjetas.Tarjeta;
import mx.com.sky.sel.utils.JavaUtils;

public class FormatoPago implements Serializable {
    @SuppressWarnings("compatibility:4563209503560922603")
    private static final long serialVersionUID = 8996592495812477788L;
    private String cuentaSKY;
    private String paqueteActual;
    private String email;
    private String rowIDSBL;
    private String organizationID;
    private String sistemaFacturacion;
    private String tipoFacturacion;
    private String pais;
    private String moneda;
    private Double monto;
    
    private Tarjeta tarjeta;
    //private String idTarjeta;
    //private String cCV;
    
    private String origenPago;
    private String proposito;
    private String idSession;
    

    /**
     *
     */
    public FormatoPago() {
        tarjeta = new Tarjeta();
        origenPago = "";
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FormatoPago [");
        if (cuentaSKY != null) {
            builder.append("cuentaSKY= ");
            builder.append(cuentaSKY);
            builder.append(", ");
        }
        if (origenPago != null) {
            builder.append("origenPago= ");
            builder.append(origenPago);
            builder.append(", ");
        }
        if (pais != null) {
            builder.append("pais= ");
            builder.append(pais);
            builder.append(", ");
        }
        if (monto != null) {
            builder.append("monto= ");
            builder.append(monto);
            builder.append(", ");
        }
        if (email != null) {
            builder.append("email=");
            builder.append(email);
            builder.append(", ");
        }
        if (sistemaFacturacion != null) {
            builder.append("sistemaFacturacion=");
            builder.append(sistemaFacturacion);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the monto
     */
    public Double getMonto() {
        return monto;
    }

    public String getMontoString() {
        String transactionamount="0.0";
        transactionamount = JavaUtils.asMoneda(monto);
        return transactionamount;
    }
    
    /**
     * @param monto the monto to set
     */
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    /**
     * @return the tarjeta
     */
    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    /**
     * @param tarjeta the tarjeta to set
     */
    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    public String getCuentaSKY() {
        return cuentaSKY;
    }

    public void setPaqueteActual(String paqueteActual) {
        this.paqueteActual = paqueteActual;
    }

    public String getPaqueteActual() {
        return paqueteActual;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email.toLowerCase();
    }

    public void setRowIDSBL(String rowIDSBL) {
        this.rowIDSBL = rowIDSBL;
    }

    public String getRowIDSBL() {
        return rowIDSBL;
    }

    public void setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public void setSistemaFacturacion(String sistemaFacturacion) {
        this.sistemaFacturacion = sistemaFacturacion;
    }

    public String getSistemaFacturacion() {
        return sistemaFacturacion;
    }

    public void setTipoFacturacion(String tipoFacturacion) {
        this.tipoFacturacion = tipoFacturacion;
    }

    public String getTipoFacturacion() {
        return tipoFacturacion;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setOrigenPago(String origenPago) {
        this.origenPago = origenPago;
    }

    public String getOrigenPago() {
        return origenPago;
    }

    public void setProposito(String proposito) {
        this.proposito = proposito;
    }

    public String getProposito() {
        return proposito;
    }

    public void setIdSession(String idSession) {
        this.idSession = idSession;
    }

    public String getIdSession() {
        return idSession;
    }
}
