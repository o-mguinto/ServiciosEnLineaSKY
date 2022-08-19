
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
 *         &lt;element name="CabeceraOutput" type="{http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface}CabeceraOutput_TYPE"/&gt;
 *         &lt;element name="GeneraChatRNOutput" type="{http://www.sky.com.mx/EnterpriseObjects/SaaS/RN/GeneraURLChat/Interface}GeneraChatRNOutputABM_TYPE"/&gt;
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
@XmlRootElement(name = "GeneraChatRNOutputABM")
public class GeneraChatRNOutputABM {

    @XmlElement(name = "CabeceraOutput", required = true)
    protected CabeceraOutputTYPE cabeceraOutput;
    @XmlElement(name = "GeneraChatRNOutput", required = true)
    protected GeneraChatRNOutputABMTYPE generaChatRNOutput;

    /**
     * Gets the value of the cabeceraOutput property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraOutputTYPE }
     *
     */
    public CabeceraOutputTYPE getCabeceraOutput() {
        return cabeceraOutput;
    }

    /**
     * Sets the value of the cabeceraOutput property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraOutputTYPE }
     *
     */
    public void setCabeceraOutput(CabeceraOutputTYPE value) {
        this.cabeceraOutput = value;
    }

    /**
     * Gets the value of the generaChatRNOutput property.
     *
     * @return
     *     possible object is
     *     {@link GeneraChatRNOutputABMTYPE }
     *
     */
    public GeneraChatRNOutputABMTYPE getGeneraChatRNOutput() {
        return generaChatRNOutput;
    }

    /**
     * Sets the value of the generaChatRNOutput property.
     *
     * @param value
     *     allowed object is
     *     {@link GeneraChatRNOutputABMTYPE }
     *
     */
    public void setGeneraChatRNOutput(GeneraChatRNOutputABMTYPE value) {
        this.generaChatRNOutput = value;
    }

}
