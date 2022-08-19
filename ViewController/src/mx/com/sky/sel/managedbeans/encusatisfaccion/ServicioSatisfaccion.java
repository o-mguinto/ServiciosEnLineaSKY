package mx.com.sky.sel.managedbeans.encusatisfaccion;

import java.io.Serializable;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.AltaRespuestaEncuestaSatisfaccion;
import mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.AltaRespuestaEncuestaSatisfaccion_Service;
import mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.types.AltaRespuestaEncuestaSatisfaccionProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.types.AltaRespuestaEncuestaSatisfaccionProcessResponse;
import mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.types.ResultadoEncuestaSatisfaccion;
import mx.com.sky.sel.proxyclients.pagweb.altarespencusatis.types.ResultadoEncuestaSatisfaccionCollection;

public class ServicioSatisfaccion implements Serializable {
    @SuppressWarnings("compatibility:2865351472929694751")
    private static final long serialVersionUID = 2090418915895491541L;

    public ServicioSatisfaccion() {
        super();
    }

    public void agregarEncuesta(List<Satisfaccion> listaSatisfaccion) {
        AltaRespuestaEncuestaSatisfaccion_Service altaRespuestaEncuestaSatisfaccion_Service;
        AltaRespuestaEncuestaSatisfaccion altaRespuestaEncuestaSatisfaccion = null;
        AltaRespuestaEncuestaSatisfaccionProcessRequest payload;
        AltaRespuestaEncuestaSatisfaccionProcessResponse response = null;
        ResultadoEncuestaSatisfaccionCollection valueEncuesta;
        ResultadoEncuestaSatisfaccion res = null;

        try {
            altaRespuestaEncuestaSatisfaccion_Service = new AltaRespuestaEncuestaSatisfaccion_Service();
            altaRespuestaEncuestaSatisfaccion = altaRespuestaEncuestaSatisfaccion_Service.getAltaRespuestaEncuestaSatisfaccion();
            payload = new AltaRespuestaEncuestaSatisfaccionProcessRequest();
            valueEncuesta = new ResultadoEncuestaSatisfaccionCollection();

            List<ResultadoEncuestaSatisfaccion> listRES = new ArrayList<ResultadoEncuestaSatisfaccion>();

            for (Satisfaccion satisfaccion : listaSatisfaccion) {
                res = convert(satisfaccion);
                listRES.add(res);
            }
            valueEncuesta.getResultado().addAll(listRES);
            payload.setListaResultadoEncuestaSatisfaccion(valueEncuesta);
            response = altaRespuestaEncuestaSatisfaccion.process(payload);
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
    }

    private ResultadoEncuestaSatisfaccion convert(Satisfaccion satisfaccion) {
        ResultadoEncuestaSatisfaccion res = new ResultadoEncuestaSatisfaccion();
        res.setComentario(satisfaccion.getComentario());
        res.setCuentaSKY(satisfaccion.getCuentaSKY());
        res.setFolio(satisfaccion.getFolio());
        res.setNoPregunta(new BigInteger("" + satisfaccion.getNoPregunta().intValue()));
        res.setPais(satisfaccion.getPais());
        res.setPaquete(satisfaccion.getPaquete());
        res.setPregunta(satisfaccion.getPregunta());
        res.setRespuesta(satisfaccion.getRespuesta());
        res.setUserID(satisfaccion.getUserID());
        return res;
    }
}
