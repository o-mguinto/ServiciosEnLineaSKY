package mx.com.sky.sel.services.cofetel;

import java.io.Serializable;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import javax.xml.ws.Holder;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.ConsultaTelefonoValidoCOFETEL;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.ConsultatelefonovalidocofetelClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types.Process;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultatelefonovalidocf.types.ProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaladas.ConsultaLadas;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaladas.types.ConsultaLadasProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaladas.types.ConsultaLadasProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaladas.ConsultaladasClientEp;

@Stateless(name = "ServicioCofetelPSManagement", mappedName = "SEL-ServicioCofetelPSManagement")
public class ServicioCofetelPSManagementBean implements Serializable, ServicioCofetelPSManagement, ServicioCofetelPSManagementLocal {
    @SuppressWarnings("compatibility:1974679348873462929")
    private static final long serialVersionUID = -4478959595314225218L;
    @Resource
    SessionContext sessionContext;

    public ServicioCofetelPSManagementBean() {
    }

    /**
     *
     * @return
     */
    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<String> obtenerLadas() {
        List<String> ladas = null;

        ConsultaLadas consultaLadas = null;
        ConsultaladasClientEp ConsultaladasClientEp = null;
        ConsultaLadasProcessRequest payload = null;
        ConsultaLadasProcessResponse resultado = null;
        //Agregar codigo para consulta del PROXY

        ladas = new ArrayList<String>();

        try {
            ConsultaladasClientEp = new ConsultaladasClientEp();
            consultaLadas = ConsultaladasClientEp.getConsultaLadasPt();

            payload = new ConsultaLadasProcessRequest();
            payload.setApp("SEL");

            resultado = consultaLadas.process(payload);
            if (resultado != null) {
                ladas.add("");
                for (String lada : resultado.getLada()) {
                    ladas.add(lada);
                }

            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }


        return ladas;
    }
    
    @Override
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String validaTelefono(String lada, String telefono) {
        Holder<String> resultado = new Holder<String>();
        Holder<String> resultadodesc = new Holder<String>();
        Holder<String> valido = new Holder<String>();
        Holder<String> modalidad = new Holder<String>();
        ConsultaTelefonoValidoCOFETEL consultaTelefonoValidoCOFETEL = null;
        ConsultatelefonovalidocofetelClientEp ConsultatelefonovalidocofetelClientEp = null;
        Process payload = null;
        ProcessResponse response = null;
        String mod = null;
        try {
            ConsultatelefonovalidocofetelClientEp = new ConsultatelefonovalidocofetelClientEp();
            consultaTelefonoValidoCOFETEL = ConsultatelefonovalidocofetelClientEp.getConsultaTelefonoValidoCOFETELPt();
            consultaTelefonoValidoCOFETEL.process(lada, telefono, resultado, resultadodesc, valido, modalidad);

            if (resultado.value.equalsIgnoreCase("0")) {

                mod = modalidad.value;
                LogServicios.printlnError(this, "*****Modalidad: " + mod + "*****");
            } else {
                mod = "INVALIDO";
                LogServicios.printlnError(this, "*****Modalidad: INVALIDO*****");
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);

        }

        return mod;
    }
}
