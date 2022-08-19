
package mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for GestionarPagoConTDCResponseEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GestionarPagoConTDCResponseEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element name="DatosTransaccionPagoOut" type="{http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDC}DatosTransaccionPagoOutputMessageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GestionarPagoConTDCResponseEBMType",
         propOrder = { "ebmHeaderResponse", "datosTransaccionPagoOut"
    })
public class GestionarPagoConTDCResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "DatosTransaccionPagoOut", required = true)
    protected DatosTransaccionPagoOutputMessageType datosTransaccionPagoOut;

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
     * Gets the value of the datosTransaccionPagoOut property.
     *
     * @return
     *     possible object is
     *     {@link DatosTransaccionPagoOutputMessageType }
     *
     */
    public DatosTransaccionPagoOutputMessageType getDatosTransaccionPagoOut() {
        return datosTransaccionPagoOut;
    }

    /**
     * Sets the value of the datosTransaccionPagoOut property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosTransaccionPagoOutputMessageType }
     *
     */
    public void setDatosTransaccionPagoOut(DatosTransaccionPagoOutputMessageType value) {
        this.datosTransaccionPagoOut = value;
    }

}
