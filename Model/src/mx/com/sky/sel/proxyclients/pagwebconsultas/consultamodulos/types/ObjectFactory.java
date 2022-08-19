
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types package.
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultamodulos.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListaModulos }
     *
     */
    public ListaModulos createListaModulos() {
        return new ListaModulos();
    }

    /**
     * Create an instance of {@link ConsultaModulosProcessRequest }
     *
     */
    public ConsultaModulosProcessRequest createConsultaModulosProcessRequest() {
        return new ConsultaModulosProcessRequest();
    }

    /**
     * Create an instance of {@link ConsultaModulosProcessResponse }
     *
     */
    public ConsultaModulosProcessResponse createConsultaModulosProcessResponse() {
        return new ConsultaModulosProcessResponse();
    }

    /**
     * Create an instance of {@link ListaModulos.Modulo }
     *
     */
    public ListaModulos.Modulo createListaModulosModulo() {
        return new ListaModulos.Modulo();
    }

}
