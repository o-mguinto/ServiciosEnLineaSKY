package mx.com.sky.sel.managedbeans.datosgenerales;
import java.io.Serializable;

import mx.com.sky.sel.services.beans.utils.Direccion;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.datosgenerales.ServicioDatosGenerales;
import static mx.com.sky.sel.log.LogPC.println;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;

public class BBDatosGenerales implements Serializable{
    @SuppressWarnings("compatibility:5233587110131062150")
    private static final long serialVersionUID = -5072513748604311864L;
    private Direccion direccion;

    public BBDatosGenerales() {
        println(this, "BBDatosGener ales Creado");
        initDireccion();
    }

    private void initDireccion() {
        ServicioDatosGenerales dcD = new ServicioDatosGenerales();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        direccion = dcD.obtenerDireccionEnvio(suscriptor.getRowId());
        if (direccion == null)
            println(this, "Direccion : null");
    }

    public Direccion getDireccion() {
        return direccion;
    }
    }
