
package com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales;

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
 *         &lt;element name="cabeceraSalida" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}cabeceraSalida"/&gt;
 *         &lt;element name="salida" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}salida"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "cabeceraSalida", "salida" })
@XmlRootElement(name = "respuestaProceso")
public class RespuestaProceso {

    @XmlElement(required = true)
    protected CabeceraSalida cabeceraSalida;
    @XmlElement(required = true)
    protected Salida salida;

    /**
     * Gets the value of the cabeceraSalida property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraSalida }
     *
     */
    public CabeceraSalida getCabeceraSalida() {
        return cabeceraSalida;
    }

    /**
     * Sets the value of the cabeceraSalida property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraSalida }
     *
     */
    public void setCabeceraSalida(CabeceraSalida value) {
        this.cabeceraSalida = value;
    }

    /**
     * Gets the value of the salida property.
     *
     * @return
     *     possible object is
     *     {@link Salida }
     *
     */
    public Salida getSalida() {
        return salida;
    }

    /**
     * Sets the value of the salida property.
     *
     * @param value
     *     allowed object is
     *     {@link Salida }
     *
     */
    public void setSalida(Salida value) {
        this.salida = value;
    }

}
