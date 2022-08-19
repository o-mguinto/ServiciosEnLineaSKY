package mx.com.sky.sel.services.beans.tipocambio;

import java.io.Serializable;

import java.sql.Timestamp;

public class TipoDeCambio implements Serializable{
    @SuppressWarnings("compatibility:4280343521032004946")
    private static final long serialVersionUID = -29984591369320772L;

    protected String pais;
    protected Timestamp fechaInicio;
    protected double tipoCambio;
    protected String moneda;
    
    public TipoDeCambio() {
        super();
    }


    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setFechaInicio(Timestamp fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Timestamp getFechaInicio() {
        return fechaInicio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }
}
