package mx.com.sky.sel.services.beans.btgew;

import java.io.Serializable;

public class ActivacionBean implements Serializable {
    @SuppressWarnings("compatibility:8369404961089766755")
    private static final long serialVersionUID = -7445126557644466403L;
    protected String cuentaSKY;
    protected String paqueteSKY;
    protected String ott;
    protected String veo;
    protected String idSesion;
    protected String producto;

    public ActivacionBean() {
        super();
    }

    @Override
    public String toString() {
        return "cuentaSKY[" + cuentaSKY + "] OTT[" + ott + "] VEO[" + veo + "] paqueteSKY[" + paqueteSKY + "]";
    }


    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    public String getCuentaSKY() {
        return cuentaSKY;
    }

    public void setPaqueteSKY(String paqueteSKY) {
        this.paqueteSKY = paqueteSKY;
    }

    public String getPaqueteSKY() {
        return paqueteSKY;
    }

    public void setOtt(String ott) {
        this.ott = ott;
        if (ott.equalsIgnoreCase("YES")) {
            this.producto = "BTG";
        }
    }

    public String getOtt() {
        return ott;
    }

    public void setVeo(String veo) {
        this.veo = veo;
        if (veo.equalsIgnoreCase("YES")) {
            this.producto = "VEO";
        }
    }

    public String getVeo() {
        return veo;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getProducto() {
        return producto;
    }
    }
