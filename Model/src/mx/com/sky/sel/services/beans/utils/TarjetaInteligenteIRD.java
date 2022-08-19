package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

public class TarjetaInteligenteIRD implements Serializable {
    @SuppressWarnings("compatibility:7528831337551573535")
    private static final long serialVersionUID = -4019197774874105470L;
    protected String resultado;
    protected String resultadodesc;
    protected String tarjetaInteligente;
    protected String ird;


    public TarjetaInteligenteIRD() {

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
    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }


    /**
     * @param ubicacion the ubicacion to set
     */
    public void setTarjetaInteligente(String ti) {
        this.tarjetaInteligente = ti;
    }


    /**
     * @return the status
     */
    public String getIRD() {
        return ird;
    }


    /**
     * @param status the status to set
     */
    public void setIRD(String i) {
        this.ird = i;
    }
}
