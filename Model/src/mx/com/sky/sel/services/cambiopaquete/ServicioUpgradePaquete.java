package mx.com.sky.sel.services.cambiopaquete;
import java.io.Serializable;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.btgew.upgradepaquete.BTGEWUpgradePaquete;
import mx.com.sky.sel.proxyclients.btgew.upgradepaquete.BtgewUpgradepaqueteClientEp;
import mx.com.sky.sel.proxyclients.btgew.upgradepaquete.types.BtgewUpgradePaqueteInType;
import mx.com.sky.sel.proxyclients.btgew.upgradepaquete.types.BtgewUpgradePaqueteOutType;

public class ServicioUpgradePaquete implements Serializable{
    private static final long serialVersionUID = 1L;

    public ServicioUpgradePaquete() {
        super();
    }
    public boolean upgradePaquete(String cuentaSKY,String paqueteAnterior,String paqueteNuevo) {
        boolean aplicado=false;
        BTGEWUpgradePaquete upgradePaquete=null;
        BtgewUpgradepaqueteClientEp upgradepaquete_client=null;
        try{
        upgradepaquete_client=new BtgewUpgradepaqueteClientEp();
        upgradePaquete=upgradepaquete_client.getBTGEWUpgradePaquetePt();
        BtgewUpgradePaqueteInType request=new BtgewUpgradePaqueteInType();
        BtgewUpgradePaqueteOutType resultado=new BtgewUpgradePaqueteOutType();
        request.setCuentaSKY(cuentaSKY);
        //request.setAnteriorPaquete(paqueteAnterior);
        request.setNuevoPaquete(paqueteNuevo);
        resultado=upgradePaquete.process(request);
        if (resultado.getRespuestaCode().equalsIgnoreCase("0")){
            aplicado=true;
        } 
        }catch(Exception e){
            LogServicios.printlnError(this, e);
            aplicado=false;
        }
        return aplicado;
    }  
}
