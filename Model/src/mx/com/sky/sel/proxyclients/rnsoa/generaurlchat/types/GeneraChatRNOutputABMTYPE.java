
package mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneraChatRNOutputABM_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GeneraChatRNOutputABM_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="URLRN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneraChatRNOutputABM_TYPE", propOrder = {


    })
public class GeneraChatRNOutputABMTYPE {

    @XmlElement(name = "URLRN", required = true)
    protected String urlrn;

    /**
     * Gets the value of the urlrn property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getURLRN() {
        return urlrn;
    }

    /**
     * Sets the value of the urlrn property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setURLRN(String value) {
        this.urlrn = value;
    }

}
