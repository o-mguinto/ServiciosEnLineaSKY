
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBConsultarCtaCelSkySiebelInterfaceInputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBConsultarCtaCelSkySiebelInterfaceInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumCelular" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBConsultarCtaCelSkySiebelInterfaceInputType",
         propOrder = { "numCelular" })
public class DBConsultarCtaCelSkySiebelInterfaceInputType {

    @XmlElement(name = "NumCelular", required = true, nillable = true, namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface")
    protected String numCelular;

    /**
     * Gets the value of the numCelular property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumCelular() {
        return numCelular;
    }

    /**
     * Sets the value of the numCelular property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumCelular(String value) {
        this.numCelular = value;
    }

}
