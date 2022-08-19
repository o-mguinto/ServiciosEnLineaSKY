
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarctacelskysiebelinterface;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DBConsultarCtaCelSkySiebelInterfaceOutput" type="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface}DBConsultarCtaCelSkySiebelInterfaceOutputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType",
         propOrder = { "dbConsultarCtaCelSkySiebelInterfaceOutput" })
public class DBConsultarCtaCelSkySiebelInterfaceOutputCollectionType {

    @XmlElement(name = "DBConsultarCtaCelSkySiebelInterfaceOutput", namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarCtaCelSkySiebelInterface")
    protected List<DBConsultarCtaCelSkySiebelInterfaceOutputType> dbConsultarCtaCelSkySiebelInterfaceOutput;

    /**
     * Gets the value of the dbConsultarCtaCelSkySiebelInterfaceOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbConsultarCtaCelSkySiebelInterfaceOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDBConsultarCtaCelSkySiebelInterfaceOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBConsultarCtaCelSkySiebelInterfaceOutputType }
     *
     *
     */
    public List<DBConsultarCtaCelSkySiebelInterfaceOutputType> getDBConsultarCtaCelSkySiebelInterfaceOutput() {
        if (dbConsultarCtaCelSkySiebelInterfaceOutput == null) {
            dbConsultarCtaCelSkySiebelInterfaceOutput =
                new ArrayList<DBConsultarCtaCelSkySiebelInterfaceOutputType>();
        }
        return this.dbConsultarCtaCelSkySiebelInterfaceOutput;
    }

}
