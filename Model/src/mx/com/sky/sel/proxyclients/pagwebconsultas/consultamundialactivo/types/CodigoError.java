
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodigoError complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CodigoError"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Resumen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Detalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodigoError", propOrder = { "codigo", "resumen", "detalle" })
public class CodigoError {

    @XmlElementRef(name = "Codigo",
                   namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaMundialActivo/ConsultaMundialActivo",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigo;
    @XmlElementRef(name = "Resumen",
                   namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaMundialActivo/ConsultaMundialActivo",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> resumen;
    @XmlElementRef(name = "Detalle",
                   namespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaMundialActivo/ConsultaMundialActivo",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> detalle;

    /**
     * Gets the value of the codigo property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCodigo(JAXBElement<String> value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the resumen property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getResumen() {
        return resumen;
    }

    /**
     * Sets the value of the resumen property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setResumen(JAXBElement<String> value) {
        this.resumen = value;
    }

    /**
     * Gets the value of the detalle property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDetalle() {
        return detalle;
    }

    /**
     * Sets the value of the detalle property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDetalle(JAXBElement<String> value) {
        this.detalle = value;
    }

}
