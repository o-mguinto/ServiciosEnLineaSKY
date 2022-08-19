
package mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActualizarDatosFiscalesResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ActualizarDatosFiscalesResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Proceso" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SRNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SREstatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizarDatosFiscalesResponseType",
         propOrder = { "proceso", "errorCode", "errorMessage", "srId", "srNumber", "srEstatus"
    })
public class ActualizarDatosFiscalesResponseType {

    @XmlElement(name = "Proceso", required = true)
    protected String proceso;
    @XmlElement(name = "ErrorCode", required = true)
    protected String errorCode;
    @XmlElement(name = "ErrorMessage", required = true)
    protected String errorMessage;
    @XmlElement(name = "SRId", required = true)
    protected String srId;
    @XmlElement(name = "SRNumber", required = true)
    protected String srNumber;
    @XmlElement(name = "SREstatus", required = true)
    protected String srEstatus;

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
     * Gets the value of the errorMessage property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the srId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRId() {
        return srId;
    }

    /**
     * Sets the value of the srId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRId(String value) {
        this.srId = value;
    }

    /**
     * Gets the value of the srNumber property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSRNumber() {
        return srNumber;
    }

    /**
     * Sets the value of the srNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSRNumber(String value) {
        this.srNumber = value;
    }

    /**
     * Gets the value of the srEstatus property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSREstatus() {
        return srEstatus;
    }

    /**
     * Sets the value of the srEstatus property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSREstatus(String value) {
        this.srEstatus = value;
    }

}
