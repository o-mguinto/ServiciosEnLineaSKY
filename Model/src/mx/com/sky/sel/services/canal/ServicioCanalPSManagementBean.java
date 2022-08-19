package mx.com.sky.sel.services.canal;

import java.io.Serializable;
import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.Holder;

import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.ConsultaCanalesALaCarta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.ConsultaCanalesALaCarta_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.CanalALaCarta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ConsultaCanalesALaCartaProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultacanalescarta.types.ConsultaCanalesALaCartaProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.ConsultaMundialActivo;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.ConsultaMundialActivoEp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultamundialactivo.types.CodigoError;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.ConsultaPrecioCanal;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultapreciocanal.ConsultapreciocanalClientEp;
import mx.com.sky.sel.proxyclients.selabcs.consultarserviciosadicionales.ConsultarServiciosAdicionales;
import mx.com.sky.sel.proxyclients.selabcs.consultarserviciosadicionales.ConsultarServiciosAdicionalesEp;
import mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesRequestEBMType;
import mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesResponseEBMType;
import mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesEBOType;
import mx.com.sky.sel.proxyclients.selabcs.gestionarsscomprarservicios.GestionarSSComprarServicios;
import mx.com.sky.sel.proxyclients.selabcs.gestionarsscomprarservicios.GestionarSSComprarServiciosEp;
import mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesResponseEBMType;
import mx.com.sky.enterprisemessages.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesRequestType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosRequestEBMType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.ListOfInstancesType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.ListOfProductsType;
import mx.com.sky.enterprisemessages.soa.gestionarsscomprarservicios.ServiceInfoRequestType;
import mx.com.sky.enterpriseobjects.sel.consultarserviciosadicionales.ConsultarServiciosAdicionalesEBOType;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosRequestType;
import mx.com.sky.enterpriseobjects.soa.gestionarsscomprarservicios.GestionarSSComprarServiciosResponseType;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.services.beans.canal.CanalCarta;
import mx.com.sky.sel.services.beans.canal.PrecioCanal;
import mx.com.sky.sel.services.beans.solicitudservicio.DetalleSolicitudServicio;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.services.solicitudservicio.ServicioSolicituServicio;


@Stateless(name = "ServicioCanalPSManagement", mappedName = "SEL-ServicioCanalPSManagement")
public class ServicioCanalPSManagementBean implements Serializable, ServicioCanalPSManagement, ServicioCanalPSManagementLocal {
    @SuppressWarnings("compatibility:2242120005540027392")
    private static final long serialVersionUID = 5662552339453586526L;
    @Resource
    SessionContext sessionContext;

    public ServicioCanalPSManagementBean() {
        LogServicios.printlnError(this, "inicializando DC - CAC");
    }
    public boolean consultaMundialActivo(String numeroCuenta, String tipoMercado){
        boolean respuesta = true;
            Holder<CodigoError> codigoError =  new Holder<CodigoError>();
            Holder<String> mundialActivo = new Holder<String>();
            ConsultaMundialActivoEp consultaMundialActivo_ep;
            consultaMundialActivo_ep = new ConsultaMundialActivoEp();
            ConsultaMundialActivo consultaMundialActivo = consultaMundialActivo_ep.getConsultaMundialActivoPt();
            consultaMundialActivo.consultaMundialActivo(numeroCuenta,tipoMercado,codigoError,mundialActivo);
        if (codigoError.value.getCodigo().getValue().equalsIgnoreCase("0")) {
            if (mundialActivo.value.equalsIgnoreCase("N")) {
                respuesta = false;
            }else{
                respuesta = true;
            }     
        }else{
            respuesta = false;
        }
            return respuesta;
        }

        /**
         *
         * @param paquete FUN,UNIVERSE,HBO etc
         * @param tipoCuenta Normal,etc
         * @return
         */
        public List<CanalCarta> obtenerCanalCarta(String paquete, String tipoCuenta, boolean isHD,String categoria) {
            List<CanalCarta> canales = null;
            CanalCarta canal = null;
            ConsultaCanalesALaCarta_Service consultaCanalesALaCarta_Service = null;
            ConsultaCanalesALaCarta consultaCanalesALaCarta = null;
            ConsultaCanalesALaCartaProcessRequest payload = null;
            ConsultaCanalesALaCartaProcessResponse resultado = null;
            //Agregar c\u00F3digo para consulta del PROXY

            canales = new ArrayList<CanalCarta>();

            try {
                consultaCanalesALaCarta_Service = new ConsultaCanalesALaCarta_Service();
                consultaCanalesALaCarta = consultaCanalesALaCarta_Service.getConsultaCanalesALaCarta();
                payload = new ConsultaCanalesALaCartaProcessRequest();
                payload.setPaquete(paquete);
                payload.setTipoCuenta(tipoCuenta);
                payload.setCategoria(categoria);
                resultado = consultaCanalesALaCarta.process(payload);
                if (resultado != null) {
                    for (CanalALaCarta canalCarta : resultado.getListaCanalALaCarta().getCanalALaCarta()) {
                        canal = convertCanalCarta(canalCarta);
                        canal.setHabilitado(true);
                        if (isHD) {
                            canales.add(canal);
                        } else if (canal.getDefinicion().equalsIgnoreCase("SD")) {
                            canales.add(canal);
                        }
                    }
                }

            } catch (Exception e) {
                LogServicios.printlnError(this, e.getMessage(), e);
            }


            return canales;
        }
        
        public List<CanalCarta> obtenerServiciosStreaming(String cuenta, String assetNumber, String secondAssetNumber){
            List<CanalCarta> canales = new ArrayList<CanalCarta>();
            ConsultarServiciosAdicionalesEp consultarServiciosAdicionalesEp = new ConsultarServiciosAdicionalesEp();
            ConsultarServiciosAdicionales consultarServiciosAdicionales = consultarServiciosAdicionalesEp.getConsultarServiciosAdicionalesPt();
            ConsultarServiciosAdicionalesRequestEBMType payload = new ConsultarServiciosAdicionalesRequestEBMType();
            ConsultarServiciosAdicionalesRequestType request = new ConsultarServiciosAdicionalesRequestType();
            request.setAssetNumber(assetNumber);
            request.setCategoria("Service OTT");
            request.setCuenta(cuenta);
            request.setPais("Sky Mexico");
            request.setProceso("Servicio Adicional");
            request.setSecondAssetNumber(secondAssetNumber);
            payload.setConsultarServiciosAdicionalesRequest(request);
            try{
                ConsultarServiciosAdicionalesResponseEBMType response = consultarServiciosAdicionales.consultarserviciosadicionales(payload);
                if(response != null){
                    for(ConsultarServiciosAdicionalesEBOType servicio  : response.getConsultarServiciosAdicionales().getConsultarServiciosAdicionales()){
                        System.out.println(servicio.getNombreProductoSEL());
                        CanalCarta canalAux = servicioToCanalCarta(servicio);
                        canalAux.setHabilitado(true);
                        canales.add(canalAux);
                    }
                }else{
                    System.out.println("Response null");
                }
            }catch(Exception e){
                LogServicios.printlnError(this, e.getMessage(), e);
            }
            return canales;
        }
        
        private CanalCarta convertCanalCarta(CanalALaCarta canalCarta) {
            CanalCarta canal = new CanalCarta();
            canal.setImagen(canalCarta.getImagen());
            canal.setId(canalCarta.getNombre());
            canal.setNombre(canalCarta.getNombre());
            canal.setNombre_display(canalCarta.getNombreDisplay());
            canal.setPrecio_display("");
            canal.setSinopsis(canalCarta.getSinopsis());
            canal.setCanal(canalCarta.getCanal());
            canal.setCanal_display(canalCarta.getCanalDisplay());
            canal.setDefinicion(canalCarta.getDefinicion());
            canal.setCategoria(canalCarta.getCategoria());
            return canal;
        }
        
        private CanalCarta servicioToCanalCarta(ConsultarServiciosAdicionalesEBOType servicio) {
            CanalCarta canal = new CanalCarta();
            canal.setImagen(servicio.getImagen());
            canal.setId(servicio.getNombreProductoCRM());
            canal.setNombre(servicio.getNombreProductoSEL());
            canal.setPrecio_display(servicio.getCosto());
            canal.setSinopsis(servicio.getDescripcion());
            canal.setCategoria("STREAMING");
            return canal;
        }
        
        public String contratarServicioStreaming(String cuenta, String producto, String assetNumber, String secondAssetNumber){
            String response = "";
            GestionarSSComprarServiciosEp gestionarSSComprarServiciosEp = new GestionarSSComprarServiciosEp();
            GestionarSSComprarServicios gestionarSSComprarServicios = gestionarSSComprarServiciosEp.getGestionarSSComprarServiciosPt();
            GestionarSSComprarServiciosRequestType payload = new GestionarSSComprarServiciosRequestType();
            GestionarSSComprarServiciosRequestEBMType request = new GestionarSSComprarServiciosRequestEBMType();
            ServiceInfoRequestType serviceInfoRequest = new ServiceInfoRequestType();
            ListOfInstancesType listOfInstances = new ListOfInstancesType();
            ListOfInstancesType.Instance instance = new ListOfInstancesType.Instance();
            ListOfProductsType listOfProducts = new ListOfProductsType();
            ListOfProductsType.Product product = new ListOfProductsType.Product();
            product.setAction("Add");
            product.setName(producto);
            listOfProducts.getProduct().add(product);
            instance.setListOfProducts(listOfProducts);
            instance.setAssetNumber(assetNumber);
            instance.setSecondAssetNumber(secondAssetNumber);
            listOfInstances.getInstance().add(instance);
            serviceInfoRequest.setListOfInstances(listOfInstances);
            serviceInfoRequest.setCategoria("Service OTT");
            serviceInfoRequest.setCuenta(cuenta);
            serviceInfoRequest.setProceso("Servicio Adicional");
            serviceInfoRequest.setGrupo("Venta a suscriptor");
            serviceInfoRequest.setTipo("Solicitud de Aprovisionamiento");
            serviceInfoRequest.setOrigen("Web");
            request.setServiceInfoRequest(serviceInfoRequest);
            payload.setGestionarSSComprarServiciosRequestEBM(request);
            //try{
                GestionarSSComprarServiciosResponseType serviceResponse = gestionarSSComprarServicios.gestionarSSComprarServicios(payload);
                if(serviceResponse == null){
                    LogServicios.printlnError(this, "GestionarSSComprarServicios reponse null");
                    System.out.println("GestionarSSComprarServicios reponse null");
                    return response;
                }
                //System.out.println("Header 1 ManagementBean " + serviceResponse.getEBMHeaderResponse().getErrorNegocio().getEstado());
                System.out.println("Header 2 ManagementBean " + serviceResponse.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getEstado());
                System.out.println("SS ManagementBean " + serviceResponse.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS());
                if(serviceResponse.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getEstado().equalsIgnoreCase("OK")){
                    response = serviceResponse.getGestionarSSComprarServiciosResponseEBM().getServiceInfoResponse().getNumeroSS();
                    System.out.println("GestionarSSComprarServicios SS " + response);
                }else{
                    System.out.println("GestionarSSComprarServicios KO " + serviceResponse.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getCodigoError());
                    LogServicios.printlnError(this, "GestionarSSComprarServicios KO " + serviceResponse.getGestionarSSComprarServiciosResponseEBM().getEBMHeaderResponse().getErrorNegocio().getCodigoError());
                }
                
            /*}catch(Exception e){
                System.out.println("Excepcion GestionarSSComprarServicios " + e.getMessage());
                LogServicios.printlnError(this, e.getMessage(), e);
            }*/
            System.out.println("Response ManagementBean " + response);
            return response;
        }


        public List<DetalleSolicitudServicio> obtenerSolicitudServicio(String rowID, boolean isStreaming) {
            List<DetalleSolicitudServicio> solicitudes;
            ServicioSolicituServicio sss = new ServicioSolicituServicio();
            if(isStreaming){
                solicitudes = sss.consultarSolicitudServicios(rowID, "Venta a suscriptor", "Solicitud de Aprovisionamiento");
            }else{
                solicitudes = sss.consultarSolicitudServicios(rowID, "Web", "Canales a la Carta");
            }
            return solicitudes;                                                                                                                                                                                                                        
        }

        public String crearSolicitud(SolicitudServicioBean solicitudServicio) throws ServicioException {
            ServicioSolicituServicio sss = new ServicioSolicituServicio();
            //Codigo para contratar canal
            String respuesta = "";
            solicitudServicio.setArea("Web");
            solicitudServicio.setSubArea("Canales a la Carta");

            respuesta = sss.crearSolicitud(solicitudServicio);
            return respuesta;
        }
        //hijump

        public PrecioCanal consultarPrecioCanal(String numeroCanal, String paisISO, String ctaSky, String sistema, String tipoCuenta) {
            PrecioCanal precioCanal = new PrecioCanal();
            ConsultapreciocanalClientEp consultapreciocanal_client_ep;
            ConsultaPrecioCanal consultaPrecioCanal = null;
            Holder<String> resultado = new Holder<String>();
            Holder<String> resultadodesc = new Holder<String>();
            Holder<String> costo = new Holder<String>();
            Holder<String> pagoOportuno = new Holder<String>();
            
            try {
                consultapreciocanal_client_ep = new ConsultapreciocanalClientEp();
                consultaPrecioCanal = consultapreciocanal_client_ep.getConsultaPrecioCanalPt();
                consultaPrecioCanal.process(numeroCanal,paisISO,sistema,ctaSky,tipoCuenta,resultado,resultadodesc,costo,pagoOportuno);

                if (resultado.value.equalsIgnoreCase("0")) {
                    precioCanal.setCosto(costo.value);
                    precioCanal.setPagoOportuno(pagoOportuno.value);
                } else {
                    precioCanal.setCosto("0");
                    precioCanal.setPagoOportuno("0");
                    LogServicios.printlnError(this, "MENSAJE DE PRECIO CAC " + resultadodesc.value);
                }
            } catch (Exception e) {
                LogServicios.printlnError(this, e);
                precioCanal.setCosto("0");
                precioCanal.setPagoOportuno("0");
            }

            return precioCanal;
        }
        }
