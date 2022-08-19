
package mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.types.ObjectFactory;
import mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.types.RegistroCorporativoLinkRequest;
import mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.types.RegistroCorporativoLinkResponse;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "RegistraCorporativoLink",
            targetNamespace = "http://xmlns.sky.com/SKYRegistraUsuario/RegistraCorporativoLink/RegistraCorporativoLink")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface RegistraCorporativoLink {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebregistro.registracorplink.types.RegistroCorporativoLinkResponse
     */
    @WebMethod(action = "registraCorporativo")
    @WebResult(name = "RegistroCorporativoLinkResponse",
               targetNamespace = "http://www.sky.com.mx/RegistraCorporativoLink", partName = "payload")
    public RegistroCorporativoLinkResponse registraCorporativo(@WebParam(name = "RegistroCorporativoLinkRequest",
                                                                         targetNamespace =
                                                                         "http://www.sky.com.mx/RegistraCorporativoLink",
                                                                         partName = "payload")
                                                               RegistroCorporativoLinkRequest payload);

}
