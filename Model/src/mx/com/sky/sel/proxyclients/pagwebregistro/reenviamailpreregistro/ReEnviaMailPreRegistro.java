
package mx.com.sky.sel.proxyclients.pagwebregistro.reenviamailpreregistro;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebregistro.reenviamailpreregistro.types.ObjectFactory;
import mx.com.sky.sel.proxyclients.pagwebregistro.reenviamailpreregistro.types.ReEnviaMailPreRegistroProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebregistro.reenviamailpreregistro.types.ReEnviaMailPreRegistroProcessResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ReEnviaMailPreRegistro", targetNamespace = "http://xmlns.oracle.com/ReEnviaMailPreRegistro")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ReEnviaMailPreRegistro {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebregistro.reenviamailpreregistro.types.ReEnviaMailPreRegistroProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ReEnviaMailPreRegistroProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/ReEnviaMailPreRegistro", partName = "payload")
    public ReEnviaMailPreRegistroProcessResponse process(@WebParam(name = "ReEnviaMailPreRegistroProcessRequest",
                                                                   targetNamespace =
                                                                   "http://xmlns.oracle.com/ReEnviaMailPreRegistro",
                                                                   partName = "payload")
                                                         ReEnviaMailPreRegistroProcessRequest payload);

}