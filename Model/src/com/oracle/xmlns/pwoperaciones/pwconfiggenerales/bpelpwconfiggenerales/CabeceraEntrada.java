
package com.oracle.xmlns.pwoperaciones.pwconfiggenerales.bpelpwconfiggenerales;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cabeceraEntrada complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="cabeceraEntrada"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="aplicativo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="parametro" type="{http://xmlns.oracle.com/PWOperaciones/PWConfigGenerales/BPELPWConfigGenerales}parametro" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cabeceraEntrada", propOrder = { "operacion", "aplicativo", "parametro" })
public class CabeceraEntrada {

    @XmlElement(required = true)
    protected String operacion;
    @XmlElement(required = true)
    protected String aplicativo;
    protected List<Parametro> parametro;

    /**
     * Gets the value of the operacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperacion(String value) {
        this.operacion = value;
    }

    /**
     * Gets the value of the aplicativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAplicativo() {
        return aplicativo;
    }

    /**
     * Sets the value of the aplicativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAplicativo(String value) {
        this.aplicativo = value;
    }

    /**
     * Gets the value of the parametro property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parametro property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametro().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Parametro }
     *
     *
     */
    public List<Parametro> getParametro() {
        if (parametro == null) {
            parametro = new ArrayList<Parametro>();
        }
        return this.parametro;
    }

}
