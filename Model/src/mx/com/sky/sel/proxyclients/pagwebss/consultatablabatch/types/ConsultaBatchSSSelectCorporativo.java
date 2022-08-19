
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaBatchSSSelect_Corporativo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaBatchSSSelect_Corporativo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Corporativo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaBatchSSSelect_Corporativo", propOrder = { "corporativo" })
public class ConsultaBatchSSSelectCorporativo {

    @XmlElement(name = "Corporativo", required = true)
    protected String corporativo;

    /**
     * Gets the value of the corporativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCorporativo() {
        return corporativo;
    }

    /**
     * Sets the value of the corporativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCorporativo(String value) {
        this.corporativo = value;
    }

}
