
package mx.com.sky.sel.proxyclients.ejb.replicareventosom.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for procesarResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="procesarResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://ws.eventos.servicios.sky.com.mx/}replicatorBean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "procesarResponse", propOrder = { "_return" })
public class ProcesarResponse {

    @XmlElement(name = "return")
    protected ReplicatorBean _return;

    /**
     * Gets the value of the return property.
     *
     * @return
     *     possible object is
     *     {@link ReplicatorBean }
     *
     */
    public ReplicatorBean getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     *
     * @param value
     *     allowed object is
     *     {@link ReplicatorBean }
     *
     */
    public void setReturn(ReplicatorBean value) {
        this._return = value;
    }

}
