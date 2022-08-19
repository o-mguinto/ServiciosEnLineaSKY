package mx.com.sky.sel.managedbeans.consumocelular;

import java.io.Serializable;

import java.text.Normalizer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.enterpriseservices.soa.consultaconsumodatosebm.ConsultaConsumoDatosResponseEBMType;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.managedbeans.sesion.SesionMB;
import mx.com.sky.sel.services.beans.utils.LineaCelularDTO;
import mx.com.sky.sel.services.dualplay.consulta.ServicioDualPlay;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;
import mx.com.sky.soasky.BolsasTYPE;

public class BBConsumoCelular implements Serializable {
    @SuppressWarnings("compatibility:-7027642579833259946")
    private static final long serialVersionUID = 2853560444090973609L;

    private boolean consultaConsumoCelularValida;
    private String lineaCelularSeleccionada;
    private List<SelectItem> lineasCelularesComboBox;
    private List<ConsumoCelularDTO> consumosCelularesConsultados;
    private Map<String, List<BolsaConsumoCelDTO>> consumosCelularAMostrar;
    
    List<BolsaConsumoCelDTO> paquetesDeOferta;
    private String ofertaSeleccionada;
    private boolean mostrarPaisesIncluidos;
    private String nombreArchivoPaises;

    //Tipos de datos a mostrar
    private final static String TIPO_DATO_MB = "MB";
    private final static String TIPO_DATO_SMS = "SMS";
    private final static String TIPO_DATO_MIN = "MIN";
    
    //Nombres de bolsas del paquete principal (PP) para DATOS
    private final static String BOLSA_PP_CAUTIVO ="PORTAL CAUTIVO";
    private final static String BOLSA_PP_CAYUDA ="PORTAL CENTRO DE AYUDA";
    private final static String NOMBRE_BOLSA_PP_RI = "ROAMING INTERNACIONAL";
    private final static String NOMBRE_BOLSA_PP_LD = "LARGA DISTANCIA";

    public BBConsumoCelular() {
        super();
        LogPC.println(this, "***************IN BBConsumoCelular CONSTRUCTOR**************************");
        crearComboBoxLineasCelulares();
        this.consultaConsumoCelularValida = false;
        this.consumosCelularesConsultados = new ArrayList<ConsumoCelularDTO>();
        this.paquetesDeOferta = new ArrayList<BolsaConsumoCelDTO>();
        ofertaSeleccionada =null;
    }
    
    private void crearComboBoxLineasCelulares() {
        SesionMB sesion = null;
        sesion = (SesionMB)JSFUtils.getBean("sesion");
        
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            LogPC.println(this, "--------Lineas celulares del suscriptor");
            lineasCelularesComboBox = new ArrayList<SelectItem>();
            for(LineaCelularDTO lnCel : sesion.getSuscriptor().getLineasCelulares()) {
                LogPC.println(this, "-----numCelular: " + lnCel.getNumCelular());
                lineasCelularesComboBox.add(new SelectItem(lnCel.getNumCelular(),lnCel.getNumCelular()));
            }
        }
    }
    
    private double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }

    public void actualizarConsumoLineaCel(ValueChangeEvent valueChangeEvent) {
        this.lineaCelularSeleccionada = (String)valueChangeEvent.getNewValue();
        this.obtenerConsumoLineaCelular(this.lineaCelularSeleccionada);
    }
    
    private void obtenerConsumoLineaCelular(String lineaCelular) {
        boolean consultarWSConsumoCelular = true;
        ConsumoCelularDTO consumoCelularWSConsultado = null;
        
        this.consultaConsumoCelularValida = false;
        this.paquetesDeOferta = new ArrayList<BolsaConsumoCelDTO>();//se limpian los paquetes
        //Buscamos si ya se realizo la consulta de consumo para la linea proporcionada
        if( this.consumosCelularesConsultados != null && !this.consumosCelularesConsultados.isEmpty() ) {
            for(ConsumoCelularDTO consumoCelular : this.consumosCelularesConsultados ) {
                if( consumoCelular.getNumCelular().equalsIgnoreCase(lineaCelular) ) {
                    //Se encontro consumo ya consultado para la linea, se utilizara este para no volver a llamar al WS
                    LogPC.println(this, "-------Se encontro consumo ya consultado para la linea, se utilizara este para no volver a llamar al WS-------");
                    this.consumosCelularAMostrar = consumoCelular.getBolsasConsumo();
                    consultarWSConsumoCelular = false;
                    this.consultaConsumoCelularValida = true;
                    break;
                }
            }
        }
        
        if( consultarWSConsumoCelular ) {
            consumoCelularWSConsultado = this.consultarConsumoCelularWS(lineaCelular);
            if( consumoCelularWSConsultado != null ) {
                this.consumosCelularAMostrar = consumoCelularWSConsultado.getBolsasConsumo();
                this.consultaConsumoCelularValida = true;
                this.consumosCelularesConsultados.add(consumoCelularWSConsultado);
            }
        }
        
        if( this.consumosCelularAMostrar != null && !this.consumosCelularAMostrar.isEmpty() ) {
            LogPC.println(this, "**********consumosCelularAMostrar**********");
            LogPC.println(this, "Ofertas: "+this.consumosCelularAMostrar.values().size());
            for(List<BolsaConsumoCelDTO> bolsasConsumo : this.consumosCelularAMostrar.values()) {
                LogPC.println(this, "Productos: "+bolsasConsumo.size());
                for(BolsaConsumoCelDTO bolsaConsumo : bolsasConsumo){
                    LogPC.println(this, "Oferta: " + bolsaConsumo.getOferta());
                    LogPC.println(this, "NombreBolsa: " + bolsaConsumo.getNombreBolsa());
                }
            }
        }
    }
    
    private ConsumoCelularDTO consultarConsumoCelularWS(String numCelular) {
        LogPC.println(this, "In consultarConsumoCelularWS...");
        LineaCelularDTO lineCelularDtoSeleccionada = null;
        ConsumoCelularDTO consumoCelularWSConsultado = null;
        ConsultaConsumoDatosResponseEBMType respuestaWS = null;
        BolsaConsumoCelDTO bolsaConsumoCel = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        
        //Se consuta la informacion de la linea celular asociada al numero proporcionado
        if( sesion.getSuscriptor().getLineasCelulares() != null && !sesion.getSuscriptor().getLineasCelulares().isEmpty() ) {
            for(LineaCelularDTO lnCelDto : sesion.getSuscriptor().getLineasCelulares()) {
                if( lnCelDto.getNumCelular().equalsIgnoreCase(numCelular) ) {
                    lineCelularDtoSeleccionada = lnCelDto;
                }
            }
        }
        LogPC.println(this, "lineCelularDtoSeleccionada: " + lineCelularDtoSeleccionada);
        
        //Llamada al WS de consulta de consumos de linea celular
        ServicioDualPlay servicioDual = new ServicioDualPlay();
        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CONSUMO_DATOS, "Consulta consumo de celular");
        try {
            if( lineCelularDtoSeleccionada != null ) {
                LogPC.println(this, "lineCelularDtoSeleccionada.getNumCelular: " + lineCelularDtoSeleccionada.getNumCelular());
                LogPC.println(this, "lineCelularDtoSeleccionada.getExternalOffer: " + lineCelularDtoSeleccionada.getExternalOffer());
                respuestaWS = servicioDual.consultaConsumoDatos(sesion.getUsuario().getCuentaSKY(),
                                                                numCelular,
                                                                lineCelularDtoSeleccionada.getExternalOffer());
            } else {
                respuestaWS = servicioDual.consultaConsumoDatos(sesion.getUsuario().getCuentaSKY(),
                                                                numCelular,
                                                                "CEL");
            }
        } catch (ServicioException e) {
            LogPC.println(this, "Exception en la llamada al WS de consumo de datos:");
            e.printStackTrace();
        }
        
        if( respuestaWS != null && respuestaWS.getEBMHeaderResponse() != null &&
            respuestaWS.getEBMHeaderResponse().getErrorNegocio() != null &&
            respuestaWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError() != null &&
            respuestaWS.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") &&
            respuestaWS.getSCINTASConsultaConsumoDatosSalida() != null && 
            respuestaWS.getSCINTASConsultaConsumoDatosSalida().getListaBolsas() != null &&
            respuestaWS.getSCINTASConsultaConsumoDatosSalida().getListaBolsas().getBolsas() != null ) {
            
            List<BolsasTYPE> listaBolsas = respuestaWS.getSCINTASConsultaConsumoDatosSalida().getListaBolsas().getBolsas();
            LogPC.println(this, "Se encontraron " + listaBolsas.size() + " bolsas de consumo en la respuesta del WS");
            consumoCelularWSConsultado = new ConsumoCelularDTO();
            consumoCelularWSConsultado.setNumCelular(numCelular);
            for(BolsasTYPE bolsasTYPE : listaBolsas) {
                if ( ( bolsasTYPE.getNombreBolsa() != null && !bolsasTYPE.getNombreBolsa().isEmpty() )
                    && !( bolsasTYPE.getNombreBolsa().toUpperCase().equalsIgnoreCase(BOLSA_PP_CAUTIVO) ||
                         bolsasTYPE.getNombreBolsa().toUpperCase().equalsIgnoreCase(BOLSA_PP_CAYUDA)) )
                {
                    bolsaConsumoCel = new BolsaConsumoCelDTO();
                    bolsaConsumoCel.setTotal(bolsasTYPE.getTotalDatos());
                    bolsaConsumoCel.setDisponibles(bolsasTYPE.getDatosDisponibles());
                    bolsaConsumoCel.setVigencia(bolsasTYPE.getFechaExpiracion());
                    bolsaConsumoCel.setNombreBolsa(bolsasTYPE.getNombreBolsa());
                    bolsaConsumoCel.setOferta(bolsasTYPE.getOferta());
                    //para establecer la leyenda de mb no consumidos
                    bolsaConsumoCel.setLeyendaNoConsumos(bolsasTYPE.getNombreBolsa().contains("EUA y Canadá"));
                    if( bolsaConsumoCel.getTotal() != null && !bolsaConsumoCel.getTotal().isEmpty() &&
                        bolsaConsumoCel.getDisponibles() != null && !bolsaConsumoCel.getDisponibles().isEmpty() ) {
                        bolsaConsumoCel.setNombreBolsaDescripcion(bolsasTYPE.getNombreBolsa());
                        this.datosCalcularConsumoPorcentajeDisponible(bolsaConsumoCel);
                        
                        if( bolsaConsumoCel.getNombreBolsa().contains("Datos") ) {
                            bolsaConsumoCel.setUnidad(TIPO_DATO_MB);//unidad de la bolsa MB,SMS, MIN
                            this.datosCalcularConsumoPorcentajeDisponible(bolsaConsumoCel);
                        } else if( bolsaConsumoCel.getNombreBolsa().contains("Minutos") ) {
                            bolsaConsumoCel.setUnidad(TIPO_DATO_MIN);//unidad de la bolsa MB,SMS, MIN
                            this.smsMinutosCalcularConsumoPorcentajeDisponible(bolsaConsumoCel, TIPO_DATO_MIN);
                        } else if( bolsaConsumoCel.getNombreBolsa().contains("SMS") ) {
                            bolsaConsumoCel.setUnidad(TIPO_DATO_SMS);//unidad de la bolsa MB,SMS, MIN
                            this.smsMinutosCalcularConsumoPorcentajeDisponible(bolsaConsumoCel, TIPO_DATO_SMS);
                        }
                        
                        //Se obtiene la vigencia de los datos de la linea celular
                        if( bolsaConsumoCel.getVigencia() != null && !bolsaConsumoCel.getVigencia().isEmpty() ) {
                            bolsaConsumoCel.setVigencia(bolsaConsumoCel.getVigencia().split(" ")[0]);
                        }
                       
                        if(!consumoCelularWSConsultado.getBolsasConsumo().containsKey(bolsaConsumoCel.getOferta())){
                            consumoCelularWSConsultado.getBolsasConsumo().put(bolsaConsumoCel.getOferta(), new ArrayList<BolsaConsumoCelDTO>());
                        }
                        consumoCelularWSConsultado.getBolsasConsumo().get(bolsaConsumoCel.getOferta()).add(bolsaConsumoCel);
                    }
                }
            }
        }
        
        return consumoCelularWSConsultado;
    }
    /*metodo que se utiliza para obtene los paquetes dependiendo de la oferta enviada*/
    private List<BolsaConsumoCelDTO> getPaquetesPorOferta(String oferta){
        LogPC.println(this, "Obteniendo paquetes de la oferta "+oferta);
        Map<String, List<BolsaConsumoCelDTO>> paqCelularAMostrar=consumosCelularAMostrar;
        List<BolsaConsumoCelDTO> paquetesList = paqCelularAMostrar.get(oferta);
        LogPC.println(this, "Paquetes obtenidos: "+paquetesList.size());
        return paquetesList;
    }
    //Metodo para Calcular los datos consumidos y el porcentaje de datos disponibles para la
    //bolsa de consumo proporcionada
    private void datosCalcularConsumoPorcentajeDisponible(BolsaConsumoCelDTO bolsaConsumo) {
        double totalD;
        double consumidosD;
        double disponiblesD;
        double disponiblesPorcentajeD;
        
        totalD = Double.parseDouble(bolsaConsumo.getTotal().split(" ")[0]);
        disponiblesD = Double.parseDouble(bolsaConsumo.getDisponibles().split(" ")[0]);
        consumidosD = totalD - disponiblesD;
        disponiblesPorcentajeD = (disponiblesD *100)/totalD;
        bolsaConsumo.setConsumidos(Double.toString(redondearDecimales(consumidosD, 2)).concat(" " + TIPO_DATO_MB));
        //bolsaConsumo.setDisponiblesPorcentaje(Double.toString(disponiblesPorcentajeD).concat("%"));
        bolsaConsumo.setDisponiblesPorcentaje(Double.toString(disponiblesPorcentajeD));
    }
    //Metodo para Calcular los SMSs o Minutos consumidos y el porcentaje de SMSs o Minutos disponibles para la
    //bolsa de consumo proporcionada
    private void smsMinutosCalcularConsumoPorcentajeDisponible(BolsaConsumoCelDTO bolsaConsumo, String tipoDato) {
        int totalI;
        int consumidosI;
        int disponiblesI;
        double disponiblesPorcentajeD;
        
        totalI = Integer.parseInt(bolsaConsumo.getTotal().split(" ")[0]);
        disponiblesI = Integer.parseInt(bolsaConsumo.getDisponibles().split(" ")[0]);
        consumidosI = totalI - disponiblesI;
        disponiblesPorcentajeD = (disponiblesI *100)/totalI;
        bolsaConsumo.setConsumidos(Integer.toString(consumidosI).concat(" " + tipoDato));
        bolsaConsumo.setDisponiblesPorcentaje(Double.toString(disponiblesPorcentajeD).concat("%"));
    } 
    
    //Custom Accessors
    public boolean isLineasCelDisponibles() {
        boolean lineasCelDisponibles = false;
        
        if( lineasCelularesComboBox != null && !lineasCelularesComboBox.isEmpty() )
            lineasCelDisponibles = true;
        
        return lineasCelDisponibles;
    }
    
    public int getNumLineasCelular() {
        int numLineasCelular = 0;
        if( this.lineasCelularesComboBox != null ) {
            numLineasCelular = this.lineasCelularesComboBox.size();
        }
        return numLineasCelular;
    }
    
    //Accessors
    public boolean isConsultaConsumoCelularValida() {
        return consultaConsumoCelularValida;
    }

    public void setLineaCelularSeleccionada(String lineaCelularSeleccionada) {
        this.lineaCelularSeleccionada = lineaCelularSeleccionada;
    }

    public String getLineaCelularSeleccionada() {
        return lineaCelularSeleccionada;
    }

    public List<SelectItem> getLineasCelulares() {
        return lineasCelularesComboBox;
    }

    public Map<String, List<BolsaConsumoCelDTO>> getConsumosCelularAMostrar() {
        return consumosCelularAMostrar;
    }

    public void setPaquetesDeOferta(List<BolsaConsumoCelDTO> paquetesDeOferta) {
        this.paquetesDeOferta = paquetesDeOferta;
    }

    public List<BolsaConsumoCelDTO> getPaquetesDeOferta() {
        return paquetesDeOferta;
    }
    
    /*método que se utiliza para obtener los paquetes de la oferta dependiento del valor de la oferta seleccionada*/
    public String obtenerPaquetes() {
        // Add event code here...
        if(this.ofertaSeleccionada != null){
            paquetesDeOferta = getPaquetesPorOferta(this.ofertaSeleccionada);
            if(this.ofertaSeleccionada.toUpperCase().contains("ROAMING INTERNACIONAL") || this.ofertaSeleccionada.toUpperCase().contains("LARGA DISTANCIA")){
                this.mostrarPaisesIncluidos = true;
                this.nombreArchivoPaises = generarNombreArchivoPaises(this.ofertaSeleccionada);
            }else{
                this.mostrarPaisesIncluidos = false;
                this.nombreArchivoPaises = "";
            }
        }
        return null;
    }
    
    public String generarNombreArchivoPaises(String oferta){
        return Normalizer.normalize(oferta, Normalizer.Form.NFD).replaceAll("[^A-Za-z0-9]", "").toUpperCase();
    }

    public void setOfertaSeleccionada(String ofertaSeleccionada) {
        this.ofertaSeleccionada = ofertaSeleccionada;
    }

    public String getOfertaSeleccionada() {
        return ofertaSeleccionada;
    }

    public void setMostrarPaisesIncluidos(boolean mostrarPaisesIncluidos) {
        this.mostrarPaisesIncluidos = mostrarPaisesIncluidos;
    }

    public boolean isMostrarPaisesIncluidos() {
        return mostrarPaisesIncluidos;
    }

    public void setNombreArchivoPaises(String nombreArchivoPaises) {
        this.nombreArchivoPaises = nombreArchivoPaises;
    }

    public String getNombreArchivoPaises() {
        return nombreArchivoPaises;
    }
}
