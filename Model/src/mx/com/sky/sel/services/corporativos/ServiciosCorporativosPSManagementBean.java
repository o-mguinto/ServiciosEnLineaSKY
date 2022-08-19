package mx.com.sky.sel.services.corporativos;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import mx.com.sky.sel.proxyclients.pagwebss.actualizatablabatch.ActualizaTablaBatchSS;
import mx.com.sky.sel.proxyclients.pagwebss.actualizatablabatch.types.ActualizaTablaBatchSSProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.actualizatablabatch.types.ActualizaTablaBatchSSProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.actualizatablabatch.ActualizaTablaBatchSS_Service;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.ConsultaTablaBatchSS;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types.ConsultaTablaBatchSSProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.ConsultaTablaBatchSS_Service;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types.Row;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.ConsultaTablaBatchSSAltaFacturacion;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.ConsultaTablaBatchSSAltaFacturacionProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.ConsultaTablaBatchSSAltaFacturacionProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.ConsultaTablaBatchSSAltaFacturacion_Service;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.BatchAltaSolicitudesDeServicioWeb;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.BatchAltaSolicitudesDeServicioWebProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.BatchAltaSolicitudesDeServicioWebProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.BatchAltaSolicitudesDeServicioWeb_Service;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.DatosFiscales;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.DetallesSolicitudDeServicio;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.Direccion;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.InfoPPE;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.ListaLlaves;
import mx.com.sky.sel.proxyclients.pagwebss.batchaltasolicitudessw.types.Llave;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactasasociadas.ConsultaCuentasAsociadas;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactasasociadas.types.ConsultaCuentasAsociadasProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactasasociadas.types.ConsultaCuentasAsociadasProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactasasociadas.ConsultaCuentasAsociadas_Service;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultactasasociadas.types.Cuenta;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaticorp.types.ConsultaTICorpProcessRequest;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaticorp.types.ConsultaTICorpProcessResponse;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaticorp.ConsultaTICorp;
import mx.com.sky.sel.proxyclients.pagwebconsultas.consultaticorp.ConsultaTICorp_Service;
import mx.com.sky.sel.services.beans.corporativos.Batch;
import mx.com.sky.sel.services.beans.corporativos.BatchDF;
import mx.com.sky.sel.services.beans.corporativos.CuentaCV;
import mx.com.sky.sel.services.beans.solicitudservicio.SolicitudServicioBean;
import mx.com.sky.sel.services.exception.ServicioException;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.utils.JavaUtils;

@Stateless(name = "ServiciosCorporativosPSManagement", mappedName = "SEL-ServiciosCorporativosPSManagement")
public class ServiciosCorporativosPSManagementBean implements Serializable, ServiciosCorporativosPSManagement, ServiciosCorporativosPSManagementLocal {
    @SuppressWarnings("compatibility:6874945918004135484")
    private static final long serialVersionUID = -1576195032110159384L;
    
    @Resource
    SessionContext sessionContext;

    public ServiciosCorporativosPSManagementBean() {
    }
    
            /**
     * Consultar Estatus Solicitud Datos Fiscales
     * @param nombreCorporativo
     * @return
     */
            @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<BatchDF> consultarEstadoSolicitudDF(String nombreCorporativo) {
        List<BatchDF> consultas = new ArrayList<BatchDF>();
        BatchDF batch = null;
        ConsultaTablaBatchSSAltaFacturacion_Service consultaTablaBatchSSAltaFacturacion_Service;
        ConsultaTablaBatchSSAltaFacturacion consultaTablaBatchSSAltaFacturacion = null;
        ConsultaTablaBatchSSAltaFacturacionProcessRequest payload;
        ConsultaTablaBatchSSAltaFacturacionProcessResponse response;
        List<mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.Row> renglones = null;

        try {

            consultaTablaBatchSSAltaFacturacion_Service = new ConsultaTablaBatchSSAltaFacturacion_Service();
            consultaTablaBatchSSAltaFacturacion = consultaTablaBatchSSAltaFacturacion_Service.getConsultaTablaBatchSSAltaFacturacion();

            payload = new ConsultaTablaBatchSSAltaFacturacionProcessRequest();
            payload.setNombreCorporativo(nombreCorporativo);
            response = consultaTablaBatchSSAltaFacturacion.process(payload);
            if (response != null) {
                renglones = response.getListaSolicitudes().getSolicitud();

                for (mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.Row row : renglones) {
                    batch = convert(row);
                    consultas.add(batch);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return consultas;

    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<Batch> consultarEstadoSolicitud(String nombreCorporativo) {
        List<Batch> consultas = new ArrayList<Batch>();
        Batch batch = null;
        ConsultaTablaBatchSS_Service consultaTablaBatchSS_Service;
        ConsultaTablaBatchSS consultaTablaBatchSS = null;
        ConsultaTablaBatchSSProcessRequest payload;
        mx.com.sky.sel.proxyclients.pagwebss.consultatablabatch.types.Rows response;
        List<Row> renglones = null;

        try {

            consultaTablaBatchSS_Service = new ConsultaTablaBatchSS_Service();
            consultaTablaBatchSS = consultaTablaBatchSS_Service.getConsultaTablaBatchSS();
            payload = new ConsultaTablaBatchSSProcessRequest();
            payload.setNombreCorporativo(nombreCorporativo);
            response = consultaTablaBatchSS.process(payload);
            if (response != null) {
                renglones = response.getRenglon();

                for (Row row : renglones) {
                    batch = convert(row);
                    consultas.add(batch);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return consultas;

    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String reintentarConError(String nombreCorporativo) {
        List<Batch> batchs = consultarEstadoSolicitud(nombreCorporativo);
        for (Batch batch : batchs) {
            if (batch.getStatus().equalsIgnoreCase("ERROR")) {
                try {
                    actualizarStatusBatch(batch.getBpelId(), batch.getLlaveOperacion(), batch.getStatus(), batch.getFechaInicio());
                } catch (Exception e) {
                    LogServicios.printlnError(this, e);
                }
            }
        }
        return "ok";
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String reintentarConErrorDF(String nombreCorporativo) {
        List<BatchDF> batchs = consultarEstadoSolicitudDF(nombreCorporativo);
        for (BatchDF batch : batchs) {
            if (batch.getStatus().equalsIgnoreCase("ERROR")) {
                try {
                    actualizarStatusBatch(batch.getBpelId(), batch.getNoCuentaSKY(), batch.getStatus(), "");
                } catch (Exception e) {
                    LogServicios.printlnError(this, e);
                }
            }
        }
        return "ok";
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private void actualizarStatusBatch(String bpelID, String llaveOperacion, String status, String fechaPPE) throws ServicioException {
        ActualizaTablaBatchSS_Service actualizaTablaBatchSS_Service;
        ActualizaTablaBatchSS actualizaTablaBatchSS = null;
        ActualizaTablaBatchSSProcessRequest payload = null;
        ActualizaTablaBatchSSProcessResponse response = null;

        try {
            actualizaTablaBatchSS_Service = new ActualizaTablaBatchSS_Service();
            actualizaTablaBatchSS = actualizaTablaBatchSS_Service.getActualizaTablaBatchSS();
            payload = new ActualizaTablaBatchSSProcessRequest();

            payload.setBpelid(bpelID);
            payload.setLlaveoperacion(llaveOperacion);
            payload.setFechaPPE(fechaPPE);
            payload.setStatus("Pendiente");
            response = actualizaTablaBatchSS.process(payload);
            if (response != null && response.getResultado().equalsIgnoreCase("0")) {
                //OK
            } else {
                throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde");
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado, por favor intente m\u00E1s tarde");
        }
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String crearSolicitudPPV(SolicitudServicioBean solicitudServicio, List<String> tis, String nombreCorporativo,
                                    String sistema) throws ServicioException {
        return generarSolicitudServicio(solicitudServicio, tis, nombreCorporativo, sistema);
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public String crearSolicitudInfoFiscal(SolicitudServicioBean solicitudServicio, List<CuentaCV> cuentasCV, String nombreCorporativo,
                                           String sistema) throws ServicioException {
        List<String> llaves = new ArrayList<String>();

        for (CuentaCV cuentaCV : cuentasCV) {
            llaves.add(cuentaCV.getCuentaSKY());
        }
        return generarSolicitudServicio(solicitudServicio, llaves, nombreCorporativo, sistema);
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private String generarSolicitudServicio(SolicitudServicioBean solicitudServicio, List<String> llaves, String nombreCorporativo,
                                            String sistema) throws ServicioException {
        BatchAltaSolicitudesDeServicioWeb_Service batchAltaSolicitudesDeServicioWeb_Service;
        BatchAltaSolicitudesDeServicioWeb batchAltaSolicitudesDeServicioWeb = null;
        BatchAltaSolicitudesDeServicioWebProcessRequest payload;
        BatchAltaSolicitudesDeServicioWebProcessResponse response;
        DetallesSolicitudDeServicio detalleSS = null;
        InfoPPE infoPPE = null;
        ListaLlaves listaLlaves = null;
        List<Llave> tisWS;
        Llave tiWS;
        String resultado = null;

        try {

            batchAltaSolicitudesDeServicioWeb_Service = new BatchAltaSolicitudesDeServicioWeb_Service();
            batchAltaSolicitudesDeServicioWeb = batchAltaSolicitudesDeServicioWeb_Service.getBatchAltaSolicitudesDeServicioWeb();
            payload = new BatchAltaSolicitudesDeServicioWebProcessRequest();

            detalleSS = new DetallesSolicitudDeServicio();
            detalleSS.setArea(solicitudServicio.getArea());
            detalleSS.setDescripcion(solicitudServicio.getDescripcion());
            detalleSS.setMailConfirmacion(solicitudServicio.getCorreoElectronico());
            detalleSS.setNombreSuscriptor(solicitudServicio.getNombreSuscriptor());
            detalleSS.setPais(solicitudServicio.getPais());
            detalleSS.setSubArea(solicitudServicio.getSubArea());
            detalleSS.setTipoCuenta(solicitudServicio.getTipoCuenta());


            DatosFiscales datosFiscales = new DatosFiscales();
            datosFiscales.setCompania("");
            datosFiscales.setMetodoEnvio(solicitudServicio.getDatosFiscales().getMetodoEnvio());
            datosFiscales.setRFC(solicitudServicio.getDatosFiscales().getRfc());
            datosFiscales.setRazonSocial(solicitudServicio.getDatosFiscales().getRazonSocial());
            datosFiscales.setTipoFactura(solicitudServicio.getDatosFiscales().getTipoFactura());
            //Nuevos parametros CFDI4.0
            datosFiscales.setTipoPersona(solicitudServicio.getDatosFiscales().getTipoPersona());
            datosFiscales.setRegimenFiscal(solicitudServicio.getDatosFiscales().getRegimenFiscal());
            datosFiscales.setUsoCfdi(solicitudServicio.getDatosFiscales().getUsoCFDI());

            Direccion direccion = new Direccion();
            direccion.setCP(solicitudServicio.getDireccion().getCp());
            direccion.setCalle(solicitudServicio.getDireccion().getCalleNumero());
            direccion.setColonia(solicitudServicio.getDireccion().getColonia());
            direccion.setDelMun(solicitudServicio.getDireccion().getDelMun());
            direccion.setEstado(solicitudServicio.getDireccion().getEstado());
            direccion.setNoExt(solicitudServicio.getDireccion().getNumeroExt());
            direccion.setNoInt(solicitudServicio.getDireccion().getNumeroInt());
            direccion.setPoblacion(solicitudServicio.getDireccion().getPoblacion());

            infoPPE = new InfoPPE();
            infoPPE.setCanal(solicitudServicio.getInfoPPE().getCanal());
            infoPPE.setFechaExpiracion(solicitudServicio.getInfoPPE().getHoraExpiracion());
            infoPPE.setFechaInicio(solicitudServicio.getInfoPPE().getHoraEvento());
            infoPPE.setIDEvento(solicitudServicio.getInfoPPE().getId());
            infoPPE.setTokenOverride("0");
            infoPPE.setCanalDisplay(solicitudServicio.getInfoPPE().getCanalDisplay());
            infoPPE.setNombreDelEvento(solicitudServicio.getInfoPPE().getTitulo());
            infoPPE.setTokenValue(solicitudServicio.getInfoPPE().getToken());
            infoPPE.setZonaHoraria(solicitudServicio.getInfoPPE().getDiferenciaHoraria());
            infoPPE.setDuracion(solicitudServicio.getInfoPPE().getDuracion());
            infoPPE.setCosto(solicitudServicio.getInfoPPE().getPrecio());
            infoPPE.setTipoEvento(solicitudServicio.getInfoPPE().getTipoEvento());
            infoPPE.setMailFechaInicio(solicitudServicio.getInfoPPE().getHoraPedido());
            infoPPE.setMailFechaTermino(solicitudServicio.getInfoPPE().getHoraCancelacion());
            infoPPE.setPpvGenreId(solicitudServicio.getInfoPPE().getPpvGenreId());
            infoPPE.setProviderEventId(solicitudServicio.getInfoPPE().getProviderEventId());
            infoPPE.setOrderType(solicitudServicio.getInfoPPE().getTipoOrden());
            infoPPE.setSKYTrackingId(solicitudServicio.getInfoPPE().getSkyTrackingId());

            if (llaves != null && llaves.size() > 0) {
                tisWS = new ArrayList<Llave>();
                for (String ti : llaves) {
                    tiWS = new Llave();
                    tiWS.setNumeroLlave(ti);
                    tisWS.add(tiWS);
                }
                listaLlaves = new ListaLlaves();
                listaLlaves.getLlave().addAll(tisWS);
                payload.setListaLlaves(listaLlaves);
            }
            payload.setNombreCorporativo(nombreCorporativo);
            detalleSS.setDatosFiscales(datosFiscales);
            detalleSS.setDireccion(direccion);
            detalleSS.setInfoPPE(infoPPE);
            payload.setDetallesSolicitudDeServicio(detalleSS);
            payload.setSISTEMA(sistema);

            response = batchAltaSolicitudesDeServicioWeb.process(payload);

            if (response == null) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intente m\u00E1s tarde");
            } else if (response.getResultado() == null) {
                throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intente m\u00E1s tarde");
            } else if (!response.getResultado().equalsIgnoreCase("0")) {
                throw new ServicioException(response.getResultadodesc());
            } else {
                resultado = response.getResultadodesc();
            }
        } catch (ServicioException e) {
            LogServicios.printlnError(this, e);
            throw e;
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
            throw new ServicioException("Ocurri\u00F3 algo inesperado por favor intente m\u00E1s tarde");
        }
        return resultado;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<CuentaCV> consultarCuentasAsociadas(String cuentaSKY) {
        List<CuentaCV> cuentasCV = new ArrayList<CuentaCV>();
        CuentaCV cuentaCV = null;
        ConsultaCuentasAsociadas_Service consultaCuentasAsociadas_Service;
        ConsultaCuentasAsociadas consultaCuentasAsociadas = null;
        ConsultaCuentasAsociadasProcessRequest payload = null;
        ConsultaCuentasAsociadasProcessResponse response = null;

        try {
            consultaCuentasAsociadas_Service = new ConsultaCuentasAsociadas_Service();
            consultaCuentasAsociadas = consultaCuentasAsociadas_Service.getConsultaCuentasAsociadas();
            payload = new ConsultaCuentasAsociadasProcessRequest();
            payload.setCuentaSKY(cuentaSKY);
            response = consultaCuentasAsociadas.process(payload);
            if (response != null) {
                for (Cuenta cuentaWS : response.getListaCuentas().getCuenta()) {
                    cuentaCV = convert(cuentaWS);
                    cuentasCV.add(cuentaCV);
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return cuentasCV;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    public List<String> consultarTIsAsociadas(String nombreCorporativo) {
        List<String> cuentasCV = new ArrayList<String>();
        String tiCV = null;
        ConsultaTICorp_Service ConsultaTICorp_Service;
        ConsultaTICorp ConsultaTICorp = null;
        ConsultaTICorpProcessResponse response = null;
        ConsultaTICorpProcessRequest payload = null;
        try {
            ConsultaTICorp_Service = new ConsultaTICorp_Service();
            ConsultaTICorp = ConsultaTICorp_Service.getConsultaTICorp();
            payload = new ConsultaTICorpProcessRequest();
            payload.setNombreCorporativo(nombreCorporativo);
            response = ConsultaTICorp.process(payload);
            if (response != null) {
                if (response.getListaTarjetasInteligentes() != null) {
                    for (ConsultaTICorpProcessResponse.ListaTarjetasInteligentes tiWS : response.getListaTarjetasInteligentes()) {
                        tiCV = tiWS.getNumeroTarjetaInteligente();
                        cuentasCV.add(tiCV);
                    }
                } else {
                    LogServicios.printlnWarn(this,
                                             "No tiene objeto con TIS [" + response.getResultado() + "] " + response.getListaTarjetasInteligentes());
                }
            }
        } catch (Exception e) {
            LogServicios.printlnError(this, e);
        }
        return cuentasCV;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private CuentaCV convert(Cuenta cuentaWS) {
        CuentaCV cuentaCV = new CuentaCV();
        cuentaCV.setCuentaSKY(cuentaWS.getCuentaSKY());
        cuentaCV.setRowId(cuentaWS.getRowId());
        return cuentaCV;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private Batch convert(Row row) {
        Batch batch = new Batch();
        batch.setBpelId(row.getBpelId());
        batch.setCanal(row.getCanal());
        batch.setCanalDisplay(row.getCanalDisplay());
        batch.setCostoEvento(row.getCostoEvento());
        batch.setDescripcion(row.getDescripcion());
        batch.setDuracion(row.getDuracion());
        batch.setFechaCreacion(JavaUtils.asTimestamp(row.getFechaCreacion().getValue()));
        batch.setFechaCreacionString(JavaUtils.asString(batch.getFechaCreacion()));
        batch.setFechaInicio(formatFechaInicio(row.getFechaInicio()));
        batch.setIdEvento(row.getIdEvento());
        batch.setLlaveOperacion(row.getLlaveOperacion());
        batch.setNoSolicitud(row.getNoSolicitud());
        batch.setNombreCorporativo(row.getNombreCorporativo());
        batch.setNombreEvento(row.getNombreEvento());
        batch.setStatus(row.getStatus());
        batch.setTipoEvento(row.getTipoEvento());

        return batch;
    }
    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private BatchDF convert(mx.com.sky.sel.proxyclients.pagwebss.consultatablabatchaltafact.types.Row row) {
        BatchDF batch = new BatchDF();
        batch.setBpelId(row.getBpelId());
        batch.setArea(row.getArea());
        batch.setCalle(row.getCalle());
        batch.setCodigoPostal(row.getCodigoPostal());
        batch.setColonia(row.getColonia());
        batch.setCompania(row.getCompania());
        batch.setDelMunicipio(row.getDelMunicipio());
        batch.setEstado(row.getEstado());
        batch.setFechaCreacion(JavaUtils.asTimestamp(row.getFechaCreacion().getValue()));
        batch.setMetodoEnvio(row.getMetodoEnvio());
        batch.setNoCuentaSKY(row.getNoCuentaSKY());
        batch.setNoExterior(row.getNoExterior());
        batch.setNoInterior(row.getNoInterior());
        batch.setNoSolicitud(row.getNoSolicitud());
        batch.setNombreCorporativo(row.getNombreCorporativo());
        batch.setPoblacion(row.getPoblacion());
        batch.setRazonSocial(row.getRazonSocial());
        batch.setRfc(row.getRfc());
        batch.setStatus(row.getStatus());
        batch.setSubArea(row.getSubArea());
        batch.setTipoFactura(row.getTipoFactura());

        return batch;
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    private String formatFechaInicio(String fechaInicio) {
        String fechaFinal = "";
        //20120828
        //01234567
        fechaFinal = fechaInicio.substring(6, 8);
        fechaFinal += "/";
        fechaFinal += fechaInicio.substring(4, 6);
        fechaFinal += "/";
        fechaFinal += fechaInicio.substring(0, 4);
        return fechaFinal;
    }
}
