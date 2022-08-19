
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultatiird.types;

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
 *         &lt;element name="RowID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "rowID" })
@XmlRootElement(name = "ConsultaTI_IRDProcessRequest")
public class ConsultaTIIRDProcessRequest {

    @XmlElement(name = "RowID", required = true)
    protected String rowID;

    /**
     * Gets the value of the rowID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRowID() {
        return rowID;
    }

    /**
     * Sets the value of the rowID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowID(String value) {
        this.rowID = value;
    }

}
