
package mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.types.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150616.1732
 * Generated source version: 2.2
 *
 */
@WebService(name = "CalculaCrecimientos_VeTV",
            targetNamespace =
            "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
@XmlSeeAlso({ ObjectFactory.class })
public interface CalculaCrecimientosVeTV {


    /**
     *
     * @param sd
     * @param precio
     * @param codigoError
     * @param descError
     * @param cuenta
     * @param hd
     * @param phd
     * @param fechaPago
     * @param paquete
     * @param hmc
     */
    @WebMethod(action = "calculaCrecimientos")
    @RequestWrapper(localName = "calculaCrecimientos",
                    targetNamespace =
                    "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV",
                    className = "mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.types.CalculaCrecimientos")
    @ResponseWrapper(localName = "calculaCrecimientosResponse",
                     targetNamespace =
                     "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV",
                     className =
                     "mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.types.CalculaCrecimientosResponse")
    public void calculaCrecimientos(@WebParam(name = "cuenta",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
                                    String cuenta,
                                    @WebParam(name = "sd",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
                                    String sd,
                                    @WebParam(name = "hd",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
                                    String hd,
                                    @WebParam(name = "phd",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
                                    String phd,
                                    @WebParam(name = "hmc",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
                                    String hmc,
                                    @WebParam(name = "fechaPago",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
                                    String fechaPago,
                                    @WebParam(name = "paquete",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV")
                                    String paquete,
                                    @WebParam(name = "precio",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV",
                                              mode = WebParam.Mode.OUT) Holder<BigDecimal> precio,
                                    @WebParam(name = "codigoError",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV",
                                              mode = WebParam.Mode.OUT) Holder<String> codigoError,
                                    @WebParam(name = "descError",
                                              targetNamespace =
                                              "http://xmlns.oracle.com/SKY_CrecimientosEquipos/SKY_Crecimientos/CalculaCrecimientos_VeTV",
                                              mode = WebParam.Mode.OUT) Holder<String> descError);

}
