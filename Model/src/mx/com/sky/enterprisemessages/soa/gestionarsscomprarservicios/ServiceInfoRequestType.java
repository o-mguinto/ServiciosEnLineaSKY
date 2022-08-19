
package mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceInfoRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceInfoRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Grupo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Tipo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListOfInstances" type="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarServicios}ListOfInstances_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoRequestType",
         propOrder = { "proceso", "cuenta", "categoria", "grupo", "tipo", "origen", "listOfInstances" })
public class ServiceInfoRequestType {

    @XmlElement(name = "Proceso", required = true)
    protected String proceso;
    @XmlElement(name = "Cuenta", required = true)
    protected String cuenta;
    @XmlElement(name = "Categoria", required = true)
    protected String categoria;
    @XmlElement(name = "Grupo", required = true)
    protected String grupo;
    @XmlElement(name = "Tipo", required = true)
    protected String tipo;
    @XmlElement(name = "Origen", required = true)
    protected String origen;
    @XmlElement(name = "ListOfInstances")
    protected ListOfInstancesType listOfInstances;

    /**
     * Gets the value of the proceso property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * Sets the value of the proceso property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setProceso(String value) {
        this.proceso = value;
    }

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

    /**
     * Gets the value of the categoria property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the grupo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Sets the value of the grupo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Gets the value of the tipo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the origen property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the listOfInstances property.
     *
     * @return
     *     possible object is
     *     {@link ListOfInstancesType }
     *
     */
    public ListOfInstancesType getListOfInstances() {
        return listOfInstances;
    }

    /**
     * Sets the value of the listOfInstances property.
     *
     * @param value
     *     allowed object is
     *     {@link ListOfInstancesType }
     *
     */
    public void setListOfInstances(ListOfInstancesType value) {
        this.listOfInstances = value;
    }

}
