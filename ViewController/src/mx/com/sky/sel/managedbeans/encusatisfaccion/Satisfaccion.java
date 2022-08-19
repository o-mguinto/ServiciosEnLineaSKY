package mx.com.sky.sel.managedbeans.encusatisfaccion;

import java.io.Serializable;

public class Satisfaccion implements Serializable {
    @SuppressWarnings("compatibility:-2659723057433907022")
    private static final long serialVersionUID = 314607687526538636L;
    private String folio;
    private String userID;
    private String cuentaSKY;
    private String pais;
    private String paquete;
    private Integer noPregunta;
    private String pregunta;
    private String respuesta;
    private String comentario;


    /**
     *
     */
    public Satisfaccion() {
        // TODO Auto-generated constructor stub
    }


    /* (non-Javadoc)
         * @see java.lang.Object#toString()
         */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Satisfaccion [");
        if (folio != null) {
            builder.append("folio=");
            builder.append(folio);
            builder.append(", ");
        }
        if (userID != null) {
            builder.append("userID=");
            builder.append(userID);
            builder.append(", ");
        }
        if (cuentaSKY != null) {
            builder.append("cuentaSKY=");
            builder.append(cuentaSKY);
            builder.append(", ");
        }
        if (pais != null) {
            builder.append("pais=");
            builder.append(pais);
            builder.append(", ");
        }
        if (paquete != null) {
            builder.append("paquete=");
            builder.append(paquete);
            builder.append(", ");
        }
        if (noPregunta != null) {
            builder.append("noPregunta=");
            builder.append(noPregunta);
            builder.append(", ");
        }
        if (pregunta != null) {
            builder.append("pregunta=");
            builder.append(pregunta);
            builder.append(", ");
        }
        if (respuesta != null) {
            builder.append("respuesta=");
            builder.append(respuesta);
            builder.append(", ");
        }
        if (comentario != null) {
            builder.append("comentario=");
            builder.append(comentario);
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
                prime * result + ((comentario == null) ? 0 : comentario.hashCode());
        result =
                prime * result + ((cuentaSKY == null) ? 0 : cuentaSKY.hashCode());
        result = prime * result + ((folio == null) ? 0 : folio.hashCode());
        result =
                prime * result + ((noPregunta == null) ? 0 : noPregunta.hashCode());
        result = prime * result + ((pais == null) ? 0 : pais.hashCode());
        result = prime * result + ((paquete == null) ? 0 : paquete.hashCode());
        result =
                prime * result + ((pregunta == null) ? 0 : pregunta.hashCode());
        result =
                prime * result + ((respuesta == null) ? 0 : respuesta.hashCode());
        result = prime * result + ((userID == null) ? 0 : userID.hashCode());
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
        if (!(obj instanceof Satisfaccion))
            return false;
        Satisfaccion other = (Satisfaccion)obj;
        if (comentario == null) {
            if (other.comentario != null)
                return false;
        } else if (!comentario.equals(other.comentario))
            return false;
        if (cuentaSKY == null) {
            if (other.cuentaSKY != null)
                return false;
        } else if (!cuentaSKY.equals(other.cuentaSKY))
            return false;
        if (folio == null) {
            if (other.folio != null)
                return false;
        } else if (!folio.equals(other.folio))
            return false;
        if (noPregunta == null) {
            if (other.noPregunta != null)
                return false;
        } else if (!noPregunta.equals(other.noPregunta))
            return false;
        if (pais == null) {
            if (other.pais != null)
                return false;
        } else if (!pais.equals(other.pais))
            return false;
        if (paquete == null) {
            if (other.paquete != null)
                return false;
        } else if (!paquete.equals(other.paquete))
            return false;
        if (pregunta == null) {
            if (other.pregunta != null)
                return false;
        } else if (!pregunta.equals(other.pregunta))
            return false;
        if (respuesta == null) {
            if (other.respuesta != null)
                return false;
        } else if (!respuesta.equals(other.respuesta))
            return false;
        if (userID == null) {
            if (other.userID != null)
                return false;
        } else if (!userID.equals(other.userID))
            return false;
        return true;
    }


    /**
     * @return the folio
     */
    public String getFolio() {
        return folio;
    }


    /**
     * @param folio the folio to set
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }


    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }


    /**
     * @return the cuentaSKY
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }


    /**
     * @param cuentaSKY the cuentaSKY to set
     */
    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }


    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }


    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }


    /**
     * @return the paquete
     */
    public String getPaquete() {
        return paquete;
    }


    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }


    /**
     * @return the noPregunta
     */
    public Integer getNoPregunta() {
        return noPregunta;
    }


    /**
     * @param noPregunta the noPregunta to set
     */
    public void setNoPregunta(Integer noPregunta) {
        this.noPregunta = noPregunta;
    }


    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }


    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }


    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }


    /**
     * @param respuesta the respuesta to set
     */
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }


    /**
     * @return the comentario
     */
    public String getComentario() {
        return comentario;
    }


    /**
     * @param comentario the comentario to set
     */
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
