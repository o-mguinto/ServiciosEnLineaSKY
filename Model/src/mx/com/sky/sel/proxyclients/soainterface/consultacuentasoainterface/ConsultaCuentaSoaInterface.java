
package mx.com.sky.sel.proxyclients.soainterface.consultacuentasoainterface;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ConsultaCuentaRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ConsultaCuentaResponseEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaCuentaSoaInterface",
            targetNamespace =
            "http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaCuenta")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ mx.com.sky.siebelosb.consultacuenta.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ObjectFactory.class
    })
public interface ConsultaCuentaSoaInterface {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterpriseobjects.soa.consultacuentainterface.ConsultaCuentaResponseEBMType
     */
    @WebMethod(action =
               "http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaCuenta/consultaCuenta")
    @WebResult(name = "ConsultaCuentaResponseEBM",
               targetNamespace =
               "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCuentaInterface",
               partName = "payload")
    public ConsultaCuentaResponseEBMType consultaCuenta(@WebParam(name =
                                                                  "ConsultaCuentaRequestEBM",
                                                                  targetNamespace =
                                                                  "http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaCuentaInterface",
                                                                  partName =
                                                                  "payload")
                                                        ConsultaCuentaRequestEBMType payload);

}
