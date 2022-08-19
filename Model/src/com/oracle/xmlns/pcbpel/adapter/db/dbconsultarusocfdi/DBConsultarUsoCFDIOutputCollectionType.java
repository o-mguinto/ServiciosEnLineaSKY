
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarusocfdi;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DBConsultarUsoCFDIOutputCollectionType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DBConsultarUsoCFDIOutputCollectionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DBConsultarUsoCFDIOutput" type="{http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarUsoCFDI}DBConsultarUsoCFDIOutputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBConsultarUsoCFDIOutputCollectionType", propOrder = { "dbConsultarUsoCFDIOutput" })
public class DBConsultarUsoCFDIOutputCollectionType {

    @XmlElement(name = "DBConsultarUsoCFDIOutput")
    protected List<DBConsultarUsoCFDIOutputType> dbConsultarUsoCFDIOutput;

    /**
     * Gets the value of the dbConsultarUsoCFDIOutput property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dbConsultarUsoCFDIOutput property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDBConsultarUsoCFDIOutput().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DBConsultarUsoCFDIOutputType }
     *
     *
     */
    public List<DBConsultarUsoCFDIOutputType> getDBConsultarUsoCFDIOutput() {
        if (dbConsultarUsoCFDIOutput == null) {
            dbConsultarUsoCFDIOutput = new ArrayList<DBConsultarUsoCFDIOutputType>();
        }
        return this.dbConsultarUsoCFDIOutput;
    }

}
