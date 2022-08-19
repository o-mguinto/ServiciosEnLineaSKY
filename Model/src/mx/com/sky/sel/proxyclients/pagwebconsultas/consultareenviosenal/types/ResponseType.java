
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultareenviosenal.types;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="errorMsg" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListaConsultaReenvioSenal" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaReenvioSenal/ConsultaReenvioSenal}ConsultaReenvioSenalBDOutput" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = { "errorCode", "errorMsg", "listaConsultaReenvioSenal" })
public class ResponseType {

    @XmlElement(required = true)
    protected String errorCode;
    @XmlElement(required = true)
    protected String errorMsg;
    @XmlElement(name = "ListaConsultaReenvioSenal", required = true)
    protected List<ConsultaReenvioSenalBDOutput> listaConsultaReenvioSenal;

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMsg property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the listaConsultaReenvioSenal property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaConsultaReenvioSenal property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaConsultaReenvioSenal().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaReenvioSenalBDOutput }
     *
     *
     */
    public List<ConsultaReenvioSenalBDOutput> getListaConsultaReenvioSenal() {
        if (listaConsultaReenvioSenal == null) {
            listaConsultaReenvioSenal = new ArrayList<ConsultaReenvioSenalBDOutput>();
        }
        return this.listaConsultaReenvioSenal;
    }

}
