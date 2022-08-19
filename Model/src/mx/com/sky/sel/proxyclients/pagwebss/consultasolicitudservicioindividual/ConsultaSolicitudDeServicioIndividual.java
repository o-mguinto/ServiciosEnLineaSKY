
package mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types.ConsultaSolicitudDeServicioIndividualProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types.ConsultaSolicitudDeServicioIndividualProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaSolicitudDeServicioIndividual",
            targetNamespace = "http://xmlns.oracle.com/ConsultaSolicitudDeServicioIndividual")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaSolicitudDeServicioIndividual {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebss.consultasolicitudservicioindividual.types.ConsultaSolicitudDeServicioIndividualProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaSolicitudDeServicioIndividualProcessResponse",
               targetNamespace = "http://xmlns.oracle.com/ConsultaSolicitudDeServicioIndividual", partName = "payload")
    public ConsultaSolicitudDeServicioIndividualProcessResponse process(@WebParam(name =
                                                                                  "ConsultaSolicitudDeServicioIndividualProcessRequest",
                                                                                  targetNamespace =
                                                                                  "http://xmlns.oracle.com/ConsultaSolicitudDeServicioIndividual",
                                                                                  partName = "payload")
                                                                        ConsultaSolicitudDeServicioIndividualProcessRequest payload);

}