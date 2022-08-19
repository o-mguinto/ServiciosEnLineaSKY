
package mx.com.sky.enterpriseobjects.sap.common.v3;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametroListType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ParametroListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParametroItem" type="{http://www.sky.com.mx/EnterpriseObjects/Sap/Common/V3}ParametroItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametroListType", propOrder = { "parametroItem" })
public class ParametroListType {

    @XmlElement(name = "ParametroItem")
    protected List<ParametroItemType> parametroItem;

    /**
     * Gets the value of the parametroItem property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametroItem property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametroItem().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroItemType }
     *
     *
     */
    public List<ParametroItemType> getParametroItem() {
        if (parametroItem == null) {
            parametroItem = new ArrayList<ParametroItemType>();
        }
        return this.parametroItem;
    }

}
