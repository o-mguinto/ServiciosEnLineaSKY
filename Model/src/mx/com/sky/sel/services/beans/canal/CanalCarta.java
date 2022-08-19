package mx.com.sky.sel.services.beans.canal;

import java.io.Serializable;

/**
 * @author 
 *
 */
public class CanalCarta implements Serializable {
    @SuppressWarnings("compatibility:-7444326720409413466")
    private static final long serialVersionUID = 3315292518618235526L;
    private String nombre;
    private String imagen;
    private String nombre_display;
    private String canal;
    private String canal_display;
    private String sinopsis;
    private String precio_display;
    private String precioPO_display;
    private double precio;
    private String id;
    private boolean habilitado;
    private String definicion;
    private String categoria;

    /**
     *
     */
    public CanalCarta() {
        // TODO Auto-generated constructor stub
        precio_display = "";
        precioPO_display = "";
        canal_display = "";
        categoria = "ADULTOS";
    }

    public CanalCarta(String nombre, String id) {
        super();
        this.nombre = nombre;
        this.id = id;
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CanalCarta [");
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
            builder.append(", ");
        }
        if (id != null) {
            builder.append("id=");
            builder.append(id);
            builder.append(", ");
        }
        if (imagen != null) {
            builder.append("imagen=");
            builder.append(imagen);
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
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }


    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagen() {
        return imagen;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }


    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setPrecio_display(String precio_display) {
        this.precio_display = precio_display;
    }

    public String getPrecio_display() {
        return precio_display;
    }

    public void setNombre_display(String nombre_display) {
        this.nombre_display = nombre_display;
    }

    public String getNombre_display() {
        return nombre_display;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setPrecioPO_display(String precioPO_display) {
        this.precioPO_display = precioPO_display;
    }

    public String getPrecioPO_display() {
        return precioPO_display;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setCanal_display(String canal_display) {
        this.canal_display = canal_display;
    }

    public String getCanal_display() {
        return canal_display;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }
}
