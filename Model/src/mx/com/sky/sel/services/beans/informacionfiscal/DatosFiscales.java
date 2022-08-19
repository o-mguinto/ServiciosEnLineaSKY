package mx.com.sky.sel.services.beans.informacionfiscal;

import java.io.Serializable;
import mx.com.sky.sel.services.beans.utils.Direccion;
public class DatosFiscales implements Serializable {
    @SuppressWarnings("compatibility:8598204089729931360")
    private static final long serialVersionUID = -5081745281782741681L;
    
    private Direccion direccion;
    private String rfc;
    private String email;
    private String razonSocial;
    private String contacto;
    private String metodoEnvio;
    private String tipoFactura;
    //Nuevos campos CFDI4
    private String tipoPersona;
    private String regimenFiscal;
    private String usoCFDI;


    /**
     *
     */
    public DatosFiscales() {
        rfc = "";
        direccion = new Direccion();
        direccion.init();
        email = "";
        razonSocial = "";
        contacto = "";
        metodoEnvio = "";
        tipoFactura = "";
        tipoPersona = "";
        regimenFiscal = "";
        usoCFDI = "";
    }


    /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DatosFiscales [");
        if (rfc != null) {
            builder.append("rfc=");
            builder.append(rfc);
            builder.append(", ");
        }
        if (razonSocial != null) {
            builder.append("razonSocial=");
            builder.append(razonSocial);
            builder.append(", ");
        }
        if (email != null) {
            builder.append("email=");
            builder.append(email);
            builder.append(", ");
        }
        if (contacto != null) {
            builder.append("contacto=");
            builder.append(contacto);
            builder.append(", ");
        }
        if (direccion != null) {
            builder.append("direccion=");
            builder.append(direccion);
            builder.append(", ");
        }
        if (metodoEnvio != null) {
            builder.append("metodoEnvio=");
            builder.append(metodoEnvio);
            builder.append(", ");
        }
        if (tipoFactura != null) {
            builder.append("tipoFactura=");
            builder.append(tipoFactura);
        }
        if (tipoPersona != null) {
            builder.append("tipoPersona=");
            builder.append(tipoPersona);
        }
        if (regimenFiscal != null) {
            builder.append("regimenFiscal=");
            builder.append(regimenFiscal);
        }
        if (usoCFDI != null) {
            builder.append("usoCFDI=");
            builder.append(usoCFDI);
        }
        builder.append("]");
        return builder.toString();
    }


    /**
     * @return the direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the rfc
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * @param rfc the rfc to set
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the contacto
     */
    public String getContacto() {
        return contacto;
    }

    /**
     * @param contacto the contacto to set
     */
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    /**
     * @return the metodoEnvio
     */
    public String getMetodoEnvio() {
        return metodoEnvio;
    }

    /**
     * @param metodoEnvio the metodoEnvio to set
     */
    public void setMetodoEnvio(String metodoEnvio) {
        this.metodoEnvio = metodoEnvio;
    }

    /**
     * @return the tipoFactura
     */
    public String getTipoFactura() {
        return tipoFactura;
    }

    /**
     * @param tipoFactura the tipoFactura to set
     */
    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }


    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setRegimenFiscal(String regimenFiscal) {
        this.regimenFiscal = regimenFiscal;
    }

    public String getRegimenFiscal() {
        return regimenFiscal;
    }

    public void setUsoCFDI(String usoCFDI) {
        this.usoCFDI = usoCFDI;
    }

    public String getUsoCFDI() {
        return usoCFDI;
    }
}
