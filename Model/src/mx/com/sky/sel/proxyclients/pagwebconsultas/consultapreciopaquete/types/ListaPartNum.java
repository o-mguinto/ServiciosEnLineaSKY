
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciopaquete.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="respuestaPartNum" type="{http://www.example.org}CollectionPartNum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "respuestaPartNum" })
@XmlRootElement(name = "ListaPartNum")
public class ListaPartNum {

    protected CollectionPartNum respuestaPartNum;

    /**
     * Gets the value of the respuestaPartNum property.
     *
     * @return
     *     possible object is
     *     {@link CollectionPartNum }
     *
     */
    public CollectionPartNum getRespuestaPartNum() {
        return respuestaPartNum;
    }

    /**
     * Sets the value of the respuestaPartNum property.
     *
     * @param value
     *     allowed object is
     *     {@link CollectionPartNum }
     *
     */
    public void setRespuestaPartNum(CollectionPartNum value) {
        this.respuestaPartNum = value;
    }

}
