
package mx.com.sky.siebelosb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gestionacomponente_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Gestionacomponente_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContratoSiebel" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ListaInstancia" type="{http://www.sky.com.mx/SiebelOSB}ListaInstancia_Type" minOccurs="0"/&gt;
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
@XmlType(name = "Gestionacomponente_Entrada_TYPE", propOrder = { "contratoSiebel" })
public class GestionacomponenteEntradaTYPE {

    @XmlElement(name = "ContratoSiebel", required = true)
    protected List<GestionacomponenteEntradaTYPE.ContratoSiebel> contratoSiebel;

    /**
     * Gets the value of the contratoSiebel property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contratoSiebel property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContratoSiebel().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GestionacomponenteEntradaTYPE.ContratoSiebel }
     *
     *
     */
    public List<GestionacomponenteEntradaTYPE.ContratoSiebel> getContratoSiebel() {
        if (contratoSiebel == null) {
            contratoSiebel = new ArrayList<GestionacomponenteEntradaTYPE.ContratoSiebel>();
        }
        return this.contratoSiebel;
    }

    /**
     * @param contratoSiebel
     */
    public void setContratoSiebel(List<GestionacomponenteEntradaTYPE.ContratoSiebel> contratoSiebel) {
        this.contratoSiebel = contratoSiebel;
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
     *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Origen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ListaInstancia" type="{http://www.sky.com.mx/SiebelOSB}ListaInstancia_Type" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = { "operacion", "accountNumber", "origen", "listaInstancia" })
    public static class ContratoSiebel {

        @XmlElement(name = "Operacion", required = true)
        protected String operacion;
        @XmlElement(name = "AccountNumber", required = true)
        protected String accountNumber;
        @XmlElement(name = "Origen", required = true)
        protected String origen;
        @XmlElement(name = "ListaInstancia")
        protected ListaInstanciaType listaInstancia;

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
         * Gets the value of the accountNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAccountNumber(String value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the origen property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getOrigen() {
            return origen;
        }

        /**
         * Sets the value of the origen property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setOrigen(String value) {
            this.origen = value;
        }

        /**
         * Gets the value of the listaInstancia property.
         *
         * @return
         *     possible object is
         *     {@link ListaInstanciaType }
         *
         */
        public ListaInstanciaType getListaInstancia() {
            return listaInstancia;
        }

        /**
         * Sets the value of the listaInstancia property.
         *
         * @param value
         *     allowed object is
         *     {@link ListaInstanciaType }
         *
         */
        public void setListaInstancia(ListaInstanciaType value) {
            this.listaInstancia = value;
        }

    }

}
