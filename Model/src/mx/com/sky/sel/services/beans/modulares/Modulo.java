package mx.com.sky.sel.services.beans.modulares;

import java.io.Serializable;

public class Modulo implements Serializable {
    @SuppressWarnings("compatibility:522602335255813585")
    private static final long serialVersionUID = -5910289880443100488L;
    private String nombre;
    private String imagen;


    /**
     *
     */
    public Modulo() {
        // TODO Auto-generated constructor stub
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Modulo [");
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
            builder.append(", ");
        }
        if (imagen != null) {
            builder.append("imagen=");
            builder.append(imagen);
        }
        builder.append("]");
        return builder.toString();
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Modulo))
            return false;
        Modulo other = (Modulo)obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
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
        String nombreImg = nombre.replace(" ", "");
        nombreImg = nombreImg.toLowerCase();
        nombreImg = nombreImg.replace("Ã±", "n");
        this.imagen = nombreImg + ".png";
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


}
