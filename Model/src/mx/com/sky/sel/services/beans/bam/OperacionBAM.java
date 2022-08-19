package mx.com.sky.sel.services.beans.bam;
import java.io.Serializable;

public class OperacionBAM implements Serializable{
    @SuppressWarnings("compatibility:-530010037798452285")
    private static final long serialVersionUID = 3056079684100892117L;
    private String idSesion;
    private String pcmovil;
    private String userid;
    private String username;
    private String email;
    private String cuentaSky;
    private String estatusCuenta;
    private String paquete;
    private String operacion;
    private String organizationtype;
    private String markettype;
    private String pais;
    private String tipoCuenta;
    private String descripcion;
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("OperacionBAM [");
        if (idSesion != null) {
            builder.append("idSesion=");
            builder.append(idSesion);
            builder.append(", ");
        }
        if (operacion != null) {
            builder.append("operacion=");
            builder.append(operacion);
            builder.append(", ");
        }
        if (userid != null) {
            builder.append("userid=");
            builder.append(userid);
            builder.append(", ");
        }
        if (username != null) {
            builder.append("username=");
            builder.append(username);
            builder.append(", ");
        }
        if (email != null) {
            builder.append("email=");
            builder.append(email);
            builder.append(", ");
        }
        if (cuentaSky != null) {
            builder.append("cuentaSky=");
            builder.append(cuentaSky);
            builder.append(", ");
        }
        if (estatusCuenta != null) {
            builder.append("estatusCuenta=");
            builder.append(estatusCuenta);
            builder.append(", ");
        }
        if (paquete != null) {
            builder.append("paquete=");
            builder.append(paquete);
            builder.append(", ");
        }
        if (organizationtype != null) {
            builder.append("organizationtype=");
            builder.append(organizationtype);
            builder.append(", ");
        }
        if (markettype != null) {
            builder.append("markettype=");
            builder.append(markettype);
            builder.append(", ");
        }
        if (pais != null) {
            builder.append("pais=");
            builder.append(pais);
            builder.append(", ");
        }
        if (tipoCuenta != null) {
            builder.append("tipoCuenta=");
            builder.append(tipoCuenta);
            builder.append(", ");
        }
        if (descripcion != null) {
            builder.append("descripcion=");
            builder.append(descripcion);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the idSesion
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * @param idSesion the idSesion to set
     */
    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cuentaSky
     */
    public String getCuentaSky() {
        return cuentaSky;
    }

    /**
     * @param cuentaSky the cuentaSky to set
     */
    public void setCuentaSky(String cuentaSky) {
        this.cuentaSky = cuentaSky;
    }

    /**
     * @return the estatusCuenta
     */
    public String getEstatusCuenta() {
        return estatusCuenta;
    }

    /**
     * @param estatusCuenta the estatusCuenta to set
     */
    public void setEstatusCuenta(String estatusCuenta) {
        this.estatusCuenta = estatusCuenta;
    }

    /**
     * @return the paquete
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    /**
     * @return the operacion
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    /**
     * @return the organizationtype
     */
    public String getOrganizationtype() {
        return organizationtype;
    }

    /**
     * @param organizationtype the organizationtype to set
     */
    public void setOrganizationtype(String organizationtype) {
        this.organizationtype = organizationtype;
    }

    /**
     * @return the markettype
     */
    public String getMarkettype() {
        return markettype;
    }

    /**
     * @param markettype the markettype to set
     */
    public void setMarkettype(String markettype) {
        this.markettype = markettype;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the tipoCuenta
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setPcmovil(String pcmovil) {
        this.pcmovil = pcmovil;
    }

    public String getPcmovil() {
        return pcmovil;
    }
}
