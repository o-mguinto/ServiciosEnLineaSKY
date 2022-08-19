
package mx.com.sky.enterprisemessages.sel.administrartarjetapago;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.enterprisemessages.sel.administrartarjetapago package.
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

    private final static QName _RegistrarTarjetaPagoRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                  "RegistrarTarjetaPagoRequestEBM");
    private final static QName _RegistrarTarjetaPagoResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                  "RegistrarTarjetaPagoResponseEBM");
    private final static QName _ConsultarTarjetaPagoRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                  "ConsultarTarjetaPagoRequestEBM");
    private final static QName _ConsultarTarjetaPagoResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                  "ConsultarTarjetaPagoResponseEBM");
    private final static QName _EliminarTarjetaPagoRequestEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                  "EliminarTarjetaPagoRequestEBM");
    private final static QName _EliminarTarjetaPagoResponseEBM_QNAME =
        new QName("http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                  "EliminarTarjetaPagoResponseEBM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.enterprisemessages.sel.administrartarjetapago
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrarTarjetaInputRequestEBMType }
     *
     */
    public RegistrarTarjetaInputRequestEBMType createRegistrarTarjetaInputRequestEBMType() {
        return new RegistrarTarjetaInputRequestEBMType();
    }

    /**
     * Create an instance of {@link RegistrarTarjetaOutputResponseEBMType }
     *
     */
    public RegistrarTarjetaOutputResponseEBMType createRegistrarTarjetaOutputResponseEBMType() {
        return new RegistrarTarjetaOutputResponseEBMType();
    }

    /**
     * Create an instance of {@link ConsultarTarjetaInputRequestEBMType }
     *
     */
    public ConsultarTarjetaInputRequestEBMType createConsultarTarjetaInputRequestEBMType() {
        return new ConsultarTarjetaInputRequestEBMType();
    }

    /**
     * Create an instance of {@link ConsultarTarjetaOutputResponseEBMType }
     *
     */
    public ConsultarTarjetaOutputResponseEBMType createConsultarTarjetaOutputResponseEBMType() {
        return new ConsultarTarjetaOutputResponseEBMType();
    }

    /**
     * Create an instance of {@link EliminarTarjetaInputRequestEBMType }
     *
     */
    public EliminarTarjetaInputRequestEBMType createEliminarTarjetaInputRequestEBMType() {
        return new EliminarTarjetaInputRequestEBMType();
    }

    /**
     * Create an instance of {@link EliminarTarjetaOutputResponseEBMType }
     *
     */
    public EliminarTarjetaOutputResponseEBMType createEliminarTarjetaOutputResponseEBMType() {
        return new EliminarTarjetaOutputResponseEBMType();
    }

    /**
     * Create an instance of {@link EliminarTarjetaInputType }
     *
     */
    public EliminarTarjetaInputType createEliminarTarjetaInputType() {
        return new EliminarTarjetaInputType();
    }

    /**
     * Create an instance of {@link RegistrarTarjetaInputType }
     *
     */
    public RegistrarTarjetaInputType createRegistrarTarjetaInputType() {
        return new RegistrarTarjetaInputType();
    }

    /**
     * Create an instance of {@link ConsultarTarjetasInputType }
     *
     */
    public ConsultarTarjetasInputType createConsultarTarjetasInputType() {
        return new ConsultarTarjetasInputType();
    }

    /**
     * Create an instance of {@link ConsultarTarjetasOutputType }
     *
     */
    public ConsultarTarjetasOutputType createConsultarTarjetasOutputType() {
        return new ConsultarTarjetasOutputType();
    }

    /**
     * Create an instance of {@link DatosVoltageType }
     *
     */
    public DatosVoltageType createDatosVoltageType() {
        return new DatosVoltageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTarjetaInputRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                    name = "RegistrarTarjetaPagoRequestEBM")
    public JAXBElement<RegistrarTarjetaInputRequestEBMType> createRegistrarTarjetaPagoRequestEBM(RegistrarTarjetaInputRequestEBMType value) {
        return new JAXBElement<RegistrarTarjetaInputRequestEBMType>(_RegistrarTarjetaPagoRequestEBM_QNAME,
                                                                    RegistrarTarjetaInputRequestEBMType.class,
                                                                    null,
                                                                    value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarTarjetaOutputResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                    name = "RegistrarTarjetaPagoResponseEBM")
    public JAXBElement<RegistrarTarjetaOutputResponseEBMType> createRegistrarTarjetaPagoResponseEBM(RegistrarTarjetaOutputResponseEBMType value) {
        return new JAXBElement<RegistrarTarjetaOutputResponseEBMType>(_RegistrarTarjetaPagoResponseEBM_QNAME,
                                                                      RegistrarTarjetaOutputResponseEBMType.class,
                                                                      null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTarjetaInputRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                    name = "ConsultarTarjetaPagoRequestEBM")
    public JAXBElement<ConsultarTarjetaInputRequestEBMType> createConsultarTarjetaPagoRequestEBM(ConsultarTarjetaInputRequestEBMType value) {
        return new JAXBElement<ConsultarTarjetaInputRequestEBMType>(_ConsultarTarjetaPagoRequestEBM_QNAME,
                                                                    ConsultarTarjetaInputRequestEBMType.class,
                                                                    null,
                                                                    value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarTarjetaOutputResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                    name = "ConsultarTarjetaPagoResponseEBM")
    public JAXBElement<ConsultarTarjetaOutputResponseEBMType> createConsultarTarjetaPagoResponseEBM(ConsultarTarjetaOutputResponseEBMType value) {
        return new JAXBElement<ConsultarTarjetaOutputResponseEBMType>(_ConsultarTarjetaPagoResponseEBM_QNAME,
                                                                      ConsultarTarjetaOutputResponseEBMType.class,
                                                                      null,
                                                                      value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTarjetaInputRequestEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                    name = "EliminarTarjetaPagoRequestEBM")
    public JAXBElement<EliminarTarjetaInputRequestEBMType> createEliminarTarjetaPagoRequestEBM(EliminarTarjetaInputRequestEBMType value) {
        return new JAXBElement<EliminarTarjetaInputRequestEBMType>(_EliminarTarjetaPagoRequestEBM_QNAME,
                                                                   EliminarTarjetaInputRequestEBMType.class,
                                                                   null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EliminarTarjetaOutputResponseEBMType }{@code >}}
     *
     */
    @XmlElementDecl(namespace =
                    "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                    name = "EliminarTarjetaPagoResponseEBM")
    public JAXBElement<EliminarTarjetaOutputResponseEBMType> createEliminarTarjetaPagoResponseEBM(EliminarTarjetaOutputResponseEBMType value) {
        return new JAXBElement<EliminarTarjetaOutputResponseEBMType>(_EliminarTarjetaPagoResponseEBM_QNAME,
                                                                     EliminarTarjetaOutputResponseEBMType.class,
                                                                     null,
                                                                     value);
    }

}
