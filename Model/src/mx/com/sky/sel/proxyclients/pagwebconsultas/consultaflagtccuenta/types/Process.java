
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultaflagtccuenta.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatosCuenta" type="{http://xmlns.oracle.com/SKYConsultas/ConsultaFlagTCCuenta/BPEL_ConsultaFlagCuenta}Cuenta"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "datosCuenta" })
@XmlRootElement(name = "process")
public class Process {

    @XmlElement(name = "DatosCuenta", required = true)
    protected Cuenta datosCuenta;

    /**
     * Gets the value of the datosCuenta property.
     *
     * @return
     *     possible object is
     *     {@link Cuenta }
     *
     */
    public Cuenta getDatosCuenta() {
        return datosCuenta;
    }

    /**
     * Sets the value of the datosCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link Cuenta }
     *
     */
    public void setDatosCuenta(Cuenta value) {
        this.datosCuenta = value;
    }

}
