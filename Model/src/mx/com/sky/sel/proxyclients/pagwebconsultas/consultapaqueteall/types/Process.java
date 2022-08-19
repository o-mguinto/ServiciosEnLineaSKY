
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types;

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
 *         &lt;element name="input" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaPaquete/ConsultaPaqueteAll}PaquetesInType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "input" })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(required = true)
    protected PaquetesInType input;

    /**
     * Gets the value of the input property.
     *
     * @return
     *     possible object is
     *     {@link PaquetesInType }
     *
     */
    public PaquetesInType getInput() {
        return input;
    }

    /**
     * Sets the value of the input property.
     *
     * @param value
     *     allowed object is
     *     {@link PaquetesInType }
     *
     */
    public void setInput(PaquetesInType value) {
        this.input = value;
    }

}
