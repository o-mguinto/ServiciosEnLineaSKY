
package mx.com.sky.sel.proxyclients.selabcs.consultarcambiopaqueteprincipal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalRequestEBMType;
import mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalResponseEBMType;
import mx.com.sky.enterpriseobjects.sel.consultarcambiopaqueteprincipal.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultarCambioPaquetePrincipal",
            targetNamespace = "http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarCambioPaquetePrincipal")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class,
              mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class, org.example.ObjectFactory.class
    })
public interface ConsultarCambioPaquetePrincipal {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterprisemessages.sel.consultarcambiopaqueteprincipal.ConsultarCambioPaquetePrincipalResponseEBMType
     */
    @WebMethod(operationName = "ConsultarCambioPaquetePrincipal",
               action =
               "http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarCambioPaquetePrincipal/ConsultarCambioPaquetePrincipal")
    @WebResult(name = "ConsultarCambioPaquetePrincipalResponseEBM",
               targetNamespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarCambioPaquetePrincipal",
               partName = "payload")
    public ConsultarCambioPaquetePrincipalResponseEBMType consultarCambioPaquetePrincipal(@WebParam(name =
                                                                                                    "ConsultarCambioPaquetePrincipalRequestEBM",
                                                                                                    targetNamespace =
                                                                                                    "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarCambioPaquetePrincipal",
                                                                                                    partName =
                                                                                                    "payload")
                                                                                          ConsultarCambioPaquetePrincipalRequestEBMType payload);

}
