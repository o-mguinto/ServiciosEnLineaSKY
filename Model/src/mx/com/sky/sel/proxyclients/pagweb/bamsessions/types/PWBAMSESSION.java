
package mx.com.sky.sel.proxyclients.pagweb.bamsessions.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for _PW_BAM_SESSION complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="_PW_BAM_SESSION"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="_Account"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_Package" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_Country"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="25"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_Username" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_MarketType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_LoginDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="_Ext1" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_Ext2" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_Ext3" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_Ext4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="_Ingreso" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="_idSesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_PW_BAM_SESSION",
         propOrder =
         { "account", "_package", "country", "username", "marketType", "loginDate", "ext1", "ext2", "ext3", "ext4",
           "ingreso", "idSesion"
    })
public class PWBAMSESSION {

    @XmlElement(name = "_Account", required = true)
    protected String account;
    @XmlElement(name = "_Package")
    protected String _package;
    @XmlElement(name = "_Country", required = true)
    protected String country;
    @XmlElement(name = "_Username")
    protected String username;
    @XmlElement(name = "_MarketType")
    protected String marketType;
    @XmlElement(name = "_LoginDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar loginDate;
    @XmlElement(name = "_Ext1")
    protected String ext1;
    @XmlElement(name = "_Ext2")
    protected String ext2;
    @XmlElement(name = "_Ext3")
    protected String ext3;
    @XmlElement(name = "_Ext4")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ext4;
    @XmlElement(name = "_Ingreso")
    protected String ingreso;
    @XmlElement(name = "_idSesion")
    protected String idSesion;

    /**
     * Gets the value of the account property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the package property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPackage(String value) {
        this._package = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
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
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the marketType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMarketType() {
        return marketType;
    }

    /**
     * Sets the value of the marketType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMarketType(String value) {
        this.marketType = value;
    }

    /**
     * Gets the value of the loginDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getLoginDate() {
        return loginDate;
    }

    /**
     * Sets the value of the loginDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setLoginDate(XMLGregorianCalendar value) {
        this.loginDate = value;
    }

    /**
     * Gets the value of the ext1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * Sets the value of the ext1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExt1(String value) {
        this.ext1 = value;
    }

    /**
     * Gets the value of the ext2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * Sets the value of the ext2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExt2(String value) {
        this.ext2 = value;
    }

    /**
     * Gets the value of the ext3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * Sets the value of the ext3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setExt3(String value) {
        this.ext3 = value;
    }

    /**
     * Gets the value of the ext4 property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getExt4() {
        return ext4;
    }

    /**
     * Sets the value of the ext4 property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setExt4(XMLGregorianCalendar value) {
        this.ext4 = value;
    }

    /**
     * Gets the value of the ingreso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIngreso() {
        return ingreso;
    }

    /**
     * Sets the value of the ingreso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIngreso(String value) {
        this.ingreso = value;
    }

    /**
     * Gets the value of the idSesion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
    }

}
