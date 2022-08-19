
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaladas.types;

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
 *         &lt;element name="app" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "app" })
@XmlRootElement(name = "ConsultaLadasProcessRequest")
public class ConsultaLadasProcessRequest {

    @XmlElement(required = true)
    protected String app;

    /**
     * Gets the value of the app property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApp() {
        return app;
    }

    /**
     * Sets the value of the app property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApp(String value) {
        this.app = value;
    }

}
