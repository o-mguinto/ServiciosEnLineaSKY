
package mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaEstadoDeCuentaEBMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaEstadoDeCuentaEBMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}consultaEstadoDeCuenta_Entrada"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaEstadoDeCuentaEBMType", namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaEstadoDeCuentaInterface", propOrder = {
    "ebmHeaderRequest",
    "consultaEstadoDeCuentaEntrada"
})
public class ConsultaEstadoDeCuentaEBMType {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "consultaEstadoDeCuenta_Entrada", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected ConsultaEstadoDeCuentaEntradaTYPE consultaEstadoDeCuentaEntrada;

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
     * Gets the value of the consultaEstadoDeCuentaEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaEstadoDeCuentaEntradaTYPE }
     *     
     */
    public ConsultaEstadoDeCuentaEntradaTYPE getConsultaEstadoDeCuentaEntrada() {
        return consultaEstadoDeCuentaEntrada;
    }

    /**
     * Sets the value of the consultaEstadoDeCuentaEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaEstadoDeCuentaEntradaTYPE }
     *     
     */
    public void setConsultaEstadoDeCuentaEntrada(ConsultaEstadoDeCuentaEntradaTYPE value) {
        this.consultaEstadoDeCuentaEntrada = value;
    }

}
