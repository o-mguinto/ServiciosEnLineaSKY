package mx.com.sky.sel.utils.bam;

import mx.com.sky.sel.services.bam.operaciones.insert.ServicioOperacionesBAM;
import mx.com.sky.sel.services.beans.bam.OperacionBAM;
import mx.com.sky.sel.log.LogServicios;

public class ThreadOperacionBAM extends Thread {

    private OperacionBAM operacionBAM;

    public ThreadOperacionBAM(String string) {
        super(string);
    }

    public ThreadOperacionBAM() {
        super();
    }

    public void run() {
        ServicioOperacionesBAM servicioBAM = new ServicioOperacionesBAM();
        LogServicios.println(this, "REGISTRO ServicioOperacionesBAM  " + operacionBAM);
        servicioBAM.insertOperacion(operacionBAM);
    }


    public void setOperacionBAM(OperacionBAM operacionBAM) {
        this.operacionBAM = operacionBAM;
    }

    public OperacionBAM getOperacionBAM() {
        return operacionBAM;
    }
}
