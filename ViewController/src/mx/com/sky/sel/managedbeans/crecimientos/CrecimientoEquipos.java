package mx.com.sky.sel.managedbeans.crecimientos;

import java.io.Serializable;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;

import mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.CapacidadPorDiaType;
import mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsebo.TimeSlotType;
import mx.com.sky.enterpriseobjects.sec.consultarcapacidadfsinterface.ConsultarCapacidadFSResponseEBMType;
import mx.com.sky.enterpriseobjects.sec.utilsofscprocessinterface.UtilsOfscProcessResponseEBMType;
import mx.com.sky.enterpriseservices.soa.crearsolicitudserviciosoainterface.CrearSolicitudServicioSoaInterfaceResponseType;
import mx.com.sky.sel.enums.EnumOperacionBAM;
import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;
import mx.com.sky.sel.managedbeans.sesion.ConfigMenu;
import mx.com.sky.sel.proxyclients.pagweb.calculacrecimientosvetv.types.CalculaCrecimientosResponse;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientostya.types.InsertaCrecimientosTYAResponse;
import mx.com.sky.sel.proxyclients.pagweb.insertacrecimientosvetv.types.InsertaCrecmientosVeTVResponse;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientostya.types.ValidaCrecimientosTYAResponse;
import mx.com.sky.sel.proxyclients.pagweb.validacrecimientosvetv.types.ValidaCrecimientosVeTVResponse;
import mx.com.sky.sel.proxyclients.pagweb.ventacrecimientostya.types.VentaCrecimientosTYAResponse;
import mx.com.sky.sel.services.crecimientos.ServicioCrecimientoEquipos;
import mx.com.sky.sel.utils.ADFUtils;
import mx.com.sky.sel.utils.JSFUtils;
import mx.com.sky.sel.utils.JavaUtils;
import mx.com.sky.sel.utils.bam.OperacionBAMUtils;

import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.nav.RichButton;

import org.apache.myfaces.trinidad.component.core.input.CoreSelectOneChoice;
import org.apache.myfaces.trinidad.component.core.nav.CoreCommandLink;

public class CrecimientoEquipos implements Serializable {
    @SuppressWarnings("compatibility:-64806694930191798")
    private static final long serialVersionUID = -2354326787956220454L;
    private String cuentaSky;
    private String nombreSuscriptor;

    private String mensajeTya;
    private String mensajeVeTv;
    private String validaVeTV;
    private String valida;
    private String validaCuenta;
    private int numEquipos;
    private int equipos;
    private int maximo;
    private int sd;
    private int hd;
    private int phd;
    private Date fechaAtencion;
    private String fechaAtencionFormato;
    private Date fechaActual;
    private String fechaActualFormato;
    private String horaAtencion;
    private Double horaAtencionFormato;
    private boolean cuentaValida;
    private boolean cuentaValidaVeTv;
    private boolean tipoCuentaVeTv;
    private String paquete;
    private Integer meses;
    private Double precio;
    private String precioValida;
    private String hmc;
    private String markerType;
    private String mig;
    private String sSTransaccion;
    private String sR;

    private boolean errorEnviarTya;
    private boolean errorEnviarVeTv;
    private String mensajeErrorTya;
    private String mensajeErrorVeTv;

    private transient RichPopup popupTYA;
    private transient RichPopup popupVETV;

    private boolean procesoOFCS;
    UtilsOfscProcessResponseEBMType convivenciaVeTV = null;
    ConsultarCapacidadFSResponseEBMType capacidadVeTV = null;
    private List<SelectItem> listCapacidad;
    private String numeroCodigo;
    private String tipoCuentaCrece;
    private transient RichButton enviarSolicitudTyA;
    private transient RichSelectOneChoice listHorDispon;
    private transient RichButton enviarSolicutudVeTV;
    private transient CoreCommandLink enviarSolicitudTyAMobile;
    private transient CoreCommandLink enviarSolicitudVeTVMobile;
    private transient CoreSelectOneChoice listHorDisponMobile;

    public CrecimientoEquipos() {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        cuentaSky = sesion.getSuscriptor().getCuentaSKY();
        nombreSuscriptor = sesion.getSuscriptor().getNombreSuscriptor();

        LogPC.println(this, "cuentaSky " + cuentaSky);
        LogPC.println(this, "nombreSuscriptor " + nombreSuscriptor);

        OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONSULTA_CRECIMIENTO_EQUIPO);
        if (sesion.isCuentaDualPlay()) {
            tipoCuentaCrece = "COMBO";
        } else if (sesion.isUserVeTV()) {
            tipoCuentaCrece = "PREPAGO";
        } else {
            tipoCuentaCrece = "TYA";
        }
    }

    public String validaCrecimientosTablet() {
        LogPC.println(this, "validaCrecimientos");

        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        fechaActualFormato = formatoFecha.format(new Date());

        LogPC.println(this, "fechaActualFormato " + fechaActualFormato);

        if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("VETV")) {
            tipoCuentaVeTv = true;
            markerType = "VETV";
        } else {
            tipoCuentaVeTv = false;
            markerType = "TYA";
        }

        try {

            fechaActual = formatoFecha.parse(fechaActualFormato);
            if (markerType.equals("VETV")) {
                ValidaCrecimientosVeTVResponse responde = null;
                //HD
                responde = crecimiento.validacrecimientos_vetv(cuentaSky);

                if (responde != null) {
                    LogPC.println(this, "Valido " + responde.getValido());

                    LogPC.println(this, "Precio " + responde.getPrecio());

                    LogPC.println(this,
                                  "Cuenta VETV " +
                                  sesion.getSuscriptor().getMarketType());

                    LogPC.println(this, "Fecha actual " + fechaActual);

                    LogPC.println(this,
                                  "Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        mensajeVeTv =
                            "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                    } else {
                        //else if (!responde.getValido().toString().equals("1")){
                        if (responde.getValido().toString().equals("0")) {
                            cuentaValidaVeTv = true;
                            validaVeTV =
                                "La cuenta es v\u00E1lida para crecimientos.";
                            validaCuenta = "valida";
                            precioValida = responde.getPrecio();
                            precioValida = JavaUtils.formatMoneda(precioValida);
                            if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("HD")) {
                                sd = 0;
                                hd = 1;
                                phd = 0;
                                hmc = "0";
                            } else {
                                sd = 1;
                                hd = 0;
                                phd = 0;
                                hmc = "0";
                            }
                            if (getPermisoCrecimiento("EQUIPO_ADICIONAL_OFSC")) {
                                convivenciaVeTV =
                                    crecimiento.consultaConvivencia("CRECIMIENTO_SEL",
                                                                    cuentaSky,
                                                                    Integer.toString(sd),
                                                                    Integer.toString(hd),
                                                                    Integer.toString(phd),
                                                                    hmc,
                                                                    Integer.toString(numEquipos),
                                                                    sesion.getSuscriptor().getPais(),
                                                                    tipoCuentaCrece);
                                if (convivenciaVeTV.getOutputParameters().getFLAG().getValue().equalsIgnoreCase("Y") &&
                                    getPermisoCrecimiento("EQUIPO_ADICIONAL_OFSC")) {
                                    procesoOFCS = true;
                                    //enviarSolicitudTyA.setDisabled(true);
                                    //enviarSolicutudVeTV.setDisabled(true);
                                } else {
                                    procesoOFCS = false;
                                    //enviarSolicitudTyA.setDisabled(false);
                                    //enviarSolicutudVeTV.setDisabled(false);
                                }
                            } else {
                                procesoOFCS = false;
                            }
                        } else if (responde.getValido().toString().equals("2")) {
                            mensajeVeTv =
                                "La cuenta tiene m\u00E1s de un equipo.";
                        } else if (responde.getValido().toString().equals("3")) {
                            mensajeVeTv = "La cuenta no tiene recarga.";
                        } else if (responde.getValido().toString().equals("4")) {
                            mensajeVeTv = "La cuenta tiene un SS abierta.";
                        } else {
                            mensajeVeTv =
                                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                            LogServicios.printlnError(this,
                                                      responde.getDescError());
                        }
                        //}
                    }
                }
            } else {
                ValidaCrecimientosTYAResponse responde = null;
                if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("HD")) {
                    sd = 0;
                    hd = 1;
                    phd = 0;
                    hmc = "0";
                } else {
                    sd = 1;
                    hd = 0;
                    phd = 0;
                    hmc = "0";
                }

                responde = crecimiento.validacrecimientos_tya(cuentaSky);

                if (responde != null) {
                    LogPC.println(this, "Valida " + responde.getValida());

                    LogPC.println(this, "Estatus " + responde.getEstatus());

                    LogPC.println(this,
                                  "Cuenta TYA " +
                                  sesion.getSuscriptor().getMarketType());

                    LogPC.println(this, "Fecha actual " + fechaActual);

                    LogPC.println(this,
                                  "Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        mensajeTya =
                            "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                    } else if (responde.getNumEquipos().equalsIgnoreCase("4")) {
                        mensajeTya =
                            "La cuenta ya contiene 4 equipos, no es posible realizar el crecimiento.";
                    } else if (responde.getValida().equals("N")) {
                        if (responde.getEstatus().equals("1")) {
                            mensajeTya = "La cuenta no se encuentra Activa.";
                        } else if (responde.getEstatus().equals("2") ||
                                   responde.getEstatus().equals("3") ||
                                   responde.getEstatus().equals("4")) {
                            mensajeTya =
                                "El tipo de cuenta no permita realizar el crecimiento.";
                        } else if (responde.getEstatus().equals("5")) {
                            mensajeTya =
                                "La cuenta contiene equipos pendientes, no es posible realizar el crecimiento.";
                        } else if (responde.getEstatus().equals("6")) {
                            mensajeTya =
                                "El estatus legal de la cuenta no permite realizar crecimientos.";
                        } else if (responde.getEstatus().equals("7")) {
                            mensajeTya =
                                "Existe una solicitud de servicio abierta de crecimientos.";
                        }
                    } else {
                        cuentaValida = true;
                        valida = "La cuenta es v\u00E1lida para crecimientos.";
                        validaCuenta = "valida";
                        numEquipos = Integer.valueOf(responde.getNumEquipos());

                        paquete = responde.getPaquete();
                        meses = Integer.valueOf(responde.getMeses());
                        //hmcValida = responde.getHmc();
                        String numeroEquiposValida =
                            Integer.toString(numEquipos + sd + hd + phd +
                                             Integer.valueOf(hmc));
                        if (Integer.valueOf(numeroEquiposValida) >= 4) {
                            numeroEquiposValida = "4";
                        } else {
                            numeroEquiposValida =
                                Integer.toString(numEquipos + sd + hd + phd +
                                                 Integer.valueOf(hmc));
                        }
                        convivenciaVeTV =
                            crecimiento.consultaConvivencia("CRECIMIENTO_SEL",
                                                            cuentaSky,
                                                            Integer.toString(sd),
                                                            Integer.toString(hd),
                                                            Integer.toString(phd),
                                                            hmc,
                                                            numeroEquiposValida,
                                                            sesion.getSuscriptor().getPais(),
                                                            tipoCuentaCrece);
                        if (convivenciaVeTV.getOutputParameters().getFLAG().getValue().equalsIgnoreCase("Y") &&
                            getPermisoCrecimiento("EQUIPO_ADICIONAL_OFSC")) {
                            procesoOFCS = true;
                            //enviarSolicitudTyA.setDisabled(true);
                            //enviarSolicutudVeTV.setDisabled(true);
                        } else {
                            procesoOFCS = false;
                            //enviarSolicitudTyA.setDisabled(false);
                            //enviarSolicutudVeTV.setDisabled(false);
                        }
                    }
                }
            }
            horaAtencionFormato = 1.0;

        } catch (ParseException e) {
            mensajeTya =
                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
            mensajeVeTv =
                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
        }
        return validaCuenta;
    }

    public String validaCrecimientos() {
        LogPC.println(this, "validaCrecimientos");

        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        fechaActualFormato = formatoFecha.format(new Date());

        LogPC.println(this, "fechaActualFormato " + fechaActualFormato);

        if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("VETV")) {
            tipoCuentaVeTv = true;
            markerType = "VETV";
        } else {
            tipoCuentaVeTv = false;
            markerType = "TYA";
        }

        try {

            fechaActual = formatoFecha.parse(fechaActualFormato);
            if (markerType.equals("VETV")) {
                ValidaCrecimientosVeTVResponse responde = null;
                //HD
                responde = crecimiento.validacrecimientos_vetv(cuentaSky);

                if (responde != null) {
                    LogPC.println(this, "Valido " + responde.getValido());

                    LogPC.println(this, "Precio " + responde.getPrecio());

                    LogPC.println(this,
                                  "Cuenta VETV " +
                                  sesion.getSuscriptor().getMarketType());

                    LogPC.println(this, "Fecha actual " + fechaActual);

                    LogPC.println(this,
                                  "Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        mensajeVeTv =
                            "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                    } else { 
                        //else if (!responde.getValido().toString().equals("1")){
                        if (responde.getValido().toString().equals("0")) {
                            cuentaValidaVeTv = true;
                            validaVeTV =
                                "La cuenta es v\u00E1lida para crecimientos.";
                            validaCuenta = "valida";
                            precioValida = responde.getPrecio();
                            precioValida = JavaUtils.formatMoneda(precioValida);
                            if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("HD")) {
                                sd = 0;
                                hd = 1;
                                phd = 0;
                                hmc = "0";
                            } else {
                                sd = 1;
                                hd = 0;
                                phd = 0;
                                hmc = "0";
                            }
                            if (getPermisoCrecimiento("EQUIPO_ADICIONAL_OFSC")) {


                                convivenciaVeTV =
                                    crecimiento.consultaConvivencia("CRECIMIENTO_SEL",
                                                                    cuentaSky,
                                                                    Integer.toString(sd),
                                                                    Integer.toString(hd),
                                                                    Integer.toString(phd),
                                                                    hmc,
                                                                    Integer.toString(numEquipos +
                                                                                     sd +
                                                                                     hd +
                                                                                     phd +
                                                                                     Integer.valueOf(hmc)),
                                                                    sesion.getSuscriptor().getPaisISO(),
                                                                    tipoCuentaCrece);
                                if (convivenciaVeTV.getOutputParameters().getFLAG().getValue().equalsIgnoreCase("Y")) {
                                    procesoOFCS = true;
                                    enviarSolicitudTyA.setDisabled(true);
                                    enviarSolicutudVeTV.setDisabled(true);
                                } else {
                                    procesoOFCS = false;
                                    enviarSolicitudTyA.setDisabled(false);
                                    enviarSolicutudVeTV.setDisabled(false);
                                }
                            } else {
                                procesoOFCS = false;
                                enviarSolicitudTyA.setDisabled(false);
                                enviarSolicutudVeTV.setDisabled(false);
                            }
                        } else if (responde.getValido().toString().equals("2")) {
                            mensajeVeTv =
                                "La cuenta tiene m\u00E1s de un equipo.";
                        } else if (responde.getValido().toString().equals("3")) {
                            mensajeVeTv = "La cuenta no tiene recarga.";
                        } else if (responde.getValido().toString().equals("4")) {
                            mensajeVeTv = "La cuenta tiene un SS abierta.";
                        } else {
                            mensajeVeTv =
                                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                            LogServicios.printlnError(this,
                                                      responde.getDescError());
                        }
                        //}
                    }
                }
            } else {
                ValidaCrecimientosTYAResponse responde = null;
                if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("HD")) {
                    sd = 0;
                    hd = 1;
                    phd = 0;
                    hmc = "0";
                } else {
                    sd = 1;
                    hd = 0;
                    phd = 0;
                    hmc = "0";
                }

                responde = crecimiento.validacrecimientos_tya(cuentaSky);
                LogPC.println(this, "validacrecimientos_tya  :  " + responde);
                if (responde != null) {
                    LogPC.println(this, "Valida " + responde.getValida());

                    LogPC.println(this, "Estatus " + responde.getEstatus());

                    LogPC.println(this,
                                  "Cuenta TYA " +
                                  sesion.getSuscriptor().getMarketType());

                    LogPC.println(this, "Fecha actual " + fechaActual);

                    LogPC.println(this,
                                  "Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        mensajeTya =
                            "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                    } else if (responde.getNumEquipos().equalsIgnoreCase("4")) {
                        mensajeTya =
                            "La cuenta ya contiene 4 equipos, no es posible realizar el crecimiento.";
                    }else if (responde.getValida().equals("N")) {
                        if (responde.getEstatus().equals("1")) {
                            mensajeTya = "La cuenta no se encuentra Activa.";
                        } else if (responde.getEstatus().equals("2") ||
                                   responde.getEstatus().equals("3") ||
                                   responde.getEstatus().equals("4")) {
                            mensajeTya =
                                "El tipo de cuenta no permita realizar el crecimiento.";
                        } else if (responde.getEstatus().equals("5")) {
                            mensajeTya =
                                "La cuenta contiene equipos pendientes, no es posible realizar el crecimiento.";
                        } else if (responde.getEstatus().equals("6")) {
                            mensajeTya =
                                "El estatus legal de la cuenta no permite realizar crecimientos.";
                        } else if (responde.getEstatus().equals("7")) {
                            mensajeTya =
                                "Existe una solicitud de servicio abierta de crecimientos.";
                        }
                    } else {
                        cuentaValida = true;
                        valida = "La cuenta es v\u00E1lida para crecimientos.";
                        validaCuenta = "valida";
                        numEquipos = Integer.valueOf(responde.getNumEquipos());

                        paquete = responde.getPaquete();
                        meses = Integer.valueOf(responde.getMeses());
                        //hmcValida = responde.getHmc();
                        String numeroEquiposValida =
                            Integer.toString(numEquipos + sd + hd + phd +
                                             Integer.valueOf(hmc));
                        if (Integer.valueOf(numeroEquiposValida) >= 4) {
                            numeroEquiposValida = "4";
                        } else {
                            numeroEquiposValida =
                                Integer.toString(numEquipos + sd + hd + phd +
                                                 Integer.valueOf(hmc));
                        }
                        if (getPermisoCrecimiento("EQUIPO_ADICIONAL_OFSC")) {
                            convivenciaVeTV =
                                crecimiento.consultaConvivencia("CRECIMIENTO_SEL",
                                                                cuentaSky,
                                                                Integer.toString(sd),
                                                                Integer.toString(hd),
                                                                Integer.toString(phd),
                                                                hmc,
                                                                numeroEquiposValida,
                                                                sesion.getSuscriptor().getPais(),
                                                                tipoCuentaCrece);
                            if (convivenciaVeTV.getOutputParameters().getFLAG().getValue().equalsIgnoreCase("Y")) {
                                procesoOFCS = true;
                                enviarSolicitudTyA.setDisabled(true);
                                enviarSolicutudVeTV.setDisabled(true);
                            } else {
                                procesoOFCS = false;
                                enviarSolicitudTyA.setDisabled(false);
                                enviarSolicutudVeTV.setDisabled(false);
                            }
                        } else {
                            procesoOFCS = false;
                            enviarSolicitudTyA.setDisabled(false);
                            enviarSolicutudVeTV.setDisabled(false);
                        }
                    }
                }
            }
            horaAtencionFormato = 1.0;

        } catch (ParseException e) {
            mensajeTya =
                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
            mensajeVeTv =
                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
        }
        return validaCuenta;
    }

    public void consultaHorarioInstalacion(ActionEvent actionEvent) {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        fechaAtencionFormato = formatoFecha.format(fechaAtencion);
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        capacidadVeTV =
            crecimiento.consultaCapacidad(fechaAtencionFormato,
                                          convivenciaVeTV.getOutputParameters().getCP().getValue(),
                                          sesion.getSuscriptor().getPaisISO(),
                                          convivenciaVeTV.getOutputParameters().getTIPOACT().getValue());
        //capacidadVeTV = crecimiento.consultaCapacidad(fechaAtencionFormato, "03100", sesion.getSuscriptor().getPaisISO(), "AINSCN");
        List<CapacidadPorDiaType> listaUno =
            capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia();
        if (!capacidadVeTV.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") ||
            listaUno.isEmpty()) {
            ADFUtils.showErrorMessage("No se tiene horario disponible de atenci\u00F3n para le fecha seleccionada.");
            LogServicios.printlnError(this,
                                      "No se tiene horario disponible de atenci\u00F3n para le fecha seleccionada");
        } else {
            listCapacidad =
                new ArrayList<SelectItem>(capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot().size());
            if (capacidadVeTV.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                List<TimeSlotType> listFechasCapacidad =
                    capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot();
                if (listFechasCapacidad != null &&
                    !listFechasCapacidad.isEmpty()) {
                    for (TimeSlotType timeSlotType : listFechasCapacidad) {
                        listCapacidad.add(new SelectItem(timeSlotType.getCodigo(),
                                                         timeSlotType.getDescripcion()));
                    }
                }
            }
            enviarSolicitudTyA.setDisabled(false);
            enviarSolicutudVeTV.setDisabled(false);
            ADFUtils.addPartialTarget(enviarSolicitudTyA);
            ADFUtils.addPartialTarget(enviarSolicutudVeTV);
            listHorDispon.setRequired(true);
            ADFUtils.addPartialTarget(listHorDispon);
        }
    }

    public void calculaCrecimientoEquipos(ActionEvent actionEvent) {
        //HD
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        CrearSolicitudServicioSoaInterfaceResponseType respuesta = null;

        if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("HD")) {
            sd = 0;
            hd = 1;
            phd = 0;
        } else {
            sd = 1;
            hd = 0;
            phd = 0;
        }
        if (procesoOFCS) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            fechaAtencionFormato = formatoFecha.format(fechaAtencion);
            for (TimeSlotType tymeSlotType :
                 capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot()) {
                if (tymeSlotType.getCodigo().equalsIgnoreCase(numeroCodigo)) {
                    respuesta =
                        crecimiento.crearSolicitudCrecimiento(cuentaSky,
                                                              convivenciaVeTV.getOutputParameters().getGRUPO().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getTIPO().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getSUBTIPO().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getDISTVTA().getValue(),
                                                              fechaAtencionFormato,
                                                              tymeSlotType.getCodigo(),
                                                              tymeSlotType.getHoraInicio(),
                                                              tymeSlotType.getHoraFin(),
                                                              tymeSlotType.getDescripcion(),
                                                              convivenciaVeTV.getOutputParameters().getCATEGORIACAP().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getDEFCORCHETES().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getTIPOACT().getValue());
                }
            }
            if (!respuesta.getCreaSolicitudServicioSalida().getCABECERA().getCODERROR().equals("0")) {
                ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
            } else {
                sR = respuesta.getCreaSolicitudServicioSalida().getSRNumber();
                ADFUtils.showPopup(popupVETV);
            }
        } else {
            LogPC.println(this, "Calcula Crecimientos");

            CalculaCrecimientosResponse responde = null;

            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

            LogPC.println(this, "sd " + sd);

            LogPC.println(this, "hd " + hd);

            LogPC.println(this, "phd " + phd);

            //equipos = sd + hd + phd;

            String horaActualFormato = formatoHora.format(new Date());
            String horaTardeFormato = "12:00:00";

            Date horaActual = null;
            Date horaTarde = null;

            try {
                horaActual = formatoHora.parse(horaActualFormato);
                horaTarde = formatoHora.parse(horaTardeFormato);

                LogPC.println(this, "horaActual " + horaActual);
                LogPC.println(this, "horaTarde " + horaTarde);
            } catch (ParseException e) {
                ADFUtils.showInfoMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
            }

            fechaAtencionFormato = formatoFecha.format(fechaAtencion);

            LogPC.println(this, "fechaAtencionFormato " + fechaAtencionFormato);

            LogPC.println(this, "fechaAtencion " + fechaAtencion);

            if (fechaAtencionFormato.equals(fechaActualFormato) &
                horaActual.after(horaTarde) & horaAtencionFormato.equals(1.0)) {
                ADFUtils.showInfoMessage("La hora de atenci\u00F3n debe ser mayor a la actual");
            }
            /*else if(equipos == 0){
            ADFUtils.showInfoMessage("Se debe seleccionar al menos un equipo.");
        }
        else if(equipos > 1){
             ADFUtils.showInfoMessage("La cantidad de equipos excede los permitidos.");
        }*/
            else {

                if (horaAtencionFormato.equals(1.0)) {
                    horaAtencion = "A.M.";
                } else if (horaAtencionFormato.equals(2.0)) {
                    horaAtencion = "P.M.";
                } else if (horaAtencionFormato.equals(3.0)) {
                    horaAtencion = "Abierto";
                }

                LogPC.println(this,
                              "horaAtencionFormato " + horaAtencionFormato);

                LogPC.println(this, "horaAtencion " + horaAtencion);

                responde =
                    crecimiento.calculacrecimientos_vetv(cuentaSky,
                                                         Integer.toString(sd),
                                                         Integer.toString(hd),
                                                         Integer.toString(phd),
                                                         fechaAtencionFormato,
                                                         "VETV");

                if (responde != null) {
                    LogPC.println(this,
                                  "Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                    } else {
                        LogPC.println(this, "Precio " + responde.getPrecio());

                        precio = responde.getPrecio().doubleValue();

                        if (insertaCrecimientosVeTv()) {
                            ADFUtils.showPopup(popupVETV);
                        } else {
                            ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                        }
                    }
                }
            }
        }
    }

    private boolean getPermisoCrecimiento(String code) {
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        return sesion.getPermisoCrecimiento(code);
    }

    public void ventaCrecimientoEquipos(ActionEvent actionEvent) {
        CrearSolicitudServicioSoaInterfaceResponseType respuesta = null;
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");

        LogPC.println(this, "Venta Crecimientos");

        VentaCrecimientosTYAResponse responde = null;

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        hmc = "0";

        LogPC.println(this, "sd " + sd);

        LogPC.println(this, "hd " + hd);

        LogPC.println(this, "phd " + phd);

        equipos = sd + hd + phd;
        int equiposHD = hd + phd;
        maximo = 4;
        int totalEquipos = equipos + numEquipos;

        LogPC.println(this, "numEquipos " + numEquipos);

        LogPC.println(this, "paquete " + paquete);

        LogPC.println(this, "meses " + meses);

        if (paquete.equals("ACCESS")) {
            maximo = 2;
        }

        String horaActualFormato = formatoHora.format(new Date());
        String horaTardeFormato = "12:00:00";

        Date horaActual = null;
        Date horaTarde = null;

        try {
            horaActual = formatoHora.parse(horaActualFormato);
            horaTarde = formatoHora.parse(horaTardeFormato);

            LogPC.println(this, "horaActual " + horaActual);
            LogPC.println(this, "horaTarde " + horaTarde);
        } catch (ParseException e) {
            ADFUtils.showInfoMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
        }

        fechaAtencionFormato = formatoFecha.format(fechaAtencion);

        LogPC.println(this, "fechaAtencionFormato " + fechaAtencionFormato);

        if (equipos == 0) {
            ADFUtils.showInfoMessage("Se debe seleccionar al menos un equipo.");
        } else if (paquete.equals("BASICO") & meses < 18 & equiposHD > 0) {
            ADFUtils.showInfoMessage("No es posible contratar equipos con funcionalidad HD.");
        } else if ((paquete.equals("ACCESS") & equiposHD > 0)) {
            ADFUtils.showInfoMessage("No es posible contratar equipos con funcionalidad HD.");
        } else if (paquete.equals("ACCESS") & totalEquipos > 2) {
            ADFUtils.showInfoMessage("No es posible crecer a m\u00E1s de dos equipos.");
        } else if (totalEquipos > maximo) {
            ADFUtils.showInfoMessage("La cantidad de equipos excede los permitidos.");
        } else if (fechaAtencionFormato.equals(fechaActualFormato) &
                   horaActual.after(horaTarde) &
                   horaAtencionFormato.equals(1.0)) {
            ADFUtils.showInfoMessage("La hora de atenci\u00F3n debe ser mayor a la actual");
        } else {
            if (procesoOFCS) {
                formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                fechaAtencionFormato = formatoFecha.format(fechaAtencion);
                convivenciaVeTV =
                    crecimiento.consultaConvivencia("CRECIMIENTO_SEL",
                                                    cuentaSky,
                                                    Integer.toString(sd),
                                                    Integer.toString(hd),
                                                    Integer.toString(phd), hmc,
                                                    Integer.toString(numEquipos),
                                                    sesion.getSuscriptor().getPais(),
                                                    tipoCuentaCrece);
                for (TimeSlotType tymeSlotType :
                     capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot()) {
                    if (tymeSlotType.getCodigo().equalsIgnoreCase(numeroCodigo)) {
                        respuesta =
                            crecimiento.crearSolicitudCrecimiento(cuentaSky,
                                                                  convivenciaVeTV.getOutputParameters().getGRUPO().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getTIPO().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getSUBTIPO().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getDISTVTA().getValue(),
                                                                  fechaAtencionFormato,
                                                                  tymeSlotType.getCodigo(),
                                                                  tymeSlotType.getHoraInicio(),
                                                                  tymeSlotType.getHoraFin(),
                                                                  tymeSlotType.getDescripcion(),
                                                                  convivenciaVeTV.getOutputParameters().getCATEGORIACAP().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getDEFCORCHETES().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getTIPOACT().getValue());
                    }
                }
                if (!respuesta.getCreaSolicitudServicioSalida().getCABECERA().getCODERROR().equals("0")) {
                    ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                } else {
                    sSTransaccion =
                        respuesta.getCreaSolicitudServicioSalida().getSRNumber();
                    ADFUtils.showPopup(popupTYA);
                }
            } else {
                if (horaAtencionFormato.equals(1.0)) {
                    horaAtencion = "A.M.";
                } else if (horaAtencionFormato.equals(2.0)) {
                    horaAtencion = "P.M.";
                } else if (horaAtencionFormato.equals(3.0)) {
                    horaAtencion = "Abierto";
                }

                LogPC.println(this,
                              "horaAtencionFormato " + horaAtencionFormato);

                LogPC.println(this, "horaAtencion " + horaAtencion);

                responde =
                    crecimiento.ventacrecimientos_tya(cuentaSky,
                                                      Integer.toString(sd),
                                                      Integer.toString(hd),
                                                      Integer.toString(phd),
                                                      fechaAtencionFormato,
                                                      horaAtencion,
                                                      Integer.toString(numEquipos),
                                                      hmc);

                if (responde != null) {
                    LogPC.println(this,
                                  "ventaCrecimientoEquipos Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                    } else {
                        LogPC.println(this,
                                      "SS Transacci\u00F3n " +
                                      responde.getSsTransaction());

                        sSTransaccion = responde.getSsTransaction();

                        if (insertaCrecimientosTyA()) {
                            ADFUtils.showPopup(popupTYA);
                        } else {
                            ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                        }
                    }
                }
            }
        }

    }

    public boolean insertaCrecimientosVeTv() {
        LogPC.println(this, "insertaCrecimientosVeTv");

        InsertaCrecmientosVeTVResponse responde = null;
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();

        responde =
            crecimiento.insertacrecimientos_vetv(cuentaSky,
                                                 fechaAtencionFormato,
                                                 horaAtencion,
                                                 precio.toString());

        if (responde != null) {
            LogPC.println(this,
                          "insertaCrecimientosVeTv Codigo de error " +
                          responde.getCodigoError());

            if (responde.getCodigoError().equals("1")) {
                LogServicios.printlnError(this, responde.getDescError());
                return false;
            } else {
                LogPC.println(this, "Sr " + responde.getSr());

                sR = responde.getSr();
            }
        }
        return true;
    }

    public boolean insertaCrecimientosTyA() {
        LogPC.println(this, "insertaCrecimientosTyA");

        InsertaCrecimientosTYAResponse responde = null;
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        Integer crece = equipos + numEquipos;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");

        if (sesion.getSistema().equals("HIJUMP")) {
            mig = "Y";
        } else {
            mig = "N";
        }

        LogPC.println(this, "mig " + mig);

        responde =
            crecimiento.insertacrecimientos_tya(cuentaSky, Integer.toString(sd),
                                                Integer.toString(hd),
                                                Integer.toString(phd),
                                                fechaAtencionFormato,
                                                horaAtencion, crece.toString(),
                                                Integer.toString(maximo),
                                                Integer.toString(numEquipos),
                                                paquete, sSTransaccion, mig,
                                                hmc);

        if (responde != null) {
            LogPC.println(this,
                          "insertaCrecimientosTyA Codigo de error " +
                          responde.getCodigoError());

            if (responde.getCodigoError().equals("1")) {
                LogServicios.printlnError(this, responde.getDescError());
                return false;
            } else {
                LogPC.println(this, "insertaCrecimientosTyA");

            }
        }
        return true;
    }

    public String nuevoCrecimiento() {
        LogPC.println(this, "nuevoCrecimiento");

        //cuentaSky = null;
        //nombreSuscriptor = null;

        mensajeTya = null;
        mensajeVeTv = null;
        validaVeTV = null;
        valida = null;
        validaCuenta = null;
        numEquipos = 0;
        equipos = 0;
        maximo = 0;
        sd = 0;
        hd = 0;
        phd = 0;
        fechaAtencion = null;
        fechaAtencionFormato = null;
        fechaActual = null;
        fechaActualFormato = null;
        horaAtencion = null;
        horaAtencionFormato = null;
        cuentaValida = false;
        cuentaValidaVeTv = false;
        tipoCuentaVeTv = false;
        paquete = null;
        meses = null;
        precio = null;
        hmc = null;
        markerType = null;
        mig = null;
        sSTransaccion = null;
        sR = null;

        errorEnviarTya = false;
        mensajeErrorTya = null;
        errorEnviarVeTv = false;
        mensajeErrorVeTv = null;

        LogPC.println(this, "cuentaValida " + cuentaValida);

        LogPC.println(this, "cuentaValidaVeTv " + cuentaValidaVeTv);

        LogPC.println(this, "validaCuenta " + validaCuenta);
        ADFUtils.hidePopup(popupVETV);
        ADFUtils.hidePopup(popupTYA);
        return "regresar";
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setFechaAtencion(Date fechaAtencion) {
        this.fechaAtencion = fechaAtencion;
    }

    public Date getFechaAtencion() {
        return fechaAtencion;
    }

    public void setMig(String mig) {
        this.mig = mig;
    }

    public String getMig() {
        return mig;
    }

    public void setHoraAtencion(String horaAtencion) {
        this.horaAtencion = horaAtencion;
    }

    public String getHoraAtencion() {
        return horaAtencion;
    }

    public void setValidaVeTV(String validaVeTV) {
        this.validaVeTV = validaVeTV;
    }

    public String getValidaVeTV() {
        return validaVeTV;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setSSTransaccion(String sSTransaccion) {
        this.sSTransaccion = sSTransaccion;
    }

    public String getSSTransaccion() {
        return sSTransaccion;
    }

    public void setCuentaSky(String cuentaSky) {
        this.cuentaSky = cuentaSky;
    }

    public String getCuentaSky() {
        return cuentaSky;
    }

    public void setCuentaValida(boolean cuentaValida) {
        this.cuentaValida = cuentaValida;
    }

    public boolean isCuentaValida() {
        return cuentaValida;
    }

    public void setValida(String valida) {
        this.valida = valida;
    }

    public String getValida() {
        return valida;
    }

    public void setMensajeTya(String mensajeTya) {
        this.mensajeTya = mensajeTya;
    }

    public String getMensajeTya() {
        return mensajeTya;
    }

    public void setMensajeVeTv(String mensajeVeTv) {
        this.mensajeVeTv = mensajeVeTv;
    }

    public String getMensajeVeTv() {
        return mensajeVeTv;
    }

    public void setCuentaValidaVeTv(boolean cuentaValidaVeTv) {
        this.cuentaValidaVeTv = cuentaValidaVeTv;
    }

    public boolean isCuentaValidaVeTv() {
        return cuentaValidaVeTv;
    }

    public void setMarkerType(String markerType) {
        this.markerType = markerType;
    }

    public String getMarkerType() {
        return markerType;
    }

    public void setTipoCuentaVeTv(boolean tipoCuentaVeTv) {
        this.tipoCuentaVeTv = tipoCuentaVeTv;
    }

    public boolean isTipoCuentaVeTv() {
        return tipoCuentaVeTv;
    }

    public void setFechaActual(Date fechaActual) {
        this.fechaActual = fechaActual;
    }

    public Date getFechaActual() {
        return fechaActual;
    }

    public void setSR(String sR) {
        this.sR = sR;
    }

    public String getSR() {
        return sR;
    }

    public void setHmc(String hmc) {
        this.hmc = hmc;
    }

    public String getHmc() {
        return hmc;
    }

    public void setPopupTYA(RichPopup popupTYA) {
        this.popupTYA = popupTYA;
    }

    public RichPopup getPopupTYA() {
        return popupTYA;
    }

    public void setPopupVETV(RichPopup popupVETV) {
        this.popupVETV = popupVETV;
    }

    public RichPopup getPopupVETV() {
        return popupVETV;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setFechaAtencionFormato(String fechaAtencionFormato) {
        this.fechaAtencionFormato = fechaAtencionFormato;
    }

    public String getFechaAtencionFormato() {
        return fechaAtencionFormato;
    }

    public void setSd(int sd) {
        this.sd = sd;
    }

    public int getSd() {
        return sd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getHd() {
        return hd;
    }

    public void setPhd(int phd) {
        this.phd = phd;
    }

    public int getPhd() {
        return phd;
    }

    public void setNombreSuscriptor(String nombreSuscriptor) {
        this.nombreSuscriptor = nombreSuscriptor;
    }

    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    public void setFechaActualFormato(String fechaActualFormato) {
        this.fechaActualFormato = fechaActualFormato;
    }

    public String getFechaActualFormato() {
        return fechaActualFormato;
    }

    public void setPrecioValida(String precioValida) {
        this.precioValida = precioValida;
    }

    public String getPrecioValida() {
        return precioValida;
    }

    public void setEquipos(int equipos) {
        this.equipos = equipos;
    }

    public int getEquipos() {
        return equipos;
    }

    public void setHoraAtencionFormato(Double horaAtencionFormato) {
        this.horaAtencionFormato = horaAtencionFormato;
    }

    public Double getHoraAtencionFormato() {
        return horaAtencionFormato;
    }

    public void setValidaCuenta(String validaCuenta) {
        this.validaCuenta = validaCuenta;
    }

    public String getValidaCuenta() {
        return validaCuenta;
    }

    public void setErrorEnviarVeTv(boolean errorEnviarVeTv) {
        this.errorEnviarVeTv = errorEnviarVeTv;
    }

    public boolean isErrorEnviarVeTv() {
        return errorEnviarVeTv;
    }

    public void setMensajeErrorTya(String mensajeErrorTya) {
        this.mensajeErrorTya = mensajeErrorTya;
    }

    public String getMensajeErrorTya() {
        return mensajeErrorTya;
    }

    public void setMensajeErrorVeTv(String mensajeErrorVeTv) {
        this.mensajeErrorVeTv = mensajeErrorVeTv;
    }

    public String getMensajeErrorVeTv() {
        return mensajeErrorVeTv;
    }

    public void setErrorEnviarTya(boolean errorEnviarTya) {
        this.errorEnviarTya = errorEnviarTya;
    }

    public boolean isErrorEnviarTya() {
        return errorEnviarTya;
    }


    public String calculaCrecimientoMobile() {
        //HD
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        String calcula = null;
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        CrearSolicitudServicioSoaInterfaceResponseType respuesta = null;
        if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("HD")) {
            sd = 0;
            hd = 1;
            phd = 0;
        } else {
            sd = 1;
            hd = 0;
            phd = 0;
        }
        if (procesoOFCS) {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            fechaAtencionFormato = formatoFecha.format(fechaAtencion);
            for (TimeSlotType tymeSlotType :
                 capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot()) {
                if (tymeSlotType.getCodigo().equalsIgnoreCase(numeroCodigo)) {
                    respuesta =
                        crecimiento.crearSolicitudCrecimiento(cuentaSky,
                                                              convivenciaVeTV.getOutputParameters().getGRUPO().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getTIPO().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getSUBTIPO().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getDISTVTA().getValue(),
                                                              fechaAtencionFormato,
                                                              tymeSlotType.getCodigo(),
                                                              tymeSlotType.getHoraInicio(),
                                                              tymeSlotType.getHoraFin(),
                                                              tymeSlotType.getDescripcion(),
                                                              convivenciaVeTV.getOutputParameters().getCATEGORIACAP().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getDEFCORCHETES().getValue(),
                                                              convivenciaVeTV.getOutputParameters().getTIPOACT().getValue());
                }
            }
            if (!respuesta.getCreaSolicitudServicioSalida().getCABECERA().getCODERROR().equals("0")) {
                errorEnviarVeTv = true;
                mensajeErrorVeTv =
                    "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
            } else {
                sR = respuesta.getCreaSolicitudServicioSalida().getSRNumber();
                calcula = "irVeTv";
            }
        } else {
            LogPC.println(this, "Calcula Crecimiento Mobile");


            CalculaCrecimientosResponse responde = null;

            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");


            //HD
            if (sesion.getSuscriptor().getMarketType().toUpperCase().contains("HD")) {
                sd = 0;
                hd = 1;
                phd = 0;
            } else {
                sd = 1;
                hd = 0;
                phd = 0;
            }

            LogPC.println(this, "sd " + sd);

            LogPC.println(this, "hd " + hd);

            LogPC.println(this, "phd " + phd);

            //equipos = sd + hd + phd;

            String horaActualFormato = formatoHora.format(new Date());
            String horaTardeFormato = "12:00:00";

            Date horaActual = null;
            Date horaTarde = null;

            try {
                horaActual = formatoHora.parse(horaActualFormato);
                horaTarde = formatoHora.parse(horaTardeFormato);

                LogPC.println(this, "horaActual " + horaActual);
                LogPC.println(this, "horaTarde " + horaTarde);
            } catch (ParseException e) {
                //ADFUtils.showInfoMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                errorEnviarVeTv = true;
                mensajeErrorVeTv =
                    "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
            }

            fechaAtencionFormato = formatoFecha.format(fechaAtencion);

            LogPC.println(this, "fechaAtencionFormato " + fechaAtencionFormato);

            if (fechaAtencionFormato.equals(fechaActualFormato) &
                horaActual.after(horaTarde) & horaAtencionFormato.equals(1.0)) {
                //ADFUtils.showInfoMessage("La hora de atenci\u00F3n debe ser mayor a la actual");
                errorEnviarVeTv = true;
                mensajeErrorVeTv =
                    "La hora de atenci\u00F3n debe ser mayor a la actual";
            }
            /*else if(equipos == 0){
            ADFUtils.showInfoMessage("Se debe seleccionar al menos un equipo.");
        }
        else if(equipos > 1){
             ADFUtils.showInfoMessage("La cantidad de equipos excede los permitidos.");
        }*/
            else {

                if (horaAtencionFormato.equals(1.0)) {
                    horaAtencion = "A.M.";
                } else if (horaAtencionFormato.equals(2.0)) {
                    horaAtencion = "P.M.";
                } else if (horaAtencionFormato.equals(3.0)) {
                    horaAtencion = "Abierto";
                }

                LogPC.println(this,
                              "horaAtencionFormato " + horaAtencionFormato);

                LogPC.println(this, "horaAtencion " + horaAtencion);

                responde =
                    crecimiento.calculacrecimientos_vetv(cuentaSky,
                                                         Integer.toString(sd),
                                                         Integer.toString(hd),
                                                         Integer.toString(phd),
                                                         fechaAtencionFormato,
                                                         "VETV");

                if (responde != null) {
                    LogPC.println(this,
                                  "calculaCrecimientoMobile Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        //ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                        errorEnviarVeTv = true;
                        mensajeErrorVeTv =
                            "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                    } else {
                        LogPC.println(this, "Precio " + responde.getPrecio());

                        precio = responde.getPrecio().doubleValue();

                        if (insertaCrecimientosVeTv()) {
                            //ADFUtils.showPopup(popupVETV);
                            calcula = "irVeTv";
                        } else {
                            //ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                            errorEnviarVeTv = true;
                            mensajeErrorVeTv =
                                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                        }
                    }
                }
            }
        }
        return calcula;
    }

    public String ventaCrecimientoMobile() {
        LogPC.println(this, "Venta Crecimiento Mobile");
        CrearSolicitudServicioSoaInterfaceResponseType respuesta = null;
        String venta = null;
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        VentaCrecimientosTYAResponse responde = null;
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        hmc = "0";

        LogPC.println(this, "sd " + sd);

        LogPC.println(this, "hd " + hd);

        LogPC.println(this, "phd " + phd);


        equipos = sd + hd + phd;
        int equiposHD = hd + phd;
        maximo = 4;
        int totalEquipos = equipos + numEquipos;

        LogPC.println(this, "numEquipos " + numEquipos);

        LogPC.println(this, "paquete " + paquete);

        LogPC.println(this, "meses " + meses);

        if (paquete.equals("ACCESS")) {
            maximo = 2;
        }

        String horaActualFormato = formatoHora.format(new Date());
        String horaTardeFormato = "12:00:00";

        Date horaActual = null;
        Date horaTarde = null;

        try {
            horaActual = formatoHora.parse(horaActualFormato);
            horaTarde = formatoHora.parse(horaTardeFormato);

            LogPC.println(this, "horaActual " + horaActual);
            LogPC.println(this, "horaTarde " + horaTarde);
        } catch (ParseException e) {
            //ADFUtils.showInfoMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
            errorEnviarTya = true;
            mensajeErrorTya =
                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
        }

        fechaAtencionFormato = formatoFecha.format(fechaAtencion);

        LogPC.println(this, "fechaAtencionFormato " + fechaAtencionFormato);

        if (equipos == 0) {
            //ADFUtils.showInfoMessage("Se debe seleccionar al menos un equipo.");
            errorEnviarTya = true;
            mensajeErrorTya = "Se debe seleccionar al menos un equipo.";
        } else if ((paquete.equals("BASICO") & meses < 18 & equiposHD > 0) |
                   (paquete.equals("BASICO") & equiposHD > 0)) {
            //ADFUtils.showInfoMessage("No puede contratar crecimiento con funcionalidad HD.");
            errorEnviarTya = true;
            mensajeErrorTya =
                "No puede contratar crecimiento con funcionalidad HD.";
        } else if ((paquete.equals("ACCESS") & equiposHD > 0)) {
            //ADFUtils.showInfoMessage("No puede contratar crecimiento con funcionalidad HD.");
            errorEnviarTya = true;
            mensajeErrorTya =
                "No puede contratar crecimiento con funcionalidad HD.";
        } else if (paquete.equals("ACCESS") & totalEquipos > 2) {
            //ADFUtils.showInfoMessage("No puede crecer a m\u00E1s de dos equipos.");
            errorEnviarTya = true;
            mensajeErrorTya = "No puede crecer a m\u00E1s de dos equipos.";
        } else if (totalEquipos > maximo) {
            //ADFUtils.showInfoMessage("La cantidad de equipos excede los permitidos.");
            errorEnviarTya = true;
            mensajeErrorTya = "La cantidad de equipos excede los permitidos.";
        } else if (fechaAtencionFormato.equals(fechaActualFormato) &
                   horaActual.after(horaTarde) &
                   horaAtencionFormato.equals(1.0)) {
            //ADFUtils.showInfoMessage("La hora de atenci\u00F3n debe ser mayor a la actual");
            errorEnviarTya = true;
            mensajeErrorTya =
                "La hora de atenci\u00F3n debe ser mayor a la actua";
        } else {
            if (procesoOFCS) {
                formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                fechaAtencionFormato = formatoFecha.format(fechaAtencion);
                convivenciaVeTV =
                    crecimiento.consultaConvivencia("CRECIMIENTO_SEL",
                                                    cuentaSky,
                                                    Integer.toString(sd),
                                                    Integer.toString(hd),
                                                    Integer.toString(phd), hmc,
                                                    Integer.toString(numEquipos),
                                                    sesion.getSuscriptor().getPais(),
                                                    tipoCuentaCrece);
                for (TimeSlotType tymeSlotType :
                     capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot()) {
                    if (tymeSlotType.getCodigo().equalsIgnoreCase(numeroCodigo)) {
                        respuesta =
                            crecimiento.crearSolicitudCrecimiento(cuentaSky,
                                                                  convivenciaVeTV.getOutputParameters().getGRUPO().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getTIPO().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getSUBTIPO().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getDISTVTA().getValue(),
                                                                  fechaAtencionFormato,
                                                                  tymeSlotType.getCodigo(),
                                                                  tymeSlotType.getHoraInicio(),
                                                                  tymeSlotType.getHoraFin(),
                                                                  tymeSlotType.getDescripcion(),
                                                                  convivenciaVeTV.getOutputParameters().getCATEGORIACAP().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getDEFCORCHETES().getValue(),
                                                                  convivenciaVeTV.getOutputParameters().getTIPOACT().getValue());
                    }
                }
                if (!respuesta.getCreaSolicitudServicioSalida().getCABECERA().getCODERROR().equals("0")) {
                    errorEnviarTya = true;
                    mensajeErrorTya =
                        "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                } else {
                    sSTransaccion =
                        respuesta.getCreaSolicitudServicioSalida().getSRNumber();
                    venta = "irTya";
                }
            } else {
                if (horaAtencionFormato.equals(1.0)) {
                    horaAtencion = "A.M.";
                } else if (horaAtencionFormato.equals(2.0)) {
                    horaAtencion = "P.M.";
                } else if (horaAtencionFormato.equals(3.0)) {
                    horaAtencion = "Abierto";
                }

                LogPC.println(this,
                              "horaAtencionFormato " + horaAtencionFormato);

                LogPC.println(this, "horaAtencion " + horaAtencion);

                responde =
                    crecimiento.ventacrecimientos_tya(cuentaSky,
                                                      Integer.toString(sd),
                                                      Integer.toString(hd),
                                                      Integer.toString(phd),
                                                      fechaAtencionFormato,
                                                      horaAtencion,
                                                      Integer.toString(numEquipos),
                                                      hmc);

                if (responde != null) {
                    LogPC.println(this,
                                  "ventaCrecimientoMobile Codigo de error " +
                                  responde.getCodigoError());

                    if (responde.getCodigoError().equals("1")) {
                        //ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                        LogServicios.printlnError(this,
                                                  responde.getDescError());
                        errorEnviarTya = true;
                        mensajeErrorTya =
                            "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                    } else {
                        LogPC.println(this,
                                      "SS Transacci\u00F3n " +
                                      responde.getSsTransaction());

                        sSTransaccion = responde.getSsTransaction();

                        if (insertaCrecimientosTyA()) {
                            //ADFUtils.showPopup(popupTYA);
                            OperacionBAMUtils.registrarOperacion(EnumOperacionBAM.CONTRATA_CRECIMIENTO_EQUIPO);
                            venta = "irTya";
                        } else {
                            //ADFUtils.showErrorMessage("Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.");
                            errorEnviarTya = true;
                            mensajeErrorTya =
                                "Por el momento el sistema no esta disponible. Favor de intentar m\u00E1s tarde.";
                        }
                    }
                }
            }
        }
        return venta;
    }

    public void setProcesoOFCS(boolean procesoOFCS) {
        this.procesoOFCS = procesoOFCS;
    }

    public boolean isProcesoOFCS() {
        return procesoOFCS;
    }


    public void setListCapacidad(List<SelectItem> listCapacidad) {
        this.listCapacidad = listCapacidad;
    }

    public List<SelectItem> getListCapacidad() {
        return listCapacidad;
    }

    public void setNumeroCodigo(String numeroCodigo) {
        this.numeroCodigo = numeroCodigo;
    }

    public String getNumeroCodigo() {
        return numeroCodigo;
    }

    public void setTipoCuentaCrece(String tipoCuentaCrece) {
        this.tipoCuentaCrece = tipoCuentaCrece;
    }

    public String getTipoCuentaCrece() {
        return tipoCuentaCrece;
    }

    public void setEnviarSolicitudTyA(RichButton enviarSolicitudTyA) {
        this.enviarSolicitudTyA = enviarSolicitudTyA;
    }

    public RichButton getEnviarSolicitudTyA() {
        return enviarSolicitudTyA;
    }

    public void setListHorDispon(RichSelectOneChoice listHorDispon) {
        this.listHorDispon = listHorDispon;
    }

    public RichSelectOneChoice getListHorDispon() {
        return listHorDispon;
    }

    public void setEnviarSolicutudVeTV(RichButton enviarSolicutudVeTV) {
        this.enviarSolicutudVeTV = enviarSolicutudVeTV;
    }

    public RichButton getEnviarSolicutudVeTV() {
        return enviarSolicutudVeTV;
    }

    public String consultaHorarioInstalacionMobile() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        fechaAtencionFormato = formatoFecha.format(fechaAtencion);
        ConfigMenu sesion = (ConfigMenu)JSFUtils.getBean("sesion");
        ServicioCrecimientoEquipos crecimiento =
            new ServicioCrecimientoEquipos();
        capacidadVeTV =
            crecimiento.consultaCapacidad(fechaAtencionFormato,
                                          convivenciaVeTV.getOutputParameters().getCP().getValue(),
                                          sesion.getSuscriptor().getPaisISO(),
                                          convivenciaVeTV.getOutputParameters().getTIPOACT().getValue());
        //capacidadVeTV = crecimiento.consultaCapacidad(fechaAtencionFormato, "03100", sesion.getSuscriptor().getPaisISO(), "AINSCN");
        List<CapacidadPorDiaType> listaUno =
            capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia();
        if (!capacidadVeTV.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0") ||
            listaUno.isEmpty()) {
            ADFUtils.showErrorMessage("No se tiene horario disponible de atenci\u00F3n para le fecha seleccionada.");
            LogServicios.printlnError(this,
                                      "No se tiene horario disponible de atenci\u00F3n para le fecha seleccionada");
        } else {
            listCapacidad =
                new ArrayList<SelectItem>(capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot().size());
            if (capacidadVeTV.getEBMHeaderResponse().getErrorNegocio().getCodigoError().equalsIgnoreCase("0")) {
                List<TimeSlotType> listFechasCapacidad =
                    capacidadVeTV.getConsultarCapacidadFSResponseEBM().getConsultarCapacidadFSResponse().getCapacidad().getCapacidadPorDia().get(0).getTimeSlots().getTimeSlot();
                if (listFechasCapacidad != null &&
                    !listFechasCapacidad.isEmpty()) {
                    for (TimeSlotType timeSlotType : listFechasCapacidad) {
                        listCapacidad.add(new SelectItem(timeSlotType.getCodigo(),
                                                         timeSlotType.getDescripcion()));
                    }
                }
            }
            //enviarSolicitudTyAMobile.setDisabled(false);
            //enviarSolicitudVeTVMobile.setDisabled(false);
            //ADFUtils.addPartialTarget(enviarSolicitudTyA);
            //ADFUtils.addPartialTarget(enviarSolicutudVeTV);
            listHorDisponMobile.setRequired(true);
            ADFUtils.addPartialTarget(listHorDisponMobile);
        }
        return null;
    }

    public void setEnviarSolicitudTyAMobile(CoreCommandLink enviarSolicitudTyAMobile) {
        this.enviarSolicitudTyAMobile = enviarSolicitudTyAMobile;
    }

    public CoreCommandLink getEnviarSolicitudTyAMobile() {
        return enviarSolicitudTyAMobile;
    }

    public void setEnviarSolicitudVeTVMobile(CoreCommandLink enviarSolicitudVeTVMobile) {
        this.enviarSolicitudVeTVMobile = enviarSolicitudVeTVMobile;
    }

    public CoreCommandLink getEnviarSolicitudVeTVMobile() {
        return enviarSolicitudVeTVMobile;
    }

    public void setListHorDisponMobile(CoreSelectOneChoice listHorDisponMobile) {
        this.listHorDisponMobile = listHorDisponMobile;
    }

    public CoreSelectOneChoice getListHorDisponMobile() {
        return listHorDisponMobile;
    }

}
