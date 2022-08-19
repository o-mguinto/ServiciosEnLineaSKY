package mx.com.sky.sel.services.beans.controlremoto;

import java.io.Serializable;

public class DireccionCR implements Serializable {
    @SuppressWarnings("compatibility:-4865166302459205530")
    private static final long serialVersionUID = 553647040038235609L;
    protected String idDireccion;
    protected String idRegion;
    protected String nombre;
    protected String tipo;
    protected String codigoPostal;
    protected String direccion;
    protected String telefono;
    protected String fax;
    protected String horario;
    protected String notas;
    protected String zona;
    protected String poblacion;

    /**
     *
     */
    public DireccionCR() {
        // TODO Auto-generated constructor stub
    }


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Direccion [");
        if (idDireccion != null) {
            builder.append("idDireccion=");
            builder.append(idDireccion);
            builder.append(", ");
        }
        if (idRegion != null) {
            builder.append("idRegion=");
            builder.append(idRegion);
            builder.append(", ");
        }
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
            builder.append(", ");
        }
        if (tipo != null) {
            builder.append("tipo=");
            builder.append(tipo);
            builder.append(", ");
        }
        if (codigoPostal != null) {
            builder.append("codigoPostal=");
            builder.append(codigoPostal);
            builder.append(", ");
        }
        if (direccion != null) {
            builder.append("direccion=");
            builder.append(direccion);
            builder.append(", ");
        }
        if (telefono != null) {
            builder.append("telefono=");
            builder.append(telefono);
            builder.append(", ");
        }
        if (fax != null) {
            builder.append("fax=");
            builder.append(fax);
            builder.append(", ");
        }
        if (horario != null) {
            builder.append("horario=");
            builder.append(horario);
            builder.append(", ");
        }
        if (notas != null) {
            builder.append("notas=");
            builder.append(notas);
            builder.append(", ");
        }
        if (zona != null) {
            builder.append("zona=");
            builder.append(zona);
            builder.append(", ");
        }
        if (poblacion != null) {
            builder.append("poblacion=");
            builder.append(poblacion);
        }
        builder.append("]");
        return builder.toString();
    }


    public String getDireccionCompleta() {
        StringBuilder builder = new StringBuilder();
        builder.append("Direccion ");
        if (tipo != null) {
            builder.append("");
            builder.append(tipo);
            builder.append(" ");
        }
        if (nombre != null) {
            builder.append(nombre);
            builder.append(", ");
        }
        if (direccion != null) {
            builder.append("Direcci\u00F3n:");
            builder.append(direccion);
            builder.append(", ");
        }
        if (codigoPostal != null) {
            builder.append("c\u00F3digo:");
            builder.append(codigoPostal);
            builder.append(", ");
        }
        if (telefono != null) {
            builder.append("tel\u00E9fono:");
            builder.append(telefono);
            builder.append(", ");
        }
        if (fax != null) {
            builder.append("fax:");
            builder.append(fax);
            builder.append(", ");
        }
        if (horario != null) {
            builder.append("horario:");
            builder.append(horario);
            builder.append(", ");
        }
        if (zona != null && !zona.isEmpty()) {
            builder.append("zona:");
            builder.append(zona);
            builder.append(", ");
        }
        if (poblacion != null && !poblacion.isEmpty()) {
            builder.append("poblaci\u00F3n:");
            builder.append(poblacion);
            builder.append(", ");
        }
        if (notas != null && !notas.isEmpty()) {
            builder.append("notas:");
            builder.append(notas);
        }

        return builder.toString();
    }


    /** (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result =
                prime * result + ((codigoPostal == null) ? 0 : codigoPostal.hashCode());
        result =
                prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + ((fax == null) ? 0 : fax.hashCode());
        result = prime * result + ((horario == null) ? 0 : horario.hashCode());
        result =
                prime * result + ((idDireccion == null) ? 0 : idDireccion.hashCode());
        result =
                prime * result + ((idRegion == null) ? 0 : idRegion.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((notas == null) ? 0 : notas.hashCode());
        result =
                prime * result + ((poblacion == null) ? 0 : poblacion.hashCode());
        result =
                prime * result + ((telefono == null) ? 0 : telefono.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((zona == null) ? 0 : zona.hashCode());
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
        if (!(obj instanceof DireccionCR))
            return false;
        DireccionCR other = (DireccionCR)obj;
        if (codigoPostal == null) {
            if (other.codigoPostal != null)
                return false;
        } else if (!codigoPostal.equals(other.codigoPostal))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        if (fax == null) {
            if (other.fax != null)
                return false;
        } else if (!fax.equals(other.fax))
            return false;
        if (horario == null) {
            if (other.horario != null)
                return false;
        } else if (!horario.equals(other.horario))
            return false;
        if (idDireccion == null) {
            if (other.idDireccion != null)
                return false;
        } else if (!idDireccion.equals(other.idDireccion))
            return false;
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
        if (notas == null) {
            if (other.notas != null)
                return false;
        } else if (!notas.equals(other.notas))
            return false;
        if (poblacion == null) {
            if (other.poblacion != null)
                return false;
        } else if (!poblacion.equals(other.poblacion))
            return false;
        if (telefono == null) {
            if (other.telefono != null)
                return false;
        } else if (!telefono.equals(other.telefono))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (zona == null) {
            if (other.zona != null)
                return false;
        } else if (!zona.equals(other.zona))
            return false;
        return true;
    }

    /**
     * @return the idDireccion
     */
    public String getIdDireccion() {
        return idDireccion;
    }

    /**
     * @param idDireccion the idDireccion to set
     */
    public void setIdDireccion(String idDireccion) {
        this.idDireccion = idDireccion;
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
     * @return the codigoPostal
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the notas
     */
    public String getNotas() {
        return notas;
    }

    /**
     * @param notas the notas to set
     */
    public void setNotas(String notas) {
        this.notas = notas;
    }

    /**
     * @return the zona
     */
    public String getZona() {
        return zona;
    }

    /**
     * @param zona the zona to set
     */
    public void setZona(String zona) {
        this.zona = zona;
    }

    /**
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

    /**
     * @param poblacion the poblacion to set
     */
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }


}
