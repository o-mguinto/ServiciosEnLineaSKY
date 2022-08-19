
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultainfofiscalvigente.types;

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
 *         &lt;element name="resultado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resultadodesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InformacionFiscalVigente"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="MetodoEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TipoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CalleFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NumeroExtFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NumeroIntFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ColoniaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CiudadFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DelMunFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="EstadoFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CPFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ApellidoContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NombreContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="eMailContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "resultado", "resultadodesc", "informacionFiscalVigente" })
@XmlRootElement(name = "ConsultaInformacionFiscalVigenteProcessResponse")
public class ConsultaInformacionFiscalVigenteProcessResponse {

    @XmlElement(required = true)
    protected String resultado;
    @XmlElement(required = true)
    protected String resultadodesc;
    @XmlElement(name = "InformacionFiscalVigente", required = true)
    protected ConsultaInformacionFiscalVigenteProcessResponse.InformacionFiscalVigente informacionFiscalVigente;

    /**
     * Gets the value of the resultado property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultado() {
        return resultado;
    }

    /**
     * Sets the value of the resultado property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultado(String value) {
        this.resultado = value;
    }

    /**
     * Gets the value of the resultadodesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getResultadodesc() {
        return resultadodesc;
    }

    /**
     * Sets the value of the resultadodesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setResultadodesc(String value) {
        this.resultadodesc = value;
    }

    /**
     * Gets the value of the informacionFiscalVigente property.
     *
     * @return
     *     possible object is
     *     {@link ConsultaInformacionFiscalVigenteProcessResponse.InformacionFiscalVigente }
     *
     */
    public ConsultaInformacionFiscalVigenteProcessResponse.InformacionFiscalVigente getInformacionFiscalVigente() {
        return informacionFiscalVigente;
    }

    /**
     * Sets the value of the informacionFiscalVigente property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultaInformacionFiscalVigenteProcessResponse.InformacionFiscalVigente }
     *
     */
    public void setInformacionFiscalVigente(ConsultaInformacionFiscalVigenteProcessResponse.InformacionFiscalVigente value) {
        this.informacionFiscalVigente = value;
    }


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
     *         &lt;element name="RazonSocial" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RFC" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="MetodoEnvio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TipoFactura" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CalleFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NumeroExtFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NumeroIntFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ColoniaFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CiudadFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DelMunFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="EstadoFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CPFiscal" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ApellidoContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NombreContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="eMailContacto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "",
             propOrder =
             { "razonSocial", "rfc", "metodoEnvio", "tipoFactura", "calleFiscal", "numeroExtFiscal", "numeroIntFiscal",
               "coloniaFiscal", "ciudadFiscal", "delMunFiscal", "estadoFiscal", "cpFiscal", "apellidoContacto",
               "nombreContacto", "eMailContacto"
        })
    public static class InformacionFiscalVigente {

        @XmlElement(name = "RazonSocial", required = true)
        protected String razonSocial;
        @XmlElement(name = "RFC", required = true)
        protected String rfc;
        @XmlElement(name = "MetodoEnvio", required = true)
        protected String metodoEnvio;
        @XmlElement(name = "TipoFactura", required = true)
        protected String tipoFactura;
        @XmlElement(name = "CalleFiscal", required = true)
        protected String calleFiscal;
        @XmlElement(name = "NumeroExtFiscal", required = true)
        protected String numeroExtFiscal;
        @XmlElement(name = "NumeroIntFiscal", required = true)
        protected String numeroIntFiscal;
        @XmlElement(name = "ColoniaFiscal", required = true)
        protected String coloniaFiscal;
        @XmlElement(name = "CiudadFiscal", required = true)
        protected String ciudadFiscal;
        @XmlElement(name = "DelMunFiscal", required = true)
        protected String delMunFiscal;
        @XmlElement(name = "EstadoFiscal", required = true)
        protected String estadoFiscal;
        @XmlElement(name = "CPFiscal", required = true)
        protected String cpFiscal;
        @XmlElement(name = "ApellidoContacto", required = true)
        protected String apellidoContacto;
        @XmlElement(name = "NombreContacto", required = true)
        protected String nombreContacto;
        @XmlElement(required = true)
        protected String eMailContacto;

        /**
         * Gets the value of the razonSocial property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRazonSocial() {
            return razonSocial;
        }

        /**
         * Sets the value of the razonSocial property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRazonSocial(String value) {
            this.razonSocial = value;
        }

        /**
         * Gets the value of the rfc property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRFC() {
            return rfc;
        }

        /**
         * Sets the value of the rfc property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRFC(String value) {
            this.rfc = value;
        }

        /**
         * Gets the value of the metodoEnvio property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMetodoEnvio() {
            return metodoEnvio;
        }

        /**
         * Sets the value of the metodoEnvio property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMetodoEnvio(String value) {
            this.metodoEnvio = value;
        }

        /**
         * Gets the value of the tipoFactura property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTipoFactura() {
            return tipoFactura;
        }

        /**
         * Sets the value of the tipoFactura property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTipoFactura(String value) {
            this.tipoFactura = value;
        }

        /**
         * Gets the value of the calleFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCalleFiscal() {
            return calleFiscal;
        }

        /**
         * Sets the value of the calleFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCalleFiscal(String value) {
            this.calleFiscal = value;
        }

        /**
         * Gets the value of the numeroExtFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroExtFiscal() {
            return numeroExtFiscal;
        }

        /**
         * Sets the value of the numeroExtFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroExtFiscal(String value) {
            this.numeroExtFiscal = value;
        }

        /**
         * Gets the value of the numeroIntFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNumeroIntFiscal() {
            return numeroIntFiscal;
        }

        /**
         * Sets the value of the numeroIntFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNumeroIntFiscal(String value) {
            this.numeroIntFiscal = value;
        }

        /**
         * Gets the value of the coloniaFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getColoniaFiscal() {
            return coloniaFiscal;
        }

        /**
         * Sets the value of the coloniaFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setColoniaFiscal(String value) {
            this.coloniaFiscal = value;
        }

        /**
         * Gets the value of the ciudadFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCiudadFiscal() {
            return ciudadFiscal;
        }

        /**
         * Sets the value of the ciudadFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCiudadFiscal(String value) {
            this.ciudadFiscal = value;
        }

        /**
         * Gets the value of the delMunFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDelMunFiscal() {
            return delMunFiscal;
        }

        /**
         * Sets the value of the delMunFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDelMunFiscal(String value) {
            this.delMunFiscal = value;
        }

        /**
         * Gets the value of the estadoFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getEstadoFiscal() {
            return estadoFiscal;
        }

        /**
         * Sets the value of the estadoFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setEstadoFiscal(String value) {
            this.estadoFiscal = value;
        }

        /**
         * Gets the value of the cpFiscal property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCPFiscal() {
            return cpFiscal;
        }

        /**
         * Sets the value of the cpFiscal property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCPFiscal(String value) {
            this.cpFiscal = value;
        }

        /**
         * Gets the value of the apellidoContacto property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getApellidoContacto() {
            return apellidoContacto;
        }

        /**
         * Sets the value of the apellidoContacto property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setApellidoContacto(String value) {
            this.apellidoContacto = value;
        }

        /**
         * Gets the value of the nombreContacto property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNombreContacto() {
            return nombreContacto;
        }

        /**
         * Sets the value of the nombreContacto property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNombreContacto(String value) {
            this.nombreContacto = value;
        }

        /**
         * Gets the value of the eMailContacto property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getEMailContacto() {
            return eMailContacto;
        }

        /**
         * Sets the value of the eMailContacto property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setEMailContacto(String value) {
            this.eMailContacto = value;
        }

    }

}
