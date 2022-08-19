
package mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Suscriptor_consultaPPVContratadosEBMResponseTYPE_SalidaFiltro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Suscriptor_consultaPPVContratadosEBMResponseTYPE_SalidaFiltro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/>
 *         &lt;element ref="{http://www.sky.com.mx/soasky}Suscriptor_consultaPPVContratados_SalidaFiltros"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suscriptor_consultaPPVContratadosEBMResponseTYPE_SalidaFiltro", namespace = "http://www.sky.com.mx/EnterpriseObjects/SOA/Suscriptor_consultaPPVContratadosEBM", propOrder = {
    "ebmHeaderResponse",
    "suscriptorConsultaPPVContratadosSalidaFiltros"
})
public class SuscriptorConsultaPPVContratadosEBMResponseTYPESalidaFiltro {

    @XmlElement(name = "EBMHeaderResponse", namespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1", required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "Suscriptor_consultaPPVContratados_SalidaFiltros", namespace = "http://www.sky.com.mx/soasky", required = true)
    protected SuscriptorConsultaPPVContratadosSalidaFiltrosTYPE suscriptorConsultaPPVContratadosSalidaFiltros;

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
     * Gets the value of the suscriptorConsultaPPVContratadosSalidaFiltros property.
     * 
     * @return
     *     possible object is
     *     {@link SuscriptorConsultaPPVContratadosSalidaFiltrosTYPE }
     *     
     */
    public SuscriptorConsultaPPVContratadosSalidaFiltrosTYPE getSuscriptorConsultaPPVContratadosSalidaFiltros() {
        return suscriptorConsultaPPVContratadosSalidaFiltros;
    }

    /**
     * Sets the value of the suscriptorConsultaPPVContratadosSalidaFiltros property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuscriptorConsultaPPVContratadosSalidaFiltrosTYPE }
     *     
     */
    public void setSuscriptorConsultaPPVContratadosSalidaFiltros(SuscriptorConsultaPPVContratadosSalidaFiltrosTYPE value) {
        this.suscriptorConsultaPPVContratadosSalidaFiltros = value;
    }

}
