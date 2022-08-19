
package mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types.ConsultaPermisosInType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types.ConsultaPermisosOutType;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "ConsultaPPEPermisos",
            targetNamespace = "http://xmlns.oracle.com/SKYConsultas/ConsultaPPEPermisos/ConsultaPPEPermisos")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class })
public interface ConsultaPPEPermisos {


    /**
     *
     * @param payload
     * @return
     *     returns mx.com.sky.sel.proxyclients.pagwebconsultas.consultappepermisos.types.ConsultaPermisosOutType
     */
    @WebMethod(action = "process")
    @WebResult(name = "consultaPermisosOut", targetNamespace = "http://www.sky.com.mx/consulta/permisos/ppe",
               partName = "payload")
    public ConsultaPermisosOutType process(@WebParam(name = "consultaPermisosIn",
                                                     targetNamespace = "http://www.sky.com.mx/consulta/permisos/ppe",
                                                     partName = "payload") ConsultaPermisosInType payload);

}
