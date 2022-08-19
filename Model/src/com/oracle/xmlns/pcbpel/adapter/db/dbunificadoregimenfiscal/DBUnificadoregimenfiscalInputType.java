
package com.oracle.xmlns.pcbpel.adapter.db.dbunificadoregimenfiscal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBUnificadoregimenfiscalInputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBUnificadoregimenfiscalInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Moral" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Fisica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBUnificadoregimenfiscalInputType", propOrder = { "moral", "fisica" })
public class DBUnificadoregimenfiscalInputType {

    @XmlElement(name = "Moral", required = true, nillable = true)
    protected String moral;
    @XmlElement(name = "Fisica", required = true, nillable = true)
    protected String fisica;

    /**
     * Gets the value of the moral property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMoral() {
        return moral;
    }

    /**
     * Sets the value of the moral property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMoral(String value) {
        this.moral = value;
    }

    /**
     * Gets the value of the fisica property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFisica() {
        return fisica;
    }

    /**
     * Sets the value of the fisica property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFisica(String value) {
        this.fisica = value;
    }

}
