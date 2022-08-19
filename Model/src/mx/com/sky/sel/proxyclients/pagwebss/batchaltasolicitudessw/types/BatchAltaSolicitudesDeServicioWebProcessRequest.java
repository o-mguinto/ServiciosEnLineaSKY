
package mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types;

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
 *         &lt;element name="NombreCorporativo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListaLlaves" type="{http://xmlns.oracle.com/BatchAltaSolicitudesDeServicioWeb}ListaLlaves"/&gt;
 *         &lt;element name="DetallesSolicitudDeServicio" type="{http://xmlns.oracle.com/BatchAltaSolicitudesDeServicioWeb}DetallesSolicitudDeServicio"/&gt;
 *         &lt;element name="SISTEMA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "nombreCorporativo", "listaLlaves", "detallesSolicitudDeServicio", "sistema" })
@XmlRootElement(name = "BatchAltaSolicitudesDeServicioWebProcessRequest")
public class BatchAltaSolicitudesDeServicioWebProcessRequest {

    @XmlElement(name = "NombreCorporativo", required = true)
    protected String nombreCorporativo;
    @XmlElement(name = "ListaLlaves", required = true)
    protected ListaLlaves listaLlaves;
    @XmlElement(name = "DetallesSolicitudDeServicio", required = true)
    protected DetallesSolicitudDeServicio detallesSolicitudDeServicio;
    @XmlElement(name = "SISTEMA", required = true)
    protected String sistema;

    /**
     * Gets the value of the nombreCorporativo property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNombreCorporativo() {
        return nombreCorporativo;
    }

    /**
     * Sets the value of the nombreCorporativo property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNombreCorporativo(String value) {
        this.nombreCorporativo = value;
    }

    /**
     * Gets the value of the listaLlaves property.
     *
     * @return
     *     possible object is
     *     {@link ListaLlaves }
     *
     */
    public ListaLlaves getListaLlaves() {
        return listaLlaves;
    }

    /**
     * Sets the value of the listaLlaves property.
     *
     * @param value
     *     allowed object is
     *     {@link ListaLlaves }
     *
     */
    public void setListaLlaves(ListaLlaves value) {
        this.listaLlaves = value;
    }

    /**
     * Gets the value of the detallesSolicitudDeServicio property.
     *
     * @return
     *     possible object is
     *     {@link DetallesSolicitudDeServicio }
     *
     */
    public DetallesSolicitudDeServicio getDetallesSolicitudDeServicio() {
        return detallesSolicitudDeServicio;
    }

    /**
     * Sets the value of the detallesSolicitudDeServicio property.
     *
     * @param value
     *     allowed object is
     *     {@link DetallesSolicitudDeServicio }
     *
     */
    public void setDetallesSolicitudDeServicio(DetallesSolicitudDeServicio value) {
        this.detallesSolicitudDeServicio = value;
    }

    /**
     * Gets the value of the sistema property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSISTEMA() {
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
    public void setSISTEMA(String value) {
        this.sistema = value;
    }

}
