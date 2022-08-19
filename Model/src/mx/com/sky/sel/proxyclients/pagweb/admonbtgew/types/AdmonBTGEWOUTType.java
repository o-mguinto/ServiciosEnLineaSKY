
package mx.com.sky.sel.proxyclients.pagweb.admonbtgew.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdmonBTGEW_OUTType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AdmonBTGEW_OUTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BTGEWs" type="{http://xmlns.oracle.com/SKYPortal/AdmonBTGEW/AdmonBTGEW}BTGEWElementType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmonBTGEW_OUTType", propOrder = { "resultado", "resultadodesc", "btgeWs" })
public class AdmonBTGEWOUTType {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "BTGEWs", required = true)
    protected List<BTGEWElementType> btgeWs;

    /**
     * Gets the value of the resultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the resultadodesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultadodesc() {
        return resultadodesc;
    }

    /**
     * Sets the value of the resultadodesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultadodesc(String value) {
        this.resultadodesc = value;
    }

    /**
     * Gets the value of the btgeWs property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the btgeWs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBTGEWs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BTGEWElementType }
     *
     *
     */
    public List<BTGEWElementType> getBTGEWs() {
        if (btgeWs == null) {
            btgeWs = new ArrayList<BTGEWElementType>();
        }
        return this.btgeWs;
    }

}
