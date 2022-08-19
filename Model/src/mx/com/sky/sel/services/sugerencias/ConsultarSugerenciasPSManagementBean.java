package mx.com.sky.sel.services.sugerencias;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.OpinionSugerencias;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.OpinionSugerencias_Service;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.types.OpinionSugerenciasProcessRequest;
import mx.com.sky.sel.proxyclients.pagweb.opinionsugerencias.types.OpinionSugerenciasProcessResponse;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.beans.solicitudservicio.Sugerencia;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioOtros;
import mx.com.sky.sel.utils.JavaUtils;

@Stateless(name = "ConsultarSugerenciasPSManagement",
           mappedName = "SEL-ConsultarSugerenciasPSManagement")
public class ConsultarSugerenciasPSManagementBean implements Serializable, ConsultarSugerenciasPSManagement,
                                                             ConsultarSugerenciasPSManagementLocal {
    @SuppressWarnings("compatibility:-8592226703237048893")
    private static final long serialVersionUID = 5168742287680122792L;
    @Resource
    SessionContext sessionContext;

    public ConsultarSugerenciasPSManagementBean() {
    }
    
    public String agregarSugerencias(String uid, String sugerencia) {
        String respuesta = null;
        ServicioSugerencias sq = new ServicioSugerencias();
        String numeroSS = null;
        try {
            numeroSS = crearSolicitud(sugerencia);
            sq.agregarSugerencia(uid, sugerencia, numeroSS);
            
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
        }
        return respuesta;
    }

    public List<Sugerencia> consultarSugerencias(String uid) {
        ServicioSugerencias sq = new ServicioSugerencias();
        return sq.consultarSugerencias(uid);
    }

    private String crearSolicitud(String comentarios) {
        ServicioOtros so = new ServicioOtros();
        SolicitudServicioBean solicitudServicio = null;
        String numeroSS = null;
        try {            
            //solicitudServicio = SolicitudServicioUtils.convert(solicitudServicio, "Sugerencia: " + comentarios);
            numeroSS = so.crearSolicitud(solicitudServicio);
            
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            LogPC.printlnError(e);
        }
        return numeroSS;
    }

    private Sugerencia convert(OpinionSugerenciasProcessResponse.Sugerencias sugenrecias) {
        Sugerencia sugerencia = new Sugerencia();
        sugerencia.setFechaRegistro(JavaUtils.asTimestamp(sugenrecias.getREGISTRATIONDATE()));
        sugerencia.setSugerencia(sugenrecias.getSUGGESTION());
        sugerencia.setNumero_ss(sugenrecias.getNUMBERSS());
        return sugerencia;
    }    
}
