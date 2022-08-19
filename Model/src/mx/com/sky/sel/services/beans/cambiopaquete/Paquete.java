package mx.com.sky.sel.services.beans.cambiopaquete;

import java.io.Serializable;

public class Paquete implements Serializable {
    @SuppressWarnings("compatibility:3915436211478599823")
    private static final long serialVersionUID = 4128936335625678950L;
    private String nombre;
    private String nombre_display;
    private String costo;
    private String costoPagoOportuno;
    private String imagen;
    private String paqueteActual;
    private String servicioAContratar;
    private String numero;
    private String penalizacionVeTVCA;
    private String partNumSiebel;
    private boolean mostrarVetvPlus;
    

    /**
     *
     */
    public Paquete() {
        penalizacionVeTVCA = "N";
        nombre = "";
        nombre_display = "";
        paqueteActual = "";
    }

    /**
     * @param nombre
     * @param costo
     * @param imagen
     * @param mostrarVetvPlus
     */
    public Paquete(String nombre, String costo, String imagen, boolean mostrarVetvPlus) {
        super();
        this.nombre = nombre;
        this.costo = costo;
        this.imagen = imagen;
        this.mostrarVetvPlus = mostrarVetvPlus;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Paquete [");
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
            builder.append(", ");
        }
        if (paqueteActual != null) {
            builder.append("paqueteActual=");
            builder.append(paqueteActual);
            builder.append(", ");
        }
        if (servicioAContratar != null) {
            builder.append("servicioAContratar=");
            builder.append(servicioAContratar);
            builder.append(", ");
        }
        if (penalizacionVeTVCA != null) {
            builder.append("penalizacionVeTVCA=");
            builder.append(penalizacionVeTVCA);
            builder.append(", ");
        }
        if (costo != null) {
            builder.append("costo=");
            builder.append(costo);
            builder.append(", ");
        }
        if (imagen != null) {
            builder.append("imagen=");
            builder.append(imagen);
        }
        if (mostrarVetvPlus || !mostrarVetvPlus) {
            builder.append("mostrarVetvPlus=");
            builder.append(mostrarVetvPlus);
        }
        builder.append("]");
        return builder.toString();
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
     * @return the costo
     */
    public String getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(String costo) {
        this.costo = costo;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }


    public void setPaqueteActual(String paqueteActual) {
        this.paqueteActual = paqueteActual;
    }

    public String getPaqueteActual() {
        return paqueteActual;
    }

    public void setServicioAContratar(String servicioAContratar) {
        this.servicioAContratar = servicioAContratar;
    }

    public String getServicioAContratar() {
        return servicioAContratar;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNombre_display(String nombre_display) {
        this.nombre_display = nombre_display;
    }

    public String getNombre_display() {
        return nombre_display;
    }

    public void setPenalizacionVeTVCA(String penalizacionVeTVCA) {
        this.penalizacionVeTVCA = penalizacionVeTVCA;
    }

    public String getPenalizacionVeTVCA() {
        return penalizacionVeTVCA;
    }


    public void setCostoPagoOportuno(String costoPagoOportuno) {
        this.costoPagoOportuno = costoPagoOportuno;
    }

    public String getCostoPagoOportuno() {
        return costoPagoOportuno;
    }

    public void setPartNumSiebel(String partNumSiebel) {
        this.partNumSiebel = partNumSiebel;
    }

    public String getPartNumSiebel() {
        return partNumSiebel;
    }

    public void setMostrarVetvPlus(boolean mostrarVetvPlus) {
        this.mostrarVetvPlus = mostrarVetvPlus;
    }

    public boolean isMostrarVetvPlus() {
        return mostrarVetvPlus;
    }
}

