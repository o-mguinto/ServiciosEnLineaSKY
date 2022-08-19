package mx.com.sky.sel.services.factura;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.xml.ws.WebServiceRef;

import mx.com.sky.sel.services.beans.facturas.Factura;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.utils.JavaUtils;

import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.ConsultaCuentaEspecial_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.ConsultaCuentaEspecial;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactaespecial.types.ConsultaCuentaEspecialProcessResponse;

import mx.com.sky.sel.proxyclients.cfdiinterface.consultar.obtenerfactura.ObtenerFacturaPDF;
import mx.com.sky.sel.proxyclients.cfdiinterface.consultar.obtenerfactura.ObtenerfacturapdfClientEp;
import mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf.ObtenerFacturaPDFReqType;
import mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf.ObtenerFacturaPDFRequestType;
import mx.com.sky.enterpriseflowmessage.soasap.obtenerfacturapdf.ObtenerFacturaPDFResponseType;

import mx.com.sky.sel.proxyclients.sicofinterface.consultar.factura.ConsultarFactura;
import mx.com.sky.sel.proxyclients.sicofinterface.consultar.factura.ConsultarFacturaEp;
import mx.com.sky.enterprisemessages.sicof.consultarfactura.ConsultarFacturaRequestType;
import mx.com.sky.enterprisemessages.sicof.consultarfactura.ConsultarFacturaRequestEBMType;
import mx.com.sky.enterpriseobjects.sicof.consultarfactura.ConsultarFacturaEBOType;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterprisemessages.sicof.consultarfactura.ConsultarFacturaResponseEBMType;
import java.sql.Timestamp;
import sun.misc.BASE64Decoder;

@Stateless(name = "ServicioFacturaPSManagement", mappedName = "SEL-ServicioFacturaPSManagement")
public class ServicioFacturaPSManagementBean implements Serializable,ServicioFacturaPSManagement, ServicioFacturaPSManagementLocal {
    @SuppressWarnings("compatibility:-7053517752436394514")
    private static final long serialVersionUID = -5927286845397250338L;
    @Resource
    SessionContext sessionContext;
    
    @WebServiceRef
    private ObtenerfacturapdfClientEp obtenerfacturapdf_client_ep;
    @WebServiceRef
    private ConsultarFacturaEp consultarfactura_client_ep;
    
    private static final String CONSULTA_SERVICIOSCOMPARTE_OPERACION = "SKY Obtiene Factura";
    private static final String SISTEMA_ORIGEN = "Web";

    public ServicioFacturaPSManagementBean() {
    }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Factura> consultarFacturas(String cuentaSKY) {
        List<Factura> facturas = new ArrayList<Factura>();
        facturas.addAll(ConsultarFacturas(cuentaSKY));
        return facturas;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public byte[] obtenerFacturaPDF(String UUID,String fechaTimbrado,String PAC) {
        String archivoFactura = "";
        
        ObtenerFacturaPDF obtenerfacturapdf = null;
        ObtenerFacturaPDFRequestType payload;
        ObtenerFacturaPDFReqType payload2=null;
        ObtenerFacturaPDFResponseType response = null;
        ObtenerFacturaPDFReqType responseWs=null;
        byte[] byteFactura = null;
        try {
            obtenerfacturapdf_client_ep = new ObtenerfacturapdfClientEp();
            obtenerfacturapdf = obtenerfacturapdf_client_ep.getObtenerFacturaPDFPt();
            payload = new ObtenerFacturaPDFRequestType();
            payload2 = new ObtenerFacturaPDFReqType();
            payload2.setUUID(UUID);
            payload2.setFechaTimbrado(fechaTimbrado);
            payload2.setPAC(PAC);
            payload.setObtenerFacturaPDFRequest(payload2);
            
            response = obtenerfacturapdf.obtenerfacturapdf(payload);
            
            if (response != null && response.getEBMHeaderResponse() != null &&
            response.getEBMHeaderResponse().getErrorNegocio() != null &&
            response.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
            response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                archivoFactura = response.getObtenerFacturaPDFResponse().getPdf();
                byteFactura = decodeBase64(archivoFactura);
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return byteFactura;
    }

    private List<Factura> ConsultarFacturas(String cuentaSKY) {
        List<Factura> facturas = new ArrayList<Factura>();
        Factura factura = null;
       
        ConsultarFactura consultarFacturas = null;
        ConsultarFacturaRequestEBMType payload = null;
        ConsultarFacturaRequestType payload2 = null;
        ConsultarFacturaResponseEBMType responseWS = null;
        Calendar clInit = Calendar.getInstance();
        Calendar c1End = Calendar.getInstance();
        clInit.add(Calendar.MONTH, -5);
        clInit.set(Calendar.DAY_OF_MONTH, 1);   
        try {

            consultarfactura_client_ep = new ConsultarFacturaEp();
            consultarFacturas = consultarfactura_client_ep.getConsultarFacturaPt();
            //Header
            EBMHeaderRequestType header = new EBMHeaderRequestType();
            header.setOperacion(CONSULTA_SERVICIOSCOMPARTE_OPERACION);
            header.setSistemaOrigen(SISTEMA_ORIGEN);
                        
            payload = new ConsultarFacturaRequestEBMType();
            payload2 = new ConsultarFacturaRequestType();
            payload2.setNumeroCuenta(cuentaSKY);
            payload.setEBMHeaderRequest(header);
            payload.setConsultarFacturaRequest(payload2);
            responseWS = consultarFacturas.consultarFactura(payload);
            
            
            if (responseWS != null && responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null
              && responseWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                for (ConsultarFacturaEBOType fact : responseWS.getConsultarFactura().getConsultarFactura()) {
                    factura = convert(fact);
                    if(factura.getfechaTimbrado()!=null && factura.getPac()!=null){
                        facturas.add(factura);
                    }
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }

        return facturas;
    }

    private static byte[] decodeBase64(String cadenaBase64) throws IOException {
        BASE64Decoder base64 = new BASE64Decoder();
        byte[] byteArray64;
        byteArray64 = base64.decodeBuffer(cadenaBase64);
        return byteArray64;
    }
        private Factura convert(ConsultarFacturaEBOType facturas) {
           
            Factura factura = new Factura();
            factura.setCuentaSKY(facturas.getCuentaSKY().getValue());
            factura.setDescripcion(facturas.getDescripcion().getValue());
            factura.setPac(facturas.getPac().getValue());
            factura.setTipoArchivo(facturas.getTipoArchivo().getValue());
            factura.setfactura(facturas.getFactura().getValue());
            factura.setfechaTimbrado(JavaUtils.asTimestamp(facturas.getFechaTimbrado().getValue()));
            factura.setfechacorte(JavaUtils.asTimestamp(facturas.getFechacorte().getValue()));
            factura.setuuid(facturas.getUuid().getValue());
            factura.setid_doc_edicom(facturas.getIdDocEdicom().toString());
            factura.setserie(facturas.getSerie().getValue());
            return factura;

        }
    
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public ConsultaCuentaEspecialProcessResponse consultaCuentaEspecial(String cuentaSKY){
        ConsultaCuentaEspecialProcessResponse response = null;
        ConsultaCuentaEspecial_Service consultaCuentaEspecial_Service = new ConsultaCuentaEspecial_Service();
        ConsultaCuentaEspecial consultaCuentaEspecial = consultaCuentaEspecial_Service.getConsultaCuentaEspecial();
        ConsultaCuentaEspecialProcessRequest request = new ConsultaCuentaEspecialProcessRequest();
        request.setCuentaSKY(cuentaSKY);
        response = consultaCuentaEspecial.process(request);
        return response;
    }
    }
