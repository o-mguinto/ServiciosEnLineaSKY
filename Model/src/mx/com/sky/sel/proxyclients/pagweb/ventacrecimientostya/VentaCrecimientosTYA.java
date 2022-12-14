
package mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "VentaCrecimientos_TYA",
            targetNamespace = "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
@XmlSeeAlso({ ObjectFactory.class })
public interface VentaCrecimientosTYA {


    /**
     *
     * @param codigoError
     * @param cuentaSKY
     * @param descError
     * @param origen
     * @param fechaAtencion
     * @param phd
     * @param distribuidor
     * @param ssTransaction
     * @param sd
     * @param numEquipos
     * @param horaAtencion
     * @param hd
     * @param hmc
     */
    @WebMethod(action = "ventaCrecimientosTYA")
    @RequestWrapper(localName = "ventaCrecimientosTYA",
                    targetNamespace =
                    "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                    className = "mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.types.VentaCrecimientosTYA")
    @ResponseWrapper(localName = "ventaCrecimientosTYAResponse",
                     targetNamespace =
                     "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                     className =
                     "mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.types.VentaCrecimientosTYAResponse")
    public void ventaCrecimientosTYA(@WebParam(name = "cuentaSKY",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String cuentaSKY,
                                     @WebParam(name = "sd",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String sd,
                                     @WebParam(name = "hd",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String hd,
                                     @WebParam(name = "phd",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String phd,
                                     @WebParam(name = "hmc",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String hmc,
                                     @WebParam(name = "numEquipos",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String numEquipos,
                                     @WebParam(name = "origen",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String origen,
                                     @WebParam(name = "distribuidor",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String distribuidor,
                                     @WebParam(name = "fechaAtencion",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String fechaAtencion,
                                     @WebParam(name = "horaAtencion",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA")
                                     String horaAtencion,
                                     @WebParam(name = "ssTransaction",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                                               mode = WebParam.Mode.OUT) Holder<String> ssTransaction,
                                     @WebParam(name = "codigoError",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                                               mode = WebParam.Mode.OUT) Holder<String> codigoError,
                                     @WebParam(name = "descError",
                                               targetNamespace =
                                               "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/VentaCrecimientos_TYA",
                                               mode = WebParam.Mode.OUT) Holder<String> descError);

}
