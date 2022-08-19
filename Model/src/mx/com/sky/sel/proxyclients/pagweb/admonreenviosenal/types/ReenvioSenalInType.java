
package mx.com.sky.sel.proxyclients.pagweb.admonreenviosenal.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReenvioSenalInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ReenvioSenalInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="REENVIO_SENALInput" type="{http://xmlns.oracle.com/SKYPortal/AdmonReenvioSenal/AdmonReenvioSenal}INSERT_REENVIO_SENALInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReenvioSenalInType", propOrder = { "reenviosenalInput" })
public class ReenvioSenalInType {

    @XmlElement(name = "REENVIO_SENALInput", required = true)
    protected INSERTREENVIOSENALInput reenviosenalInput;

    /**
     * Gets the value of the reenviosenalInput property.
     *
     * @return
     *     possible object is
     *     {@link INSERTREENVIOSENALInput }
     *
     */
    public INSERTREENVIOSENALInput getREENVIOSENALInput() {
        return reenviosenalInput;
    }

    /**
     * Sets the value of the reenviosenalInput property.
     *
     * @param value
     *     allowed object is
     *     {@link INSERTREENVIOSENALInput }
     *
     */
    public void setREENVIOSENALInput(INSERTREENVIOSENALInput value) {
        this.reenviosenalInput = value;
    }

}
