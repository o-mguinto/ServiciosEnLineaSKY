package mx.com.sky.sel.beans.utils;

import java.io.Serializable;

public class Usuario implements Serializable {
    @SuppressWarnings("compatibility:-7023761126348004918")
    private static final long serialVersionUID = 8649314355228989694L;
    
    private String cuentaSKY;
    private String paqueteSKY;
    private String statusSKY;
    private String nombreCompleto;
    private String nombreUsuario;
    private String nombreCorporativo;
    private String uid;
    private String mail;
    private String tipoUsuario;
    private String primerLogin;
    private boolean cuentaJerarquia;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    /*Se refiere al tipo de permisos de admin*/
    private String permisos;
    /* Atributos LDAP*/
    private String acl_btg;
    private String acl_ott;
    private String acl_sel;
    private String status_btg;
    private String status_ott;
    private String status_sel;


    /**
     *
     */
    public Usuario() {
        cuentaSKY = "";
        paqueteSKY = "";
        statusSKY = "";
        nombreCompleto = "";
        nombreUsuario = "";
        uid = "";
        mail = "";
    }

    public boolean isSuscriptor() {
        if (uid != null && uid.contains("-01")) {
            return true;
        }
        return false;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Usuario [");
        if (nombreUsuario != null) {
            builder.append("nombreUsuario=");
            builder.append(nombreUsuario);
            builder.append(", ");
        }
        if (uid != null) {
            builder.append("uid=");
            builder.append(uid);
            builder.append(", ");
        }

        if (cuentaSKY != null) {
            builder.append("cuentaSKY=");
            builder.append(cuentaSKY);
            builder.append(", ");
        }

        if (tipoUsuario != null) {
            builder.append("tipoUsuario=");
            builder.append(tipoUsuario);
            builder.append(", ");
        }
        if (mail != null) {
            builder.append("mail=");
            builder.append(mail);

        }

        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the cuentaSKY
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * @param cuentaSKY the cuentaSKY to set
     */
    public void setCuentaSKY(String cuentaSKY) {
        if (cuentaSKY != null)
            this.cuentaSKY = cuentaSKY;
    }

    /**
     * @return the paqueteSKY
     */
    public String getPaqueteSKY() {
        return paqueteSKY;
    }

    /**
     * @param paqueteSKY the paqueteSKY to set
     */
    public void setPaqueteSKY(String paqueteSKY) {
        if (paqueteSKY != null)
            this.paqueteSKY = paqueteSKY;
    }

    /**
     * @return the statusSKY
     */
    public String getStatusSKY() {
        return statusSKY;
    }

    /**
     * @param statusSKY the statusSKY to set
     */
    public void setStatusSKY(String statusSKY) {
        if (statusSKY != null)
            this.statusSKY = statusSKY;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        if (nombreCompleto != null)
            this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * @param nombreUsuario the nombreUsuario to set
     */
    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null)
            this.nombreUsuario = nombreUsuario;
    }

    /**
     * @return the uid
     */
    public String getUid() {
        return uid;
    }

    /**
     * @param uid the uid to set
     */
    public void setUid(String uid) {
        if (uid != null)
            this.uid = uid;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail.toLowerCase();
    }


    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }


    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setNombreCorporativo(String nombreCorporativo) {
        this.nombreCorporativo = nombreCorporativo;
    }

    public String getNombreCorporativo() {
        return nombreCorporativo;
    }


    public void setAcl_btg(String acl_btg) {
        this.acl_btg = acl_btg;
    }

    public String getAcl_btg() {
        return acl_btg;
    }

    public void setAcl_ott(String acl_ott) {
        this.acl_ott = acl_ott;
    }

    public String getAcl_ott() {
        return acl_ott;
    }

    public void setAcl_sel(String acl_sel) {
        this.acl_sel = acl_sel;
    }

    public String getAcl_sel() {
        return acl_sel;
    }

    public void setStatus_btg(String status_btg) {
        this.status_btg = status_btg;
    }

    public String getStatus_btg() {
        return status_btg;
    }

    public void setStatus_ott(String status_ott) {
        this.status_ott = status_ott;
    }

    public String getStatus_ott() {
        return status_ott;
    }

    public void setStatus_sel(String status_sel) {
        this.status_sel = status_sel;
    }

    public String getStatus_sel() {
        return status_sel;
    }

    public void setPrimerLogin(String primerLogin) {
        this.primerLogin = primerLogin;
    }

    public String getPrimerLogin() {
        return primerLogin;
    }

    public void setCuentaJerarquia(boolean cuentaJerarquia) {
        this.cuentaJerarquia = cuentaJerarquia;
    }

    public boolean isCuentaJerarquia() {
        return cuentaJerarquia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
}
