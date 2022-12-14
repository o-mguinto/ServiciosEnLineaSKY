
package mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types.ObjectFactory;
import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types.RegistroUsuarioLinkProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types.RegistroUsuarioLinkProcessResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "RegistroUsuarioLink", targetNamespace = "http://xmlns.oracle.com/RegistroUsuarioLink")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface RegistroUsuarioLink {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebregistro.registrousuariolink.types.RegistroUsuarioLinkProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "RegistroUsuarioLinkProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/RegistroUsuarioLink", partName = "payload")
    public RegistroUsuarioLinkProcessResponse process(@WebParam(name = "RegistroUsuarioLinkProcessRequest",
                                                                targetNamespace =
                                                                "http://xmlns.oracle.com/RegistroUsuarioLink",
                                                                partName = "payload")
                                                      RegistroUsuarioLinkProcessRequest payload);

}
