
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv.types;

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
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ppv" type="{http://xmlns.oracle.com/ConsultaPPV}ppvType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "operacion", "ppv" })
@XmlRootElement(name = "ConsultaPPVProcessRequest")
public class ConsultaPPVProcessRequest {

    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(required = true)
    protected PpvType ppv;

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the ppv property.
     *
     * @return
     *     possible object is
     *     {@link PpvType }
     *
     */
    public PpvType getPpv() {
        return ppv;
    }

    /**
     * Sets the value of the ppv property.
     *
     * @param value
     *     allowed object is
     *     {@link PpvType }
     *
     */
    public void setPpv(PpvType value) {
        this.ppv = value;
    }

}
