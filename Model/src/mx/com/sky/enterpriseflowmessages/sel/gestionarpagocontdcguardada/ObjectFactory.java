
package mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada package.
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

    private final static QName _GestionarPagoConTDCGuardadaRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDCGuardada",
                  "GestionarPagoConTDCGuardadaRequestEBM");
    private final static QName _GestionarPagoConTDCGuardadaResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDCGuardada",
                  "GestionarPagoConTDCGuardadaResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterpriseflowmessages.sel.gestionarpagocontdcguardada
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GestionarPagoConTDCGuardadaRequestEBMType }
     *
     */
    public GestionarPagoConTDCGuardadaRequestEBMType createGestionarPagoConTDCGuardadaRequestEBMType() {
        return new GestionarPagoConTDCGuardadaRequestEBMType();
    }

    /**
     * Create an instance of {@link GestionarPagoConTDCGuardadaResponseEBMType }
     *
     */
    public GestionarPagoConTDCGuardadaResponseEBMType createGestionarPagoConTDCGuardadaResponseEBMType() {
        return new GestionarPagoConTDCGuardadaResponseEBMType();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarPagoConTDCGuardadaRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDCGuardada",
                    name = "GestionarPagoConTDCGuardadaRequestEBM")
    public JAXBElement<GestionarPagoConTDCGuardadaRequestEBMType> createGestionarPagoConTDCGuardadaRequestEBM(GestionarPagoConTDCGuardadaRequestEBMType value) {
        return new JAXBElement<GestionarPagoConTDCGuardadaRequestEBMType>(_GestionarPagoConTDCGuardadaRequestEBM_QNAME,
                                                                          GestionarPagoConTDCGuardadaRequestEBMType.class,
                                                                          null,
                                                                          value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionarPagoConTDCGuardadaResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseFlowMessages/Sel/GestionarPagoConTDCGuardada",
                    name = "GestionarPagoConTDCGuardadaResponseEBM")
    public JAXBElement<GestionarPagoConTDCGuardadaResponseEBMType> createGestionarPagoConTDCGuardadaResponseEBM(GestionarPagoConTDCGuardadaResponseEBMType value) {
        return new JAXBElement<GestionarPagoConTDCGuardadaResponseEBMType>(_GestionarPagoConTDCGuardadaResponseEBM_QNAME,
                                                                           GestionarPagoConTDCGuardadaResponseEBMType.class,
                                                                           null,
                                                                           value);
    }

}
