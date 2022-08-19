
package com.oracle.xmlns.sky_btgew.modificarcuentaldap.bpel_modificarcuentaldap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.oracle.xmlns.sky_btgew.modificarcuentaldap.bpel_modificarcuentaldap package.
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

    private final static QName _Operaciones_QNAME =
        new QName("http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP", "Operaciones");
    private final static QName _Operacion_QNAME =
        new QName("http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP", "Operacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.oracle.xmlns.sky_btgew.modificarcuentaldap.bpel_modificarcuentaldap
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LdapProcess }
     *
     */
    public LdapProcess createLdapProcess() {
        return new LdapProcess();
    }

    /**
     * Create an instance of {@link LdapProcessResponse }
     *
     */
    public LdapProcessResponse createLdapProcessResponse() {
        return new LdapProcessResponse();
    }

    /**
     * Create an instance of {@link Operaciones }
     *
     */
    public Operaciones createOperaciones() {
        return new Operaciones();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Operaciones }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP",
                    name = "Operaciones")
    public JAXBElement<Operaciones> createOperaciones(Operaciones value) {
        return new JAXBElement<Operaciones>(_Operaciones_QNAME, Operaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/SKY_BTGEW/ModificarCuentaLDAP/BPEL_ModificarCuentaLDAP",
                    name = "Operacion")
    public JAXBElement<String> createOperacion(String value) {
        return new JAXBElement<String>(_Operacion_QNAME, String.class, null, value);
    }

}
