
package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Facturas_consultaFacturasPeriodo_Salida_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Facturas_consultaFacturasPeriodo_Salida_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Salida_TYPE"/>
 *         &lt;element name="RESULTADOS" type="{http://www.sky.com.mx/soasky}Resultados_Salida_TYPE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Facturas_consultaFacturasPeriodo_Salida_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "cabecera",
    "resultados"
})
public class FacturasConsultaFacturasPeriodoSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "RESULTADOS")
    protected List<ResultadosSalidaTYPE> resultados;

    /**
     * Gets the value of the cabecera property.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSalidaTYPE }
     *     
     */
    public CabeceraSalidaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaTYPE }
     *     
     */
    public void setCABECERA(CabeceraSalidaTYPE value) {
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
     *    getRESULTADOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultadosSalidaTYPE }
     * 
     * 
     */
    public List<ResultadosSalidaTYPE> getRESULTADOS() {
        if (resultados == null) {
            resultados = new ArrayList<ResultadosSalidaTYPE>();
        }
        return this.resultados;
    }

}
