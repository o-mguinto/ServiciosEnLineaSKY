package mx.com.sky.sel.services.beans.promesa.pago;
import java.io.Serializable;

import java.sql.Timestamp;


public class PromesaPago implements Serializable {
    @SuppressWarnings("compatibility:681320969517964386")
    private static final long serialVersionUID = -8873018487128105387L;
    private String institucionPago;
    private String referencia;
    private String monto;
    private double montoPagado;
    private String estatus;
    private Timestamp fechaPago;

    /**/
    private Integer id;
    private String userID;
    private String cuentaSKY;
    private Timestamp fechaRegistro;
    private String noSolicitud;
    private String cuentaRowID;
    private String tarjetaInteligente;
    private String sistema;
    private String descripcion;
    private String idSesion;
    private String tipoCuenta;

    /**
     *
     */
    public PromesaPago() {
        // TODO Auto-generated constructor stub
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("PromesaPago [");
        if (institucionPago != null) {
            builder.append("institucionPago=");
            builder.append(institucionPago);
            builder.append(", ");
        }
        if (referencia != null) {
            builder.append("referencia=");
            builder.append(referencia);
            builder.append(", ");
        }
        if (monto != null) {
            builder.append("monto=");
            builder.append(monto);
            builder.append(", ");
        }

        builder.append("montoPagado=");
        builder.append(montoPagado);
        builder.append(", ");

        if (estatus != null) {
            builder.append("estatus=");
            builder.append(estatus);
            builder.append(", ");
        }
        if (fechaPago != null) {
            builder.append("fechaPago=");
            builder.append(fechaPago);
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * @return the institucionPago
     */
    public String getInstitucionPago() {
        return institucionPago;
    }


    /**
     * @param institucionPago the institucionPago to set
     */
    public void setInstitucionPago(String institucionPago) {
        this.institucionPago = institucionPago;
    }


    /**
     * @return the referencia
     */
    public String getReferencia() {
        return referencia;
    }


    /**
     * @param referencia the referencia to set
     */
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }


    /**
     * @return the monto
     */
    public String getMonto() {
        return monto;
    }


    /**
     * @param monto the monto to set
     */
    public void setMonto(String monto) {
        this.monto = monto;
    }


    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }


    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }


    /**
     * @return the fechaPago
     */
    public Timestamp getFechaPago() {
        return fechaPago;
    }


    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(Timestamp fechaPago) {
        this.fechaPago = fechaPago;
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    public String getCuentaSKY() {
        return cuentaSKY;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setNoSolicitud(String noSolicitud) {
        this.noSolicitud = noSolicitud;
    }

    public String getNoSolicitud() {
        return noSolicitud;
    }


    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setCuentaRowID(String cuentaRowID) {
        this.cuentaRowID = cuentaRowID;
    }

    public String getCuentaRowID() {
        return cuentaRowID;
    }

    public void setTarjetaInteligente(String tarjetaInteligente) {
        this.tarjetaInteligente = tarjetaInteligente;
    }

    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSistema() {
        return sistema;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }
}
