
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaquetesInType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PaquetesInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id_Pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaquetesInType", propOrder = { "idPais" })
public class PaquetesInType {

    @XmlElement(name = "Id_Pais", required = true)
    protected String idPais;

    /**
     * Gets the value of the idPais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdPais() {
        return idPais;
    }

    /**
     * Sets the value of the idPais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdPais(String value) {
        this.idPais = value;
    }

}
