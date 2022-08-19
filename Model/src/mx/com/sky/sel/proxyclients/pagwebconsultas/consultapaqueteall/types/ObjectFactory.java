
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types package.
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaqueteall.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Process }
     *
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link PaquetesInType }
     *
     */
    public PaquetesInType createPaquetesInType() {
        return new PaquetesInType();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     *
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link PaquetesOutType }
     *
     */
    public PaquetesOutType createPaquetesOutType() {
        return new PaquetesOutType();
    }

    /**
     * Create an instance of {@link PaquetesElementType }
     *
     */
    public PaquetesElementType createPaquetesElementType() {
        return new PaquetesElementType();
    }

}