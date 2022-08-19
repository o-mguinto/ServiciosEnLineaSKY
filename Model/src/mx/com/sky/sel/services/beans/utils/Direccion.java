package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

public class Direccion implements Serializable {
    @SuppressWarnings("compatibility:-2223733527867357793")
    private static final long serialVersionUID = -9046378103613409980L;
    private String calleNumero;
    private String numeroInt;
    private String numeroExt;
    private String ciudad;
    private String poblacion;
    private String delMun;
    private String estado;
    private String cp;
    private String lada;
    private String telefono;
    private String colonia;

    /**
     *
     */
    public Direccion() {
        // TODO Auto-generated constructor stub
    }

    public void init() {
        calleNumero = "";
        numeroInt = "";
        numeroExt = "";
        ciudad = "";
        poblacion = "";
        delMun = "";
        estado = "";
        cp = "";
        lada = "";
        telefono = "";
        colonia = "";
    }


    public Direccion(Direccion dir) {
        super();
        this.calleNumero = dir.calleNumero;
        this.numeroInt = dir.numeroInt;
        this.numeroExt = dir.numeroExt;
        this.ciudad = dir.ciudad;
        this.poblacion = dir.poblacion;
        this.delMun = dir.delMun;
        this.estado = dir.estado;
        this.cp = dir.cp;
        this.lada = dir.lada;
        this.telefono = dir.telefono;
        this.colonia = dir.colonia;
    }
    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((calleNumero == null) ? 0 : calleNumero.hashCode());
        result = prime * result + ((ciudad == null) ? 0 : ciudad.hashCode());
        result = prime * result + ((colonia == null) ? 0 : colonia.hashCode());
        result = prime * result + ((cp == null) ? 0 : cp.hashCode());
        result = prime * result + ((delMun == null) ? 0 : delMun.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((lada == null) ? 0 : lada.hashCode());
        result = prime * result + ((numeroExt == null) ? 0 : numeroExt.hashCode());
        result = prime * result + ((numeroInt == null) ? 0 : numeroInt.hashCode());
        result = prime * result + ((poblacion == null) ? 0 : poblacion.hashCode());
        result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
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
        if (!(obj instanceof Direccion))
            return false;
        Direccion other = (Direccion)obj;
        if (calleNumero == null) {
            if (other.calleNumero != null)
                return false;
        } else if (!calleNumero.equals(other.calleNumero))
            return false;
        if (ciudad == null) {
            if (other.ciudad != null)
                return false;
        } else if (!ciudad.equals(other.ciudad))
            return false;
        if (colonia == null) {
            if (other.colonia != null)
                return false;
        } else if (!colonia.equals(other.colonia))
            return false;
        if (cp == null) {
            if (other.cp != null)
                return false;
        } else if (!cp.equals(other.cp))
            return false;
        if (delMun == null) {
            if (other.delMun != null)
                return false;
        } else if (!delMun.equals(other.delMun))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (lada == null) {
            if (other.lada != null)
                return false;
        } else if (!lada.equals(other.lada))
            return false;
        if (numeroExt == null) {
            if (other.numeroExt != null)
                return false;
        } else if (!numeroExt.equals(other.numeroExt))
            return false;
        if (numeroInt == null) {
            if (other.numeroInt != null)
                return false;
        } else if (!numeroInt.equals(other.numeroInt))
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
        return true;
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Direccion ");
        if (calleNumero != null) {
            builder.append("calle y numero:");
            builder.append(calleNumero);
            builder.append(", ");
        }
        if (numeroInt != null) {
            builder.append("numero Int:");
            builder.append(numeroInt);
            builder.append(", ");
        }
        if (numeroExt != null) {
            builder.append("numero Ext:");
            builder.append(numeroExt);
            builder.append(", ");
        }
        if (ciudad != null) {
            builder.append("ciudad:");
            builder.append(ciudad);
            builder.append(", ");
        }
        if (poblacion != null) {
            builder.append("poblacion:");
            builder.append(poblacion);
            builder.append(", ");
        }
        if (delMun != null) {
            builder.append("delegacion o municipio:");
            builder.append(delMun);
            builder.append(", ");
        }
        if (estado != null) {
            builder.append("estado:");
            builder.append(estado);
            builder.append(", ");
        }
        if (cp != null) {
            builder.append("cp:");
            builder.append(cp);
            builder.append(", ");
        }
        if (colonia != null) {
            builder.append("colonia:");
            builder.append(colonia);
            builder.append(", ");
        }
        if (lada != null) {
            builder.append("telefono:");
            builder.append(lada);
            if (telefono != null) {
                builder.append(" ");
                builder.append(telefono);

            }
        } else {
            if (telefono != null) {
                builder.append("telefono:");
                builder.append(telefono);

            }
        }
        return builder.toString();
    }


    public String getDireccion() {
        StringBuilder builder = new StringBuilder();
        builder.append("Direccion ");
        if (calleNumero != null) {
            builder.append("calle y numero:");
            builder.append(calleNumero);
            builder.append(", ");
        }
        if (numeroInt != null) {
            builder.append("numero Int:");
            builder.append(numeroInt);
            builder.append(", ");
        }
        if (numeroExt != null) {
            builder.append("numero Ext:");
            builder.append(numeroExt);
            builder.append(", ");
        }
        if (ciudad != null) {
            builder.append("ciudad:");
            builder.append(ciudad);
            builder.append(", ");
        }
        if (poblacion != null) {
            builder.append("poblacion:");
            builder.append(poblacion);
            builder.append(", ");
        }
        if (delMun != null) {
            builder.append("delegacion o municipio:");
            builder.append(delMun);
            builder.append(", ");
        }
        if (estado != null) {
            builder.append("estado:");
            builder.append(estado);
            builder.append(", ");
        }
        if (cp != null) {
            builder.append("cp:");
            builder.append(cp);
            builder.append(", ");
        }
        if (colonia != null) {
            builder.append("colonia:");
            builder.append(colonia);
            builder.append(", ");
        }
        if (lada != null) {
            builder.append("telefono:");
            builder.append(lada);
            if (telefono != null) {
                builder.append(" ");
                builder.append(telefono);

            }
        } else {
            if (telefono != null) {
                builder.append("telefono:");
                builder.append(telefono);

            }
        }
        return builder.toString();
    }

    /**
     * @return the calleNumero
     */
    public String getCalleNumero() {
        return calleNumero;
    }


    /**
     * @param calleNumero the calleNumero to set
     */
    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }


    /**
     * @return the numeroInt
     */
    public String getNumeroInt() {
        return numeroInt;
    }


    /**
     * @param numeroInt the numeroInt to set
     */
    public void setNumeroInt(String numeroInt) {
        this.numeroInt = numeroInt;
    }


    /**
     * @return the numeroExt
     */
    public String getNumeroExt() {
        return numeroExt;
    }


    /**
     * @param numeroExt the numeroExt to set
     */
    public void setNumeroExt(String numeroExt) {
        this.numeroExt = numeroExt;
    }


    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }


    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
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


    /**
     * @return the delMun
     */
    public String getDelMun() {
        return delMun;
    }


    /**
     * @param delMun the delMun to set
     */
    public void setDelMun(String delMun) {
        this.delMun = delMun;
    }


    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }


    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }


    /**
     * @return the cp
     */
    public String getCp() {
        return cp;
    }


    /**
     * @param cp the cp to set
     */
    public void setCp(String cp) {
        this.cp = cp;
    }


    /**
     * @return the lada
     */
    public String getLada() {
        return lada;
    }


    /**
     * @param lada the lada to set
     */
    public void setLada(String lada) {
        this.lada = lada;
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
     * @return the colonia
     */
    public String getColonia() {
        return colonia;
    }


    /**
     * @param colonia the colonia to set
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }


}
