
package com.oracle.xmlns.pcbpel.adapter.db.dbvalidarpreregistrosel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.pcbpel.adapter.db.dbvalidarpreregistrosel package.
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

    private final static QName _DbValidarPreRegistroSelInput_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DbValidarPreRegistroSel", "DbValidarPreRegistroSelInput");
    private final static QName _DbValidarPreRegistroSelOutputCollection_QNAME =
        new QName("http://xmlns.oracle.com/pcbpel/adapter/db/DbValidarPreRegistroSel",
                  "DbValidarPreRegistroSelOutputCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.pcbpel.adapter.db.dbvalidarpreregistrosel
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DbValidarPreRegistroSelInput }
     *
     */
    public DbValidarPreRegistroSelInput createDbValidarPreRegistroSelInput() {
        return new DbValidarPreRegistroSelInput();
    }

    /**
     * Create an instance of {@link DbValidarPreRegistroSelOutputCollection }
     *
     */
    public DbValidarPreRegistroSelOutputCollection createDbValidarPreRegistroSelOutputCollection() {
        return new DbValidarPreRegistroSelOutputCollection();
    }

    /**
     * Create an instance of {@link DbValidarPreRegistroSelOutput }
     *
     */
    public DbValidarPreRegistroSelOutput createDbValidarPreRegistroSelOutput() {
        return new DbValidarPreRegistroSelOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbValidarPreRegistroSelInput }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DbValidarPreRegistroSel",
                    name = "DbValidarPreRegistroSelInput")
    public JAXBElement<DbValidarPreRegistroSelInput> createDbValidarPreRegistroSelInput(DbValidarPreRegistroSelInput value) {
        return new JAXBElement<DbValidarPreRegistroSelInput>(_DbValidarPreRegistroSelInput_QNAME,
                                                             DbValidarPreRegistroSelInput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DbValidarPreRegistroSelOutputCollection }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/pcbpel/adapter/db/DbValidarPreRegistroSel",
                    name = "DbValidarPreRegistroSelOutputCollection")
    public JAXBElement<DbValidarPreRegistroSelOutputCollection> createDbValidarPreRegistroSelOutputCollection(DbValidarPreRegistroSelOutputCollection value) {
        return new JAXBElement<DbValidarPreRegistroSelOutputCollection>(_DbValidarPreRegistroSelOutputCollection_QNAME,
                                                                        DbValidarPreRegistroSelOutputCollection.class,
                                                                        null, value);
    }

}
