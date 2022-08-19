package mx.com.sky.sel.services.beans.corporativos;
import java.io.Serializable;

import java.sql.Timestamp;


public class Batch implements Serializable {
    @SuppressWarnings("compatibility:29340631718055046")
    private static final long serialVersionUID = -2757362412919485419L;
    private String bpelId;
    private String status;
    private Timestamp fechaCreacion;
    private String fechaCreacionString;
    private String noSolicitud;
    private String llaveOperacion;
    private String descripcion;
    private String duracion;
    private String tipoEvento;
    private String costoEvento;
    private String canalDisplay;
    private String canal;
    private String idEvento;
    private String fechaInicio;
    private String nombreEvento;
    private String nombreCorporativo;
    
    public Batch() {
        super();
    }


    public void setBpelId(String bpelId) {
        this.bpelId = bpelId;
    }

    public String getBpelId() {
        return bpelId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setFechaCreacion(Timestamp fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Timestamp getFechaCreacion() {
        return fechaCreacion;
    }

    public void setNoSolicitud(String noSolicitud) {
        this.noSolicitud = noSolicitud;
    }

    public String getNoSolicitud() {
        return noSolicitud;
    }

    public void setLlaveOperacion(String llaveOperacion) {
        this.llaveOperacion = llaveOperacion;
    }

    public String getLlaveOperacion() {
        return llaveOperacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setCostoEvento(String costoEvento) {
        this.costoEvento = costoEvento;
    }

    public String getCostoEvento() {
        return costoEvento;
    }

    public void setCanalDisplay(String canalDisplay) {
        this.canalDisplay = canalDisplay;
    }

    public String getCanalDisplay() {
        return canalDisplay;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreCorporativo(String nombreCorporativo) {
        this.nombreCorporativo = nombreCorporativo;
    }

    public String getNombreCorporativo() {
        return nombreCorporativo;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setFechaCreacionString(String fechaCreacionString) {
        this.fechaCreacionString = fechaCreacionString;
    }

    public String getFechaCreacionString() {
        return fechaCreacionString;
    }
}
