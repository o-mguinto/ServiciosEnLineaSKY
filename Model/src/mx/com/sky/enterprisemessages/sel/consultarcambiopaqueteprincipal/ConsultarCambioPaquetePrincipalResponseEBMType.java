
package mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalListType;


/**
 * <p>Java class for ConsultarCambioPaquetePrincipalResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCambioPaquetePrincipalResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="ConsultarCambioPaquetePrincipal" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarCambioPaquetePrincipal}ConsultarCambioPaquetePrincipalListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCambioPaquetePrincipalResponseEBMType",
         propOrder = { "ebmHeaderResponse", "consultarCambioPaquetePrincipal" })
public class ConsultarCambioPaquetePrincipalResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ConsultarCambioPaquetePrincipal", required = true)
    protected ConsultarCambioPaquetePrincipalListType consultarCambioPaquetePrincipal;

    /**
     * Gets the value of the ebmHeaderResponse property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public EBMHeaderResponseType getEBMHeaderResponse() {
        return ebmHeaderResponse;
    }

    /**
     * Sets the value of the ebmHeaderResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public void setEBMHeaderResponse(EBMHeaderResponseType value) {
        this.ebmHeaderResponse = value;
    }

    /**
     * Gets the value of the consultarCambioPaquetePrincipal property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarCambioPaquetePrincipalListType }
     *
     */
    public ConsultarCambioPaquetePrincipalListType getConsultarCambioPaquetePrincipal() {
        return consultarCambioPaquetePrincipal;
    }

    /**
     * Sets the value of the consultarCambioPaquetePrincipal property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarCambioPaquetePrincipalListType }
     *
     */
    public void setConsultarCambioPaquetePrincipal(ConsultarCambioPaquetePrincipalListType value) {
        this.consultarCambioPaquetePrincipal = value;
    }

}
