
package mx.com.sky.sel.proxyclients.edicom.obtenerfactura;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EDICOM_PD_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDICOM_PD_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadenaOriginal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="archivoStringBase64" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errorcode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errordesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sistemaerror" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDICOM_PD_Type", namespace = "http://msg.factura.edicom.sky.com.mx", propOrder = {
    "cadenaOriginal",
    "archivoStringBase64",
    "errorcode",
    "errordesc",
    "sistemaerror"
})
public class EDICOMPDType {

    @XmlElement(required = true)
    protected String cadenaOriginal;
    @XmlElement(required = true)
    protected String archivoStringBase64;
    @XmlElement(required = true)
    protected String errorcode;
    @XmlElement(required = true)
    protected String errordesc;
    @XmlElement(required = true)
    protected String sistemaerror;

    /**
     * Gets the value of the cadenaOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCadenaOriginal() {
        return cadenaOriginal;
    }

    /**
     * Sets the value of the cadenaOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCadenaOriginal(String value) {
        this.cadenaOriginal = value;
    }

    /**
     * Gets the value of the archivoStringBase64 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchivoStringBase64() {
        return archivoStringBase64;
    }

    /**
     * Sets the value of the archivoStringBase64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchivoStringBase64(String value) {
        this.archivoStringBase64 = value;
    }

    /**
     * Gets the value of the errorcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
     * Sets the value of the errorcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorcode(String value) {
        this.errorcode = value;
    }

    /**
     * Gets the value of the errordesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrordesc() {
        return errordesc;
    }

    /**
     * Sets the value of the errordesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrordesc(String value) {
        this.errordesc = value;
    }

    /**
     * Gets the value of the sistemaerror property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaerror() {
        return sistemaerror;
    }

    /**
     * Sets the value of the sistemaerror property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaerror(String value) {
        this.sistemaerror = value;
    }

}
