
package mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;
import mx.com.sky.enterpriseobjects.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesListType;


/**
 * <p>Java class for ConsultarServiciosAdicionalesResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarServiciosAdicionalesResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="ConsultarServiciosAdicionales" type="{http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarServiciosAdicionales}ConsultarServiciosAdicionalesListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarServiciosAdicionalesResponseEBMType",
         propOrder = { "ebmHeaderResponse", "consultarServiciosAdicionales" })
public class ConsultarServiciosAdicionalesResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ConsultarServiciosAdicionales", required = true)
    protected ConsultarServiciosAdicionalesListType consultarServiciosAdicionales;

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
     * Gets the value of the consultarServiciosAdicionales property.
     *
     * @return
     *     possible object is
     *     {@link ConsultarServiciosAdicionalesListType }
     *
     */
    public ConsultarServiciosAdicionalesListType getConsultarServiciosAdicionales() {
        return consultarServiciosAdicionales;
    }

    /**
     * Sets the value of the consultarServiciosAdicionales property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultarServiciosAdicionalesListType }
     *
     */
    public void setConsultarServiciosAdicionales(ConsultarServiciosAdicionalesListType value) {
        this.consultarServiciosAdicionales = value;
    }

}
