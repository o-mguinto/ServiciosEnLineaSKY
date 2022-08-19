package mx.com.sky.sel.managedbeans.consumointernet;

import java.io.Serializable;

import java.util.List;

import mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm.ConsultaConsumoDatosResponseEBMType;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.dualplay.consulta.ServicioDualPlay;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.soasky.BolsasTYPE;

public class BBConsumoDatos implements Serializable {
    private static final long serialVersionUID = 4381548046192789869L;
    private String totalDatos;
    private String datosDisponibles;
    private String datosDisponiblesPorcentaje;
    private String datosConsumidos;
    private String vigenteDatos;
    private boolean consultaValida;
    
    private String totalDatosComprados;
    private String datosDisponiblesComprados;
    private String datosDisponiblesCompradosPorcentaje;
    private String datosConsumidosComprados;
    private String vigenteDatosComprados;
    private boolean datosAdicionales;
    public BBConsumoDatos() {
        super();
        consultaDatos();
    }
    private void consultaDatos() {
        try {
            ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
            datosAdicionales = false;
            double totalDatosTemp= 0;
            double totalDatosTempCompra= 0;
            double datosDisponiblesTemp=0;
            double datosDisponiblesTempCompra=0;
            double datosConsumidosTemp=0;
            double datosConsumidosTempCompra=0;
            ServicioDualPlay servicioDual = new ServicioDualPlay();
            ConsultaConsumoDatosResponseEBMType respuesta= null;
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONSUMO_DATOS    );
            respuesta = servicioDual.consultaConsumoDatos(sesion.getUsuario().getCuentaSKY(),sesion.getSuscriptor().getMsisdnInternet(), sesion.getSuscriptor().getExternalOffer());
            //Prueba JAM
            //respuesta = servicioDual.consultaConsumoDatos("501222311190","1000200439");
            if (respuesta.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                consultaValida=true;
                List<BolsasTYPE> listaBolsas = respuesta.getSCINTASConsultaConsumoDatosSalida().getListaBolsas().getBolsas();
                for (BolsasTYPE bolsasTYPE : listaBolsas) {
                    if (bolsasTYPE.getNombreBolsa().equalsIgnoreCase("BOLSA PRINCIPAL")) {
                        totalDatos = bolsasTYPE.getTotalDatos();
                        datosDisponibles = bolsasTYPE.getDatosDisponibles();
                        String[] partVigenteDatos = bolsasTYPE.getFechaExpiracion().split(" ");
                        vigenteDatos = partVigenteDatos[0];
                        String[] partTotal = totalDatos.split(" ");
                        String[] partDisponibles = datosDisponibles.split(" ");
                        totalDatosTemp = Double.parseDouble(partTotal[0]); 
                        datosDisponiblesTemp = Double.parseDouble(partDisponibles[0]);
                        datosConsumidosTemp = totalDatosTemp - datosDisponiblesTemp;
                        //datosConsumidos = Double.toString(datosConsumidosTemp);
                        datosConsumidos = Double.toString(redondearDecimales(datosConsumidosTemp, 2));
                        datosConsumidos = datosConsumidos.concat(" GB");
                        double porConsumidosTemp = (datosDisponiblesTemp *100)/totalDatosTemp;
                        datosDisponiblesPorcentaje = Double.toString(porConsumidosTemp);
                    }
                    if ( bolsasTYPE.getNombreBolsa().equalsIgnoreCase("BOLSA ADICIONAL") &&
                         bolsasTYPE.getTotalDatos() != null && !bolsasTYPE.getTotalDatos().isEmpty() &&
                         bolsasTYPE.getDatosDisponibles() != null && !bolsasTYPE.getDatosDisponibles().isEmpty() ) {
                        datosAdicionales = true;
                        totalDatosComprados = bolsasTYPE.getTotalDatos();
                        datosDisponiblesComprados = bolsasTYPE.getDatosDisponibles();
                        
                        String[] partVigenteDatosComprados = bolsasTYPE.getFechaExpiracion().split(" ");
                        vigenteDatosComprados = partVigenteDatosComprados[0];
                        String[] partTotalCompra = totalDatosComprados.split(" ");
                        String[] partDisponiblesCompra = datosDisponiblesComprados.split(" ");
                        totalDatosTempCompra = Double.parseDouble(partTotalCompra[0]);
                        datosDisponiblesTempCompra = Double.parseDouble(partDisponiblesCompra[0]);
                        datosConsumidosTempCompra = totalDatosTempCompra - datosDisponiblesTempCompra;
                        //datosConsumidosComprados = Double.toString(datosConsumidosTempCompra);
                        datosConsumidosComprados = Double.toString(redondearDecimales(datosConsumidosTempCompra, 2));
                        datosConsumidosComprados = datosConsumidosComprados.concat(" GB");
                        double porConsumidosTempCompra = (datosDisponiblesTempCompra *100)/totalDatosTempCompra;
                        datosDisponiblesCompradosPorcentaje = Double.toString(porConsumidosTempCompra);
                        
                    }
                }
            }else{
                consultaValida=false;
            }
            
        } catch (ServicioException e) {
        }
    }
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
            double parteEntera, resultado;
            resultado = valorInicial;
            parteEntera = Math.floor(resultado);
            resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
            resultado=Math.round(resultado);
            resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
            return resultado;
        }
    public boolean isBloqueoMovilidadInternet(){
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        boolean respuesta = false;
        if (sesion.getSuscriptor().getStatusServicioIntenet() == null) {
            respuesta = false;
        }else if (sesion.getSuscriptor().getStatusServicioIntenet().equalsIgnoreCase("SUSPEND_MOVILITY")) {
            respuesta = true;
        }else{
            respuesta = false;
        }
        
        //DUMY
        //respuesta = true;        
        //DUMMY
        
        return respuesta;
    }
    public void setTotalDatos(String totalDatos) {
        this.totalDatos = totalDatos;
    }

    public String getTotalDatos() {
        return totalDatos;
    }

    public void setDatosDisponibles(String datosDisponibles) {
        this.datosDisponibles = datosDisponibles;
    }

    public String getDatosDisponibles() {
        return datosDisponibles;
    }

    public void setDatosConsumidos(String datosConsumidos) {
        this.datosConsumidos = datosConsumidos;
    }

    public String getDatosConsumidos() {
        return datosConsumidos;
    }

    public void setVigenteDatos(String vigenteDatos) {
        this.vigenteDatos = vigenteDatos;
    }

    public String getVigenteDatos() {
        return vigenteDatos;
    }

    public void setConsultaValida(boolean consultaValida) {
        this.consultaValida = consultaValida;
    }

    public boolean isConsultaValida() {
        //DUMMY
        //consultaValida = true;    
        //DUMY
        return consultaValida;
    }

    public void setTotalDatosComprados(String totalDatosComprados) {
        this.totalDatosComprados = totalDatosComprados;
    }

    public String getTotalDatosComprados() {
        return totalDatosComprados;
    }

    public void setDatosDisponiblesComprados(String datosDisponiblesComprados) {
        this.datosDisponiblesComprados = datosDisponiblesComprados;
    }

    public String getDatosDisponiblesComprados() {
        return datosDisponiblesComprados;
    }

    public void setDatosConsumidosComprados(String datosConsumidosComprados) {
        this.datosConsumidosComprados = datosConsumidosComprados;
    }

    public String getDatosConsumidosComprados() {
        return datosConsumidosComprados;
    }

    public void setDatosAdicionales(boolean datosAdicionales) {
        this.datosAdicionales = datosAdicionales;
    }

    public boolean isDatosAdicionales() {
        //DUMMY
        //datosAdicionales = true;
        //DUMMY
        return datosAdicionales;
    }

    public void setVigenteDatosComprados(String vigenteDatosComprados) {
        this.vigenteDatosComprados = vigenteDatosComprados;
    }

    public String getVigenteDatosComprados() {
        return vigenteDatosComprados;
    }

    public void setDatosDisponiblesPorcentaje(String datosDisponiblesPorcentaje) {
        this.datosDisponiblesPorcentaje = datosDisponiblesPorcentaje;
    }

    public String getDatosDisponiblesPorcentaje() {
        return datosDisponiblesPorcentaje;
    }

    public void setDatosDisponiblesCompradosPorcentaje(String datosDisponiblesCompradosPorcentaje) {
        this.datosDisponiblesCompradosPorcentaje = datosDisponiblesCompradosPorcentaje;
    }

    public String getDatosDisponiblesCompradosPorcentaje() {
        return datosDisponiblesCompradosPorcentaje;
    }
}
