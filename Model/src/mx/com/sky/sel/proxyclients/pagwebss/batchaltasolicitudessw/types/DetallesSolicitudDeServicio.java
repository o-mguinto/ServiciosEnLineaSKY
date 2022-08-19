
package mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetallesSolicitudDeServicio complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DetallesSolicitudDeServicio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatosFiscales" type="{http://xmlns.oracle.com/BatchAltaSolicitudesDeServicioWeb}DatosFiscales"/&gt;
 *         &lt;element name="Direccion" type="{http://xmlns.oracle.com/BatchAltaSolicitudesDeServicioWeb}Direccion"/&gt;
 *         &lt;element name="InfoPPE" type="{http://xmlns.oracle.com/BatchAltaSolicitudesDeServicioWeb}InfoPPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetallesSolicitudDeServicio",
         propOrder =
         { "area", "subArea", "descripcion", "mailConfirmacion", "pais", "tipoCuenta", "nombreSuscriptor",
           "datosFiscales", "direccion", "infoPPE"
    })
public class DetallesSolicitudDeServicio {

    @XmlElement(name = "Area", required = true)
    protected String area;
    @XmlElement(name = "SubArea", required = true)
    protected String subArea;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "MailConfirmacion", required = true)
    protected String mailConfirmacion;
    @XmlElement(name = "Pais", required = true)
    protected String pais;
    @XmlElement(name = "TipoCuenta", required = true)
    protected String tipoCuenta;
    @XmlElement(name = "NombreSuscriptor", required = true)
    protected String nombreSuscriptor;
    @XmlElement(name = "DatosFiscales", required = true)
    protected DatosFiscales datosFiscales;
    @XmlElement(name = "Direccion", required = true)
    protected Direccion direccion;
    @XmlElement(name = "InfoPPE", required = true)
    protected InfoPPE infoPPE;

    /**
     * Gets the value of the area property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getArea() {
        return area;
    }

    /**
     * Sets the value of the area property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setArea(String value) {
        this.area = value;
    }

    /**
     * Gets the value of the subArea property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubArea() {
        return subArea;
    }

    /**
     * Sets the value of the subArea property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubArea(String value) {
        this.subArea = value;
    }

    /**
     * Gets the value of the descripcion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the mailConfirmacion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMailConfirmacion() {
        return mailConfirmacion;
    }

    /**
     * Sets the value of the mailConfirmacion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMailConfirmacion(String value) {
        this.mailConfirmacion = value;
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
     * Gets the value of the tipoCuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Sets the value of the tipoCuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTipoCuenta(String value) {
        this.tipoCuenta = value;
    }

    /**
     * Gets the value of the nombreSuscriptor property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    /**
     * Sets the value of the nombreSuscriptor property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreSuscriptor(String value) {
        this.nombreSuscriptor = value;
    }

    /**
     * Gets the value of the datosFiscales property.
     *
     * @return
     *     possible object is
     *     {@link DatosFiscales }
     *
     */
    public DatosFiscales getDatosFiscales() {
        return datosFiscales;
    }

    /**
     * Sets the value of the datosFiscales property.
     *
     * @param value
     *     allowed object is
     *     {@link DatosFiscales }
     *
     */
    public void setDatosFiscales(DatosFiscales value) {
        this.datosFiscales = value;
    }

    /**
     * Gets the value of the direccion property.
     *
     * @return
     *     possible object is
     *     {@link Direccion }
     *
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     *
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *
     */
    public void setDireccion(Direccion value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the infoPPE property.
     *
     * @return
     *     possible object is
     *     {@link InfoPPE }
     *
     */
    public InfoPPE getInfoPPE() {
        return infoPPE;
    }

    /**
     * Sets the value of the infoPPE property.
     *
     * @param value
     *     allowed object is
     *     {@link InfoPPE }
     *
     */
    public void setInfoPPE(InfoPPE value) {
        this.infoPPE = value;
    }

}
