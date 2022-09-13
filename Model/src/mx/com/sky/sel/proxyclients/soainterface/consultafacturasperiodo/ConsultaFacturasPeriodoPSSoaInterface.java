package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="https://qaselsoa.sky.com.mx:443/soa-infra/services/SOA_Interface/ConsultaFacturasPeriodoPSSoaInterface/ConsultaFacturasPeriodoPSSoaInterface_ep?WSDL",
  targetNamespace="http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaFacturasPeriodoPS",
  name="ConsultaFacturasPeriodoPSSoaInterface")
@XmlSeeAlso(
  { mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.ObjectFactory.class })
@SOAPBinding(style=Style.DOCUMENT, parameterStyle=ParameterStyle.BARE)
public interface ConsultaFacturasPeriodoPSSoaInterface
{
  @WebMethod(action="http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaFacturasPeriodoPS/consultaFacturasPeriodoPS")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaFacturasPeriodoPS/consultaFacturasPeriodoPS",
    output="http://xmlns.sky.com.mx/InterfaceServices/Soa/ConsultaFacturasPeriodoPS/ConsultaFacturasPeriodoPSSoaInterface/consultaFacturasPeriodoPSResponse")
  @WebResult(targetNamespace="http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface",
    partName="payload", name="ConsultaFacturasPeriodoPSResponseEBM")
  public mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.ConsultaFacturasPeriodoPSResponseEBMType consultaFacturasPeriodoPS(@WebParam(targetNamespace="http://www.sky.com.mx/EnterpriseObjects/Soa/ConsultaFacturasPeriodoPSInterface",
      partName="payload", name="ConsultaFacturasPeriodoPSEBM")
    mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo.types.ConsultaFacturasPeriodoPSEBMType payload);
}
