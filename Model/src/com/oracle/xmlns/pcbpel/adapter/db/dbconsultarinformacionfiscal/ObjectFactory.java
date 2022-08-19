
package com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal package.
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

    private final static QName _DBConsultarInformacionFiscalInput_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal",
                  "DBConsultarInformacionFiscalInput");
    private final static QName _DBConsultarInformacionFiscalOutputCollection_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal",
                  "DBConsultarInformacionFiscalOutputCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DBConsultarInformacionFiscalInputType }
     *
     */
    public DBConsultarInformacionFiscalInputType createDBConsultarInformacionFiscalInputType() {
        return new DBConsultarInformacionFiscalInputType();
    }

    /**
     * Create an instance of {@link DBConsultarInformacionFiscalOutputCollectionType }
     *
     */
    public DBConsultarInformacionFiscalOutputCollectionType createDBConsultarInformacionFiscalOutputCollectionType() {
        return new DBConsultarInformacionFiscalOutputCollectionType();
    }

    /**
     * Create an instance of {@link DBConsultarInformacionFiscalOutputType }
     *
     */
    public DBConsultarInformacionFiscalOutputType createDBConsultarInformacionFiscalOutputType() {
        return new DBConsultarInformacionFiscalOutputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBConsultarInformacionFiscalInputType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal",
                    name = "DBConsultarInformacionFiscalInput")
    public JAXBElement<DBConsultarInformacionFiscalInputType> createDBConsultarInformacionFiscalInput(DBConsultarInformacionFiscalInputType value) {
        return new JAXBElement<DBConsultarInformacionFiscalInputType>(_DBConsultarInformacionFiscalInput_QNAME,
                                                                      DBConsultarInformacionFiscalInputType.class, null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DBConsultarInformacionFiscalOutputCollectionType }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DBConsultarInformacionFiscal",
                    name = "DBConsultarInformacionFiscalOutputCollection")
    public JAXBElement<DBConsultarInformacionFiscalOutputCollectionType> createDBConsultarInformacionFiscalOutputCollection(DBConsultarInformacionFiscalOutputCollectionType value) {
        return new JAXBElement<DBConsultarInformacionFiscalOutputCollectionType>(_DBConsultarInformacionFiscalOutputCollection_QNAME,
                                                                                 DBConsultarInformacionFiscalOutputCollectionType.class,
                                                                                 null, value);
    }

}
