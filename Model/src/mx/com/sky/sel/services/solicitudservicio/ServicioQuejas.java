package mx.com.sky.sel.services.solicitudservicio;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.quejas.Quejas;
import mx.com.sky.sel.proxyclients.pagweb.quejas.Quejas_Service;
import mx.com.sky.sel.proxyclients.pagweb.quejas.types.QuejasProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.quejas.types.QuejasProcessResponse;
import mx.com.sky.sel.services.beans.solicitudservicio.Queja;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.JavaUtils;

public class ServicioQuejas implements Serializable {
    private static final long serialVersionUID = 1L;

    public ServicioQuejas() {
        super();
    }


    public String agregarQueja(String uid, String queja, String numeroSS) throws ServicioException {
        Quejas_Service quejas_Service;
        Quejas quejas = null;
        QuejasProcessRequest payload;
        QuejasProcessResponse resultado = null;

        try {
            quejas_Service = new Quejas_Service();
            quejas = quejas_Service.getQuejas();

            payload = new QuejasProcessRequest();
            payload.setQuejas(queja);
            payload.setUserID(uid);
            payload.setTipoConsulta("1");
            payload.setNumeroSS(numeroSS);
            resultado = quejas.process(payload);

            if (resultado == null) {
                throw new ServicioException("Ocurri\u00F3 un error al procesar la solicitud");
            } else if (!resultado.getRespuesta().equalsIgnoreCase("0")) {
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

    public List<Queja> consultarQuejas(String uid) throws ServicioException {
        List<Queja> quejas = new ArrayList<Queja>();
        Queja queja = null;
        Quejas_Service quejas_Service;
        Quejas quejasWS = null;
        QuejasProcessRequest payload;
        QuejasProcessResponse resultado = null;


        try {
            quejas_Service = new Quejas_Service();
            quejasWS = quejas_Service.getQuejas();
            payload = new QuejasProcessRequest();
            payload.setUserID(uid);
            payload.setTipoConsulta("2");
            resultado = quejasWS.process(payload);
            if (resultado != null) {
                for (QuejasProcessResponse.Quejas object : resultado.getQuejas()) {
                    queja = convert(object);
                    quejas.add(queja);
                }
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            throw new ServicioException("Ocurri\u00F3 un error al procesar la solicitud");
        }
        return quejas;
    }


    private Queja convert(QuejasProcessResponse.Quejas quejas) {
        Queja queja = new Queja();
        queja.setFechaRegistro(JavaUtils.asTimestamp(quejas.getFecha()));
        queja.setQueja(quejas.getQueja());
        queja.setNumero_ss(quejas.getNumeroSs());
        return queja;
    }
}
