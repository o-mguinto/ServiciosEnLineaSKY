
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultainfofiscalvigente.types;

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
 *         &lt;element name="RowId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "rowId" })
@XmlRootElement(name = "ConsultaInformacionFiscalVigenteProcessRequest")
public class ConsultaInformacionFiscalVigenteProcessRequest {

    @XmlElement(name = "RowId", required = true)
    protected String rowId;

    /**
     * Gets the value of the rowId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRowId(String value) {
        this.rowId = value;
    }

}
