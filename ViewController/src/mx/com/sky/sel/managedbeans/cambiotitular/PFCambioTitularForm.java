package mx.com.sky.sel.managedbeans.cambiotitular;

import java.io.OutputStream;
import java.io.Serializable;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import mx.com.sky.sel.beans.cambiotitular.CambioTitularDatos;
import mx.com.sky.sel.enums.EnumFormaPago;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.services.beans.equipos.Equipo;
import mx.com.sky.sel.services.beans.pagos.formaspago.FormaPagoActual;
import mx.com.sky.sel.services.beans.utils.ReceptorDigital;
import mx.com.sky.sel.services.beans.utils.Suscriptor;
import mx.com.sky.sel.services.beans.utils.TarjetaInteligenteIRD;
import mx.com.sky.sel.services.contrato.ServicioContrato;
import mx.com.sky.sel.services.equipos.ServicioEquipos;
import mx.com.sky.sel.services.pagos.ServicioFormasPago;
import mx.com.sky.sel.services.rdig.SerivcioReceptorDigital;
import mx.com.sky.sel.services.ti.SerivcioTarjetaInteligente;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.CantidadLetra;
import mx.com.sky.sel.utils.GeneraReporteJasper;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.ProcesarDiasActivos;
import mx.com.sky.sel.utils.UtileriasMB;
import mx.com.sky.sel.utils.UtilsException;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneRadio;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;


public class PFCambioTitularForm extends UtileriasMB implements Serializable {
    @SuppressWarnings("compatibility:2507323304549353615")
    private static final long serialVersionUID = 7564340350033111487L;

    private CambioTitularDatos subrrogacion;
    private transient RichSelectOneRadio sorPFM;
    private transient RichInputText itApellidoPatNS;
    private transient RichInputText itApellidoMatNS;
    private transient RichInputText repLegalApPat;
    private transient RichInputText repLegalApMat;
    private transient RichInputText repLegalNom;

    private String firmacedente;
    private transient RichPanelLabelAndMessage ddd;
    private transient RichPanelLabelAndMessage labelRep;
    private Map<String, EnumFormaPago> formasPagoMap;
    private Map<String, String> meses;
    private Map<String, String> anios;
    private EnumFormaPago formaPagoSelected;
    private transient RichPanelFormLayout panelPF;

    public PFCambioTitularForm() {
        super();
        subrrogacion = new CambioTitularDatos();
        meses = new LinkedHashMap<String, String>();
        meses.put("01", "01");
        meses.put("02", "02");
        meses.put("03", "03");
        meses.put("04", "04");
        meses.put("05", "05");
        meses.put("06", "06");
        meses.put("07", "07");
        meses.put("08", "08");
        meses.put("09", "09");
        meses.put("10", "10");
        meses.put("11", "11");
        meses.put("12", "12");

        anios = new LinkedHashMap<String, String>();
        int anio = Calendar.getInstance().get(Calendar.YEAR);
        anio = anio % 100;
        for (int i = anio; i <= (anio + 10); i++)
            anios.put(String.valueOf(i), String.valueOf(i));

        formasPagoMap = new HashMap<String, EnumFormaPago>();
        try {
            llenarFormasPago();
        } catch (Exception e) {
            LogPC.printlnError(this, e);
        }
    }

    public String cbSiguienteFormaPago_action() {
        String result = null;
        if (formaPagoSelected == EnumFormaPago.EFECTIVO) {
            subrrogacion.setAnoVencimiento("");
            subrrogacion.setMesVencimiento("");
            subrrogacion.setNoTDC("");
            subrrogacion.setTipoTDC("Forma de Pago Efectivo");
            result = "siguiente";
        } else {
            subrrogacion.setTipoTDC(formaPagoSelected.toString());
            result = "TDC";
        }
        return result;
    }

    public String cbAtrasFormaPago_action() {
        String result = null;
        if (formaPagoSelected == EnumFormaPago.EFECTIVO) {
            result = "atras";
        } else {
            subrrogacion.setTipoTDC(formaPagoSelected.toString());
            result = "atrasTDC";
        }
        return result;
    }

    public void download_cartaReponsiva(FacesContext facesContext,
                                        OutputStream outputStream) {
        LogPC.println(this, "download_cartaReponsiva");
        FacesMessage mensajeError;
        GeneraReporteJasper grj = new GeneraReporteJasper();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");

        try {
            llenarDatosTitular();
            if (sesion.isUserSKY() || sesion.isUserModular()|| sesion.isUserBar()) {
                outputStream =
                        grj.generarCartaResponsivaTYMMX(outputStream, subrrogacion);
            } else if (sesion.isUserVeTV()) {
                outputStream =
                        grj.generarCartaResponsivaVeTVMX(outputStream, subrrogacion);
            }
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_TITULAR_DESCARGA_CARGA_RESPONSIVA);
            outputStream.flush();
        } catch (UtilsException e) {
            LogPC.printlnError(this, e);
            mensajeError =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "", getMensajeProperties("mensaje_PantallaError_generico"));
            facesContext.addMessage(null, mensajeError);
            facesContext.renderResponse();
            facesContext.responseComplete();
        } catch (Exception e) {
            LogPC.printlnError(this, e);
            mensajeError =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "", "No se puedo procesar documento, por favor intente más tarde");
            facesContext.addMessage(null, mensajeError);
            facesContext.renderResponse();
            facesContext.responseComplete();
        }
    }


    public void download_cesionDerechos(FacesContext facesContext,
                                        OutputStream outputStream) {
        LogPC.println(this, "download_cesionDerechos");
        FacesMessage mensajeError;
        GeneraReporteJasper grj = new GeneraReporteJasper();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        try {
            llenarDatosTitular();
            if (sesion.isUserSKY() || sesion.isUserModular() || sesion.isUserBar()) {
                outputStream =
                        grj.generarCesionDerechosTYMMX(outputStream, subrrogacion);
            }else if (sesion.isUserVeTV()) {
                outputStream =
                        grj.generarCesionDerechosVeTVMX(outputStream, subrrogacion);
            }else{
                LogPC.printlnWarn(this, "Tipo de usuario no ENCONTRADO");
            }
            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CAMBIO_TITULAR_DESCARGA_CESION_DERECHOS);
            outputStream.flush();
        } catch (UtilsException e) {
            LogPC.printlnError(this, e);
            mensajeError =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "", getMensajeProperties("mensaje_PantallaError_generico"));
            facesContext.addMessage(null, mensajeError);
            facesContext.renderResponse();
            facesContext.responseComplete();
        } catch (Exception e) {
            LogPC.printlnError(this, e);
            mensajeError =
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "", "No se puedo procesar documento, por favor intente más tarde");
            facesContext.addMessage(null, mensajeError);
            facesContext.renderResponse();
            facesContext.responseComplete();
        }
    }


    private void llenarDatosTitular() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        Suscriptor suscriptor = sesion.getSuscriptor();
        ReceptorDigital receptorDigital = null;
        TarjetaInteligenteIRD ti_IRD = null;
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaHoy = sdf.format(date);
        sdf = new SimpleDateFormat("yyyy");
        String fechaAnio = sdf.format(date);
        sdf = new SimpleDateFormat("MM");
        String fechaMes = sdf.format(date);
        sdf = new SimpleDateFormat("dd");
        String fechaDia = sdf.format(date);
        suscriptor.getRowId();
        CantidadLetra cl = new CantidadLetra();

        String cesionario = subrrogacion.getCesNombre() + " ";
        cesionario += subrrogacion.getCesApPaterno() + " ";
        cesionario += subrrogacion.getCesApMaterno();
        
        ti_IRD = getIRD(suscriptor.getCuentaSKY());
        receptorDigital = getReceptorDigital(ti_IRD.getIRD());
        
        subrrogacion.setAno(fechaAnio);
        subrrogacion.setCedente(suscriptor.getNombreSuscriptor());
        subrrogacion.setCesionario(cesionario);
        subrrogacion.setDia(fechaDia);
        subrrogacion.setMes(fechaMes);
        subrrogacion.setNoCuenta(suscriptor.getCuentaSKY());
        subrrogacion.setCantidad(String.valueOf(getCostoTotal(suscriptor.getRowId())));
        subrrogacion.setCantidadLetra(cl.getCantidadLetra(getCostoTotal(suscriptor.getRowId())));
        subrrogacion.setNoTarjetaInt(getIRD(suscriptor.getCuentaSKY()).getTarjetaInteligente());
        subrrogacion.setModeloIRD(receptorDigital.getModelo());
        subrrogacion.setMarcaEquipo(receptorDigital.getMarca());
        subrrogacion.setNoSerieIRD(ti_IRD.getIRD());


        if (subrrogacion.isAutorizoSKY()) {
            subrrogacion.setSi("X");
        } else {
            subrrogacion.setNo("X");
        }
        if (subrrogacion.getTipoPersonaSHCP().equalsIgnoreCase("PF")) {
            subrrogacion.setPersonaFisica("X");
        } else if (subrrogacion.getTipoPersonaSHCP().equalsIgnoreCase("PFAE")) {
            subrrogacion.setPfActividadEmp("X");
        } else if (subrrogacion.getTipoPersonaSHCP().equalsIgnoreCase("PM")) {
            subrrogacion.setPersonaMoral("X");
        }

    }

    public void cambioTipoPersona(ValueChangeEvent valueChangeEvent) {
        String value = (String)valueChangeEvent.getNewValue();
        boolean resultado = false;
        boolean resultado2 = false;
        if (value.equalsIgnoreCase("PM")) {
            resultado = false;
            resultado2 = true;
            panelPF.setMaxColumns(1);
        } else {
            resultado = true;
            resultado2 = false;
            panelPF.setMaxColumns(3);
        }
        itApellidoMatNS.setRequired(resultado);
        itApellidoPatNS.setRequired(resultado);
        repLegalNom.setRequired(resultado2);
        repLegalApMat.setRequired(resultado2);
        repLegalApPat.setRequired(resultado2);


        itApellidoMatNS.setVisible(resultado);
        itApellidoPatNS.setVisible(resultado);
        repLegalNom.setVisible(resultado2);
        repLegalApMat.setVisible(resultado2);
        repLegalApPat.setVisible(resultado2);
        labelRep.setVisible(resultado2);

        ADFUtils.addPartialTarget(itApellidoMatNS);
        ADFUtils.addPartialTarget(itApellidoPatNS);
        ADFUtils.addPartialTarget(repLegalNom);
        ADFUtils.addPartialTarget(repLegalApMat);
        ADFUtils.addPartialTarget(repLegalApPat);
        ADFUtils.addPartialTarget(labelRep);
    }

    public void setSubrrogacion(CambioTitularDatos subrrogacion) {
        this.subrrogacion = subrrogacion;
    }

    public CambioTitularDatos getSubrrogacion() {
        return subrrogacion;
    }

    private void llenarFormasPago() throws Exception {
        EnumFormaPago formasAmostrar = obtenerDatosNuevaFormaPago();
        if (formasPagoMap == null) {
            formasPagoMap = new HashMap<String, EnumFormaPago>();
        }
        if (formasAmostrar == EnumFormaPago.EFEC_TDC) {
            formasPagoMap.put("Efectivo", EnumFormaPago.EFECTIVO);
            formasPagoMap.put("Tarjeta de Crédito", EnumFormaPago.TDC);
        } else if (formasAmostrar == EnumFormaPago.EFEC_TDD) {
            formasPagoMap.put("Efectivo", EnumFormaPago.EFECTIVO);
            formasPagoMap.put("Tarjeta de Dédito", EnumFormaPago.TDD);
        } else if (formasAmostrar == EnumFormaPago.TDC) {
            formasPagoMap.put("Tarjeta de Crédito", EnumFormaPago.TDC);
        } else if (formasAmostrar == EnumFormaPago.TDC_TDD) {
            formasPagoMap.put("Tarjeta de Crédito", EnumFormaPago.TDC);
            formasPagoMap.put("Tarjeta de Dédito", EnumFormaPago.TDD);
        } else if (formasAmostrar == EnumFormaPago.TODAS) {
            formasPagoMap.put("Efectivo", EnumFormaPago.EFECTIVO);
            formasPagoMap.put("Tarjeta de Crédito", EnumFormaPago.TDC);
            formasPagoMap.put("Tarjeta de Dédito", EnumFormaPago.TDD);
        }
    }

    public EnumFormaPago obtenerDatosNuevaFormaPago() throws Exception {
        boolean isPlazoforsozoActivo = false;
        boolean isCargoCFP = false;
        int diasActivos = 0;
        int diasInactivos = 0;
        int diasContrato = 0;
        int resultado = 0;
        EnumFormaPago enumResultado;
        FormaPagoActual formaPagoActual = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String cuentaSKY = sesion.getSuscriptor().getCuentaSKY();
        ProcesarDiasActivos pda = new ProcesarDiasActivos();
        ServicioContrato serContrato = new ServicioContrato();
        ServicioFormasPago sfp = new ServicioFormasPago();

        isCargoCFP = sfp.isPagoCambioFormaPago(cuentaSKY);
        formaPagoActual = sfp.consultaFormaPagoActual(cuentaSKY);
        if (sesion.isUserSKY()) {
            diasContrato = serContrato.consultarDiasContrato(cuentaSKY);
            /*pda.obtenerDiasActivosInactivos(cuentaSKY);
            diasActivos = pda.getDiasActivos();
            diasInactivos = pda.getDiasInactivos();
            resultado = (diasContrato + diasInactivos) - (diasActivos);*/
            isPlazoforsozoActivo = resultado > 0;
        } else if (sesion.isUserVeTV()) {
            isPlazoforsozoActivo = sfp.recargasVeTV(cuentaSKY) <= 12;
        }

        if (formaPagoActual.getFormaPagoActual() == EnumFormaPago.EFECTIVO) {
            enumResultado = EnumFormaPago.EFEC_TDC;
        } else if (isPlazoforsozoActivo) {
            if (isCargoCFP) {
                //Ya pago el Cargo por cambio de forma de pago
                if (formaPagoActual.getFormaPagoActual() ==
                    EnumFormaPago.TDC) {
                    enumResultado = EnumFormaPago.EFEC_TDC;
                } else if (formaPagoActual.getFormaPagoActual() ==
                           EnumFormaPago.TDD) {
                    enumResultado = EnumFormaPago.TODAS;
                } else {
                    throw new Exception("Forma de Pago no Encontrada. Ya ha pagado el Cargo por cambio de forma de pago");
                }
            } else {
                //No ha pagado el Cargo por cambio de forma de pago
                if (formaPagoActual.getFormaPagoActual() ==
                    EnumFormaPago.TDC) {
                    enumResultado = EnumFormaPago.TDC;
                } else if (formaPagoActual.getFormaPagoActual() ==
                           EnumFormaPago.TDD) {
                    enumResultado = EnumFormaPago.TDC_TDD;
                } else {
                    throw new Exception("Forma de Pago no Encontrada. No ha pagado el Cargo por cambio de forma de pago");
                }
            }
        } else {
            //Ya pago el Cargo por cambio de forma de pago
            if (formaPagoActual.getFormaPagoActual() == EnumFormaPago.TDC) {
                enumResultado = EnumFormaPago.EFEC_TDC;
            } else if (formaPagoActual.getFormaPagoActual() ==
                       EnumFormaPago.TDD) {
                enumResultado = EnumFormaPago.TODAS;
            } else {
                throw new Exception("Forma de Pago no Encontrada");
            }
        }

        return enumResultado;
    }

    public void setSorPFM(RichSelectOneRadio sorPFM) {
        this.sorPFM = sorPFM;
    }

    public RichSelectOneRadio getSorPFM() {
        return sorPFM;
    }

    public void setItApellidoPatNS(RichInputText itApellidoPatNS) {
        this.itApellidoPatNS = itApellidoPatNS;
    }

    public RichInputText getItApellidoPatNS() {
        return itApellidoPatNS;
    }

    public void setItApellidoMatNS(RichInputText itApellidoMatNS) {
        this.itApellidoMatNS = itApellidoMatNS;
    }

    public RichInputText getItApellidoMatNS() {
        return itApellidoMatNS;
    }

    public double getCostoTotal(String rowID) {
        double total = 0;
        Equipo e = null;
        ServicioEquipos se = new ServicioEquipos();
        List<Equipo> equipos = new ArrayList<Equipo>();
        equipos = se.obtenerEquipos(rowID);

        for (int ii = 0; ii < equipos.size(); ii++) {
            e = equipos.get(ii);
            total = total + e.getCosto();
        }
        return total;
    }

    public TarjetaInteligenteIRD getIRD(String ctaSKY) {
        TarjetaInteligenteIRD tiird = null;
        SerivcioTarjetaInteligente sti = new SerivcioTarjetaInteligente();
        tiird = sti.getTarjetaInteligenteIRD(ctaSKY);
        return tiird;
    }

    public ReceptorDigital getReceptorDigital(String IRD) {
        ReceptorDigital rd = null;
        SerivcioReceptorDigital srd = new SerivcioReceptorDigital();
        rd = srd.getReceptorDigital(IRD);
        return rd;
    }

    public void setFirmacedente(String firmacedente) {
        this.firmacedente = firmacedente;
    }

    public String getFirmacedente() {
        return firmacedente;
    }

    public String getDate() {
        String date;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date d1 = new Date();
        date = sdf.format(d1);
        return date;
    }


    public void setDdd(RichPanelLabelAndMessage ddd) {
        this.ddd = ddd;
    }

    public RichPanelLabelAndMessage getDdd() {
        return ddd;
    }

    public void setRepLegalApPat(RichInputText repLegalApPat) {
        this.repLegalApPat = repLegalApPat;
    }

    public RichInputText getRepLegalApPat() {
        return repLegalApPat;
    }

    public void setRepLegalApMat(RichInputText repLegalApMat) {
        this.repLegalApMat = repLegalApMat;
    }

    public RichInputText getRepLegalApMat() {
        return repLegalApMat;
    }

    public void setRepLegalNom(RichInputText repLegalNom) {
        this.repLegalNom = repLegalNom;
    }

    public RichInputText getRepLegalNom() {
        return repLegalNom;
    }

    public void setLabelRep(RichPanelLabelAndMessage labelRep) {
        this.labelRep = labelRep;
    }

    public RichPanelLabelAndMessage getLabelRep() {
        return labelRep;
    }

    public void setFormaPagoSelected(EnumFormaPago formaPagoSelected) {
        this.formaPagoSelected = formaPagoSelected;
    }

    public EnumFormaPago getFormaPagoSelected() {
        return formaPagoSelected;
    }

    public void setFormasPagoMap(Map<String, EnumFormaPago> formasPagoMap) {
        this.formasPagoMap = formasPagoMap;
    }

    public Map<String, EnumFormaPago> getFormasPagoMap() {
        return formasPagoMap;
    }


    public void setMeses(Map<String, String> meses) {
        this.meses = meses;
    }

    public Map<String, String> getMeses() {
        return meses;
    }

    public void setAnios(Map<String, String> anios) {
        this.anios = anios;
    }

    public Map<String, String> getAnios() {
        return anios;
    }

    public void setPanelPF(RichPanelFormLayout panelPF) {
        this.panelPF = panelPF;
    }

    public RichPanelFormLayout getPanelPF() {
        return panelPF;
    }
}
