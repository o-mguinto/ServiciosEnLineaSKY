
package mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.ConsultaTablaBatchSSAltaFacturacionProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.ConsultaTablaBatchSSAltaFacturacionProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaTablaBatchSSAltaFacturacion",
            targetNamespace = "http://xmlns.oracle.com/ConsultaTablaBatchSSAltaFacturacion")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaTablaBatchSSAltaFacturacion {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.ConsultaTablaBatchSSAltaFacturacionProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaTablaBatchSSAltaFacturacionProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/ConsultaTablaBatchSSAltaFacturacion", partName = "payload")
    public ConsultaTablaBatchSSAltaFacturacionProcessResponse process(@WebParam(name =
                                                                                "ConsultaTablaBatchSSAltaFacturacionProcessRequest",
                                                                                targetNamespace =
                                                                                "http://xmlns.oracle.com/ConsultaTablaBatchSSAltaFacturacion",
                                                                                partName = "payload")
                                                                      ConsultaTablaBatchSSAltaFacturacionProcessRequest payload);

}
