
package mx.com.sky.siebelosb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.siebelosb package.
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

    private final static QName _GestionacomponenteEntrada_QNAME =
        new QName("http://www.sky.com.mx/SiebelOSB", "Gestionacomponente_Entrada");
    private final static QName _GestionacomponenteSalida_QNAME =
        new QName("http://www.sky.com.mx/SiebelOSB", "Gestionacomponente_Salida");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.siebelosb
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaProductoType }
     *
     */
    public ListaProductoType createListaProductoType() {
        return new ListaProductoType();
    }

    /**
     * Create an instance of {@link ListaInstanciaType }
     *
     */
    public ListaInstanciaType createListaInstanciaType() {
        return new ListaInstanciaType();
    }

    /**
     * Create an instance of {@link GestionacomponenteSalidaTYPE }
     *
     */
    public GestionacomponenteSalidaTYPE createGestionacomponenteSalidaTYPE() {
        return new GestionacomponenteSalidaTYPE();
    }

    /**
     * Create an instance of {@link GestionacomponenteEntradaTYPE }
     *
     */
    public GestionacomponenteEntradaTYPE createGestionacomponenteEntradaTYPE() {
        return new GestionacomponenteEntradaTYPE();
    }

    /**
     * Create an instance of {@link ListaProductoType.Producto }
     *
     */
    public ListaProductoType.Producto createListaProductoTypeProducto() {
        return new ListaProductoType.Producto();
    }

    /**
     * Create an instance of {@link ListaInstanciaType.Instancia }
     *
     */
    public ListaInstanciaType.Instancia createListaInstanciaTypeInstancia() {
        return new ListaInstanciaType.Instancia();
    }

    /**
     * Create an instance of {@link GestionacomponenteSalidaTYPE.CABECERA }
     *
     */
    public GestionacomponenteSalidaTYPE.CABECERA createGestionacomponenteSalidaTYPECABECERA() {
        return new GestionacomponenteSalidaTYPE.CABECERA();
    }

    /**
     * Create an instance of {@link GestionacomponenteEntradaTYPE.ContratoSiebel }
     *
     */
    public GestionacomponenteEntradaTYPE.ContratoSiebel createGestionacomponenteEntradaTYPEContratoSiebel() {
        return new GestionacomponenteEntradaTYPE.ContratoSiebel();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionacomponenteEntradaTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/SiebelOSB", name = "Gestionacomponente_Entrada")
    public JAXBElement<GestionacomponenteEntradaTYPE> createGestionacomponenteEntrada(GestionacomponenteEntradaTYPE value) {
        return new JAXBElement<GestionacomponenteEntradaTYPE>(_GestionacomponenteEntrada_QNAME,
                                                              GestionacomponenteEntradaTYPE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GestionacomponenteSalidaTYPE }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://www.sky.com.mx/SiebelOSB", name = "Gestionacomponente_Salida")
    public JAXBElement<GestionacomponenteSalidaTYPE> createGestionacomponenteSalida(GestionacomponenteSalidaTYPE value) {
        return new JAXBElement<GestionacomponenteSalidaTYPE>(_GestionacomponenteSalida_QNAME,
                                                             GestionacomponenteSalidaTYPE.class, null, value);
    }

}
