
package mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaEstadoDeCuentaResponseEBMType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultaEstadoDeCuentaResponseEBMType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}consultaEstadoDeCuenta_Salida"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaEstadoDeCuentaResponseEBMType", namespace = "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaEstadoDeCuentaInterface", propOrder = {
    "ebmHeaderResponse",
    "consultaEstadoDeCuentaSalida"
})
public class ConsultaEstadoDeCuentaResponseEBMType {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "consultaEstadoDeCuenta_Salida", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected ConsultaEstadoDeCuentaSalidaTYPE consultaEstadoDeCuentaSalida;

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
     * Gets the value of the consultaEstadoDeCuentaSalida property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultaEstadoDeCuentaSalidaTYPE }
     *     
     */
    public ConsultaEstadoDeCuentaSalidaTYPE getConsultaEstadoDeCuentaSalida() {
        return consultaEstadoDeCuentaSalida;
    }

    /**
     * Sets the value of the consultaEstadoDeCuentaSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultaEstadoDeCuentaSalidaTYPE }
     *     
     */
    public void setConsultaEstadoDeCuentaSalida(ConsultaEstadoDeCuentaSalidaTYPE value) {
        this.consultaEstadoDeCuentaSalida = value;
    }

}
