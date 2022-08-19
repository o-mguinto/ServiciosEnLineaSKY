
package mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListOfInstances_Type complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ListOfInstances_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Instance" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ListOfProducts" type="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos}ListOfProducts_Type" minOccurs="0"/&gt;
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
@XmlType(name = "ListOfInstances_Type", propOrder = { "instance" })
public class ListOfInstancesType {

    @XmlElement(name = "Instance")
    protected List<ListOfInstancesType.Instance> instance;

    /**
     * Gets the value of the instance property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfInstancesType.Instance }
     *
     *
     */
    public List<ListOfInstancesType.Instance> getInstance() {
        if (instance == null) {
            instance = new ArrayList<ListOfInstancesType.Instance>();
        }
        return this.instance;
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
     *         &lt;element name="AssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="SecondAssetNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ListOfProducts" type="{http://www.sky.com.mx/EnterpriseMessages/Soa/GestionarSSComprarDatos}ListOfProducts_Type" minOccurs="0"/&gt;
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
             { "assetNumber", "secondAssetNumber", "listOfProducts" })
    public static class Instance {

        @XmlElement(name = "AssetNumber", required = true)
        protected String assetNumber;
        @XmlElement(name = "SecondAssetNumber", required = true)
        protected String secondAssetNumber;
        @XmlElement(name = "ListOfProducts")
        protected ListOfProductsType listOfProducts;

        /**
         * Gets the value of the assetNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAssetNumber() {
            return assetNumber;
        }

        /**
         * Sets the value of the assetNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAssetNumber(String value) {
            this.assetNumber = value;
        }

        /**
         * Gets the value of the secondAssetNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSecondAssetNumber() {
            return secondAssetNumber;
        }

        /**
         * Sets the value of the secondAssetNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSecondAssetNumber(String value) {
            this.secondAssetNumber = value;
        }

        /**
         * Gets the value of the listOfProducts property.
         *
         * @return
         *     possible object is
         *     {@link ListOfProductsType }
         *
         */
        public ListOfProductsType getListOfProducts() {
            return listOfProducts;
        }

        /**
         * Sets the value of the listOfProducts property.
         *
         * @param value
         *     allowed object is
         *     {@link ListOfProductsType }
         *
         */
        public void setListOfProducts(ListOfProductsType value) {
            this.listOfProducts = value;
        }

    }

}
