package mx.com.sky.sel.dc.saldo;

import java.io.Serializable;

import mx.com.sky.sel.beans.utils.ParametrosPago;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.saldos.Saldo;
import mx.com.sky.sel.services.saldo.ServicioSaldo;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;


public class DCSaldo implements Serializable {
    @SuppressWarnings("compatibility:-6847489667386117534")
    private static final long serialVersionUID = 732279419431930878L;

    public DCSaldo() {
        LogPC.println(this, "DCSaldo Creado");
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_SALDO);
    }

    public Saldo consultaSaldo() {
        LogPC.println(this, "DCSaldo consultaSaldo ");
        Double saldoD = 0.0;
        Saldo saldo = null;
        ServicioSaldo ss = null;
        ss = new ServicioSaldo();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String accountid = sesion.getSuscriptor().getCuentaSKY();
        String sistema = sesion.getSistema();
        LogPC.println(this, "Consulta de SALDO "+accountid);
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_SALDO);
        if (sesion.isUserVeTV()) {
            saldo = new Saldo();
            ParametrosPago parametrosPago = (ParametrosPago)JSFUtils.getBean("ParametrosPago");
            parametrosPago.setTipoPago(sesion.getCodigoRecargaVeTV());
            //hijump
            if (sistema.equalsIgnoreCase("HIJUMP")) {
                String montoString = "";
                try {
                    montoString = ss.consultaSaldo(accountid, sistema).getSaldoTotal();
                    saldoD = new Double(montoString);
                } catch (Exception e) {
                    System.out.println("e.getMessage; "+e.getMessage());
                    saldoD = 0.0;
                }
            } else {
                saldoD = ss.obtenerSaldoRealVeTV(accountid);
            }
            saldo.setSaldoTotal(saldoD.toString());
        } else {
            //SI ES TYM KENAN O HIJUMP
            saldo = ss.consultaSaldo(accountid, sistema);
            if (saldo == null) {
                LogPC.printlnWarn(this, "saldo null");
                saldo = new Saldo();
            }
        }
        return saldo;
    }
}
