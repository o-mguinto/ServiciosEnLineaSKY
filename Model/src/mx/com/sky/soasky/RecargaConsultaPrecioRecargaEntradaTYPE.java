
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Recarga_consultaPrecioRecarga_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Recarga_consultaPrecioRecarga_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Entrada_TYPE"/&gt;
 *         &lt;element name="NUMCUENTA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DIAS" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recarga_consultaPrecioRecarga_Entrada_TYPE",
         propOrder = { "cabecera", "numcuenta"
    })
public class RecargaConsultaPrecioRecargaEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "NUMCUENTA")
    protected String numcuenta;

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
     * Gets the value of the numcuenta property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public String getNUMCUENTA() {
        /*return numcuenta;*/

        return numcuenta;
    }

    /**
     * Sets the value of the numcuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setNUMCUENTA(String value) {
        this.numcuenta = value;
    }


}
