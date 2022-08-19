package mx.com.sky.sel.services.beans.solicitudservicio;

import java.io.Serializable;

import mx.com.sky.sel.services.beans.apg.RemoteBooking;
import mx.com.sky.sel.services.beans.cambiopaquete.Paquete;
import mx.com.sky.sel.services.beans.controlremoto.ControlRemotoBean;
import mx.com.sky.sel.services.beans.eventos.Evento;
import mx.com.sky.sel.services.beans.informacionfiscal.DatosFiscales;
import mx.com.sky.sel.services.beans.utils.Direccion;
public class SolicitudServicioBean implements Serializable {
    @SuppressWarnings("compatibility:-3336371700442288353")
    private static final long serialVersionUID = 9143122574317931058L;
    protected String cuenta;
    protected String nombreSuscriptor;
    protected String tipoCuenta;
    protected String area;
    protected String subArea;
    protected String descripcion;
    protected String status;
    protected String tarjetaInteligente;
    protected String contactoRowId;
    protected String correoElectronico;
    protected String pais;
    protected DatosFiscales datosFiscales;
    protected Direccion direccion;
    protected Paquete contratacionServicios;
    protected ControlRemotoBean controlRemoto;
    protected Evento infoPPE;
    protected String sistema;
    protected String idSesion;
    protected RemoteBooking remoteBooking;

    public SolicitudServicioBean() {
        super();
        datosFiscales = new DatosFiscales();
        direccion = new Direccion();
        contratacionServicios = new Paquete();
        controlRemoto = new ControlRemotoBean();
        infoPPE = new Evento();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SolicitudServicioBean [");
        if (tipoCuenta != null) {
            builder.append("tipoCuenta=");
            builder.append(tipoCuenta);
            builder.append(", ");
        }

        if (cuenta != null) {
            builder.append("cuenta=");
            builder.append(cuenta);
            builder.append(", ");
        }
        if (area != null) {
            builder.append("area=");
            builder.append(area);
            builder.append(", ");
        }
        if (subArea != null) {
            builder.append("subArea=");
            builder.append(subArea);
            builder.append(", ");
        }
        if (status != null) {
            builder.append("status=");
            builder.append(status);
            builder.append(", ");
        }
        if (tarjetaInteligente != null) {
            builder.append("tarjetaInteligente=");
            builder.append(tarjetaInteligente);
            builder.append(", ");
        }
        if (contactoRowId != null) {
            builder.append("contactoRowId=");
            builder.append(contactoRowId);
            builder.append(", ");
        }
        if (pais != null) {
            builder.append("pais=");
            builder.append(pais);
            builder.append(", ");
        }

        if (descripcion != null) {
            builder.append("descripcion=");
            builder.append(descripcion);
            builder.append(", ");
        }
        if (correoElectronico != null) {
            builder.append("correoElectronico=");
            builder.append(correoElectronico);
            builder.append(", ");
        }
        if (datosFiscales != null) {
            builder.append("datosFiscales=");
            builder.append(datosFiscales);
            builder.append(", ");
        }
        if (direccion != null) {
            builder.append("direccion=");
            builder.append(direccion);
            builder.append(", ");
        }
        if (contratacionServicios != null) {
            builder.append("contratacionServicios=");
            builder.append(contratacionServicios);
            builder.append(", ");
        }
        if (controlRemoto != null) {
            builder.append("controlRemoto=");
            builder.append(controlRemoto);
            builder.append(", ");
        }
        if (infoPPE != null) {
            builder.append("infoPPE=");
            builder.append(infoPPE);
        }
        builder.append("]");
        return builder.toString();
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setSubArea(String subArea) {
        this.subArea = subArea;
    }

    public String getSubArea() {
        return subArea;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTarjetaInteligente(String tarjetaInteligente) {
        this.tarjetaInteligente = tarjetaInteligente;
    }

    public String getTarjetaInteligente() {
        return tarjetaInteligente;
    }

    public void setContactoRowId(String contactoRowId) {
        this.contactoRowId = contactoRowId;
    }

    public String getContactoRowId() {
        return contactoRowId;
    }

    public void setDatosFiscales(DatosFiscales datosFiscales) {
        this.datosFiscales = datosFiscales;
    }

    public DatosFiscales getDatosFiscales() {
        return datosFiscales;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setContratacionServicios(Paquete contratacionServicios) {
        this.contratacionServicios = contratacionServicios;
    }

    public Paquete getContratacionServicios() {
        return contratacionServicios;
    }

    public void setControlRemoto(ControlRemotoBean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public ControlRemotoBean getControlRemoto() {
        return controlRemoto;
    }

    public void setInfoPPE(Evento infoPPE) {
        this.infoPPE = infoPPE;
    }

    public Evento getInfoPPE() {
        return infoPPE;
    }


    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico.toLowerCase();
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }


    public void setNombreSuscriptor(String suscriptor) {
        this.nombreSuscriptor = suscriptor;
    }

    public String getNombreSuscriptor() {
        return nombreSuscriptor;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getSistema() {
        return sistema;
    }

    public void setIdSesion(String idSesion) {
        this.idSesion = idSesion;
    }

    public String getIdSesion() {
        return idSesion;
    }

    public void setRemoteBooking(RemoteBooking remoteBooking) {
        this.remoteBooking = remoteBooking;
    }

    public RemoteBooking getRemoteBooking() {
        return remoteBooking;
    }
}
