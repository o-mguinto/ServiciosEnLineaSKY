
package mx.com.sky.sel.proxyclients.selinterface.consultarinformacionfiscalselinterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal.ConsultarInformacionFiscalRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal.ConsultarInformacionFiscalResponseType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultarInformacionFiscal",
            targetNamespace = "http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarInformacionFiscal")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ com.oracle.xmlns.pcbpel.adapter.db.dbconsultarinformacionfiscal.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal.ObjectFactory.class
    })
public interface ConsultarInformacionFiscal {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterpriseobjects.sel.consultarinformacionfiscal.ConsultarInformacionFiscalResponseType
     */
    @WebMethod(operationName = "ConsultarInformacionFiscal",
               action =
               "http://xmlns.sky.com.mx/InterfaceServices/Sel/ConsultarInformacionFiscal/ConsultarInformacionFiscal")
    @WebResult(name = "ConsultarInformacionFiscalResponse",
               targetNamespace = "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarInformacionFiscal",
               partName = "payload")
    public ConsultarInformacionFiscalResponseType consultarInformacionFiscal(@WebParam(name =
                                                                                       "ConsultarInformacionFiscalRequest",
                                                                                       targetNamespace =
                                                                                       "http://www.sky.com.mx/EnterpriseObjects/Sel/ConsultarInformacionFiscal",
                                                                                       partName = "payload")
                                                                             ConsultarInformacionFiscalRequestType payload);

}
