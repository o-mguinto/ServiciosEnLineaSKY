
package mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabeceraInput_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CabeceraInput_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="SistemaOrg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Zona" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Canal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Parametros" type="{http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface}PARAMETRO_TYPE" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabeceraInput_TYPE", propOrder = {


    })
public class CabeceraInputTYPE {

    @XmlElement(name = "SistemaOrg", required = true)
    protected String sistemaOrg;
    @XmlElement(name = "Zona", required = true)
    protected String zona;
    @XmlElement(name = "Canal", required = true)
    protected String canal;
    @XmlElementRef(name = "Parametros",
                   namespace = "http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<PARAMETROTYPE> parametros;

    /**
     * Gets the value of the sistemaOrg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistemaOrg() {
        return sistemaOrg;
    }

    /**
     * Sets the value of the sistemaOrg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistemaOrg(String value) {
        this.sistemaOrg = value;
    }

    /**
     * Gets the value of the zona property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZona() {
        return zona;
    }

    /**
     * Sets the value of the zona property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZona(String value) {
        this.zona = value;
    }

    /**
     * Gets the value of the canal property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCanal(String value) {
        this.canal = value;
    }

    /**
     * Gets the value of the parametros property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PARAMETROTYPE }{@code >}
     *
     */
    public JAXBElement<PARAMETROTYPE> getParametros() {
        return parametros;
    }

    /**
     * Sets the value of the parametros property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PARAMETROTYPE }{@code >}
     *
     */
    public void setParametros(JAXBElement<PARAMETROTYPE> value) {
        this.parametros = value;
    }

}
