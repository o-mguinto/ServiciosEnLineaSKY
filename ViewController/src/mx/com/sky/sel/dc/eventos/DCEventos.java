package mx.com.sky.sel.dc.eventos;
import java.io.Serializable;

import java.sql.Timestamp;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import mx.com.sky.sel.services.beans.eventos.Evento;
import mx.com.sky.sel.services.beans.eventos.Horario;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.eventos.ServicioPagosEventosPSManagementBean;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

public class DCEventos implements Serializable {
    @SuppressWarnings("compatibility:-1693883698626394980")
    private static final long serialVersionUID = 7847529632348364055L;

    public DCEventos() {
        LogPC.println(this, "DCEventos Creado");
    }

    public List<Evento> obtenerPPEventos(String tipoPPE) {
        List<Evento> eventos = null;
        ServicioPagosEventosPSManagementBean spe = null;
        SesionMB sesion = null;

        sesion = (SesionMB)JSFUtils.getBean("sesion");
        String pais = sesion.getSuscriptor().getPais();
        String banderaHD = sesion.getSuscriptor().isEquipoHD() ? "Y" : "N";
        String paquete = sesion.getSuscriptor().getPaquete();
        String tipoCuenta="";
        spe = new ServicioPagosEventosPSManagementBean();
        //tipoPPE 1 = PREMIERE :: 2=EVENT:: 3=ADULTOS
        if (tipoPPE.equalsIgnoreCase("1")) {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PPV_PREMIERE);
        } else if (tipoPPE.equalsIgnoreCase("2")) {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PPV_ESPECIAL);
        } else if (tipoPPE.equalsIgnoreCase("3")) {
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PPV_ADULTOS);
        }
        if (sesion.isCuentaNewEra()) {
                tipoCuenta ="%N%";
        }else if (sesion.isCuentaVETVHD() || sesion.isCuentaVETVPLUSHD()) {
                tipoCuenta ="%N%";
        }else{
            tipoCuenta = "%T%";
        }
        eventos = spe.obtenerPPEventos(tipoPPE, pais, banderaHD, paquete,tipoCuenta);
        if (eventos == null) {
            LogPC.printlnWarn(this, "eventos null");
            eventos = new ArrayList<Evento>();
        }
        return eventos;
    }

    public List<Evento> obtenerPagoPorEventosContratados(String tarjetaInteligente, String cuentaSKY) {
        return getPagoPorEventosContratados( tarjetaInteligente,  cuentaSKY);
    }
    public List<Evento> getPagoPorEventosContratados(String tarjetaInteligente, String cuentaSKY) {
        List<Evento> eventos = null;
        ServicioPagosEventosPSManagementBean spe = null;

        spe = new ServicioPagosEventosPSManagementBean();
        SesionMB sesion = (SesionMB)JSFUtils.getBean("sesion");

        LogPC.println(this, "sistema: " + sesion.getSistema());
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_PPV_CONTRATADOS, tarjetaInteligente);

        eventos = spe.getPagoPorEventosContratados(tarjetaInteligente, cuentaSKY, sesion.getSistema());

        if (eventos == null) {
            LogPC.printlnWarn(this, "eventos null");
            eventos = new ArrayList<Evento>();
        }
        return eventos;
    }

    public List<Horario> obtenerHorariosPPE(String canal, String tituloEvento, String diferenciaGMT, String pais, String tipoEvento) {
        LogPC.println(this, "JAM In obtenerHorariosPPE con los siguientes parametros:");
        LogPC.println(this, "canal: " + canal);
        LogPC.println(this, "tituloEvento: " + tituloEvento);
        LogPC.println(this, "diferenciaGMT: " + diferenciaGMT);
        LogPC.println(this, "pais: " + pais);
        LogPC.println(this, "tipoEvento: " + tipoEvento);
        
        List<Horario> horarios = null;
        ServicioPagosEventosPSManagementBean spe = null;
        spe = new ServicioPagosEventosPSManagementBean();
        horarios = spe.obtenerHorariosPPE(canal, tituloEvento, diferenciaGMT, pais, tipoEvento);
        if (horarios == null) {
            LogPC.printlnWarn(this, "horarios null");
            horarios = new ArrayList<Horario>();
        } else {
            LogPC.println(this, "Horarios recuperados desde el servicio:");
            for(Horario hor : horarios) {
                LogPC.println(this, "hor fecha inicio: " + hor.getFechaInicio());
                LogPC.println(this, "hor fecha fin: " + hor.getFechaFin());
                LogPC.println(this, "hor: " + hor);
            }
        }
        return horarios;
    }
}
