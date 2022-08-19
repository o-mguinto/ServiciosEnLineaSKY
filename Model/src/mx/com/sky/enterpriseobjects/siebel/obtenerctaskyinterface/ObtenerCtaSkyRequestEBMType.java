
package mx.com.sky.enterpriseobjects.siebel.obtenerctaskyinterface;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ObtenerCtaSkyRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ObtenerCtaSkyRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="nip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObtenerCtaSkyRequestEBMType", propOrder = { "ebmHeaderRequest", "nip", "imei" })
public class ObtenerCtaSkyRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    protected String nip;
    protected String imei;

    /**
     * Gets the value of the ebmHeaderRequest property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public EBMHeaderRequestType getEBMHeaderRequest() {
        return ebmHeaderRequest;
    }

    /**
     * Sets the value of the ebmHeaderRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public void setEBMHeaderRequest(EBMHeaderRequestType value) {
        this.ebmHeaderRequest = value;
    }

    /**
     * Gets the value of the nip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNip() {
        return nip;
    }

    /**
     * Sets the value of the nip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNip(String value) {
        this.nip = value;
    }

    /**
     * Gets the value of the imei property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImei(String value) {
        this.imei = value;
    }

}
