package mx.com.sky.sel.services.beans.pagos.tarjetas;
import java.io.Serializable;

public class Tarjeta implements Serializable {
    @SuppressWarnings("compatibility:-4526241593859405263")
    private static final long serialVersionUID = -8100070008523811241L;

    private Integer id;
    private String nombre;
    private String numeroTarjeta;
    private String noCodificado;
    private String codigo;
    private String anio;
    private String mes;
    private String tipo;
    private String creditoDebito;
    private String creditoDebitoTexto;
    private String keyId;
    private String phase;

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPhase() {
        return phase;
    }

    private void codificarNumero() {
        if (numeroTarjeta.length() == 16) {
            noCodificado = "XXXX-XXXX-XXXX-";
            noCodificado += numeroTarjeta.substring(12);
        } else if (numeroTarjeta.length() == 15) {
            noCodificado = "XXXX-XXXX-XXX-";
            noCodificado += numeroTarjeta.substring(11);
        }else{
            noCodificado = numeroTarjeta;
        }
    }
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tarjeta [");
        if (id != null) {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
            builder.append(", ");
        }
        if (numeroTarjeta != null) {
            builder.append("numeroTarjeta=");
            builder.append(numeroTarjeta);
            builder.append(", ");
        }
        if (tipo != null) {
            builder.append("tipo=");
            builder.append(tipo);
            builder.append(", ");
        }
        if (creditoDebito != null) {
            builder.append("creditoDebito=");
            builder.append(creditoDebito);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return the numeroTarjeta
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * @param numeroTarjeta the numeroTarjeta to set
     */
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        codificarNumero();
    }

    /**
     * @return the noCodificado
     */
    /*public String getNoCodificado() {
        return noCodificado;
    }*/

    /**
     * @param noCodificado the noCodificado to set
     */
    /*public void setNoCodificado(String noCodificado) {
        this.noCodificado = noCodificado;
    }*/

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the anio
     */
    public String getAnio() {
        return anio;
    }

    /**
     * @param anio the anio to set
     */
    public void setAnio(String anio) {
        this.anio = anio;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the creditoDebito
     */
    public String getCreditoDebito() {
        return creditoDebito;
    }

    /**
     * @param creditoDebito the creditoDebito to set
     */
    public void setCreditoDebito(String creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

     public void setNoCodificado(String noCodificado) {
        
        this.noCodificado = noCodificado;
    }

    public String getNoCodificado() {
        return noCodificado;
    }

    public void setCreditoDebitoTexto(String creditoDebitoTexto) {
        this.creditoDebitoTexto = creditoDebitoTexto;
    }

    public String getCreditoDebitoTexto() {
        return creditoDebitoTexto;
    }
}
