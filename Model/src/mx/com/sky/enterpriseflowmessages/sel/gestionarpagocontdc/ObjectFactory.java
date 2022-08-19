
package mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc package.
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

    private final static QName _GestionarPagoConTDCRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDC",
                  "GestionarPagoConTDCRequestEBM");
    private final static QName _GestionarPagoConTDCResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDC",
                  "GestionarPagoConTDCResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdc
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GestionarPagoConTDCRequestEBMType }
     *
     */
    public GestionarPagoConTDCRequestEBMType createGestionarPagoConTDCRequestEBMType() {
        return new GestionarPagoConTDCRequestEBMType();
    }

    /**
     * Create an instance of {@link GestionarPagoConTDCResponseEBMType }
     *
     */
    public GestionarPagoConTDCResponseEBMType createGestionarPagoConTDCResponseEBMType() {
        return new GestionarPagoConTDCResponseEBMType();
    }

    /**
     * Create an instance of {@link DatosTransaccionPagoInputMessageType }
     *
     */
    public DatosTransaccionPagoInputMessageType createDatosTransaccionPagoInputMessageType() {
        return new DatosTransaccionPagoInputMessageType();
    }

    /**
     * Create an instance of {@link DatosTransaccionPagoOutputMessageType }
     *
     */
    public DatosTransaccionPagoOutputMessageType createDatosTransaccionPagoOutputMessageType() {
        return new DatosTransaccionPagoOutputMessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarPagoConTDCRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDC",
                    name = "GestionarPagoConTDCRequestEBM")
    public JAXBElement<GestionarPagoConTDCRequestEBMType> createGestionarPagoConTDCRequestEBM(GestionarPagoConTDCRequestEBMType value) {
        return new JAXBElement<GestionarPagoConTDCRequestEBMType>(_GestionarPagoConTDCRequestEBM_QNAME,
                                                                  GestionarPagoConTDCRequestEBMType.class,
                                                                  null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarPagoConTDCResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDC",
                    name = "GestionarPagoConTDCResponseEBM")
    public JAXBElement<GestionarPagoConTDCResponseEBMType> createGestionarPagoConTDCResponseEBM(GestionarPagoConTDCResponseEBMType value) {
        return new JAXBElement<GestionarPagoConTDCResponseEBMType>(_GestionarPagoConTDCResponseEBM_QNAME,
                                                                   GestionarPagoConTDCResponseEBMType.class,
                                                                   null, value);
    }

}
