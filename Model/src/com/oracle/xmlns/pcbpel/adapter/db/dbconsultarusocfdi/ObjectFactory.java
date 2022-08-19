
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarusocfdi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.dbconsultarusocfdi package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DBConsultarUsoCFDIInput_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarUsoCFDI", "DBConsultarUsoCFDIInput");
    private final static QName _DBConsultarUsoCFDIOutputCollection_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarUsoCFDI", "DBConsultarUsoCFDIOutputCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.dbconsultarusocfdi
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DBConsultarUsoCFDIInputType }
     *
     */
    public DBConsultarUsoCFDIInputType createDBConsultarUsoCFDIInputType() {
        return new DBConsultarUsoCFDIInputType();
    }

    /**
     * Create an instance of {@link DBConsultarUsoCFDIOutputCollectionType }
     *
     */
    public DBConsultarUsoCFDIOutputCollectionType createDBConsultarUsoCFDIOutputCollectionType() {
        return new DBConsultarUsoCFDIOutputCollectionType();
    }

    /**
     * Create an instance of {@link DBConsultarUsoCFDIOutputType }
     *
     */
    public DBConsultarUsoCFDIOutputType createDBConsultarUsoCFDIOutputType() {
        return new DBConsultarUsoCFDIOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBConsultarUsoCFDIInputType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarUsoCFDI",
                    name = "DBConsultarUsoCFDIInput")
    public JAXBElement<DBConsultarUsoCFDIInputType> createDBConsultarUsoCFDIInput(DBConsultarUsoCFDIInputType value) {
        return new JAXBElement<DBConsultarUsoCFDIInputType>(_DBConsultarUsoCFDIInput_QNAME,
                                                            DBConsultarUsoCFDIInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBConsultarUsoCFDIOutputCollectionType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarUsoCFDI",
                    name = "DBConsultarUsoCFDIOutputCollection")
    public JAXBElement<DBConsultarUsoCFDIOutputCollectionType> createDBConsultarUsoCFDIOutputCollection(DBConsultarUsoCFDIOutputCollectionType value) {
        return new JAXBElement<DBConsultarUsoCFDIOutputCollectionType>(_DBConsultarUsoCFDIOutputCollection_QNAME,
                                                                       DBConsultarUsoCFDIOutputCollectionType.class,
                                                                       null, value);
    }

}
