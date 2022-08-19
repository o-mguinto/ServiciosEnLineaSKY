
package mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.types;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoEncuestaSatisfaccion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResultadoEncuestaSatisfaccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CuentaSKY" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Paquete" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NoPregunta" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Pregunta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Respuesta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comentario" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultadoEncuestaSatisfaccion",
         propOrder =
         { "folio", "userID", "cuentaSKY", "pais", "paquete", "noPregunta", "pregunta", "respuesta", "comentario"
    })
public class ResultadoEncuestaSatisfaccion {

    @XmlElement(name = "Folio", required = true)
    protected String folio;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "CuentaSKY", required = true)
    protected String cuentaSKY;
    @XmlElement(name = "Pais", required = true)
    protected String pais;
    @XmlElement(name = "Paquete", required = true)
    protected String paquete;
    @XmlElement(name = "NoPregunta", required = true)
    protected BigInteger noPregunta;
    @XmlElement(name = "Pregunta", required = true)
    protected String pregunta;
    @XmlElement(name = "Respuesta", required = true)
    protected String respuesta;
    @XmlElement(name = "Comentario", required = true)
    protected String comentario;

    /**
     * Gets the value of the folio property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFolio(String value) {
        this.folio = value;
    }

    /**
     * Gets the value of the userID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the cuentaSKY property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * Sets the value of the cuentaSKY property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuentaSKY(String value) {
        this.cuentaSKY = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the paquete property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaquete() {
        return paquete;
    }

    /**
     * Sets the value of the paquete property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaquete(String value) {
        this.paquete = value;
    }

    /**
     * Gets the value of the noPregunta property.
     *
     * @return
     *     possible object is
     *     {@link BigInteger }
     *
     */
    public BigInteger getNoPregunta() {
        return noPregunta;
    }

    /**
     * Sets the value of the noPregunta property.
     *
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *
     */
    public void setNoPregunta(BigInteger value) {
        this.noPregunta = value;
    }

    /**
     * Gets the value of the pregunta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * Sets the value of the pregunta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPregunta(String value) {
        this.pregunta = value;
    }

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
     * Gets the value of the comentario property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Sets the value of the comentario property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

}
