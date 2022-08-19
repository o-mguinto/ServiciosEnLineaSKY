package mx.com.sky.sel.beans.utils;
import java.io.Serializable;

import mx.com.sky.sel.services.beans.saldos.Saldo;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.services.saldo.ServicioSaldo;
import mx.com.sky.sel.services.vetv.ServicioVeTV;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;


public class ParametrosPago implements Serializable {
    @SuppressWarnings("compatibility:-2712760427918947707")
    private static final long serialVersionUID = -3743450761534854918L;
    private String sigPagina;
    private String comentariosPago;
    private String monto;
    private Double montoD;
    //Para VeTV
    private Double saldoEnCuenta = 0.0;
    private String saldoEnCuentaString = "0.0";
    private Double montoRecarga = 0.0;

    public ParametrosPago() {
    }


    public void setTipoPago(String tipoPago) {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String ctaSKY = sesion.getSuscriptor().getCuentaSKY();
        ServicioVeTV sp = new ServicioVeTV();
        LogPC.println(this, "setTipoPago(" + tipoPago + ")");
        if (!tipoPago.equalsIgnoreCase("PAGO")) {
            if(tipoPago.equalsIgnoreCase("NO_CLASIFICADA")){
                this.montoD = 0.0;
            }else{
                if(tipoPago.equalsIgnoreCase("CONTROL_REMOTO")){
                    this.montoD = sp.consultarPrecio(tipoPago);
                }else{
                    this.montoD = sp.consultarPrecio(ctaSKY, tipoPago);
                }
            }
            this.monto = JavaUtils.asMoneda(this.montoD);
            montoRecarga = montoD.doubleValue();
        } else {
            this.montoD = 0.0;
            this.monto = JavaUtils.asMoneda(this.montoD);
            montoRecarga = montoD.doubleValue();
        }
            if (tipoPago.equalsIgnoreCase("CONTROL_REMOTO")) {
                comentariosPago = "Compra de Control Remoto VeTV";
                sigPagina = "termina_pago";
            } else if (tipoPago.equalsIgnoreCase("CANAL_CARTA")) {
                comentariosPago = "Contrataci\u00F3n de Canal a la Carta";
                sigPagina = "contrata_canal";
            }else if (tipoPago.equalsIgnoreCase("CANAL_CARTA_HD")) {
                comentariosPago = "Contrataci\u00F3n de Canal a la Carta HD";
                sigPagina = "contrata_canal";
            }else if (sesion.isUserVeTV() || sesion.isUserMini()) {
                    System.out.println("++++ SI es usuario vetv o MINI");
                    comentariosPago = "Recarga VeTV";
                    sigPagina = "";
                    saldoEnCuenta = 0.0;
                    calcularMonto(sesion.getSistema());
                }else/*
            if (tipoPago.equalsIgnoreCase("RECARGA") ||
                       tipoPago.equalsIgnoreCase("RECARGA_2_EQUIPOS")) {
                comentariosPago = "Recarga VeTV";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("REC_VETV_DUAL_5") ||
                       tipoPago.equalsIgnoreCase("REC_VETV_2_DUAL_5")) {
                comentariosPago = "Recarga VeTV";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("REC_VETV_DUAL_10") ||
                       tipoPago.equalsIgnoreCase("REC_VETV_2_DUAL_10")) {
                comentariosPago = "Recarga VeTV";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("RECARGA_VETVPLUS") ||
                       tipoPago.equalsIgnoreCase("RECARGA_2_VETVPLUS")) {
                comentariosPago = "Recarga VeTV Plus";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            
            }else if (tipoPago.equalsIgnoreCase("REC_VETVPLUS_DUAL_5") ||
                       tipoPago.equalsIgnoreCase("REC_VETVPLUS_2_DUAL_5")) {
                comentariosPago = "Recarga VeTV";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("REC_VETVPLUS_DUAL_10") ||
                       tipoPago.equalsIgnoreCase("REC_VETVPLUS_2_DUAL_10")) {
                comentariosPago = "Recarga VeTV";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("RECARGA_VETVHD") ||
                       tipoPago.equalsIgnoreCase("RECARGA_2_VETVHD")) {
                comentariosPago = "Recarga VeTV HD";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("RECARGA_VETVPLUSHD") ||
                       tipoPago.equalsIgnoreCase("RECARGA_2_VETVPLUSHD")) {
                comentariosPago = "Recarga VeTV Plus HD";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            } else if (tipoPago.equalsIgnoreCase("REC_VETVPLUSHD_DUAL_5") ||
                       tipoPago.equalsIgnoreCase("REC_VETVPLUSHD_2_DUAL_5")) {
                comentariosPago = "Recarga VeTV";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("REC_VETVPLUSHD_DUAL_10") ||
                       tipoPago.equalsIgnoreCase("REC_VETVPLUSHD_2_DUAL_10")) {
                comentariosPago = "Recarga VeTV";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else if (tipoPago.equalsIgnoreCase("RECARGA_VETVMINI") ||
                       tipoPago.equalsIgnoreCase("RECARGA_2_VETVMINI")) {
                comentariosPago = "Recarga VeTV Mini";
                sigPagina = "";
                saldoEnCuenta = 0.0;
                calcularMonto(sesion.getSistema());
            }else*/ {
                comentariosPago = "";
                sigPagina = "";
                monto = "";
            }
    }

    public void calcularMonto(String sistema) {
        ServicioSaldo ss = new ServicioSaldo();
        Double montoTmp = 0.0;
        Double saldoRealVeTV = 0.0;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String ctaSKY = sesion.getSuscriptor().getCuentaSKY();
        LogPC.println(this, "calcularMonto(" + sistema + ")");
        if (sistema.equalsIgnoreCase("KENAN")) {
            saldoRealVeTV = ss.obtenerSaldoRealVeTV(ctaSKY);
            saldoEnCuenta = saldoRealVeTV * (-1.00);
        } else {
            // Para Hi Jump ya se debio haber hecho el set del saldoEnCuenta
            Saldo saldo = ss.consultaSaldo(ctaSKY, sistema);
            LogPC.println(this, " saldo HIJUMP " + saldo);
            
                saldoEnCuenta = new Double(saldo.getSaldoTotal());
                saldoRealVeTV = saldoEnCuenta * 1.00;
                saldoEnCuenta *= (-1.00);
            
            LogPC.println(this, " saldoEnCuenta HIJUMP " + saldoEnCuenta);
        }
        LogServicios.println(this,
                             "saldoEnCuenta [" + (saldoEnCuenta >= montoD) +
                             "] >= montoD" + saldoEnCuenta + ">=" + montoD);
        
            saldoEnCuentaString = JavaUtils.asMoneda(saldoRealVeTV);
            if (saldoEnCuenta >= montoD) {
                montoTmp = 0.0;
            } else if (saldoEnCuenta < montoD) {
                montoTmp = montoD - saldoEnCuenta;
            }
            this.monto = JavaUtils.asMoneda(montoTmp);
        
    }
    
    public void actualizarMontoRecarga (String cuenta, String tipoRecarga){
            ServicioVeTV servVeTV = new ServicioVeTV();
            this.montoRecarga = servVeTV.consultarPrecio(cuenta, tipoRecarga);
        }   
    public void calcularRecargas(int numrecargas) {
            LogPC.println(this, "calcularRecargas(" + numrecargas + ")");
            double montoTmp = montoRecarga * numrecargas;
            LogPC.println(this,montoTmp + " = " + montoRecarga + " * " + numrecargas +" :: montoTmp = montoRecarga * numrecargas");
            montoTmp = montoTmp - saldoEnCuenta;
            LogPC.println(this, "montoTmp - saldoEnCuenta[" + saldoEnCuenta + "]");
            LogPC.println(this, "montoTmp " + montoTmp);
            if(saldoEnCuenta >= montoRecarga){
                if (montoTmp >= (-montoRecarga * numrecargas)) {
                    montoTmp = montoRecarga * numrecargas;
                    //si el costo de las recargas es mayor al saldo a favor, se le resta el saldo
                    if(montoTmp > saldoEnCuenta){
                        montoTmp = montoTmp-saldoEnCuenta;
                    }
                    LogPC.println(this,"montoTmp >= (-montoRecarga*numrecargas) " +montoTmp);
                } else if (montoTmp <= (-montoRecarga * numrecargas)) {
                    montoTmp = montoRecarga * numrecargas;
                    LogPC.println(this,"montoTmp <= (-montoRecarga * numrecargas) " +montoTmp);
                }
            }
            this.montoD = montoTmp;
            this.monto = JavaUtils.asMoneda(montoD);
        }


    public void setSigPagina(String sigPagina) {
        this.sigPagina = sigPagina;
    }

    public String getSigPagina() {
        return sigPagina;
    }

    public void setComentariosPago(String comentariosPago) {
        this.comentariosPago = comentariosPago;
    }

    public String getComentariosPago() {
        return comentariosPago;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }


    public Double getMontoD() {
        return montoD;
    }

    public void setSaldoEnCuenta(Double saldoEnCuenta) {
        this.saldoEnCuenta = saldoEnCuenta;
    }

    public Double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public Double getMontoRecarga() {
        return montoRecarga;
    }

    public void setSaldoEnCuentaString(String saldoEnCuentaString) {
        this.saldoEnCuentaString = saldoEnCuentaString;
    }

    public String getSaldoEnCuentaString() {
        return saldoEnCuentaString;
    }
}
