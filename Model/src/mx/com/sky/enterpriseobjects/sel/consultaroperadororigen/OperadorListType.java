
package mx.com.sky.enterpriseobjects.sel.consultaroperadororigen;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperadorListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OperadorListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operador" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarOperadorOrigen}OperadorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperadorListType", propOrder = { "operador" })
public class OperadorListType {

    @XmlElement(name = "Operador")
    protected List<OperadorType> operador;

    /**
     * Gets the value of the operador property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operador property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperador().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperadorType }
     *
     *
     */
    public List<OperadorType> getOperador() {
        if (operador == null) {
            operador = new ArrayList<OperadorType>();
        }
        return this.operador;
    }

}
