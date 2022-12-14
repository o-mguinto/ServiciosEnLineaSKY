
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaCuentaEspecial", targetNamespace = "http://xmlns.oracle.com/ConsultaCuentaEspecial")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaCuentaEspecial {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaCuentaEspecialProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/ConsultaCuentaEspecial", partName = "payload")
    public ConsultaCuentaEspecialProcessResponse process(@WebParam(name = "ConsultaCuentaEspecialProcessRequest",
                                                                   targetNamespace =
                                                                   "http://xmlns.oracle.com/ConsultaCuentaEspecial",
                                                                   partName = "payload")
                                                         ConsultaCuentaEspecialProcessRequest payload);

}
