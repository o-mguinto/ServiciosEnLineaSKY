package mx.com.sky.sel.services.equipos;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaequiposhd.ConsultaEquiposHD;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaequiposhd.ConsultaequiposhdClientEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaequiposhd.types.ConsultaEquiposHDIN;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaequiposhd.types.ConsultaEquiposHDOUT;
import mx.com.sky.sel.services.beans.equipos.Equipo;

public class ServicioEquipos implements Serializable {
    @SuppressWarnings("compatibility:3566990146258045906")
    private static final long serialVersionUID = -187803581616039807L;

    public ServicioEquipos() {
        super();
    }

    public List<Equipo> obtenerEquipos(String rowID) {

        List<Equipo> equipos = new ArrayList<Equipo>();
        Equipo equipo = null;
        ConsultaequiposhdClientEp consultaequiposhd_client_ep = null;
        ConsultaEquiposHD consultaEquiposHD = null;
        ConsultaEquiposHDIN payload;
        ConsultaEquiposHDOUT response = null;
        int numeroEquipoTradiciona = 0;

        try {

            consultaequiposhd_client_ep = new ConsultaequiposhdClientEp();
            consultaEquiposHD = consultaequiposhd_client_ep.getConsultaEquiposHDPt();
            payload = new ConsultaEquiposHDIN();
            payload.setRowID(rowID);
            response = consultaEquiposHD.process(payload);

            if (response != null) {
                for (ConsultaEquiposHDOUT.Equipos equipoWS : response.getEquipos()) {
                    equipo = convert(equipoWS);
                    if (equipo.getEquipo().equalsIgnoreCase("Equipo")) {
                        if (numeroEquipoTradiciona == 0) {
                            equipo.setCosto(4000);
                        } else {
                            equipo.setCosto(2000);
                        }
                        numeroEquipoTradiciona++;
                    } else {
                        equipo.setCosto(6000);
                    }

                    equipos.add(equipo);
                }
            }

        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }

        return equipos;
    }

    private Equipo convert(ConsultaEquiposHDOUT.Equipos equipoWS) {
        Equipo e = new Equipo();
        e.setEquipo(equipoWS.getTipoEquipo());
        return e;
    }
}
