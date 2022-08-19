package mx.com.sky.sel.services.beans.reenviosenal;

import java.io.Serializable;
import java.sql.Timestamp;
public class ReenvioSenial implements Serializable {
    @SuppressWarnings("compatibility:-6053067584171578426")
    private static final long serialVersionUID = -1023526386264501869L;
    private String id;
    private String userId;
    private String cuentaSKY;
    private String ti;
    private String paquete;
    private String pais;
    private Timestamp fechaRegistro;
    private String activo;
    private String idSesion;
    private String rowidCuenta;

    public ReenvioSenial() {
        super();
    }


    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    public String getCuentaSKY() {
        return cuentaSKY;
    }

    public void setTi(String ti) {
        this.ti = ti;
    }

    public String getTi() {
        return ti;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }


    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getActivo() {
        return activo;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setRowidCuenta(String rowidCuenta) {
        this.rowidCuenta = rowidCuenta;
    }

    public String getRowidCuenta() {
        return rowidCuenta;
    }

}
