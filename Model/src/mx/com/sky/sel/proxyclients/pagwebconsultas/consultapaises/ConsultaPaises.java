
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types.ConsultaPaisesProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types.ConsultaPaisesProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaPaises", targetNamespace = "http://xmlns.oracle.com/ConsultaPaises")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaPaises {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultapaises.types.ConsultaPaisesProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaPaisesProcessResponse", targetNamespace = "http://xmlns.oracle.com/ConsultaPaises",
               partName = "payload")
    public ConsultaPaisesProcessResponse process(@WebParam(name = "ConsultaPaisesProcessRequest",
                                                           targetNamespace = "http://xmlns.oracle.com/ConsultaPaises",
                                                           partName = "payload") ConsultaPaisesProcessRequest payload);

}