package mx.com.sky.sel.utils;

import java.io.File;
import java.io.OutputStream;
import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;

import mx.com.sky.sel.beans.cambiotitular.CambioTitularDatos;
import mx.com.sky.sel.log.LogPC;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

public class GeneraReporteJasper implements Serializable {
    @SuppressWarnings("compatibility:4610462499433909115")
    private static final long serialVersionUID = 4253311946107523356L;
    private String rutaReportes ="";
    private String reporteCartaResponsivaTYMMX = "subrrogacionGeneral.jasper";
    private String reporteCartaResponsivaVeTVMX = "subrrogacionVETV.jasper";
    private String reporteCesionDerechosTYMMX = "cesionDerechosGeneral.jasper";
    private String reporteCesionDerechosVeTVMX = "cesionDerechosVETV.jasper";

    public GeneraReporteJasper() {
        super();
        Parametros param = new Parametros(true);
        rutaReportes = param.getRutaReportes();
    }

    public OutputStream generarCartaResponsivaVeTVMX(OutputStream outputStream,
                                                     CambioTitularDatos cambioTitularDatos) throws UtilsException {
        LogPC.println(this, "generarCartaResponsivaVeTVMX Init");
        String reporte = rutaReportes + reporteCartaResponsivaVeTVMX;

        try {
            outputStream =
                    generarReporte(outputStream, reporte, cambioTitularDatos);
        } catch (JRException e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        } catch (Exception e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        }
        return outputStream;
    }

    public OutputStream generarCartaResponsivaTYMMX(OutputStream outputStream,
                                                    CambioTitularDatos cambioTitularDatos) throws UtilsException {
        LogPC.println(this, "generarCartaResponsivaTYMMX Init");
        String reporte = rutaReportes + reporteCartaResponsivaTYMMX;

        try {
            outputStream =
                    generarReporte(outputStream, reporte, cambioTitularDatos);
        } catch (JRException e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        } catch (Exception e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        }
        return outputStream;
    }

    public OutputStream generarCesionDerechosVeTVMX(OutputStream outputStream,
                                                    CambioTitularDatos cambioTitularDatos) throws UtilsException {
        LogPC.println(this, "generarCesionDerechosVeTVMX Init");
        String reporte = rutaReportes + reporteCesionDerechosVeTVMX;

        try {
            outputStream =
                    generarReporte(outputStream, reporte, cambioTitularDatos);
        } catch (JRException e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        } catch (Exception e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        }
        return outputStream;
    }

    public OutputStream generarCesionDerechosTYMMX(OutputStream outputStream,
                                                   CambioTitularDatos cambioTitularDatos) throws UtilsException {
        LogPC.println(this, "generarCartaResponsivaTYMMX Init");
        String reporte = rutaReportes + reporteCesionDerechosTYMMX;

        try {
            outputStream =
                    generarReporte(outputStream, reporte, cambioTitularDatos);
        } catch (JRException e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        } catch (Exception e) {
            LogPC.printlnError(this, e);
            throw new UtilsException("Ocurrió algo inesperado al procesar documento, por favor intente más tarde");
        }
        return outputStream;
    }

    private OutputStream generarReporte(OutputStream outputStream,
                                        String reporte,
                                        CambioTitularDatos cambioTitularDatos) throws JRException {
        JasperReport jReport;
        Map<String, Object> parametros = null;
        parametros = parseParams(cambioTitularDatos);

        LogPC.println(this, "Leyendo datos " + reporte);
        File file = new File(reporte);
        jReport = (JasperReport)JRLoader.loadObject(file);
        LogPC.println(this, "Procesando datos " + reporte);
        JasperPrint jasperPrint =
            JasperFillManager.fillReport(jReport, parametros);
        LogPC.println(this, "Exportando parametros " + reporte);

        JRPdfExporter exporter = new JRPdfExporter();
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
        exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, outputStream);
        
        

        LogPC.println(this, "Exportando " + reporte);
        exporter.exportReport();
        LogPC.println(this, "Reporte Listo " + reporte);
        return outputStream;
    }

    private Map<String, Object> parseParams(CambioTitularDatos subrrogacion) {
        Map<String, Object> parametros = null;
        parametros = new HashMap<String, Object>();
        
        parametros.put("TipoFormaPago", subrrogacion.getTipoTDC());
        parametros.put("NumeroTDC", subrrogacion.getNoTDC());
        parametros.put("AnioVencimiento", subrrogacion.getAnoVencimiento());
        parametros.put("MesVencimiento", subrrogacion.getMesVencimiento());
        parametros.put("ano", subrrogacion.getAno());
        parametros.put("calle", subrrogacion.getCalle());
        parametros.put("cantidad", subrrogacion.getCantidad());
        parametros.put("cantidadLetra", subrrogacion.getCantidadLetra());
        parametros.put("caseta", subrrogacion.getCaseta());
        parametros.put("cedComprobanteDom",
                       subrrogacion.getCedComprobanteDom());
        parametros.put("cedente", subrrogacion.getCedente());
        parametros.put("cedIdentificacion",
                       subrrogacion.getCedIdentificacion());
        parametros.put("cel", subrrogacion.getCel());
        parametros.put("cesApMaterno", subrrogacion.getCesApMaterno());
        parametros.put("cesApPaterno", subrrogacion.getCesApPaterno());
        parametros.put("cesComprobanteDom",
                       subrrogacion.getCesComprobanteDom());
        parametros.put("cesIdentificacion",
                       subrrogacion.getCesIdentificacion());
        parametros.put("cesionario", subrrogacion.getCesionario());
        parametros.put("cesNombre", subrrogacion.getCesNombre());
        parametros.put("claveLada", subrrogacion.getClaveLada());
        parametros.put("codigoPostal", subrrogacion.getCodigoPostal());
        parametros.put("colonia", subrrogacion.getColonia());
        parametros.put("comprobanteDom", subrrogacion.getComprobanteDom());
        parametros.put("correo", subrrogacion.getCorreo());
        parametros.put("CURP", subrrogacion.getCURP());
        parametros.put("dia", subrrogacion.getDia());
        parametros.put("entidadFederativa",
                       subrrogacion.getEntidadFederativa());
        parametros.put("entreCalle", subrrogacion.getEntreCalle());
        parametros.put("fechaCesion", subrrogacion.getFechaCesion());
        parametros.put("identificacion", subrrogacion.getIdentificacion());
        parametros.put("lugarCambio", subrrogacion.getLugarCambio());
        parametros.put("marcaEquipo", subrrogacion.getMarcaEquipo());
        parametros.put("mes", subrrogacion.getMes());
        parametros.put("meses", subrrogacion.getMeses());
        parametros.put("modeloIRD", subrrogacion.getModeloIRD());
        parametros.put("municipio", subrrogacion.getMunicipio());
        parametros.put("no", subrrogacion.getNo());
        parametros.put("noClave", subrrogacion.getNoClave());
        parametros.put("noContrato", subrrogacion.getNoContrato());
        parametros.put("noCuenta", subrrogacion.getNoCuenta());
        parametros.put("noExt", subrrogacion.getNoExt());
        parametros.put("noInt", subrrogacion.getNoInt());
        parametros.put("nombre2Ref", subrrogacion.getNombre2Ref());
        parametros.put("nombreDistrib", subrrogacion.getNombreDistrib());
        parametros.put("nombreRef", subrrogacion.getNombreRef());
        parametros.put("noSerieIRD", subrrogacion.getNoSerieIRD());
        parametros.put("noTarjetaInt", subrrogacion.getNoTarjetaInt());
        parametros.put("otrasReferencias", subrrogacion.getOtrasReferencias());
        parametros.put("otroTel", subrrogacion.getOtroTel());
        parametros.put("parentesco1", subrrogacion.getParentesco1());
        parametros.put("parentesco2", subrrogacion.getParentesco2());
        parametros.put("personaFisica", subrrogacion.getPersonaFisica());
        parametros.put("personaMoral", subrrogacion.getPersonaMoral());
        parametros.put("pfActividadEmp", subrrogacion.getPfActividadEmp());
        parametros.put("poblacion", subrrogacion.getPoblacion());
        parametros.put("recargas", subrrogacion.getRecargas());
        parametros.put("repLegalApMat", subrrogacion.getRepLegalApMat());
        parametros.put("repLegalApPat", subrrogacion.getRepLegalApPat());
        parametros.put("repLegalNom", subrrogacion.getRepLegalNom());
        parametros.put("RFC", subrrogacion.getRFC());
        parametros.put("si", subrrogacion.getSi());
        parametros.put("tel2Ref", subrrogacion.getTel2Ref());
        parametros.put("telCasa", subrrogacion.getTelCasa());
        parametros.put("telOficina", subrrogacion.getTelOficina());
        parametros.put("telRef", subrrogacion.getTelRef());
        parametros.put("yCalle", subrrogacion.getYCalle());
        LogPC.println(this, "parametros:" + parametros);
        return parametros;
    }
}
