
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv.types.ConsultaPPVProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv.types.ConsultaPPVProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaPPV", targetNamespace = "http://xmlns.oracle.com/ConsultaPPV")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaPPV {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultappv.types.ConsultaPPVProcessResponse
     */
    @WebMethod(action = "process")
    @WebResult(name = "ConsultaPPVProcessResponse", targetNamespace = "http://xmlns.oracle.com/ConsultaPPV",
               partName = "payload")
    public ConsultaPPVProcessResponse process(@WebParam(name = "ConsultaPPVProcessRequest",
                                                        targetNamespace = "http://xmlns.oracle.com/ConsultaPPV",
                                                        partName = "payload") ConsultaPPVProcessRequest payload);

}
