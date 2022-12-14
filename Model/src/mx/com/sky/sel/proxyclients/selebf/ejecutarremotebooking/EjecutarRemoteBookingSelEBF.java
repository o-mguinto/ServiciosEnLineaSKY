
package mx.com.sky.sel.proxyclients.selebf.ejecutarremotebooking;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.EjecutarRemoteBookingRequestEBFEBMType;
import mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.EjecutarRemoteBookingResponseEBFEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "EjecutarRemoteBookingSelEBF",
            targetNamespace =
            "http://xmlns.sky.com.mx/EnterpriseFlows/Sel/EjecutarRemoteBookingSelEBF")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class })
public interface EjecutarRemoteBookingSelEBF {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterpriseflowmessage.sel.ejecutarremotebooking.EjecutarRemoteBookingResponseEBFEBMType
     */
    @WebMethod(action =
               "http://xmlns.sky.com.mx/EnterpriseFlows/Sel/EjecutarRemoteBookingSelEBF/ejecutarRemoteBooking")
    @WebResult(name = "EjecutarRemoteBookingResponseEBM",
               targetNamespace =
               "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/EjecutarRemoteBooking",
               partName = "payload")
    public EjecutarRemoteBookingResponseEBFEBMType ejecutarRemoteBooking(@WebParam(name =
                                                                                   "EjecutarRemoteBookingRequestEBM",
                                                                                   targetNamespace =
                                                                                   "http://www.sky.com.mx/EnterpriseFlowMessage/Sel/EjecutarRemoteBooking",
                                                                                   partName =
                                                                                   "payload")
                                                                         EjecutarRemoteBookingRequestEBFEBMType payload);

}
