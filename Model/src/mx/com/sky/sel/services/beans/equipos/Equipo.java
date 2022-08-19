package mx.com.sky.sel.services.beans.equipos;

import java.io.Serializable;

public class Equipo implements Serializable {
    @SuppressWarnings("compatibility:-4829357521499647616")
    private static final long serialVersionUID = -6738786934914812084L;
    private String equipo;
    private double costo;

    /**
     *
     */
    public Equipo() {
        // TODO Auto-generated constructor stub
    }


    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((equipo == null) ? 0 : equipo.hashCode());
        return result;
    }


    /** (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Equipo))
            return false;
        Equipo other = (Equipo)obj;
        if (equipo == null) {
            if (other.equipo != null)
                return false;
        } else if (!equipo.equals(other.equipo))
            return false;
        return true;
    }


    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Equipo [");
        if (equipo != null) {
            builder.append("equipo=");
            builder.append(equipo);
            builder.append(", ");
        }
        builder.append("costo=");
        builder.append(costo);
        builder.append("]");
        return builder.toString();
    }


    /**
     * @return the equipo
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }
}
