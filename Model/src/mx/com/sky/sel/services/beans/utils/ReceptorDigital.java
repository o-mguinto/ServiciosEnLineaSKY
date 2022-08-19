package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

public class ReceptorDigital implements Serializable {
    @SuppressWarnings("compatibility:5716407356383584067")
    private static final long serialVersionUID = 1154885620189793958L;
    protected String resultado;
    protected String resultadodesc;
    protected String serie;
    protected String marca;
    protected String modelo;
    protected String versionSoft;


    public ReceptorDigital() {

    }

    /**
     * @return the resultado
     */
    public String getResultado() {
        return resultado;
    }


    /**
     * @param tarjetaInteligente the tarjetaInteligente to set
     */
    public void setResultado(String tarjetaInteligente) {
        this.resultado = tarjetaInteligente;
    }


    /**
     * @return the ird
     */
    public String getResultadoDesc() {
        return resultadodesc;
    }


    /**
     * @param ird the ird to set
     */
    public void setResultadoDesc(String ird) {
        this.resultadodesc = ird;
    }


    /**
     * @return the ubicacion
     */
    public String getSerie() {
        return serie;
    }


    /**
     * @param ubicacion the ubicacion to set
     */
    public void setSerie(String ti) {
        this.serie = ti;
    }


    /**
     * @return the status
     */
    public String getMarca() {
        return marca;
    }


    /**
     * @param status the status to set
     */
    public void setMarca(String i) {
        this.marca = i;
    }
    
    /**
     * @return the status
     */
    public String getModelo() {
        return modelo;
    }


    /**
     * @param modelothe status to set
     */
    public void setModelo(String m) {
        this.modelo = m;
    }
    
    /**
     * @return the status
     */
    public String getVersionSoft() {
        return versionSoft;
    }


    /**
     * @param status the status to set
     */
    public void setVersionSoft(String vs) {
        this.versionSoft = vs;
    }
}
