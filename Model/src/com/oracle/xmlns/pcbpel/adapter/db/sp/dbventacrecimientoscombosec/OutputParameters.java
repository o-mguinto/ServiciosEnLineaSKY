
package com.oracle.xmlns.pcbpel.adapter.db.sp.dbventacrecimientoscombosec;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="SS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CONTRATOI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "ss", "contratoi" })
@XmlRootElement(name = "OutputParameters")
public class OutputParameters {

    @XmlElementRef(name = "SS", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> ss;
    @XmlElementRef(name = "CONTRATOI",
                   namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/sp/DbVentaCrecimientosComboSec",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> contratoi;

    /**
     * Gets the value of the ss property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSS() {
        return ss;
    }

    /**
     * Sets the value of the ss property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSS(JAXBElement<String> value) {
        this.ss = value;
    }

    /**
     * Gets the value of the contratoi property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCONTRATOI() {
        return contratoi;
    }

    /**
     * Sets the value of the contratoi property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCONTRATOI(JAXBElement<String> value) {
        this.contratoi = value;
    }

}
