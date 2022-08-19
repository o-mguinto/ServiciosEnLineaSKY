
package mx.com.sky.enterprisemessages.sel.paqadicionaldatos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ConsultarPaqAdicionalDatosRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarPaqAdicionalDatosRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="ConsultarPaqAdicionalDatosRequest" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/PaqAdicionalDatos}ConsultarPaqAdicionalDatosRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarPaqAdicionalDatosRequestEBMType",
         propOrder = { "ebmHeaderRequest", "consultarPaqAdicionalDatosRequest"
    })
public class ConsultarPaqAdicionalDatosRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ConsultarPaqAdicionalDatosRequest", required = true)
    protected ConsultarPaqAdicionalDatosRequestType consultarPaqAdicionalDatosRequest;

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
     * Gets the value of the consultarPaqAdicionalDatosRequest property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarPaqAdicionalDatosRequestType }
     *
     */
    public ConsultarPaqAdicionalDatosRequestType getConsultarPaqAdicionalDatosRequest() {
        return consultarPaqAdicionalDatosRequest;
    }

    /**
     * Sets the value of the consultarPaqAdicionalDatosRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarPaqAdicionalDatosRequestType }
     *
     */
    public void setConsultarPaqAdicionalDatosRequest(ConsultarPaqAdicionalDatosRequestType value) {
        this.consultarPaqAdicionalDatosRequest = value;
    }

}
