package mx.com.sky.sel.services.pagos.tarjetas;
import java.io.Serializable;

import java.util.List;

import mx.com.sky.sel.services.beans.pagos.tarjetas.Bines;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.ConsultaBines;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types.ConsultaBinesIn;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types.ConsultaBinesInCollection;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types.ConsultaBinesInput;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types.ConsultaBinesOut;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types.ConsultaBinesOutCollection;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.types.ConsultaBinesOutput;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultabines.ConsultaBines_Service;


public class ServicioBines implements Serializable {
    @SuppressWarnings("compatibility:9200062732063321825")
    private static final long serialVersionUID = 1607061356072029738L;

    public ServicioBines() {
        super();
    }

    public Bines validarBines(String binesString, String organizationId) {
        ConsultaBines_Service consultaBines_Service;
        ConsultaBines consultaBines = null;
        ConsultaBinesOutput binesOutput = null;
        ConsultaBinesInput payload = null;
        ConsultaBinesInCollection listaTarjetas;
        ConsultaBinesIn consultaBinesIn;
        Bines binesBean = new Bines();
        ConsultaBinesOutCollection response;
        List<ConsultaBinesOut> consultaOut;
        String bines;
        try {

            if (binesString.length() > 6) {
                bines = binesString.substring(0, 6);
            } else {
                bines = binesString;
            }
            consultaBines_Service = new ConsultaBines_Service();
            consultaBines = consultaBines_Service.getConsultaBines();
            listaTarjetas = new ConsultaBinesInCollection();
            payload = new ConsultaBinesInput();
            consultaBinesIn = new ConsultaBinesIn();
            consultaBinesIn.setBINES(bines);
            listaTarjetas.getBines().add(consultaBinesIn);
            payload.setOrgID(organizationId);
            payload.setTarjetas(listaTarjetas);
            binesOutput = consultaBines.process(payload);

            response = binesOutput.getRespuesta();
            consultaOut = response.getConsultaOut();
            if (consultaOut.size() <= 0) {
                binesBean.setTarjetaValida(false);
            } else {
                for (ConsultaBinesOut consultaBinesOut : consultaOut) {
                    binesBean.setTarjetaValida(consultaBinesOut.getRespuesta().equalsIgnoreCase("Y"));
                    binesBean.setCreditoDebito(consultaBinesOut.getCreditoDebito());
                    binesBean.setTipoTarjeta(consultaBinesOut.getTipoTarjeta());
                    binesBean.setClearingHouse(consultaBinesOut.getClearingHouseCD());
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e.getMessage(), e);
            binesBean.setTarjetaValida(false);
        }
        return binesBean;
    }
}
