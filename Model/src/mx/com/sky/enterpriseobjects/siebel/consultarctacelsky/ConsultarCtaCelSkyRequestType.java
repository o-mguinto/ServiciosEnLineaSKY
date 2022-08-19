
package mx.com.sky.enterpriseobjects.siebel.consultarctacelsky;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface.DBConsultarCtaCelSkySiebelInterfaceInputType;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;


/**
 * <p>Java class for ConsultarCtaCelSkyRequestType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ConsultarCtaCelSkyRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1}EBMHeaderRequest"/&gt;
 *         &lt;element ref="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface}DBConsultarCtaCelSkySiebelInterfaceInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarCtaCelSkyRequestType",
         propOrder =
         { "ebmHeaderRequest", "dbConsultarCtaCelSkySiebelInterfaceInput"
    })
public class ConsultarCtaCelSkyRequestType {

    @XmlElement(name = "EBMHeaderRequest",
                namespace =
                "http://www.sky.com.mx/EnterpriseObjects/Sel/Common/V1",
                required = true)
    protected EBMHeaderRequestType ebmHeaderRequest;
    @XmlElement(name = "DBConsultarCtaCelSkySiebelInterfaceInput",
                namespace =
                "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface",
                required = true)
    protected DBConsultarCtaCelSkySiebelInterfaceInputType dbConsultarCtaCelSkySiebelInterfaceInput;

    /**
     * Gets the value of the ebmHeaderRequest property.
     *
     * @return
     *     possible object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public EBMHeaderRequestType getEBMHeaderRequest() {
        return ebmHeaderRequest;
    }

    /**
     * Sets the value of the ebmHeaderRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link EBMHeaderRequestType }
     *
     */
    public void setEBMHeaderRequest(EBMHeaderRequestType value) {
        this.ebmHeaderRequest = value;
    }

    /**
     * Gets the value of the dbConsultarCtaCelSkySiebelInterfaceInput property.
     *
     * @return
     *     possible object is
     *     {@link DBConsultarCtaCelSkySiebelInterfaceInputType }
     *
     */
    public DBConsultarCtaCelSkySiebelInterfaceInputType getDBConsultarCtaCelSkySiebelInterfaceInput() {
        return dbConsultarCtaCelSkySiebelInterfaceInput;
    }

    /**
     * Sets the value of the dbConsultarCtaCelSkySiebelInterfaceInput property.
     *
     * @param value
     *     allowed object is
     *     {@link DBConsultarCtaCelSkySiebelInterfaceInputType }
     *
     */
    public void setDBConsultarCtaCelSkySiebelInterfaceInput(DBConsultarCtaCelSkySiebelInterfaceInputType value) {
        this.dbConsultarCtaCelSkySiebelInterfaceInput = value;
    }

}
