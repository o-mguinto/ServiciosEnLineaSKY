package mx.com.sky.sel.services.saldo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StringReader;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.enterpriseobjects.soa.consultasaldoscorrientesinterface.ConsultaSaldosCorrientesRequestEBMType;
import mx.com.sky.enterpriseobjects.soa.consultasaldoscorrientesinterface.ConsultaSaldosCorrientesResponseEBMType;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientesnew.ConsultaSaldosCorrientesSoaInterface;
import mx.com.sky.sel.proxyclients.soainterface.consultasaldoscorrientesnew.ConsultaSaldosCorrientesSoaInterfaceEp;
import mx.com.sky.sel.services.beans.saldos.Saldo;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.utils.Parametros;
import mx.com.sky.soasky.CabeceraEntradaConsultaSaldosCorrientesTYPE;
import mx.com.sky.soasky.SaldosConsultaSaldosCorrientesEntradaTYPE;
import mx.com.sky.soasky.SaldosConsultaSaldosCorrientesSalidaTYPE;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import org.xml.sax.InputSource;

public class ServicioSaldo implements Serializable {
    @SuppressWarnings("compatibility:2228522076313773740")
    private static final long serialVersionUID = 948203335208771641L;

    public ServicioSaldo() {
        super();
    }
    
    
    public Saldo consultaSaldo(String ctaSKY, String sistema) {
        Saldo saldoConsultado = new Saldo();
        ConsultaSaldosCorrientesSoaInterfaceEp consultaSaldosCorrientesSoaInterfaceEp = new ConsultaSaldosCorrientesSoaInterfaceEp();
        ConsultaSaldosCorrientesSoaInterface consultaSaldosCorrientesSoaInterface = consultaSaldosCorrientesSoaInterfaceEp.getConsultaSaldosCorrientesSoaInterfacePt();
        
        //Response
        ConsultaSaldosCorrientesResponseEBMType response = null;
        
        //Payload request
        ConsultaSaldosCorrientesRequestEBMType payloadReq = new ConsultaSaldosCorrientesRequestEBMType();
        
        //Header
        EBMHeaderRequestType header = new EBMHeaderRequestType();
        header.setOperacion("ConsultaSaldoCuenta");
        header.setSistemaOrigen("WEB");
        //Header
        
        //Body request
        SaldosConsultaSaldosCorrientesEntradaTYPE bodyReq = new SaldosConsultaSaldosCorrientesEntradaTYPE();
        
        //Cabecera
        CabeceraEntradaConsultaSaldosCorrientesTYPE bodyReqCabecera = new CabeceraEntradaConsultaSaldosCorrientesTYPE();
        bodyReqCabecera.setOPERACION("ConsultaSaldoCuenta");
        bodyReqCabecera.setAPLICATIVO("WEB");
        //Cabecera
        bodyReq.setCABECERA(bodyReqCabecera);
        bodyReq.setNUMEROCUENTA(ctaSKY);
        //Body request
        
        payloadReq.setEBMHeaderRequest(header);
        payloadReq.setSaldosConsultaSaldosCorrientesEntrada(bodyReq);
        //Payload request
        //Llamar al servicio
        response = consultaSaldosCorrientesSoaInterface.consultaSaldosCorrientes(payloadReq);
        
        LogPC.println(this, "Response from service: " + response);
        if( response != null && response.getEBMHeaderResponse() != null && 
            response.getEBMHeaderResponse().getErrorNegocio() != null && 
            response.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null && 
            response.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") ) {
            saldoConsultado = this.transformSaldo(response, sistema);
            
            LogPC.println(this, "SaldoConsultado: " + saldoConsultado);
        }
        
        
        return saldoConsultado;
    }
    
    
    /**
     * [sldcargosxreactivacion]+[sldxfactcargosadmivos]+[sldppvxcobrar]+[sldsaldoactualminimo]
     * @param accountid
     * @return
     */
    public Double obtenerSaldoRealVeTV(String accountid) {
        String lista = "";
        URL url = null;
        String urlParameters = "accountid=" + accountid;
        String request = "";

        try {
            request = Parametros.getRequestSaldoVeTV();
            url = new URL(request);
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            connection.setDoOutput(true);
            connection.setDoInput(true);
            connection.setInstanceFollowRedirects(false);
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("charset", "utf-8");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
            connection.setUseCaches(false);

            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.writeBytes(urlParameters);
            wr.flush();

            String line = "";
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while ((line = reader.readLine()) != null) {
                lista = line;
            }
            wr.close();
            reader.close();
        } catch (MalformedURLException mue) {
            LogPC.println(this, "Ouch - a MalformedURLException happened.");
            LogPC.printlnError(this, mue.getMessage(), mue);
        } catch (IOException ioe) {
            LogPC.println(this, "Oops- an IOException happened.");
            LogPC.printlnError(this, ioe.getMessage(), ioe);
        }
        return procesarXMLString(lista);
    }

    /**
     * [sldcargosxreactivacion]+[sldxfactcargosadmivos]+[sldppvxcobrar]+[sldsaldoactualminimo]
     * @param xmlString
     * @return
     */
    private Double procesarXMLString(String xmlString) {
        Double saldoActual = 0.0;
        String sldcargosxreactivacion = "";
        String sldxfactcargosadmivos = "";
        String sldppvxcobrar = "";
        String sldsaldoactualminimo = "";
        Double sldcargosxreactivacionD = 0.0;
        Double sldxfactcargosadmivosD = 0.0;
        Double sldppvxcobrarD = 0.0;
        Double sldsaldoactualminimoD = 0.0;
        DocumentBuilder db = null;
        InputSource is = null;
        Document doc = null;
        NodeList nodes = null;
        Element element = null;
        NodeList name = null;
        try {

            db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            is = new InputSource();
            is.setCharacterStream(new StringReader(xmlString));
            doc = db.parse(is);
            nodes = doc.getElementsByTagName("value");
            for (int i = 0; i < nodes.getLength(); i++) {
                element = (Element)nodes.item(i);
                name = element.getElementsByTagName("siebel-xmlext-query-ret");

                sldcargosxreactivacion = element.getAttribute("sldcargosxreactivacion");
                sldxfactcargosadmivos = element.getAttribute("sldxfactcargosadmivos");
                sldppvxcobrar = element.getAttribute("sldppvxcobrar");
                sldsaldoactualminimo = element.getAttribute("sldsaldoactualminimo");

                //sldcargosxreactivacion
                if (sldcargosxreactivacion == null || sldcargosxreactivacion.isEmpty() || sldcargosxreactivacion.length() <= 0) {
                    sldcargosxreactivacionD = 0.0;
                } else {
                    sldcargosxreactivacionD = Double.parseDouble(sldcargosxreactivacion);
                }
                //sldxfactcargosadmivos
                if (sldxfactcargosadmivos == null || sldxfactcargosadmivos.isEmpty() || sldxfactcargosadmivos.length() <= 0) {
                    sldxfactcargosadmivosD = 0.0;
                } else {
                    sldxfactcargosadmivosD = Double.parseDouble(sldxfactcargosadmivos);
                }
                //sldppvxcobrar
                if (sldppvxcobrar == null || sldppvxcobrar.isEmpty() || sldppvxcobrar.length() <= 0) {
                    sldppvxcobrarD = 0.0;
                } else {
                    sldppvxcobrarD = Double.parseDouble(sldppvxcobrar);
                }
                //sldsaldoactualminimo
                if (sldsaldoactualminimo == null || sldsaldoactualminimo.isEmpty() || sldsaldoactualminimo.length() <= 0) {
                    sldsaldoactualminimoD = 0.0;
                } else {
                    sldsaldoactualminimoD = Double.parseDouble(sldsaldoactualminimo);
                }

                saldoActual = sldcargosxreactivacionD + sldxfactcargosadmivosD + sldppvxcobrarD + sldsaldoactualminimoD;
                LogServicios.println(this,
                                     " saldoActual = sldcargosxreactivacionD + sldxfactcargosadmivosD + sldppvxcobrarD + sldsaldoactualminimoD; ");
                LogServicios.println(this,
                                     " [" + saldoActual + "] = [" + sldcargosxreactivacionD + "] + [" + sldxfactcargosadmivosD + "] + [" + sldppvxcobrarD +
                                     "] + [" + sldsaldoactualminimoD + "]; ");

            }
        } catch (Exception e) {
            LogPC.printlnError(this, e);
        }
        return saldoActual;
    }
    
    private Saldo transformSaldo(ConsultaSaldosCorrientesResponseEBMType response, String sistema ) {
        Saldo saldo = new Saldo();
        
        SaldosConsultaSaldosCorrientesSalidaTYPE responseSalidatype = response.getSaldosConsultaSaldosCorrientesSalida();
        saldo.setExternalID("");
        if( responseSalidatype != null ) {
            if( responseSalidatype.getSALDOMINIMO() == null || responseSalidatype.getSALDOMINIMO().isEmpty() ) {
                saldo.setSaldoActMin("0");
            } else {
                saldo.setSaldoActMin(JavaUtils.asMoneda(responseSalidatype.getSALDOMINIMO()));
            }
            
            if (responseSalidatype.getSALDOTOTAL() == null || responseSalidatype.getSALDOTOTAL().isEmpty()) {
                saldo.setSaldoTotal("0");
            } else {
                saldo.setSaldoTotal(JavaUtils.asMoneda(responseSalidatype.getSALDOTOTAL()));
            }
            if (responseSalidatype.getTOTALPAGOOPORTUNO().getValue() == null || responseSalidatype.getTOTALPAGOOPORTUNO().getValue().isEmpty()) {
                saldo.setTotConPop("0");
            } else {
                saldo.setTotConPop(JavaUtils.asMoneda(responseSalidatype.getTOTALPAGOOPORTUNO().getValue()));
            }
            if (responseSalidatype.getFECHAPAGOOPORTUNO().getValue() == null || responseSalidatype.getFECHAPAGOOPORTUNO().getValue().isEmpty()) {
                saldo.setFechaPagoOportuno("");
            } else {
                saldo.setFechaPagoOportuno(responseSalidatype.getFECHAPAGOOPORTUNO().getValue().substring(0, 10).replaceAll("-", "/"));
            }
            if (responseSalidatype.getFECHASIGUIENTECORTE() == null || responseSalidatype.getFECHASIGUIENTECORTE().isEmpty()) {
                saldo.setFecha_sig_corte("");
            } else {
                saldo.setFecha_sig_corte(responseSalidatype.getFECHASIGUIENTECORTE().substring(0, 10));
            }
        } else {
            LogPC.println(this, "No se obtuvo respuesta del servicio ConsultaSaldosCorrientesSoaInterface_ep, se regresa saldo en ceros");
            saldo.setSaldoActMin("0");
            saldo.setSaldoTotal("0");
            saldo.setTotConPop("0");
        }
        
        return saldo;
    }
}
