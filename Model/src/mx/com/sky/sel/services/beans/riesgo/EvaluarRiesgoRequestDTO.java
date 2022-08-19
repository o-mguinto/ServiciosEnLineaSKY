package mx.com.sky.sel.services.beans.riesgo;

import java.io.Serializable;

import java.util.List;

import mx.com.sky.sel.proxyclients.apigateway.ebs.evaluarriesgo.types.ParametroComerciante;

public class EvaluarRiesgoRequestDTO implements Serializable {
    @SuppressWarnings("compatibility:6279528743346217347")
    private static final long serialVersionUID = -7616677422210671424L;

    private String instrumentoDePagoId;
    private String mId;//comercioId
    private String montoTotal;
    private String monedaISO;
    private String sesionId;
    private String codigoSKY;
    //private String cuentaIdProspectoNoContrato;//cuenta, idprospecto o noContrato
    //private String procesoCyber;//proceso cyber DM, 3DS, ENROLL, ENROLLV, JWT. Para PAGOS CHKIN, CHKOUT, PAGO, CRI,PAGOR
    //private String appOrigen;//SOA_SEC, SkyMobile, AppSKY, AppBTG, SEL_DTC, SEL_BT, SEL, IVR, CRM, no requerido para PAGOS
    //private String fecha; //aaaammddhhmmss ej. 20220329121722
    private String identificadorUnico;//solo para proceso de PAGOS, ej. 2722422032513882681
    private List<ParametroComerciante> datosComerciante;
    
    public EvaluarRiesgoRequestDTO() {
        super();
    }
    
    public void setCodigoSKY(String codigoSKY) {
        this.codigoSKY = codigoSKY;
    }

    public String getCodigoSKY() {
        return codigoSKY;
    }

    public void setInstrumentoDePagoId(String instrumentoDePagoId) {
        this.instrumentoDePagoId = instrumentoDePagoId;
    }

    public String getInstrumentoDePagoId() {
        return instrumentoDePagoId;
    }

    public void setMontoTotal(String montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getMontoTotal() {
        return montoTotal;
    }

    public void setMonedaISO(String monedaISO) {
        this.monedaISO = monedaISO;
    }

    public String getMonedaISO() {
        return monedaISO;
    }

    public void setSesionId(String sesionId) {
        this.sesionId = sesionId;
    }

    public String getSesionId() {
        return sesionId;
    }

    public void setIdentificadorUnico(String identificadorUnico) {
        this.identificadorUnico = identificadorUnico;
    }

    public String getIdentificadorUnico() {
        return identificadorUnico;
    }

    public void setMId(String mId) {
        this.mId = mId;
    }

    public String getMId() {
        return mId;
    }

    public void setDatosComerciante(List<ParametroComerciante> datosComerciante) {
        this.datosComerciante = datosComerciante;
    }

    public List<ParametroComerciante> getDatosComerciante() {
        return datosComerciante;
    }
}
