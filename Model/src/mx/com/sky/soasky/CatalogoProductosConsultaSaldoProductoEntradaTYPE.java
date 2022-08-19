
package mx.com.sky.soasky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CatalogoProductos_consultaSaldoProducto_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CatalogoProductos_consultaSaldoProducto_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/soasky}Cabecera_Entrada_TYPE"/&gt;
 *         &lt;element name="NUMERO_CUENTA" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PAIS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LISTA_PRODUCTOS" type="{http://www.sky.com.mx/soasky}Lista_Productos_consultaSaldoProducto_Entrada_TYPE"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CatalogoProductos_consultaSaldoProducto_Entrada_TYPE",
         propOrder = { "cabecera", "numerocuenta", "pais", "listaproductos"
    })
public class CatalogoProductosConsultaSaldoProductoEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "NUMERO_CUENTA", required = true)
    protected String numerocuenta;
    @XmlElement(name = "PAIS", required = true)
    protected String pais;
    @XmlElement(name = "LISTA_PRODUCTOS", required = true)
    protected ListaProductosConsultaSaldoProductoEntradaTYPE listaproductos;

    /**
     * Gets the value of the cabecera property.
     *
     * @return
     *     possible object is
     *     {@link CabeceraEntradaTYPE }
     *
     */
    public CabeceraEntradaTYPE getCABECERA() {
        return cabecera;
    }

    /**
     * Sets the value of the cabecera property.
     *
     * @param value
     *     allowed object is
     *     {@link CabeceraEntradaTYPE }
     *
     */
    public void setCABECERA(CabeceraEntradaTYPE value) {
        this.cabecera = value;
    }

    /**
     * Gets the value of the numerocuenta property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNUMEROCUENTA() {
        return numerocuenta;
    }

    /**
     * Sets the value of the numerocuenta property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNUMEROCUENTA(String value) {
        this.numerocuenta = value;
    }

    /**
     * Gets the value of the pais property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPAIS() {
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
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the listaproductos property.
     *
     * @return
     *     possible object is
     *     {@link ListaProductosConsultaSaldoProductoEntradaTYPE }
     *
     */
    public ListaProductosConsultaSaldoProductoEntradaTYPE getLISTAPRODUCTOS() {
        return listaproductos;
    }

    /**
     * Sets the value of the listaproductos property.
     *
     * @param value
     *     allowed object is
     *     {@link ListaProductosConsultaSaldoProductoEntradaTYPE }
     *
     */
    public void setLISTAPRODUCTOS(ListaProductosConsultaSaldoProductoEntradaTYPE value) {
        this.listaproductos = value;
    }

}
