
package mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Suscriptor_consultaPPVContratadosEBMResponseTYPE_Salida complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Suscriptor_consultaPPVContratadosEBMResponseTYPE_Salida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Suscriptor_consultaPPVContratados_Salida"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suscriptor_consultaPPVContratadosEBMResponseTYPE_Salida", namespace = "http://www.sky.com.mx/EnterpriseObjects/SOA/Suscriptor_consultaPPVContratadosEBM", propOrder = {
    "ebmHeaderResponse",
    "suscriptorConsultaPPVContratadosSalida"
})
public class SuscriptorConsultaPPVContratadosEBMResponseTYPESalida {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "Suscriptor_consultaPPVContratados_Salida", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected SuscriptorConsultaPPVContratadosSalidaTYPE suscriptorConsultaPPVContratadosSalida;

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
     * Gets the value of the suscriptorConsultaPPVContratadosSalida property.
     * 
     * @return
     *     possible object is
     *     {@link SuscriptorConsultaPPVContratadosSalidaTYPE }
     *     
     */
    public SuscriptorConsultaPPVContratadosSalidaTYPE getSuscriptorConsultaPPVContratadosSalida() {
        return suscriptorConsultaPPVContratadosSalida;
    }

    /**
     * Sets the value of the suscriptorConsultaPPVContratadosSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuscriptorConsultaPPVContratadosSalidaTYPE }
     *     
     */
    public void setSuscriptorConsultaPPVContratadosSalida(SuscriptorConsultaPPVContratadosSalidaTYPE value) {
        this.suscriptorConsultaPPVContratadosSalida = value;
    }

}
