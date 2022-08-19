
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultadatoscs.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MensajeOutType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MensajeOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SUSCRIPTOR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CLIENTE_DESDE" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="PAQUETE_ACTUAL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FORMA_DE_PAGO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADDR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADDR_NUM" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CITY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COUNTRY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="COUNTY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PROVINCE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="STATE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ZIPCODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ADDR_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensajeOutType",
         propOrder =
         { "respuesta", "respuestadesc", "cuenta", "suscriptor", "clientedesde", "paqueteactual", "formadepago", "addr",
           "addrnum", "city", "country", "county", "province", "state", "zipcode", "addrname"
    })
public class MensajeOutType {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "CUENTA", required = true)
    protected String cuenta;
    @XmlElement(name = "SUSCRIPTOR", required = true)
    protected String suscriptor;
    @XmlElement(name = "CLIENTE_DESDE", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientedesde;
    @XmlElement(name = "PAQUETE_ACTUAL", required = true)
    protected String paqueteactual;
    @XmlElement(name = "FORMA_DE_PAGO", required = true)
    protected String formadepago;
    @XmlElement(name = "ADDR", required = true)
    protected String addr;
    @XmlElement(name = "ADDR_NUM", required = true)
    protected String addrnum;
    @XmlElement(name = "CITY", required = true)
    protected String city;
    @XmlElement(name = "COUNTRY", required = true)
    protected String country;
    @XmlElement(name = "COUNTY", required = true)
    protected String county;
    @XmlElement(name = "PROVINCE", required = true)
    protected String province;
    @XmlElement(name = "STATE", required = true)
    protected String state;
    @XmlElement(name = "ZIPCODE", required = true)
    protected String zipcode;
    @XmlElement(name = "ADDR_NAME", required = true)
    protected String addrname;

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestadesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestadesc() {
        return respuestadesc;
    }

    /**
     * Sets the value of the respuestadesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestadesc(String value) {
        this.respuestadesc = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCUENTA() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCUENTA(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the suscriptor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSUSCRIPTOR() {
        return suscriptor;
    }

    /**
     * Sets the value of the suscriptor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSUSCRIPTOR(String value) {
        this.suscriptor = value;
    }

    /**
     * Gets the value of the clientedesde property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCLIENTEDESDE() {
        return clientedesde;
    }

    /**
     * Sets the value of the clientedesde property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCLIENTEDESDE(XMLGregorianCalendar value) {
        this.clientedesde = value;
    }

    /**
     * Gets the value of the paqueteactual property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAQUETEACTUAL() {
        return paqueteactual;
    }

    /**
     * Sets the value of the paqueteactual property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPAQUETEACTUAL(String value) {
        this.paqueteactual = value;
    }

    /**
     * Gets the value of the formadepago property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFORMADEPAGO() {
        return formadepago;
    }

    /**
     * Sets the value of the formadepago property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFORMADEPAGO(String value) {
        this.formadepago = value;
    }

    /**
     * Gets the value of the addr property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getADDR() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setADDR(String value) {
        this.addr = value;
    }

    /**
     * Gets the value of the addrnum property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getADDRNUM() {
        return addrnum;
    }

    /**
     * Sets the value of the addrnum property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setADDRNUM(String value) {
        this.addrnum = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the county property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCOUNTY() {
        return county;
    }

    /**
     * Sets the value of the county property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCOUNTY(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the province property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPROVINCE() {
        return province;
    }

    /**
     * Sets the value of the province property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPROVINCE(String value) {
        this.province = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zipcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZIPCODE() {
        return zipcode;
    }

    /**
     * Sets the value of the zipcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZIPCODE(String value) {
        this.zipcode = value;
    }

    /**
     * Gets the value of the addrname property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getADDRNAME() {
        return addrname;
    }

    /**
     * Sets the value of the addrname property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setADDRNAME(String value) {
        this.addrname = value;
    }

}
