
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamenu.types;

import java.math.BigDecimal;

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
 *         &lt;element name="ConfigMenu" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PM_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="PM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PM_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PARENT_MENU" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="PUM_VISIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PUM_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="PM_PARENT_MENU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="respuestaCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "respuesta", "configMenu", "respuestaCode" })
@XmlRootElement(name = "ConsultaMenuProcessResponse")
public class ConsultaMenuProcessResponse {

    @XmlElement(required = true)
    protected String respuesta;
    @XmlElement(name = "ConfigMenu", required = true)
    protected List<ConsultaMenuProcessResponse.ConfigMenu> configMenu;
    @XmlElement(required = true)
    protected String respuestaCode;

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
     * Gets the value of the configMenu property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configMenu property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfigMenu().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsultaMenuProcessResponse.ConfigMenu }
     *
     *
     */
    public List<ConsultaMenuProcessResponse.ConfigMenu> getConfigMenu() {
        if (configMenu == null) {
            configMenu = new ArrayList<ConsultaMenuProcessResponse.ConfigMenu>();
        }
        return this.configMenu;
    }

    /**
     * Gets the value of the respuestaCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRespuestaCode() {
        return respuestaCode;
    }

    /**
     * Sets the value of the respuestaCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRespuestaCode(String value) {
        this.respuestaCode = value;
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
     *         &lt;element name="PM_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="PM_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PM_DESCRIPTION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PARENT_MENU" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="PUM_VISIBLE" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PUM_ID" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="PM_PARENT_MENU" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
             propOrder = { "pmid", "pmcode", "pmdescription", "parentmenu", "pumvisible", "pumid", "pmparentmenu" })
    public static class ConfigMenu {

        @XmlElement(name = "PM_ID", required = true, nillable = true)
        protected BigDecimal pmid;
        @XmlElement(name = "PM_CODE", required = true, nillable = true)
        protected String pmcode;
        @XmlElement(name = "PM_DESCRIPTION", required = true, nillable = true)
        protected String pmdescription;
        @XmlElement(name = "PARENT_MENU", required = true, nillable = true)
        protected BigDecimal parentmenu;
        @XmlElement(name = "PUM_VISIBLE", required = true, nillable = true)
        protected String pumvisible;
        @XmlElement(name = "PUM_ID", required = true, nillable = true)
        protected BigDecimal pumid;
        @XmlElement(name = "PM_PARENT_MENU", required = true, nillable = true)
        protected String pmparentmenu;

        /**
         * Gets the value of the pmid property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPMID() {
            return pmid;
        }

        /**
         * Sets the value of the pmid property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPMID(BigDecimal value) {
            this.pmid = value;
        }

        /**
         * Gets the value of the pmcode property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPMCODE() {
            return pmcode;
        }

        /**
         * Sets the value of the pmcode property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPMCODE(String value) {
            this.pmcode = value;
        }

        /**
         * Gets the value of the pmdescription property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPMDESCRIPTION() {
            return pmdescription;
        }

        /**
         * Sets the value of the pmdescription property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPMDESCRIPTION(String value) {
            this.pmdescription = value;
        }

        /**
         * Gets the value of the parentmenu property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPARENTMENU() {
            return parentmenu;
        }

        /**
         * Sets the value of the parentmenu property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPARENTMENU(BigDecimal value) {
            this.parentmenu = value;
        }

        /**
         * Gets the value of the pumvisible property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPUMVISIBLE() {
            return pumvisible;
        }

        /**
         * Sets the value of the pumvisible property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPUMVISIBLE(String value) {
            this.pumvisible = value;
        }

        /**
         * Gets the value of the pumid property.
         *
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *
         */
        public BigDecimal getPUMID() {
            return pumid;
        }

        /**
         * Sets the value of the pumid property.
         *
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *
         */
        public void setPUMID(BigDecimal value) {
            this.pumid = value;
        }

        /**
         * Gets the value of the pmparentmenu property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPMPARENTMENU() {
            return pmparentmenu;
        }

        /**
         * Sets the value of the pmparentmenu property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPMPARENTMENU(String value) {
            this.pmparentmenu = value;
        }

    }

}
