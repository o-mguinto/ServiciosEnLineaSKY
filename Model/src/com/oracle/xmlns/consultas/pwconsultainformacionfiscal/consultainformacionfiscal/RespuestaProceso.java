
package com.oracle.xmlns.consultas.pwconsultainformacionfiscal.consultainformacionfiscal;

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
 *         &lt;element name="cabeceraSalida" type="{http://xmlns.oracle.com/Consultas/PWConsultaInformacionFiscal/ConsultaInformacionFiscal}cabeceraSalidaInformacionFiscal"/&gt;
 *         &lt;element name="datosInformacionFiscal" type="{http://xmlns.oracle.com/Consultas/PWConsultaInformacionFiscal/ConsultaInformacionFiscal}datosInformacionFiscal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cabeceraSalida", "datosInformacionFiscal" })
@XmlRootElement(name = "respuestaProceso")
public class RespuestaProceso {

    @XmlElement(required = true)
    protected CabeceraSalidaInformacionFiscal cabeceraSalida;
    @XmlElement(required = true)
    protected DatosInformacionFiscal datosInformacionFiscal;

    /**
     * Gets the value of the cabeceraSalida property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraSalidaInformacionFiscal }
     *
     */
    public CabeceraSalidaInformacionFiscal getCabeceraSalida() {
        return cabeceraSalida;
    }

    /**
     * Sets the value of the cabeceraSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraSalidaInformacionFiscal }
     *
     */
    public void setCabeceraSalida(CabeceraSalidaInformacionFiscal value) {
        this.cabeceraSalida = value;
    }

    /**
     * Gets the value of the datosInformacionFiscal property.
     *
     * @return
     *     possible object is
     *     {@link DatosInformacionFiscal }
     *
     */
    public DatosInformacionFiscal getDatosInformacionFiscal() {
        return datosInformacionFiscal;
    }

    /**
     * Sets the value of the datosInformacionFiscal property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosInformacionFiscal }
     *
     */
    public void setDatosInformacionFiscal(DatosInformacionFiscal value) {
        this.datosInformacionFiscal = value;
    }

}
