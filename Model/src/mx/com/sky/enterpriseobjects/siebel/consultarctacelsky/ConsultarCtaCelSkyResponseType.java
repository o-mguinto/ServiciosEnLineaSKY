
package mx.com.sky.enterpriseobjects.siebel.consultarctacelsky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface.DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderResponseType;


/**
 * <p>Java class for ConsultarCtaCelSkyResponseType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCtaCelSkyResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderResponse"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface}DBConsultarCtaCelSkySiebelInterfaceOutputCollection"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCtaCelSkyResponseType",
         propOrder =
         { "ebmHeaderResponse",
           "dbConsultarCtaCelSkySiebelInterfaceOutputCollection"
    })
public class ConsultarCtaCelSkyResponseType {

    @XmlElement(name = "EBMHeaderResponse",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderResponseType ebmHeaderResponse;
    @XmlElement(name = "DBConsultarCtaCelSkySiebelInterfaceOutputCollection",
                namespace =
                "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface",
                required = true)
    protected DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType dbConsultarCtaCelSkySiebelInterfaceOutputCollection;

    /**
     * Gets the value of the ebmHeaderResponse property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public EBMHeaderResponseType getEBMHeaderResponse() {
        return ebmHeaderResponse;
    }

    /**
     * Sets the value of the ebmHeaderResponse property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderResponseType }
     *
     */
    public void setEBMHeaderResponse(EBMHeaderResponseType value) {
        this.ebmHeaderResponse = value;
    }

    /**
     * Gets the value of the dbConsultarCtaCelSkySiebelInterfaceOutputCollection property.
     *
     * @return
     *     possible object is
     *     {@link DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType }
     *
     */
    public DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType getDBConsultarCtaCelSkySiebelInterfaceOutputCollection() {
        return dbConsultarCtaCelSkySiebelInterfaceOutputCollection;
    }

    /**
     * Sets the value of the dbConsultarCtaCelSkySiebelInterfaceOutputCollection property.
     *
     * @param value
     *     allowed object is
     *     {@link DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType }
     *
     */
    public void setDBConsultarCtaCelSkySiebelInterfaceOutputCollection(DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType value) {
        this.dbConsultarCtaCelSkySiebelInterfaceOutputCollection = value;
    }

}
