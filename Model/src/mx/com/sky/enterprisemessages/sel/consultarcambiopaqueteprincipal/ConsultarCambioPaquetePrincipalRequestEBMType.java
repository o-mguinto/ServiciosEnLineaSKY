
package mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ConsultarCambioPaquetePrincipalRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCambioPaquetePrincipalRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="ConsultarCambioPaquetePrincipalRequest" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarCambioPaquetePrincipal}ConsultarCambioPaquetePrincipalRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCambioPaquetePrincipalRequestEBMType",
         propOrder = { "ebmHeaderRequest", "consultarCambioPaquetePrincipalRequest" })
public class ConsultarCambioPaquetePrincipalRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "ConsultarCambioPaquetePrincipalRequest", required = true)
    protected ConsultarCambioPaquetePrincipalRequestType consultarCambioPaquetePrincipalRequest;

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
     * Gets the value of the consultarCambioPaquetePrincipalRequest property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarCambioPaquetePrincipalRequestType }
     *
     */
    public ConsultarCambioPaquetePrincipalRequestType getConsultarCambioPaquetePrincipalRequest() {
        return consultarCambioPaquetePrincipalRequest;
    }

    /**
     * Sets the value of the consultarCambioPaquetePrincipalRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarCambioPaquetePrincipalRequestType }
     *
     */
    public void setConsultarCambioPaquetePrincipalRequest(ConsultarCambioPaquetePrincipalRequestType value) {
        this.consultarCambioPaquetePrincipalRequest = value;
    }

}