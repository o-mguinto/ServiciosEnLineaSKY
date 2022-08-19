
package mx.com.sky.siebelosb.creasolicitudservicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.siebelosb.creasolicitudservicio package.
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

    private final static QName _CreaSolicitudServicioEntrada_QNAME =
        new QName("http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio", "CreaSolicitudServicio_Entrada");
    private final static QName _CreaSolicitudServicioSalida_QNAME =
        new QName("http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio", "CreaSolicitudServicio_Salida");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.siebelosb.creasolicitudservicio
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CabeceraEntradaTYPE }
     *
     */
    public CabeceraEntradaTYPE createCabeceraEntradaTYPE() {
        return new CabeceraEntradaTYPE();
    }

    /**
     * Create an instance of {@link CreaSolicitudServicioEntradaTYPE }
     *
     */
    public CreaSolicitudServicioEntradaTYPE createCreaSolicitudServicioEntradaTYPE() {
        return new CreaSolicitudServicioEntradaTYPE();
    }

    /**
     * Create an instance of {@link CreaSolicitudServicioSalidaTYPE }
     *
     */
    public CreaSolicitudServicioSalidaTYPE createCreaSolicitudServicioSalidaTYPE() {
        return new CreaSolicitudServicioSalidaTYPE();
    }

    /**
     * Create an instance of {@link CabeceraSalidaTYPE }
     *
     */
    public CabeceraSalidaTYPE createCabeceraSalidaTYPE() {
        return new CabeceraSalidaTYPE();
    }

    /**
     * Create an instance of {@link CabeceraEntradaTYPE.PARAMETRO }
     *
     */
    public CabeceraEntradaTYPE.PARAMETRO createCabeceraEntradaTYPEPARAMETRO() {
        return new CabeceraEntradaTYPE.PARAMETRO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaSolicitudServicioEntradaTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio",
                    name = "CreaSolicitudServicio_Entrada")
    public JAXBElement<CreaSolicitudServicioEntradaTYPE> createCreaSolicitudServicioEntrada(CreaSolicitudServicioEntradaTYPE value) {
        return new JAXBElement<CreaSolicitudServicioEntradaTYPE>(_CreaSolicitudServicioEntrada_QNAME,
                                                                 CreaSolicitudServicioEntradaTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreaSolicitudServicioSalidaTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/SiebelOSB/CreaSolicitudServicio",
                    name = "CreaSolicitudServicio_Salida")
    public JAXBElement<CreaSolicitudServicioSalidaTYPE> createCreaSolicitudServicioSalida(CreaSolicitudServicioSalidaTYPE value) {
        return new JAXBElement<CreaSolicitudServicioSalidaTYPE>(_CreaSolicitudServicioSalida_QNAME,
                                                                CreaSolicitudServicioSalidaTYPE.class, null, value);
    }

}
