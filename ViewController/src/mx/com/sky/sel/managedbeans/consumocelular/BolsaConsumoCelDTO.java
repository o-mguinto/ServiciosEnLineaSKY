package mx.com.sky.sel.managedbeans.consumocelular;

import java.io.Serializable;

public class BolsaConsumoCelDTO implements Serializable {
    @SuppressWarnings("compatibility:2146932749173635383")
    private static final long serialVersionUID = 273180572252694020L;

    private String nombreBolsa;
    private String nombreBolsaDescripcion;
    
    private String total;
    private String disponibles;
    private String disponiblesPorcentaje;
    private String consumidos;
    private String vigencia;
    private String oferta;
    private boolean leyendaNoConsumos;
    private String unidad;
    
    public BolsaConsumoCelDTO() {
        super();
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTotal() {
        return total;
    }

    public void setDisponibles(String disponibles) {
        this.disponibles = disponibles;
    }

    public String getDisponibles() {
        return disponibles;
    }

    public void setDisponiblesPorcentaje(String disponiblesPorcentaje) {
        this.disponiblesPorcentaje = disponiblesPorcentaje;
    }

    public String getDisponiblesPorcentaje() {
        return disponiblesPorcentaje;
    }

    public void setConsumidos(String consumidos) {
        this.consumidos = consumidos;
    }

    public String getConsumidos() {
        return consumidos;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setNombreBolsa(String nombreBolsa) {
        this.nombreBolsa = nombreBolsa;
    }

    public String getNombreBolsa() {
        return nombreBolsa;
    }

    public void setNombreBolsaDescripcion(String nombreBolsaDescripcion) {
        this.nombreBolsaDescripcion = nombreBolsaDescripcion;
    }

    public String getNombreBolsaDescripcion() {
        return nombreBolsaDescripcion;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getOferta() {
        return oferta;
    }

    public void setLeyendaNoConsumos(boolean leyendaNoConsumos) {
        this.leyendaNoConsumos = leyendaNoConsumos;
    }

    public boolean isLeyendaNoConsumos() {
        return leyendaNoConsumos;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }
}
