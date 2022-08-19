
package org.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numBolsa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "numBolsa" })
@XmlRootElement(name = "ProductoPrecio")
public class ProductoPrecio {

    @XmlElement(required = true)
    protected String numBolsa;

    /**
     * Gets the value of the numBolsa property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumBolsa() {
        return numBolsa;
    }

    /**
     * Sets the value of the numBolsa property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumBolsa(String value) {
        this.numBolsa = value;
    }

}
