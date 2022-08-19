
package mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Suscriptor_consultaPPVContratadosEBMRequestTYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Suscriptor_consultaPPVContratadosEBMRequestTYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Suscriptor_consultaPPVContratados_Entrada"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suscriptor_consultaPPVContratadosEBMRequestTYPE", namespace = "http://www.sky.com.mx/EnterpriseObjects/SOA/Suscriptor_consultaPPVContratadosEBM", propOrder = {
    "ebmHeaderRequest",
    "suscriptorConsultaPPVContratadosEntrada"
})
public class SuscriptorConsultaPPVContratadosEBMRequestTYPE {

    @XmlElement(name = "EBMHeaderRequest", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "Suscriptor_consultaPPVContratados_Entrada", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected SuscriptorConsultaPPVContratadosEntradaTYPE suscriptorConsultaPPVContratadosEntrada;

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
     * Gets the value of the suscriptorConsultaPPVContratadosEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link SuscriptorConsultaPPVContratadosEntradaTYPE }
     *     
     */
    public SuscriptorConsultaPPVContratadosEntradaTYPE getSuscriptorConsultaPPVContratadosEntrada() {
        return suscriptorConsultaPPVContratadosEntrada;
    }

    /**
     * Sets the value of the suscriptorConsultaPPVContratadosEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuscriptorConsultaPPVContratadosEntradaTYPE }
     *     
     */
    public void setSuscriptorConsultaPPVContratadosEntrada(SuscriptorConsultaPPVContratadosEntradaTYPE value) {
        this.suscriptorConsultaPPVContratadosEntrada = value;
    }

}
