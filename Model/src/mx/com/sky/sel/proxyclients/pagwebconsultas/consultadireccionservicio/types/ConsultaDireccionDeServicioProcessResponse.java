
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultadireccionservicio.types;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="respuestadesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Direccion" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DIRECCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="NO_EXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DELEGACION_MUNICIPIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="TELEFONO_ENVIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "", propOrder = { "respuesta", "respuestadesc", "direccion" })
@XmlRootElement(name = "ConsultaDireccionDeServicioProcessResponse")
public class ConsultaDireccionDeServicioProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(required = true)
    protected String respuestadesc;
    @XmlElement(name = "Direccion", required = true)
    protected List<ConsultaDireccionDeServicioProcessResponse.Direccion> direccion;

    /**
     * Gets the value of the respuesta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuesta(String value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestadesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestadesc() {
        return respuestadesc;
    }

    /**
     * Sets the value of the respuestadesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestadesc(String value) {
        this.respuestadesc = value;
    }

    /**
     * Gets the value of the direccion property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direccion property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDireccion().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaDireccionDeServicioProcessResponse.Direccion }
     *
     *
     */
    public List<ConsultaDireccionDeServicioProcessResponse.Direccion> getDireccion() {
        if (direccion == null) {
            direccion = new ArrayList<ConsultaDireccionDeServicioProcessResponse.Direccion>();
        }
        return this.direccion;
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
     *         &lt;element name="DIRECCION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="NO_EXT" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="COLONIA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DELEGACION_MUNICIPIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ESTADO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CIUDAD" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="TELEFONO_ENVIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             { "direccion", "noext", "colonia", "delegacionmunicipio", "estado", "ciudad", "cp", "telefonoenvio" })
    public static class Direccion {

        @XmlElement(name = "DIRECCION", required = true)
        protected String direccion;
        @XmlElement(name = "NO_EXT", required = true)
        protected String noext;
        @XmlElement(name = "COLONIA", required = true)
        protected String colonia;
        @XmlElement(name = "DELEGACION_MUNICIPIO", required = true)
        protected String delegacionmunicipio;
        @XmlElement(name = "ESTADO", required = true)
        protected String estado;
        @XmlElement(name = "CIUDAD", required = true)
        protected String ciudad;
        @XmlElement(name = "CP", required = true, nillable = true)
        protected String cp;
        @XmlElement(name = "TELEFONO_ENVIO", required = true, nillable = true)
        protected String telefonoenvio;

        /**
         * Gets the value of the direccion property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDIRECCION() {
            return direccion;
        }

        /**
         * Sets the value of the direccion property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDIRECCION(String value) {
            this.direccion = value;
        }

        /**
         * Gets the value of the noext property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNOEXT() {
            return noext;
        }

        /**
         * Sets the value of the noext property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNOEXT(String value) {
            this.noext = value;
        }

        /**
         * Gets the value of the colonia property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCOLONIA() {
            return colonia;
        }

        /**
         * Sets the value of the colonia property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCOLONIA(String value) {
            this.colonia = value;
        }

        /**
         * Gets the value of the delegacionmunicipio property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDELEGACIONMUNICIPIO() {
            return delegacionmunicipio;
        }

        /**
         * Sets the value of the delegacionmunicipio property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDELEGACIONMUNICIPIO(String value) {
            this.delegacionmunicipio = value;
        }

        /**
         * Gets the value of the estado property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getESTADO() {
            return estado;
        }

        /**
         * Sets the value of the estado property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setESTADO(String value) {
            this.estado = value;
        }

        /**
         * Gets the value of the ciudad property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCIUDAD() {
            return ciudad;
        }

        /**
         * Sets the value of the ciudad property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCIUDAD(String value) {
            this.ciudad = value;
        }

        /**
         * Gets the value of the cp property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCP() {
            return cp;
        }

        /**
         * Sets the value of the cp property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCP(String value) {
            this.cp = value;
        }

        /**
         * Gets the value of the telefonoenvio property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTELEFONOENVIO() {
            return telefonoenvio;
        }

        /**
         * Sets the value of the telefonoenvio property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTELEFONOENVIO(String value) {
            this.telefonoenvio = value;
        }

    }

}
