package mx.com.sky.sel.services.beans.facturas;

import java.io.Serializable;
import java.sql.Timestamp;

import mx.com.sky.sel.utils.JavaUtils;

public class Factura implements Serializable {
    @SuppressWarnings("compatibility:-4771888066799783368")
    private static final long serialVersionUID = 3592703839205756362L;
        protected String uuid;
        protected String CuentaSKY;
        protected String TipoArchivo;
        protected String factura;
        protected Timestamp fechacorte;
        protected Timestamp fechaTimbrado;
        protected String Descripcion;
        protected String id_doc_edicom;
        protected String serie;
        protected String Pac;

    /**
     *
     */
    public Factura() {
        super();
    }


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Factura [");
        if (uuid != null) {
            builder.append("uuid=");
            builder.append(uuid);
            builder.append(", ");
        }
        if (CuentaSKY != null) {
            builder.append("CuentaSKY=");
            builder.append(CuentaSKY);
            builder.append(", ");
        }
        if (TipoArchivo != null) {
            builder.append("TipoArchivo=");
            builder.append(TipoArchivo);
            builder.append(", ");
        }
        if (factura != null) {
            builder.append("factura=");
            builder.append(factura);
            builder.append(", ");
        }
        if (fechacorte != null) {
            builder.append("fechacorte=");
            builder.append(fechacorte);
            builder.append(", ");
        }
        if (fechaTimbrado != null) {
            builder.append("fechaTimbrado=");
            builder.append(fechaTimbrado);
            builder.append(", ");
        }
        if (Descripcion != null) {
            builder.append("Descripcion=");
            builder.append(Descripcion);
            builder.append(", ");
        }
        if (id_doc_edicom != null) {
            builder.append("id_doc_edicom=");
            builder.append(id_doc_edicom);
            builder.append(", ");
        }
        if (serie != null) {
            builder.append("serie=");
            builder.append(serie);
            builder.append(", ");
        }
        if (Pac != null) {
            builder.append("Pac=");
            builder.append(Pac);
            builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the uuid
     */
    public String getuuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setuuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the CuentaSKY
     */
    public String getCuentaSKY() {
        return CuentaSKY;
    }

    /**
     * @param CuentaSKY the CuentaSKY to set
     */
    public void setCuentaSKY(String CuentaSKY) {
        this.CuentaSKY = CuentaSKY;
    }
    
        /**
         * @return the TipoArchivo
         */
        public String getTipoArchivo() {
            return TipoArchivo;
        }

        /**
         * @param TipoArchivo the TipoArchivo to set
         */
        public void setTipoArchivo(String TipoArchivo) {
            this.TipoArchivo = TipoArchivo;
        }
        /**
         * @return the factura
         */
        public String getfactura() {
            return factura;
        }

        /**
         * @param factura the factura to set
         */
        public void setfactura(String factura) {
            this.factura = factura;
        }
    /**
     * @return the fechacorte
     */
    public Timestamp getfechacorte() {
        return fechacorte;
    }


    public String getfechacorteString() {
        return JavaUtils.asString(fechacorte);
    }

    /**
     * @param fechacorte the fechacorte to set
     */
    public void setfechacorte(Timestamp fechacorte) {
        this.fechacorte = fechacorte;
    }

        /**
         * @return the fechaTimbrado
         */
        public Timestamp getfechaTimbrado() {
            return fechaTimbrado;
        }


        public String getfechaTimbradoString() {
            return JavaUtils.asString(fechaTimbrado);
        }

        /**
         * @param fechaTimbrado the fechaTimbrado to set
         */
        public void setfechaTimbrado(Timestamp fechaTimbrado) {
            this.fechaTimbrado = fechaTimbrado;
        }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
        /**
         * @return the id_doc_edicom
         */
        public String getid_doc_edicom() {
            return id_doc_edicom;
        }

        /**
         * @param id_doc_edicom the id_doc_edicom to set
         */
        public void setid_doc_edicom(String id_doc_edicom) {
            this.id_doc_edicom = id_doc_edicom;
        }

        /**
         * @return the serie
         */
        public String getserie() {
            return serie;
        }

        /**
         * @param serie the serie to set
         */
        public void setserie(String serie) {
            this.serie = serie;
        }
    

    /**
     * @return the Pac
     */
    public String getPac() {
        return Pac;
    }

    /**
     * @param descripcion the Pac to set
     */
    public void setPac(String Pac) {
        this.Pac = Pac;
    }


    }