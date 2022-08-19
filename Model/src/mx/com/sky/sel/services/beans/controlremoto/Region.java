package mx.com.sky.sel.services.beans.controlremoto;
import java.io.Serializable;

public class Region implements Serializable {
    @SuppressWarnings("compatibility:-7874600902211612306")
    private static final long serialVersionUID = 4411086194338484932L;
    protected String idRegion;
    protected String nombre;

    /**
     *
     */
    public Region() {
        // TODO Auto-generated constructor stub
    }
    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Region [");
        if (idRegion != null) {
            builder.append("idRegion=");
            builder.append(idRegion);
            builder.append(", ");
        }
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
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
        result =
                prime * result + ((idRegion == null) ? 0 : idRegion.hashCode());
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
        if (!(obj instanceof Region))
            return false;
        Region other = (Region)obj;
        if (idRegion == null) {
            if (other.idRegion != null)
                return false;
        } else if (!idRegion.equals(other.idRegion))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

    /**
     * @return the idRegion
     */
    public String getIdRegion() {
        return idRegion;
    }

    /**
     * @param idRegion the idRegion to set
     */
    public void setIdRegion(String idRegion) {
        this.idRegion = idRegion;
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


    }
