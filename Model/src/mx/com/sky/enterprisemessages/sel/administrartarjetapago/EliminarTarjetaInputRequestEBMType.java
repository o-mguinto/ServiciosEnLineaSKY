
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for EliminarTarjetaInputRequestEBMType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EliminarTarjetaInputRequestEBMType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element name="DatosElimnarTarjeta" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago}EliminarTarjetaInputType"/&gt;
 *         &lt;element name="datosVoltage" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago}DatosVoltageType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EliminarTarjetaInputRequestEBMType",
         propOrder = { "ebmHeaderRequest", "datosElimnarTarjeta", "datosVoltage"
    })
public class EliminarTarjetaInputRequestEBMType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "DatosElimnarTarjeta", required = true)
    protected EliminarTarjetaInputType datosElimnarTarjeta;
    @XmlElement(required = true)
    protected DatosVoltageType datosVoltage;

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
     * Gets the value of the datosElimnarTarjeta property.
     *
     * @return
     *     possible object is
     *     {@link EliminarTarjetaInputType }
     *
     */
    public EliminarTarjetaInputType getDatosElimnarTarjeta() {
        return datosElimnarTarjeta;
    }

    /**
     * Sets the value of the datosElimnarTarjeta property.
     *
     * @param value
     *     allowed object is
     *     {@link EliminarTarjetaInputType }
     *
     */
    public void setDatosElimnarTarjeta(EliminarTarjetaInputType value) {
        this.datosElimnarTarjeta = value;
    }

    /**
     * Gets the value of the datosVoltage property.
     *
     * @return
     *     possible object is
     *     {@link DatosVoltageType }
     *
     */
    public DatosVoltageType getDatosVoltage() {
        return datosVoltage;
    }

    /**
     * Sets the value of the datosVoltage property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosVoltageType }
     *
     */
    public void setDatosVoltage(DatosVoltageType value) {
        this.datosVoltage = value;
    }

}
