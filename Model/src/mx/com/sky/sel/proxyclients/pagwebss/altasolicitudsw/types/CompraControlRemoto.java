
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompraControlRemoto complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CompraControlRemoto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NombreControl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BanderaDomicilioActual" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IDControlRemoto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ImagenControlRemoto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManualControlRemoto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompraControlRemoto",
         propOrder =
         { "nombreControl", "banderaDomicilioActual", "idControlRemoto", "imagenControlRemoto", "manualControlRemoto"
    })
public class CompraControlRemoto {

    @XmlElement(name = "NombreControl", required = true)
    protected String nombreControl;
    @XmlElement(name = "BanderaDomicilioActual", required = true)
    protected String banderaDomicilioActual;
    @XmlElement(name = "IDControlRemoto", required = true)
    protected String idControlRemoto;
    @XmlElement(name = "ImagenControlRemoto", required = true)
    protected String imagenControlRemoto;
    @XmlElement(name = "ManualControlRemoto", required = true)
    protected String manualControlRemoto;

    /**
     * Gets the value of the nombreControl property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreControl() {
        return nombreControl;
    }

    /**
     * Sets the value of the nombreControl property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreControl(String value) {
        this.nombreControl = value;
    }

    /**
     * Gets the value of the banderaDomicilioActual property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBanderaDomicilioActual() {
        return banderaDomicilioActual;
    }

    /**
     * Sets the value of the banderaDomicilioActual property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBanderaDomicilioActual(String value) {
        this.banderaDomicilioActual = value;
    }

    /**
     * Gets the value of the idControlRemoto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIDControlRemoto() {
        return idControlRemoto;
    }

    /**
     * Sets the value of the idControlRemoto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIDControlRemoto(String value) {
        this.idControlRemoto = value;
    }

    /**
     * Gets the value of the imagenControlRemoto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImagenControlRemoto() {
        return imagenControlRemoto;
    }

    /**
     * Sets the value of the imagenControlRemoto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImagenControlRemoto(String value) {
        this.imagenControlRemoto = value;
    }

    /**
     * Gets the value of the manualControlRemoto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getManualControlRemoto() {
        return manualControlRemoto;
    }

    /**
     * Sets the value of the manualControlRemoto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setManualControlRemoto(String value) {
        this.manualControlRemoto = value;
    }

}
