
package mx.com.sky.sel.proxyclients.rnsoa.generaurlchat.types;

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
 *       &lt;all&gt;
 *         &lt;element name="CabeceraInput" type="{http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface}CabeceraInput_TYPE"/&gt;
 *         &lt;element name="GeneraChatRNInput" type="{http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface}GeneraChatRNInputABM_TYPE"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {


    })
@XmlRootElement(name = "GeneraChatRNInputABM")
public class GeneraChatRNInputABM {

    @XmlElement(name = "CabeceraInput", required = true)
    protected CabeceraInputTYPE cabeceraInput;
    @XmlElement(name = "GeneraChatRNInput", required = true)
    protected GeneraChatRNInputABMTYPE generaChatRNInput;

    /**
     * Gets the value of the cabeceraInput property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraInputTYPE }
     *
     */
    public CabeceraInputTYPE getCabeceraInput() {
        return cabeceraInput;
    }

    /**
     * Sets the value of the cabeceraInput property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraInputTYPE }
     *
     */
    public void setCabeceraInput(CabeceraInputTYPE value) {
        this.cabeceraInput = value;
    }

    /**
     * Gets the value of the generaChatRNInput property.
     *
     * @return
     *     possible object is
     *     {@link GeneraChatRNInputABMTYPE }
     *
     */
    public GeneraChatRNInputABMTYPE getGeneraChatRNInput() {
        return generaChatRNInput;
    }

    /**
     * Sets the value of the generaChatRNInput property.
     *
     * @param value
     *     allowed object is
     *     {@link GeneraChatRNInputABMTYPE }
     *
     */
    public void setGeneraChatRNInput(GeneraChatRNInputABMTYPE value) {
        this.generaChatRNInput = value;
    }

}
