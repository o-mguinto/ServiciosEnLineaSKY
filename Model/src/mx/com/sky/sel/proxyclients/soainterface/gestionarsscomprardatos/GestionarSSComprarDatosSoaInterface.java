
package mx.com.sky.sel.proxyclients.soainterface.gestionarsscomprardatos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface.GestionarSSComprarDatosRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface.GestionarSSComprarDatosResponseEBMType;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0-b170214.1743
 * Generated source version: 2.2
 *
 */
@WebService(name = "GestionarSSComprarDatosSoaInterface",
            targetNamespace =
            "http://xmlns.sky.com.mx/InterfaceServices/Soa/GestionarSSComprarDatos")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ mx.com.sky.enterprisemessages.soa.gestionarsscomprardatos.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.sel.common.v1.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.soa.common.v1.ObjectFactory.class,
              mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface.ObjectFactory.class
    })
public interface GestionarSSComprarDatosSoaInterface {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.enterpriseobjects.soa.gestionarsscomprardatosinterface.GestionarSSComprarDatosResponseEBMType
     */
    @WebMethod(action =
               "http://xmlns.sky.com.mx/InterfaceServices/Soa/GestionarSSComprarDatos/gestionarSSComprarDatos")
    @WebResult(name = "GestionarSSComprarDatosResponseEBM",
               targetNamespace =
               "http://www.sky.com.mx/EnterpriseObjects/Soa/GestionarSSComprarDatosInterface",
               partName = "payload")
    public GestionarSSComprarDatosResponseEBMType gestionarSSComprarDatos(@WebParam(name =
                                                                                    "GestionarSSComprarDatosRequestEBM",
                                                                                    targetNamespace =
                                                                                    "http://www.sky.com.mx/EnterpriseObjects/Soa/GestionarSSComprarDatosInterface",
                                                                                    partName =
                                                                                    "payload")
                                                                          GestionarSSComprarDatosRequestEBMType payload);

}
