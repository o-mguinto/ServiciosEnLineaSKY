package mx.com.sky.sel.services.beans.formapago;

import java.io.Serializable;


public class CambioFormaPago implements Serializable {
    @SuppressWarnings("compatibility:8419583287655640028")
    private static final long serialVersionUID = 1838946429574945664L;

    private String cuenta;
    private String area;
    private String subArea;
    private String descripcion;
    private String tarjetaInteligente;
    private String contactoRowId;
    private String correoElectronico;
    private String pais;
    private String sistema;
    private String idSesion;
    
    private String tipoCuenta;
    
    
    private String numeroTarjeta;
    private String noCodificado;
    private String nombreTarjetabiente;
    private String fechaExpiracion;
    private String mes;
    private String anio;
    private String tipoTarjeta;
    private String codigoSeguridad;
    
    private String aceptaBeneficio;
    private String paqueteActualAccount;
    private String productName;
    
    private String creditoDebito;
    private String creditoDebitoTexto;

    public CambioFormaPago() {
    }
    private void codificarNumero() {
        if (numeroTarjeta.length() == 16) {
            noCodificado = "XXXX-XXXX-XXXX-";
            noCodificado += numeroTarjeta.substring(12);
        } else if (numeroTarjeta.length() == 15) {
            noCodificado = "XXXX-XXXX-XXX-";
            noCodificado += numeroTarjeta.substring(11);
        }else{
            noCodificado = numeroTarjeta;
        }
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CambioFormaPago [");
        if (numeroTarjeta != null) {
            builder.append("numeroTarjeta=");
            builder.append(numeroTarjeta);
            builder.append(", ");
        }
        if (nombreTarjetabiente != null) {
            builder.append("nombreTarjetabiente=");
            builder.append(nombreTarjetabiente);
            builder.append(", ");
        }
        if (fechaExpiracion != null) {
            builder.append("fechaExpiracion=");
            builder.append(fechaExpiracion);
            builder.append(", ");
        }
        if (mes != null) {
            builder.append("mes=");
            builder.append(mes);
            builder.append(", ");
        }
        if (numeroTarjeta != null) {
            builder.append("numeroTarjeta=");
            builder.append(numeroTarjeta);
            builder.append(", ");
        }
        if (tipoCuenta != null) {
            builder.append("tipoCuenta=");
            builder.append(tipoCuenta);
            builder.append(", ");
        }
        if (anio != null) {
            builder.append("anio=");
            builder.append(anio);
            builder.append(", ");
        }
        if (tipoTarjeta != null) {
            builder.append("tipoTarjeta=");
            builder.append(tipoTarjeta);
        }
        if (aceptaBeneficio != null) {
            builder.append("aceptaBeneficio=");
            builder.append(aceptaBeneficio);
        }
        if (paqueteActualAccount != null) {
            builder.append("paqueteActualAccount=");
            builder.append(paqueteActualAccount);
        }
        if (productName != null) {
            builder.append("productName=");
            builder.append(productName);
        }
        if (codigoSeguridad != null) {
            builder.append("codigoSeguridad=");
            builder.append(codigoSeguridad);
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

    public void setNombreTarjetabiente(String nombreSuscriptor) {
        this.nombreTarjetabiente = nombreSuscriptor;
    }

    public String getNombreTarjetabiente() {
        return nombreTarjetabiente;
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

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
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

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        codificarNumero();
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAnio() {
        return anio;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    /*public void setNoCodificado(String noCodificado) {
        this.noCodificado = noCodificado;
    }

    public String getNoCodificado() {
        return noCodificado;
    }*/

    public void setCreditoDebito(String creditoDebito) {
        this.creditoDebito = creditoDebito;
    }

    public String getCreditoDebito() {
        return creditoDebito;
    }
   
   
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setAceptaBeneficio(String aceptaBeneficio) {
        this.aceptaBeneficio = aceptaBeneficio;
    }

    public String getAceptaBeneficio() {
        return aceptaBeneficio;
    }

    public void setPaqueteActualAccount(String paqueteActualAccount) {
        this.paqueteActualAccount = paqueteActualAccount;
    }

    public String getPaqueteActualAccount() {
        return paqueteActualAccount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setNoCodificado(String noCodificado) {
        this.noCodificado = noCodificado;
    }

    public String getNoCodificado() {
        return noCodificado;
    }
    public void setCreditoDebitoTexto(String creditoDebitoTexto) {
        this.creditoDebitoTexto = creditoDebitoTexto;
    }
    /**
     * Devuelve credito o debito o vacio dependiendo el valor de la variable
     * @return
     */
    public String getCreditoDebitoTexto() {
        return creditoDebitoTexto;
    }
}
