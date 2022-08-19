
package mx.com.sky.sel.proxyclients.soainterface.consultaestadocuenta.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaEstadoDeCuenta_Salida_TYPE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaEstadoDeCuenta_Salida_TYPE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Salida_TYPE"/>
 *         &lt;element name="FACTURA_FORMATEADA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaEstadoDeCuenta_Salida_TYPE", namespace = "http://www.sky.com.mx/soasky", propOrder = {
    "cabecera",
    "facturaformateada"
})
public class ConsultaEstadoDeCuentaSalidaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraSalidaTYPE cabecera;
    @XmlElement(name = "FACTURA_FORMATEADA", required = true)
    protected String facturaformateada;

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
     * Gets the value of the facturaformateada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACTURAFORMATEADA() {
        return facturaformateada;
    }

    /**
     * Sets the value of the facturaformateada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACTURAFORMATEADA(String value) {
        this.facturaformateada = value;
    }

}
