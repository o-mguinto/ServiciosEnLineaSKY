
package mx.com.sky.sel.proxyclients.selabcs.consultartarjetapagoselabcs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterprisemessages.sel.administrartarjetapago.ConsultarTarjetaInputRequestEBMType;
import mx.com.sky.enterprisemessages.sel.administrartarjetapago.ConsultarTarjetaOutputResponseEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultarTarjetaPagoSelABCS",
            targetNamespace =
            "http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarTarjetaPago")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ mx.com.sky.enterprisemessages.sel.administrartarjetapago.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.tarjetapagoebo.ObjectFactory.class
    })
public interface ConsultarTarjetaPagoSelABCS {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterprisemessages.sel.administrartarjetapago.ConsultarTarjetaOutputResponseEBMType
     */
    @WebMethod(action =
               "http://xmlns.sky.com.mx/ABCSImpl/Sel/ConsultarTarjetaPago/consultarTarjetaPago")
    @WebResult(name = "ConsultarTarjetaPagoResponseEBM",
               targetNamespace =
               "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
               partName = "payload")
    public ConsultarTarjetaOutputResponseEBMType consultarTarjetaPago(@WebParam(name =
                                                                                "ConsultarTarjetaPagoRequestEBM",
                                                                                targetNamespace =
                                                                                "http://www.sky.com.mx/EnterpriseMessages/Sel/AdministrarTarjetaPago",
                                                                                partName =
                                                                                "payload")
                                                                      ConsultarTarjetaInputRequestEBMType payload);

}