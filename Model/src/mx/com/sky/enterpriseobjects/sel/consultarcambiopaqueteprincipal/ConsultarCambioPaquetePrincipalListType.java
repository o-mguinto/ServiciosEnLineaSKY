
package mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarCambioPaquetePrincipalListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCambioPaquetePrincipalListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConsultarCambioPaquetePrincipal" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarCambioPaquetePrincipal}ConsultarCambioPaquetePrincipalEBOType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCambioPaquetePrincipalListType", propOrder = { "consultarCambioPaquetePrincipal" })
public class ConsultarCambioPaquetePrincipalListType {

    @XmlElement(name = "ConsultarCambioPaquetePrincipal")
    protected List<ConsultarCambioPaquetePrincipalEBOType> consultarCambioPaquetePrincipal;

    /**
     * Gets the value of the consultarCambioPaquetePrincipal property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consultarCambioPaquetePrincipal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsultarCambioPaquetePrincipal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultarCambioPaquetePrincipalEBOType }
     *
     *
     */
    public List<ConsultarCambioPaquetePrincipalEBOType> getConsultarCambioPaquetePrincipal() {
        if (consultarCambioPaquetePrincipal == null) {
            consultarCambioPaquetePrincipal = new ArrayList<ConsultarCambioPaquetePrincipalEBOType>();
        }
        return this.consultarCambioPaquetePrincipal;
    }

}
