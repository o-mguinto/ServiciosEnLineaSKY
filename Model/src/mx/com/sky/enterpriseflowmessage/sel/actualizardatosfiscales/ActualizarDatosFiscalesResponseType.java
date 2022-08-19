
package mx.com.sky.enterpriseflowmessage.sel.actualizardatosfiscales;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


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
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/ActualizarDatosFiscales}ActualizarDatosFiscalesResponse"/&gt;
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
         propOrder = { "ebmHeaderResponse", "actualizarDatosFiscalesResponse" })
public class ActualizarDatosFiscalesResponseType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "ActualizarDatosFiscalesResponse",
                namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ActualizarDatosFiscales", required = true)
    protected mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales.ActualizarDatosFiscalesResponseType actualizarDatosFiscalesResponse;

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
     * Gets the value of the actualizarDatosFiscalesResponse property.
     *
     * @return
     *     possible object is
     *     {@link mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales.ActualizarDatosFiscalesResponseType }
     *
     */
    public mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales.ActualizarDatosFiscalesResponseType getActualizarDatosFiscalesResponse() {
        return actualizarDatosFiscalesResponse;
    }

    /**
     * Sets the value of the actualizarDatosFiscalesResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales.ActualizarDatosFiscalesResponseType }
     *
     */
    public void setActualizarDatosFiscalesResponse(mx.com.sky.enterpriseobjects.sel.actualizardatosfiscales.ActualizarDatosFiscalesResponseType value) {
        this.actualizarDatosFiscalesResponse = value;
    }

}
