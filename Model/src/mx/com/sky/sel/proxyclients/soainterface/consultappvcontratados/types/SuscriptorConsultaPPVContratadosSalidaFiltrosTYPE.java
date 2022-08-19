
package mx.com.sky.sel.proxyclients.soainterface.consultappvcontratados.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Suscriptor_consultaPPVContratados_SalidaFiltros_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Suscriptor_consultaPPVContratados_SalidaFiltros_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Entrada_TYPE"/>
 *         &lt;element name="Resultados" type="{http://www.sky.com.mx/soasky}Resultados_consultaPPVContratados_Salida_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Suscriptor_consultaPPVContratados_SalidaFiltros_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "cabecera",
    "resultados"
})
public class SuscriptorConsultaPPVContratadosSalidaFiltrosTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "Resultados")
    protected List<ResultadosConsultaPPVContratadosSalidaTYPE> resultados;

    /**
     * Gets the value of the cabecera property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraEntradaTYPE }
     *     
     */
    public CabeceraEntradaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraEntradaTYPE }
     *     
     */
    public void setCABECERA(CabeceraEntradaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the resultados property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resultados property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResultados().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultadosConsultaPPVContratadosSalidaTYPE }
     * 
     * 
     */
    public List<ResultadosConsultaPPVContratadosSalidaTYPE> getResultados() {
        if (resultados == null) {
            resultados = new ArrayList<ResultadosConsultaPPVContratadosSalidaTYPE>();
        }
        return this.resultados;
    }

}
