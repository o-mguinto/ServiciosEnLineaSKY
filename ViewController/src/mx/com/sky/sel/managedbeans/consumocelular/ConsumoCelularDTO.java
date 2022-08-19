package mx.com.sky.sel.managedbeans.consumocelular;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class ConsumoCelularDTO implements Serializable {
    @SuppressWarnings("compatibility:2436880470045399608")
    private static final long serialVersionUID = 5955680566270945557L;

    private String numCelular;
    private Map<String, List<BolsaConsumoCelDTO>> bolsasConsumo;
    
    //consumo de datos de la linea
//    private String totalDatosCelular;
//    private String datosDisponiblesCelularPorcentaje;
//    private String datosDisponiblesCelular;
//    private String datosConsumidosCelular;
//    private String vigenciaDatosCelular;
    
    //consumo de sms de la linea
//    private String totalSmsCelular;
//    private String smsDisponiblesCelularPorcentaje;
//    private String smsDisponiblesCelular;
//    private String smsConsumidosCelular;
//    private String vigenciaSmsCelular;
    
    //consumo de minutos de la linea
//    private String totalMinutosCelular;
//    private String minutosDisponiblesCelularPorcentaje;
//    private String minutosDisponiblesCelular;
//    private String minutosConsumidosCelular;
//    private String vigenciaMinutosCelular;


    public ConsumoCelularDTO() {
        super();
        this.bolsasConsumo = new HashMap<String, List<BolsaConsumoCelDTO>>();
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setBolsasConsumo(Map<String, List<BolsaConsumoCelDTO>> bolsasConsumo) {
        this.bolsasConsumo = bolsasConsumo;
    }

    public Map<String, List<BolsaConsumoCelDTO>> getBolsasConsumo() {
        return bolsasConsumo;
    }
}
