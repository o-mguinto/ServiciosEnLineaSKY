package mx.com.sky.sel.beans.utils.usuario;

import java.io.Serializable;

import mx.com.sky.sel.log.LogPC;

public class UsuarioRegistro implements Serializable {
    @SuppressWarnings("compatibility:-9046194569560576419")
    private static final long serialVersionUID = 4187733580452278678L;
    protected String uid;
    protected String userName;
    protected String password;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String email;
    protected String cuentaSKY;
    protected String tarjetaInteligente;
    protected String titularCuentaSKY;
    protected String telefonoLada;
    protected String telefonoCasa;
    protected String telefonoTrabajoLada;
    protected String telefonoTrabajo;
    protected String telefonoTrabajoExt;
    protected String telefonoMovilLada;
    protected String telefonoMovil;
    protected String sblParentesco;
    protected String contactoRowId;
    protected String descripcion;
    protected String paisISO;
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
    public UsuarioRegistro() {
        this.userName = "";
        this.password = "";
        this.nombre = "";
        this.apellidoPaterno = "";
        this.apellidoMaterno = "";
        this.email = "";
        this.cuentaSKY = "";
        this.tarjetaInteligente = "";
        this.titularCuentaSKY = "";
        this.telefonoLada = "";
        this.telefonoCasa = "";
        this.telefonoTrabajoLada = "";
        this.telefonoTrabajo = "";
        this.telefonoTrabajoExt = "";
        this.telefonoMovilLada = "";
        this.telefonoMovil = "";
        this.sblParentesco = "";
        this.descripcion = "";
    }

    /**
     * @param userName
     * @param password
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno
     * @param email
     * @param cuentaSKY
     * @param tarjetaInteligente
     * @param titularCuentaSKY
     * @param telefonoLada
     * @param telefonoCasa
     * @param telefonoTrabajoLada
     * @param telefonoTrabajo
     * @param telefonoTrabajoExt
     * @param telefonoMovilLada
     * @param telefonoMovil
     * @param sblParentesco
     */
    public UsuarioRegistro(String userName, String password, String nombre, String apellidoPaterno, String apellidoMaterno, String email,
                           String cuentaSKY, String tarjetaInteligente, String titularCuentaSKY, String telefonoLada, String telefonoCasa,
                           String telefonoTrabajoLada, String telefonoTrabajo, String telefonoTrabajoExt, String telefonoMovilLada,
                           String telefonoMovil, String sblParentesco) {
        super();
        this.userName = userName;
        this.password = password;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.email = email;
        this.cuentaSKY = cuentaSKY;
        this.tarjetaInteligente = tarjetaInteligente;
        this.titularCuentaSKY = titularCuentaSKY;
        this.telefonoLada = telefonoLada;
        this.telefonoCasa = telefonoCasa;
        this.telefonoTrabajoLada = telefonoTrabajoLada;
        this.telefonoTrabajo = telefonoTrabajo;
        this.telefonoTrabajoExt = telefonoTrabajoExt;
        this.telefonoMovilLada = telefonoMovilLada;
        this.telefonoMovil = telefonoMovil;
        this.sblParentesco = sblParentesco;
    }

    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("UsuarioRegistro [");
        if (userName != null) {
            builder.append("userName=");
            builder.append(userName);
            builder.append(", ");
        }
        if (cuentaSKY != null) {
            builder.append("cuentaSKY=");
            builder.append(cuentaSKY);
            builder.append(", ");
        }
        if (titularCuentaSKY != null) {
            builder.append("titularCuentaSKY=");
            builder.append(titularCuentaSKY);
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * @return the userName
     */
    public String getUserName() {
        return userName.toLowerCase();
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        //eliminacion de " "
        this.password = password.replaceAll("\\s+","");
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoPaterno
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * @param apellidoPaterno the apellidoPaterno to set
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * @return the apellidoMaterno
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * @param apellidoMaterno the apellidoMaterno to set
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email.toLowerCase();
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        //eliminacion de " "
        this.email = email.replaceAll("\\s+","");
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
        this.cuentaSKY = cuentaSKY;
    }

    /**
     * @return the tarjetaInteligente
     */
    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }

    /**
     * @param tarjetaInteligente the tarjetaInteligente to set
     */
    public void setTarjetaInteligente(String tarjetaInteligente) {
        this.tarjetaInteligente = tarjetaInteligente;
    }

    /**
     * @return the titularCuentaSKY
     */
    public String getTitularCuentaSKY() {
        return titularCuentaSKY;
    }

    /**
     * @param titularCuentaSKY the titularCuentaSKY to set
     */
    public void setTitularCuentaSKY(String titularCuentaSKY) {
        this.titularCuentaSKY = titularCuentaSKY;
    }

    /**
     * @return the telefonoLada
     */
    public String getTelefonoLada() {
        return telefonoLada;
    }

    /**
     * @param telefonoLada the telefonoLada to set
     */
    public void setTelefonoLada(String telefonoLada) {
        this.telefonoLada = telefonoLada;
    }

    /**
     * @return the telefonoCasa
     */
    public String getTelefonoCasa() {
        return telefonoCasa;
    }

    /**
     * @param telefonoCasa the telefonoCasa to set
     */
    public void setTelefonoCasa(String telefonoCasa) {
        this.telefonoCasa = telefonoCasa;
    }

    /**
     * @return the telefonoTrabajoLada
     */
    public String getTelefonoTrabajoLada() {
        return telefonoTrabajoLada;
    }

    /**
     * @param telefonoTrabajoLada the telefonoTrabajoLada to set
     */
    public void setTelefonoTrabajoLada(String telefonoTrabajoLada) {
        this.telefonoTrabajoLada = telefonoTrabajoLada;
    }

    /**
     * @return the telefonoTrabajo
     */
    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    /**
     * @param telefonoTrabajo the telefonoTrabajo to set
     */
    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    /**
     * @return the telefonoTrabajoExt
     */
    public String getTelefonoTrabajoExt() {
        return telefonoTrabajoExt;
    }

    /**
     * @param telefonoTrabajoExt the telefonoTrabajoExt to set
     */
    public void setTelefonoTrabajoExt(String telefonoTrabajoExt) {
        this.telefonoTrabajoExt = telefonoTrabajoExt;
    }

    /**
     * @return the telefonoMovilLada
     */
    public String getTelefonoMovilLada() {
        return telefonoMovilLada;
    }

    /**
     * @param telefonoMovilLada the telefonoMovilLada to set
     */
    public void setTelefonoMovilLada(String telefonoMovilLada) {
        this.telefonoMovilLada = telefonoMovilLada;
    }

    /**
     * @return the telefonoMovil
     */
    public String getTelefonoMovil() {
        return telefonoMovil;
    }

    /**
     * @param telefonoMovil the telefonoMovil to set
     */
    public void setTelefonoMovil(String telefonoMovil) {
        this.telefonoMovil = telefonoMovil;
    }

    /**
     * @return the sblParentesco
     */
    public String getSblParentesco() {
        return sblParentesco;
    }

    /**
     * @param sblParentesco the sblParentesco to set
     */
    public void setSblParentesco(String sblParentesco) {
        this.sblParentesco = sblParentesco;
    }


    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setContactoRowId(String contacRowId) {
        this.contactoRowId = contacRowId;
    }

    public String getContactoRowId() {
        return contactoRowId;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof UsuarioRegistro)) {
            return false;
        }
        final UsuarioRegistro other = (UsuarioRegistro)object;
        if (!(uid == null ? other.uid == null : uid.equals(other.uid))) {
            LogPC.println(this, "uid");
            return false;
        }
        if (!(userName == null ? other.userName == null : userName.equals(other.userName))) {
            LogPC.println(this, "userName");
            return false;
        }
        if (!(nombre == null ? other.nombre == null : nombre.equals(other.nombre))) {
            LogPC.println(this, "nombre");
            return false;
        }
        if (!(apellidoPaterno == null ? other.apellidoPaterno == null : apellidoPaterno.equals(other.apellidoPaterno))) {
            LogPC.println(this, "apellidoPaterno");
            return false;
        }
        if (!(apellidoMaterno == null ? other.apellidoMaterno == null : apellidoMaterno.equals(other.apellidoMaterno))) {
            LogPC.println(this, "apellidoMaterno");
            return false;
        }
        if (!(email == null ? other.email == null : email.equals(other.email))) {
            LogPC.println(this, "email");
            return false;
        }
        if (!(cuentaSKY == null ? other.cuentaSKY == null : cuentaSKY.equals(other.cuentaSKY))) {
            LogPC.println(this, "cuentaSKY");
            return false;
        }
        if (!(telefonoLada == null ? other.telefonoLada == null : telefonoLada.equals(other.telefonoLada))) {
            LogPC.println(this, "telefonoLada");
            return false;
        }
        if (!(telefonoCasa == null ? other.telefonoCasa == null : telefonoCasa.equals(other.telefonoCasa))) {
            LogPC.println(this, "telefonoCasa");
            return false;
        }
        if (!(telefonoTrabajoLada == null ? other.telefonoTrabajoLada == null : telefonoTrabajoLada.equals(other.telefonoTrabajoLada))) {
            LogPC.println(this, "telefonoTrabajoLada");
            return false;
        }
        if (!(telefonoTrabajo == null ? other.telefonoTrabajo == null : telefonoTrabajo.equals(other.telefonoTrabajo))) {
            LogPC.println(this, "telefonoTrabajo");
            return false;
        }
        if (!(telefonoTrabajoExt == null ? other.telefonoTrabajoExt == null : telefonoTrabajoExt.equals(other.telefonoTrabajoExt))) {
            LogPC.println(this, "telefonoTrabajoExt");
            return false;
        }
        if (!(telefonoMovilLada == null ? other.telefonoMovilLada == null : telefonoMovilLada.equals(other.telefonoMovilLada))) {
            LogPC.println(this, "telefonoMovilLada");
            return false;
        }
        if (!(telefonoMovil == null ? other.telefonoMovil == null : telefonoMovil.equals(other.telefonoMovil))) {
            LogPC.println(this, "telefonoMovil");
            return false;
        }
        return true;
    }


    public boolean isMismoEmail(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof UsuarioRegistro)) {
            return false;
        }
        final UsuarioRegistro other = (UsuarioRegistro)object;
        if (!(email == null ? other.email == null : email.equals(other.email))) {
            return false;
        }
        return true;
    }

    public String obtenerDiferencias(Object object) {
        StringBuilder diferencias = new StringBuilder();
        if (this == object) {
            return "";
        }
        if (!(object instanceof UsuarioRegistro)) {
            return "";
        }
        final UsuarioRegistro other = (UsuarioRegistro)object;
        if (!(uid == null ? other.uid == null : uid.equals(other.uid))) {
            diferencias.append("cambio UID []-[]");
        }
        if (!(userName == null ? other.userName == null : userName.equals(other.userName))) {
            diferencias.append("cambio username [" + userName + "]-[" + other.userName + "]");
        }
        if (!(nombre == null ? other.nombre == null : nombre.equals(other.nombre))) {
            diferencias.append(" cambio nombre [" + nombre + "]-[" + other.nombre + "]");
        }
        if (!(apellidoPaterno == null ? other.apellidoPaterno == null : apellidoPaterno.equals(other.apellidoPaterno))) {
            diferencias.append(" cambio apellido paterno [" + apellidoPaterno + "]-[" + other.apellidoPaterno + "]");
        }
        if (!(apellidoMaterno == null ? other.apellidoMaterno == null : apellidoMaterno.equals(other.apellidoMaterno))) {
            diferencias.append(" cambio apellido materno [" + apellidoMaterno + "]-[" + other.apellidoMaterno + "]");
        }
        if (!(email == null ? other.email == null : email.equals(other.email))) {
            diferencias.append(" cambio email [" + email + "]-[" + other.email + "]");
        }
        if (!(telefonoLada == null ? other.telefonoLada == null : telefonoLada.equals(other.telefonoLada))) {
            diferencias.append(" cambio Lada [" + telefonoLada + "]-[" + other.telefonoLada + "]");
        }
        if (!(telefonoCasa == null ? other.telefonoCasa == null : telefonoCasa.equals(other.telefonoCasa))) {
            diferencias.append(" cambio telefono principal [" + telefonoCasa + "]-[" + other.telefonoCasa + "]");
        }
        if (!(telefonoTrabajoLada == null ? other.telefonoTrabajoLada == null : telefonoTrabajoLada.equals(other.telefonoTrabajoLada))) {
            diferencias.append(" cambio lada del trabajo [" + telefonoTrabajoLada + "]-[" + other.telefonoTrabajoLada + "]");
        }
        if (!(telefonoTrabajo == null ? other.telefonoTrabajo == null : telefonoTrabajo.equals(other.telefonoTrabajo))) {
            diferencias.append(" cambio telefono del trabajo [" + telefonoTrabajo + "]-[" + other.telefonoTrabajo + "]");
        }
        if (!(telefonoTrabajoExt == null ? other.telefonoTrabajoExt == null : telefonoTrabajoExt.equals(other.telefonoTrabajoExt))) {
            diferencias.append(" cambio ext del trabajo [" + telefonoTrabajoExt + "]-[" + other.telefonoTrabajoExt + "]");
        }
        if (!(telefonoMovilLada == null ? other.telefonoMovilLada == null : telefonoMovilLada.equals(other.telefonoMovilLada))) {
            diferencias.append(" cambio lada celular [" + telefonoMovilLada + "]-[" + other.telefonoMovilLada + "]");
        }
        if (!(telefonoMovil == null ? other.telefonoMovil == null : telefonoMovil.equals(other.telefonoMovil))) {
            diferencias.append(" cambio numero de celular [" + telefonoMovil + "]-[" + other.telefonoMovil + "]");
        }
        return diferencias.toString();
    }


    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((uid == null) ? 0 : uid.hashCode());
        result = PRIME * result + ((userName == null) ? 0 : userName.hashCode());
        result = PRIME * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = PRIME * result + ((apellidoPaterno == null) ? 0 : apellidoPaterno.hashCode());
        result = PRIME * result + ((apellidoMaterno == null) ? 0 : apellidoMaterno.hashCode());
        result = PRIME * result + ((email == null) ? 0 : email.hashCode());
        result = PRIME * result + ((cuentaSKY == null) ? 0 : cuentaSKY.hashCode());
        result = PRIME * result + ((telefonoLada == null) ? 0 : telefonoLada.hashCode());
        result = PRIME * result + ((telefonoCasa == null) ? 0 : telefonoCasa.hashCode());
        result = PRIME * result + ((telefonoTrabajoLada == null) ? 0 : telefonoTrabajoLada.hashCode());
        result = PRIME * result + ((telefonoTrabajo == null) ? 0 : telefonoTrabajo.hashCode());
        result = PRIME * result + ((telefonoTrabajoExt == null) ? 0 : telefonoTrabajoExt.hashCode());
        result = PRIME * result + ((telefonoMovilLada == null) ? 0 : telefonoMovilLada.hashCode());
        result = PRIME * result + ((telefonoMovil == null) ? 0 : telefonoMovil.hashCode());
        return result;
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

    public void setPaisISO(String paisISO) {
        this.paisISO = paisISO;
    }

    public String getPaisISO() {
        return paisISO;
    }
    }
