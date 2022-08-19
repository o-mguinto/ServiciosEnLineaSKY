package mx.com.sky.sel.services.beans.apg;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


public class Programacion implements Serializable {
    @SuppressWarnings("compatibility:2020950021996642366")
    private static final long serialVersionUID = 3367938343189968169L;

    public Programacion() {
        super();
    }
    Canal canal;
    List<Evento> eventos = new ArrayList<Evento>();
    public int getSize(){
        return this.eventos.size();
    }

    public Programacion(Canal canal) {
        super();
        this.canal = canal;
        this.eventos = new ArrayList<Evento>();
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public int putEvento(Evento evento,int indice) {
        //la fecha fin del evento es la fecha inicio del evento siguiente
        /*if(indice > 0){
            Evento eventoAntes = this.eventos.get(indice-1);
            eventoAntes.setFechaFin(evento.getFechaInicio());      
        }*/
        this.eventos.add(indice, evento);
        return indice;
    }
}
