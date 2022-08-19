package mx.com.sky.sel.services.sugerencias;

import java.io.Serializable;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.OpinionSugerencias;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.OpinionSugerencias_Service;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.types.OpinionSugerenciasProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.types.OpinionSugerenciasProcessResponse;
import mx.com.sky.sel.services.beans.solicitudservicio.Sugerencia;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.JavaUtils;
import java.util.List;
import java.util.ArrayList;

public class ServicioSugerencias implements Serializable {
    private static final long serialVersionUID = 1L;

    public ServicioSugerencias() {
        super();
    }

    public String agregarSugerencia(String uid, String sugerencia, String numeroSS) throws ServicioException {
        OpinionSugerencias_Service opinion_Sugerencias_Service;
        OpinionSugerencias opinion_Sugerencias = null;
        OpinionSugerenciasProcessRequest payload;
        OpinionSugerenciasProcessResponse resultado = null;
        opinion_Sugerencias_Service = new OpinionSugerencias_Service();
        opinion_Sugerencias = opinion_Sugerencias_Service.getOpinionSugerencias();
        try {


            payload = new OpinionSugerenciasProcessRequest();
            payload.setSugerencias(sugerencia);
            payload.setUserID(uid);
            payload.setTipoConsulta("1");
            payload.setNumeroSS(numeroSS);
            resultado = opinion_Sugerencias.process(payload);
            if (resultado == null) {
                throw new ServicioException("Ocurri\u00F3 un error al procesar la solicitud");
            } else if (resultado.getRespuesta() != null && !resultado.getRespuesta().equalsIgnoreCase("0")) {
                throw new ServicioException(resultado.getRespuestadesc());
            }

        } catch (ServicioException e) {
            LogServicios.printlnError(e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(e);
            throw new ServicioException("Ocurri\u00F3 un error al procesar la solicitud");
        }
        return null;
    }

    public List<Sugerencia> consultarSugerencias(String uid) {
        List<Sugerencia> sugerencias = new ArrayList<Sugerencia>();
        Sugerencia sugenrencia = null;
        OpinionSugerencias_Service opinion_Sugerencias_Service;
        OpinionSugerencias opinion_Sugerencias = null;
        OpinionSugerenciasProcessRequest payload;
        OpinionSugerenciasProcessResponse resultado = null;


        try {
            opinion_Sugerencias_Service = new OpinionSugerencias_Service();
            opinion_Sugerencias = opinion_Sugerencias_Service.getOpinionSugerencias();

            payload = new OpinionSugerenciasProcessRequest();
            payload.setUserID(uid);

            payload.setTipoConsulta("2");
            resultado = opinion_Sugerencias.process(payload);
            if (resultado != null) {
                for (OpinionSugerenciasProcessResponse.Sugerencias object : resultado.getSugerencias()) {
                    sugenrencia = convert(object);
                    sugerencias.add(sugenrencia);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return sugerencias;
    }


    private Sugerencia convert(OpinionSugerenciasProcessResponse.Sugerencias sugenrecias) {
        Sugerencia sugerencia = new Sugerencia();
        sugerencia.setFechaRegistro(JavaUtils.asTimestamp(sugenrecias.getREGISTRATIONDATE()));
        sugerencia.setSugerencia(sugenrecias.getSUGGESTION());
        sugerencia.setNumero_ss(sugenrecias.getNUMBERSS());
        return sugerencia;
    }
}
