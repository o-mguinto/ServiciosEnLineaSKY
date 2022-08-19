
package mx.com.sky.sel.proxyclients.pagwebss.altasolicitudsw.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Solicitud complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Solicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Area" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TarjetaInteligente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ContactoRowId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MailConfirmacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pais" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TipoCuenta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NombreSuscriptor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DatosFiscales" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}DatosFiscales"/&gt;
 *         &lt;element name="Direccion" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}Direccion"/&gt;
 *         &lt;element name="ContratacionServicios" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}ContratacionServicios"/&gt;
 *         &lt;element name="CompraControlRemoto" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}CompraControlRemoto"/&gt;
 *         &lt;element name="ActivaRemoteBooking" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}RemoteBooking"/&gt;
 *         &lt;element name="InfoPPE" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}InfoPPE"/&gt;
 *         &lt;element name="Pagos" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}Pago"/&gt;
 *         &lt;element name="CambioFormaPago" type="{http://xmlns.oracle.com/AltaSolicitudDeServicioWeb}CambioFormaPago"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idSesion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Solicitud",
         propOrder =
         { "cuenta", "area", "subArea", "descripcion", "tarjetaInteligente", "contactoRowId", "mailConfirmacion",
           "pais", "tipoCuenta", "nombreSuscriptor", "datosFiscales", "direccion", "contratacionServicios",
           "compraControlRemoto", "activaRemoteBooking", "infoPPE", "pagos", "cambioFormaPago", "sistema", "idSesion"
    })
public class Solicitud {

    @XmlElement(name = "Cuenta", required = true)
    protected String cuenta;
    @XmlElement(name = "Area", required = true)
    protected String area;
    @XmlElement(name = "SubArea", required = true)
    protected String subArea;
    @XmlElement(name = "Descripcion", required = true)
    protected String descripcion;
    @XmlElement(name = "TarjetaInteligente", required = true)
    protected String tarjetaInteligente;
    @XmlElement(name = "ContactoRowId", required = true)
    protected String contactoRowId;
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
    @XmlElement(name = "ContratacionServicios", required = true)
    protected ContratacionServicios contratacionServicios;
    @XmlElement(name = "CompraControlRemoto", required = true)
    protected CompraControlRemoto compraControlRemoto;
    @XmlElement(name = "ActivaRemoteBooking", required = true)
    protected RemoteBooking activaRemoteBooking;
    @XmlElement(name = "InfoPPE", required = true)
    protected InfoPPE infoPPE;
    @XmlElement(name = "Pagos", required = true)
    protected Pago pagos;
    @XmlElement(name = "CambioFormaPago", required = true)
    protected CambioFormaPago cambioFormaPago;
    @XmlElement(name = "Sistema", required = true)
    protected String sistema;
    @XmlElement(required = true)
    protected String idSesion;

    /**
     * Gets the value of the cuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Sets the value of the cuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCuenta(String value) {
        this.cuenta = value;
    }

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
     * Gets the value of the tarjetaInteligente property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }

    /**
     * Sets the value of the tarjetaInteligente property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTarjetaInteligente(String value) {
        this.tarjetaInteligente = value;
    }

    /**
     * Gets the value of the contactoRowId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getContactoRowId() {
        return contactoRowId;
    }

    /**
     * Sets the value of the contactoRowId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setContactoRowId(String value) {
        this.contactoRowId = value;
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
     * Gets the value of the contratacionServicios property.
     *
     * @return
     *     possible object is
     *     {@link ContratacionServicios }
     *
     */
    public ContratacionServicios getContratacionServicios() {
        return contratacionServicios;
    }

    /**
     * Sets the value of the contratacionServicios property.
     *
     * @param value
     *     allowed object is
     *     {@link ContratacionServicios }
     *
     */
    public void setContratacionServicios(ContratacionServicios value) {
        this.contratacionServicios = value;
    }

    /**
     * Gets the value of the compraControlRemoto property.
     *
     * @return
     *     possible object is
     *     {@link CompraControlRemoto }
     *
     */
    public CompraControlRemoto getCompraControlRemoto() {
        return compraControlRemoto;
    }

    /**
     * Sets the value of the compraControlRemoto property.
     *
     * @param value
     *     allowed object is
     *     {@link CompraControlRemoto }
     *
     */
    public void setCompraControlRemoto(CompraControlRemoto value) {
        this.compraControlRemoto = value;
    }

    /**
     * Gets the value of the activaRemoteBooking property.
     *
     * @return
     *     possible object is
     *     {@link RemoteBooking }
     *
     */
    public RemoteBooking getActivaRemoteBooking() {
        return activaRemoteBooking;
    }

    /**
     * Sets the value of the activaRemoteBooking property.
     *
     * @param value
     *     allowed object is
     *     {@link RemoteBooking }
     *
     */
    public void setActivaRemoteBooking(RemoteBooking value) {
        this.activaRemoteBooking = value;
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

    /**
     * Gets the value of the pagos property.
     *
     * @return
     *     possible object is
     *     {@link Pago }
     *
     */
    public Pago getPagos() {
        return pagos;
    }

    /**
     * Sets the value of the pagos property.
     *
     * @param value
     *     allowed object is
     *     {@link Pago }
     *
     */
    public void setPagos(Pago value) {
        this.pagos = value;
    }

    /**
     * Gets the value of the cambioFormaPago property.
     *
     * @return
     *     possible object is
     *     {@link CambioFormaPago }
     *
     */
    public CambioFormaPago getCambioFormaPago() {
        return cambioFormaPago;
    }

    /**
     * Sets the value of the cambioFormaPago property.
     *
     * @param value
     *     allowed object is
     *     {@link CambioFormaPago }
     *
     */
    public void setCambioFormaPago(CambioFormaPago value) {
        this.cambioFormaPago = value;
    }

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSistema(String value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the idSesion property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIdSesion() {
        return idSesion;
    }

    /**
     * Sets the value of the idSesion property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIdSesion(String value) {
        this.idSesion = value;
    }

}
