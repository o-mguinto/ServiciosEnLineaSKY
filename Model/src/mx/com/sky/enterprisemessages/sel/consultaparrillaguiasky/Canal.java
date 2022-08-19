
package mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Canal complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Canal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identificador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdMostrado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CanalNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Canal",
         propOrder =
         { "identificador", "idMostrado", "canalNombre", "nombre", "descripcion"
    })
public class Canal {

    @XmlElementRef(name = "Identificador",
                   namespace =
                   "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> identificador;
    @XmlElementRef(name = "IdMostrado",
                   namespace =
                   "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> idMostrado;
    @XmlElementRef(name = "CanalNombre",
                   namespace =
                   "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> canalNombre;
    @XmlElementRef(name = "Nombre",
                   namespace =
                   "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElementRef(name = "Descripcion",
                   namespace =
                   "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultaParrillaGuiaSky",
                   type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcion;

    /**
     * Gets the value of the identificador property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIdentificador() {
        return identificador;
    }

    /**
     * Sets the value of the identificador property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setIdentificador(JAXBElement<String> value) {
        this.identificador = value;
    }

    /**
     * Gets the value of the idMostrado property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIdMostrado() {
        return idMostrado;
    }

    /**
     * Sets the value of the idMostrado property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setIdMostrado(JAXBElement<String> value) {
        this.idMostrado = value;
    }

    /**
     * Gets the value of the canalNombre property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCanalNombre() {
        return canalNombre;
    }

    /**
     * Sets the value of the canalNombre property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCanalNombre(JAXBElement<String> value) {
        this.canalNombre = value;
    }

    /**
     * Gets the value of the nombre property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setDescripcion(JAXBElement<String> value) {
        this.descripcion = value;
    }

}
