
package mx.com.sky.siebelosb.consultacuenta;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultaCuenta_Entrada_TYPE complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultaCuenta_Entrada_TYPE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CABECERA" type="{http://www.sky.com.mx/SiebelOSB/ConsultaCuenta}Cabecera_Entrada_TYPE"/&gt;
 *         &lt;element name="ListOfAccount"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Message" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "ConsultaCuenta_Entrada_TYPE", propOrder = { "cabecera", "listOfAccount" })
public class ConsultaCuentaEntradaTYPE {

    @XmlElement(name = "CABECERA", required = true)
    protected CabeceraEntradaTYPE cabecera;
    @XmlElement(name = "ListOfAccount", required = true)
    protected ConsultaCuentaEntradaTYPE.ListOfAccount listOfAccount;

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
     * Gets the value of the listOfAccount property.
     *
     * @return
     *     possible object is
     *     {@link ConsultaCuentaEntradaTYPE.ListOfAccount }
     *
     */
    public ConsultaCuentaEntradaTYPE.ListOfAccount getListOfAccount() {
        return listOfAccount;
    }

    /**
     * Sets the value of the listOfAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link ConsultaCuentaEntradaTYPE.ListOfAccount }
     *
     */
    public void setListOfAccount(ConsultaCuentaEntradaTYPE.ListOfAccount value) {
        this.listOfAccount = value;
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
     *         &lt;element name="Message" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
    @XmlType(name = "", propOrder = { "message" })
    public static class ListOfAccount {

        @XmlElement(name = "Message", required = true)
        protected List<ConsultaCuentaEntradaTYPE.ListOfAccount.Message> message;

        /**
         * Gets the value of the message property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the message property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMessage().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ConsultaCuentaEntradaTYPE.ListOfAccount.Message }
         *
         *
         */
        public List<ConsultaCuentaEntradaTYPE.ListOfAccount.Message> getMessage() {
            if (message == null) {
                message = new ArrayList<ConsultaCuentaEntradaTYPE.ListOfAccount.Message>();
            }
            return this.message;
        }

        public void setMessage(List<ConsultaCuentaEntradaTYPE.ListOfAccount.Message> message) {
            this.message = message;
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
         *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = { "accountNumber" })
        public static class Message {

            @XmlElement(name = "AccountNumber", required = true)
            protected BigInteger accountNumber;

            /**
             * Gets the value of the accountNumber property.
             *
             * @return
             *     possible object is
             *     {@link BigInteger }
             *
             */
            public BigInteger getAccountNumber() {
                return accountNumber;
            }

            /**
             * Sets the value of the accountNumber property.
             *
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *
             */
            public void setAccountNumber(BigInteger value) {
                this.accountNumber = value;
            }

        }

    }

}
