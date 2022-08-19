
package mx.com.sky.sel.proxyclients.pagweb.admonbtgew.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdmonBTGEW_INType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AdmonBTGEW_INType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaisISO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserNameElimina" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BTGEWElement" type="{http://xmlns.oracle.com/SKYPortal/AdmonBTGEW/AdmonBTGEW}BTGEWElementType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdmonBTGEW_INType", propOrder = { "paisISO", "operacion", "userNameElimina", "btgewElement" })
public class AdmonBTGEWINType {

    @XmlElement(name = "PaisISO", required = true)
    protected String paisISO;
    @XmlElement(name = "Operacion", required = true)
    protected String operacion;
    @XmlElement(name = "UserNameElimina", required = true)
    protected String userNameElimina;
    @XmlElement(name = "BTGEWElement", required = true)
    protected BTGEWElementType btgewElement;

    /**
     * Gets the value of the paisISO property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaisISO() {
        return paisISO;
    }

    /**
     * Sets the value of the paisISO property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaisISO(String value) {
        this.paisISO = value;
    }

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
     * Gets the value of the userNameElimina property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserNameElimina() {
        return userNameElimina;
    }

    /**
     * Sets the value of the userNameElimina property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserNameElimina(String value) {
        this.userNameElimina = value;
    }

    /**
     * Gets the value of the btgewElement property.
     *
     * @return
     *     possible object is
     *     {@link BTGEWElementType }
     *
     */
    public BTGEWElementType getBTGEWElement() {
        return btgewElement;
    }

    /**
     * Sets the value of the btgewElement property.
     *
     * @param value
     *     allowed object is
     *     {@link BTGEWElementType }
     *
     */
    public void setBTGEWElement(BTGEWElementType value) {
        this.btgewElement = value;
    }

}
