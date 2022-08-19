package mx.com.sky.sel.services.beans.controlremoto;

import java.io.Serializable;

public class ControlRemotoBean implements Serializable {
    @SuppressWarnings("compatibility:894769088232638462")
    private static final long serialVersionUID = 1068580162869504248L;
    private String pathIcon;
    private String producto;
    private String imgNombre;
    private String etiquetaProducto;
    private String descripcion;
    private String precioDisplay;
    private String manual;
    protected String banderaGarantia;
    protected String idControlRemoto;


    /**
     *
     */
    public ControlRemotoBean() {
        // TODO Auto-generated constructor stub
    }


    /**
     * @param pathIcon
     * @param producto
     * @param descripcion
     */
    public ControlRemotoBean(String pathIcon, String producto,
                             String descripcion) {
        super();
        this.pathIcon = pathIcon;
        this.producto = producto;
        this.descripcion = descripcion;
    }


    /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ControlRemoto [");
        if (pathIcon != null) {
            builder.append("pathIcon=");
            builder.append(pathIcon);
            builder.append(", ");
        }
        if (producto != null) {
            builder.append("producto=");
            builder.append(producto);
            builder.append(", ");
        }
        if (manual != null) {
            builder.append("manual=");
            builder.append(manual);
            builder.append(", ");
        }

        if (descripcion != null) {
            builder.append("descripcion=");
            builder.append(descripcion);
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
                prime * result + ((etiquetaProducto == null) ? 0 : etiquetaProducto.hashCode());
        result =
                prime * result + ((idControlRemoto == null) ? 0 : idControlRemoto.hashCode());
        result =
                prime * result + ((precioDisplay == null) ? 0 : precioDisplay.hashCode());
        result =
                prime * result + ((producto == null) ? 0 : producto.hashCode());
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
        if (!(obj instanceof ControlRemotoBean))
            return false;
        ControlRemotoBean other = (ControlRemotoBean)obj;
        if (etiquetaProducto == null) {
            if (other.etiquetaProducto != null)
                return false;
        } else if (!etiquetaProducto.equals(other.etiquetaProducto))
            return false;
        if (idControlRemoto == null) {
            if (other.idControlRemoto != null)
                return false;
        } else if (!idControlRemoto.equals(other.idControlRemoto))
            return false;
        if (precioDisplay == null) {
            if (other.precioDisplay != null)
                return false;
        } else if (!precioDisplay.equals(other.precioDisplay))
            return false;
        if (producto == null) {
            if (other.producto != null)
                return false;
        } else if (!producto.equals(other.producto))
            return false;
        return true;
    }


    /**
     * @return the pathIcon
     */
    public String getPathIcon() {
        return pathIcon;
    }


    /**
     * @param pathIcon the pathIcon to set
     */
    public void setPathIcon(String pathIcon) {
        this.pathIcon = pathIcon;
        this.imgNombre = this.pathIcon.replace(" ", "");
    }


    /**
     * @return the producto
     */
    public String getProducto() {
        return producto;
    }


    /**
     * @param producto the producto to set
     */
    public void setProducto(String producto) {
        this.producto = producto;
    }


    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }


    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setEtiquetaProducto(String etiquetaProducto) {
        this.etiquetaProducto = etiquetaProducto;
    }

    public String getEtiquetaProducto() {
        return etiquetaProducto;
    }


    public void setBanderaGarantia(String banderaGarantia) {
        this.banderaGarantia = banderaGarantia;
    }

    public String getBanderaGarantia() {
        return banderaGarantia;
    }

    public void setIdControlRemoto(String idControlRemoto) {
        this.idControlRemoto = idControlRemoto;
    }

    public String getIdControlRemoto() {
        return idControlRemoto;
    }


    public void setManual(String manual) {
        this.manual = manual;
    }

    public String getManual() {
        return manual;
    }

    public void setPrecioDisplay(String precioDisplay) {
        this.precioDisplay = precioDisplay;
    }

    public String getPrecioDisplay() {
        return precioDisplay;
    }

    public void setImgNombre(String imgNombre) {
        this.imgNombre = imgNombre;
    }

    public String getImgNombre() {
        return imgNombre;
    }
}
