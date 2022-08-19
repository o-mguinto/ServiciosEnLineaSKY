package mx.com.sky.sel.services.apg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky.Canal;
import mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky.ConsultaParillaGuiaSkyResponseEBMType;
import mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky.ConsultaParrillaGuiaSkyRequestEBMType;
import mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky.ConsultaParrillaRequestType;
import mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky.Evento;
import mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky.Eventos;
import mx.com.sky.enterprisemessages.sel.consultaparrillaguiasky.Programacion;
import mx.com.sky.enterpriseobjects.sel.common.v1.EBMHeaderRequestType;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.proxyclients.selabcs.consultaparrillaguiasky.ConsultaParrillaGuiaSky;
import mx.com.sky.sel.proxyclients.selabcs.consultaparrillaguiasky.ConsultaParrillaGuiaSkyEp;
import mx.com.sky.sel.services.beans.utils.CalendarUtils;


public class ServicioAPG {
    
    public ServicioAPG() {
        super();
    }
        public List<mx.com.sky.sel.services.beans.apg.Programacion> consultarGuiaProgramacion(String tipoConsulta,
                                                         String idPaquete, int minutos, Date hasta) {
         try {
               ConsultaParrillaGuiaSkyEp consultaParrillaGuiaSky_ep = new ConsultaParrillaGuiaSkyEp();
               ConsultaParrillaGuiaSky consultaParrillaGuiaSky = consultaParrillaGuiaSky_ep.getConsultaParrillaGuiaSkyPt();
               ConsultaParrillaGuiaSkyRequestEBMType request = new ConsultaParrillaGuiaSkyRequestEBMType();
               ConsultaParillaGuiaSkyResponseEBMType response = null;
               EBMHeaderRequestType header = new EBMHeaderRequestType();
               header.setOperacion("ConsultaParrillaGuiaSky");
               header.setSistemaOrigen("SEL");
               request.setEBMHeaderRequest(header);
               ConsultaParrillaRequestType parrillaRequest = new ConsultaParrillaRequestType();
               parrillaRequest.setFECHAFIN(getDateFin());
               parrillaRequest.setFECHAINICIO(getDate());
               parrillaRequest.setPAQUETEID(idPaquete);
               request.setConsultaParrillaGuiaSkyRequestEBM(parrillaRequest);
               LogPC.println(this, "Se consultara el servicio ConsultaParrillaGuiaSkyABCS para obtener la guia de programacion.");
               LogPC.println(this, "Parametros enviados al servicio:");
             
               LogPC.println(this, "header.setSistemaOrigen: " + header.getSistemaOrigen());
               LogPC.println(this, "header.getOperacion: " + header.getOperacion());
               LogPC.println(this, "parrillaRequest.getFECHAFIN: " + parrillaRequest.getFECHAFIN());
               LogPC.println(this, "parrillaRequest.getFECHAINICIO: " + parrillaRequest.getFECHAINICIO());
               LogPC.println(this, "parrillaRequest.getPAQUETEID: " + parrillaRequest.getPAQUETEID());
             
               response = consultaParrillaGuiaSky.consultarParrillaGuiaSky(request);

               //programaciones
               List<mx.com.sky.sel.services.beans.apg.Programacion> programaciones = new ArrayList<mx.com.sky.sel.services.beans.apg.Programacion>();
               Date desde = CalendarUtils.getDateGMT(new Date(), TimeZone.getDefault());
               //transformar
               desde = CalendarUtils.getDateLocal(desde, TimeZone.getDefault());
               for(Programacion programa : response.getConsultaParrillaGuiaSkyResponseEBM().getProgramaciones().getProgramacion()){
                   Canal canal = programa.getCanal();  
                   
                   //crea el programa
                   mx.com.sky.sel.services.beans.apg.Programacion programaL = new mx.com.sky.sel.services.beans.apg.Programacion(new mx.com.sky.sel.services.beans.apg.Canal(canal.getIdentificador().getValue(),
                                                  canal.getIdMostrado().getValue(),
                                                  canal.getCanalNombre().getValue(),
                                                  canal.getNombre().getValue(),
                                                  canal.getDescripcion().getValue()));
                   
                   
                   Eventos eventos = programa.getEventos();
                   int i = 0;
                   
                   for(Evento e : eventos.getEvento()){
                       Date finicio = e.getFechainicio().getValue().toGregorianCalendar().getTime();
                       Date ffinal = e.getFechaFinal().getValue().toGregorianCalendar().getTime();
                       finicio = CalendarUtils.getDateLocal(finicio, TimeZone.getDefault());
                       ffinal = CalendarUtils.getDateLocal(ffinal, TimeZone.getDefault());
                       
                       
                       
                       mx.com.sky.sel.services.beans.apg.Evento evento =
                           new mx.com.sky.sel.services.beans.apg.Evento(e.getTipo().getValue(),
                                      e.getTitulo().getValue(),
                                      e.getDuracion().getValue().toString(),
                                      e.getSinopsis().getValue(),
                                      e.getContentId().getValue(),
                                      finicio,
                                      ffinal,
                                      e.getDuracion().getValue().intValue(),
                                      minutos,
                                      desde,
                                      hasta,
                                      e.getTransportStreamId().getValue(),
                                       e.getEventId().getValue(),
                                       e.getSeriesId().getValue(),
                                       e.getProgramId().getValue(),
                                       e.getContentProviderId().getValue(),
                                       e.getNetworkId().getValue());
                       i = programaL.putEvento(evento, i);                   
                       i++;
                   }
                   programaciones.add(programaL);    
                  
                   //depura la lista
                   int y=0;
                   List<Integer> indicesRemover = new ArrayList<Integer>();
                   for(mx.com.sky.sel.services.beans.apg.Evento evento : programaL.getEventos()){
                       int interv = evento.calculaIntervalos(); 
                       if(interv==0){
                           indicesRemover.add(y);
                       }
                       y++;
                   }
                   Collections.sort(indicesRemover ,Collections.reverseOrder());
                   for(Integer indice : indicesRemover){
                       programaL.getEventos().remove(indice.intValue());
                   }               
               
               } 
               return programaciones;
           } catch (Exception e) {
               // TODO: Add catch code
               e.printStackTrace();
           }
         return null;
        }
        public List<mx.com.sky.sel.services.beans.apg.Programacion> consultarGuiaProgramacionTablet(String tipoConsulta,
                                                     String idPaquete, int minutos, Date hasta) {
     try {
           ConsultaParrillaGuiaSkyEp consultaParrillaGuiaSky_ep = new ConsultaParrillaGuiaSkyEp();
           ConsultaParrillaGuiaSky consultaParrillaGuiaSky = consultaParrillaGuiaSky_ep.getConsultaParrillaGuiaSkyPt();
           ConsultaParrillaGuiaSkyRequestEBMType request = new ConsultaParrillaGuiaSkyRequestEBMType();
           ConsultaParillaGuiaSkyResponseEBMType response = null;
           EBMHeaderRequestType header = new EBMHeaderRequestType();
           header.setOperacion("ConsultaParrillaGuiaSky");
           header.setSistemaOrigen("SEL");
           request.setEBMHeaderRequest(header);
           ConsultaParrillaRequestType parrillaRequest = new ConsultaParrillaRequestType();
           parrillaRequest.setFECHAFIN(getDateFinTablet());
           parrillaRequest.setFECHAINICIO(getDate());
           parrillaRequest.setPAQUETEID(idPaquete);
           request.setConsultaParrillaGuiaSkyRequestEBM(parrillaRequest);
           response = consultaParrillaGuiaSky.consultarParrillaGuiaSky(request);
            
           //programaciones
           List<mx.com.sky.sel.services.beans.apg.Programacion> programaciones = new ArrayList<mx.com.sky.sel.services.beans.apg.Programacion>();
           Date desde = CalendarUtils.getDateGMT(new Date(), TimeZone.getDefault());
           //transformar
           desde = CalendarUtils.getDateLocal(desde, TimeZone.getDefault());
           
           
         for(Programacion programa : response.getConsultaParrillaGuiaSkyResponseEBM().getProgramaciones().getProgramacion()){
               Canal canal = programa.getCanal();  
               
               //crea el programa
               mx.com.sky.sel.services.beans.apg.Programacion programaL = new mx.com.sky.sel.services.beans.apg.Programacion(new mx.com.sky.sel.services.beans.apg.Canal(canal.getIdentificador().getValue(),
                                              canal.getIdMostrado().getValue(),
                                              canal.getCanalNombre().getValue(),
                                              canal.getNombre().getValue(),
                                              canal.getDescripcion().getValue()));
               
               
               Eventos eventos = programa.getEventos();
               int i = 0;
               
               for(Evento e : eventos.getEvento()){
                    if (i < 4) {
                   Date finicio = e.getFechainicio().getValue().toGregorianCalendar().getTime();
                   Date ffinal = e.getFechaFinal().getValue().toGregorianCalendar().getTime();
                   finicio = CalendarUtils.getDateLocal(finicio, TimeZone.getDefault());
                   ffinal = CalendarUtils.getDateLocal(ffinal, TimeZone.getDefault());
                   
                   
                   
                   mx.com.sky.sel.services.beans.apg.Evento evento =
                       new mx.com.sky.sel.services.beans.apg.Evento(e.getTipo().getValue(),
                                  e.getTitulo().getValue(),
                                  e.getDuracion().getValue().toString(),
                                  e.getSinopsis().getValue(),
                                  e.getContentId().getValue(),
                                  finicio,
                                  ffinal,
                                  e.getDuracion().getValue().intValue(),
                                  minutos,
                                  desde,
                                  hasta,
                        e.getTransportStreamId().getValue(),
                         e.getEventId().getValue(),
                         e.getSeriesId().getValue(),
                         e.getProgramId().getValue(),
                         e.getContentProviderId().getValue(),
                         e.getNetworkId().getValue());
                   i = programaL.putEvento(evento, i);                   
                   i++;
                    }
               }
               programaciones.add(programaL);    
              
               //depura la lista
               int y=0;
               List<Integer> indicesRemover = new ArrayList<Integer>();
               for(mx.com.sky.sel.services.beans.apg.Evento evento : programaL.getEventos()){
                   int interv = evento.calculaIntervalos(); 
                   if(interv==0){
                       indicesRemover.add(y);
                   }
                   y++;
               }
               Collections.sort(indicesRemover ,Collections.reverseOrder());
               for(Integer indice : indicesRemover){
                   programaL.getEventos().remove(indice.intValue());
               }               
           
           } 
           return programaciones;
       } catch (Exception e) {
           // TODO: Add catch code
           e.printStackTrace();
       }
     return null;
    }
    public List<mx.com.sky.sel.services.beans.apg.Programacion> consultarGuiaProgramacionMobile(String tipoConsulta,
                                                     String idPaquete, int minutos, Date hasta) {
     try {
           ConsultaParrillaGuiaSkyEp consultaParrillaGuiaSky_ep = new ConsultaParrillaGuiaSkyEp();
           ConsultaParrillaGuiaSky consultaParrillaGuiaSky = consultaParrillaGuiaSky_ep.getConsultaParrillaGuiaSkyPt();
           ConsultaParrillaGuiaSkyRequestEBMType request = new ConsultaParrillaGuiaSkyRequestEBMType();
           ConsultaParillaGuiaSkyResponseEBMType response = null;
           EBMHeaderRequestType header = new EBMHeaderRequestType();
           header.setOperacion("ConsultaParrillaGuiaSky");
           header.setSistemaOrigen("SEL");
           request.setEBMHeaderRequest(header);
           ConsultaParrillaRequestType parrillaRequest = new ConsultaParrillaRequestType();
           parrillaRequest.setFECHAFIN(getDate());
           parrillaRequest.setFECHAINICIO(getDate());
           parrillaRequest.setPAQUETEID(idPaquete);
           request.setConsultaParrillaGuiaSkyRequestEBM(parrillaRequest);
           response = consultaParrillaGuiaSky.consultarParrillaGuiaSky(request);
            
           //programaciones
           List<mx.com.sky.sel.services.beans.apg.Programacion> programaciones = new ArrayList<mx.com.sky.sel.services.beans.apg.Programacion>();
           Date desde = CalendarUtils.getDateGMT(new Date(), TimeZone.getDefault());
           //transformar
           
           desde = CalendarUtils.getDateLocal(desde, TimeZone.getDefault());
           
           
           for(Programacion programa : response.getConsultaParrillaGuiaSkyResponseEBM().getProgramaciones().getProgramacion()){
               Canal canal = programa.getCanal();  
               
               //crea el programa
               mx.com.sky.sel.services.beans.apg.Programacion programaL = new mx.com.sky.sel.services.beans.apg.Programacion(new mx.com.sky.sel.services.beans.apg.Canal(canal.getIdentificador().getValue(),
                                              canal.getIdMostrado().getValue(),
                                              canal.getCanalNombre().getValue(),
                                              canal.getNombre().getValue(),
                                              canal.getDescripcion().getValue()));
               
               
               Eventos eventos = programa.getEventos();
               int i = 0;
               
               for(Evento e : eventos.getEvento()){
                   Date finicio = e.getFechainicio().getValue().toGregorianCalendar().getTime();
                   Date ffinal = e.getFechaFinal().getValue().toGregorianCalendar().getTime();
                   finicio = CalendarUtils.getDateLocal(finicio, TimeZone.getDefault());
                   ffinal = CalendarUtils.getDateLocal(ffinal, TimeZone.getDefault());
                   
                   
                   
                   mx.com.sky.sel.services.beans.apg.Evento evento =
                       new mx.com.sky.sel.services.beans.apg.Evento(e.getTipo().getValue(),
                                  e.getTitulo().getValue(),
                                  e.getDuracion().getValue().toString(),
                                  e.getSinopsis().getValue(),
                                  e.getContentId().getValue(),
                                  finicio,
                                  ffinal,
                                  e.getDuracion().getValue().intValue(),
                                  minutos,
                                  desde,
                                  hasta,
                   e.getTransportStreamId().getValue(),
                    e.getEventId().getValue(),
                    e.getSeriesId().getValue(),
                    e.getProgramId().getValue(),
                    e.getContentProviderId().getValue(),
                    e.getNetworkId().getValue());
                   i = programaL.putEvento(evento, i);                   
                   i++;
               }
               programaciones.add(programaL);    
              
               //depura la lista
               int y=0;
               List<Integer> indicesRemover = new ArrayList<Integer>();
               for(mx.com.sky.sel.services.beans.apg.Evento evento : programaL.getEventos()){
                   int interv = evento.calculaIntervalos(); 
                   if(interv==0){
                       indicesRemover.add(y);
                   }
                   y++;
               }
               Collections.sort(indicesRemover ,Collections.reverseOrder());
               for(Integer indice : indicesRemover){
                   programaL.getEventos().remove(indice.intValue());
               }               
           
           } 
           return programaciones;
       } catch (Exception e) {
           // TODO: Add catch code
           e.printStackTrace();
       }
     return null;
    }
    public String getDate() {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date1 = new Date();
            return dateFormat.format(date1);
        }
    public String getDateFin() {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date1 = new Date();
            Calendar calendar = Calendar.getInstance();
                  calendar.setTime(date1); 
                  calendar.add(Calendar.HOUR, 5);  
                  Date dos = calendar.getTime();
                  String date = dateFormat.format(dos);
                  return date; 
        }
    public String getDateFinTablet() {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date1 = new Date();
            Calendar calendar = Calendar.getInstance();
                  calendar.setTime(date1); 
                  calendar.add(Calendar.HOUR, 2);  
                  Date dos = calendar.getTime();
                  String date = dateFormat.format(dos);
                  return date; 
        }
}
