
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mx.com.sky.enterpriseobjects.sel.tarjetapagoebo.DatosTarjetaPagoType;


/**
 * <p>Java class for RegistrarTarjetaInputType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="RegistrarTarjetaInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroCuentaCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO}DatosTarjetaPago"/&gt;
 *         &lt;element name="datosVoltage" type="{http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago}DatosVoltageType"/&gt;
 *         &lt;element name="sistemaProducto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrarTarjetaInputType",
         propOrder =
         { "numeroCuentaCliente", "datosTarjetaPago", "datosVoltage",
           "sistemaProducto"
    })
public class RegistrarTarjetaInputType {

    @XmlElement(required = true)
    protected String numeroCuentaCliente;
    @XmlElement(name = "DatosTarjetaPago",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/TarjetaPagoEBO",
                required = true)
    protected DatosTarjetaPagoType datosTarjetaPago;
    @XmlElement(required = true)
    protected DatosVoltageType datosVoltage;
    @XmlElement(required = true)
    protected String sistemaProducto;

    /**
     * Gets the value of the numeroCuentaCliente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNumeroCuentaCliente() {
        return numeroCuentaCliente;
    }

    /**
     * Sets the value of the numeroCuentaCliente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNumeroCuentaCliente(String value) {
        this.numeroCuentaCliente = value;
    }

    /**
     * Gets the value of the datosTarjetaPago property.
     *
     * @return
     *     possible object is
     *     {@link DatosTarjetaPagoType }
     *
     */
    public DatosTarjetaPagoType getDatosTarjetaPago() {
        return datosTarjetaPago;
    }

    /**
     * Sets the value of the datosTarjetaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosTarjetaPagoType }
     *
     */
    public void setDatosTarjetaPago(DatosTarjetaPagoType value) {
        this.datosTarjetaPago = value;
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

    /**
     * Gets the value of the sistemaProducto property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistemaProducto() {
        return sistemaProducto;
    }

    /**
     * Sets the value of the sistemaProducto property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistemaProducto(String value) {
        this.sistemaProducto = value;
    }

}
