package mx.com.sky.sel.proxyclients.soainterface.consultafacturasperiodo;

import javax.xml.ws.WebServiceRef;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

public class ConsultaFacturasPeriodoPSSoaInterface_ptClient
{
  @WebServiceRef
  private static ConsultaFacturasPeriodoPSSoaInterface_ep consultaFacturasPeriodoPSSoaInterface_ep;

  public static void main(String [] args)
  {
    consultaFacturasPeriodoPSSoaInterface_ep = new ConsultaFacturasPeriodoPSSoaInterface_ep();
    ConsultaFacturasPeriodoPSSoaInterface consultaFacturasPeriodoPSSoaInterface = consultaFacturasPeriodoPSSoaInterface_ep.getConsultaFacturasPeriodoPSSoaInterface_pt();
    // Add your code to call the desired methods.
  }
}