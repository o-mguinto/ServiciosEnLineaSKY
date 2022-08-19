
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatmpbtgew.types;

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
 *         &lt;element name="result" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaTMPBlueToGoEveryWhere/ConsultaTMP_BTGEW}tmpBTGEW_OUTType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "result" })
@XmlRootElement(name = "processResponse")
public class ProcessResponse {

    @XmlElement(required = true)
    protected TmpBTGEWOUTType result;

    /**
     * Gets the value of the result property.
     *
     * @return
     *     possible object is
     *     {@link TmpBTGEWOUTType }
     *
     */
    public TmpBTGEWOUTType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     *
     * @param value
     *     allowed object is
     *     {@link TmpBTGEWOUTType }
     *
     */
    public void setResult(TmpBTGEWOUTType value) {
        this.result = value;
    }

}
