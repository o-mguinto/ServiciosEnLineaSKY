
package mx.com.sky.sel.proxyclients.selabcs.consultarserviciosadicionales;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesRequestEBMType;
import mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesResponseEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultarServiciosAdicionales",
            targetNamespace = "http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarServiciosAdicionales")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ mx.com.sky.enterpriseobjects.sel.consultarserviciosadicionales.ObjectFactory.class,
              mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class, org.example.ObjectFactory.class
    })
public interface ConsultarServiciosAdicionales {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesResponseEBMType
     */
    @WebMethod(action =
               "http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarServiciosAdicionales/ConsultarServiciosAdicionales")
    @WebResult(name = "ConsultarServiciosAdicionalesResponseEBM",
               targetNamespace = "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarServiciosAdicionales",
               partName = "payload")
    public ConsultarServiciosAdicionalesResponseEBMType consultarserviciosadicionales(@WebParam(name =
                                                                                                "ConsultarServiciosAdicionalesRequestEBM",
                                                                                                targetNamespace =
                                                                                                "http://www.sky.com.mx/EnterpriseMessages/Sel/ConsultarServiciosAdicionales",
                                                                                                partName = "payload")
                                                                                      ConsultarServiciosAdicionalesRequestEBMType payload);

}
