package mx.com.sky.sel.beans.cambiotitular;

import java.io.Serializable;

public class CambioTitularDatos implements Serializable {
    @SuppressWarnings("compatibility:-7761490259108897367")
    private static final long serialVersionUID = 5589499418114952566L;
    private boolean autorizoSKY;
    private String anoVencimiento;
    private String mesVencimiento;
    private String noTDC;
    private String tipoTDC;
    private String ano;
    private String calle;
    private String cantidad;
    private String cantidadLetra;
    private String caseta;
    private String cedComprobanteDom;
    private String cedente;
    private String cedIdentificacion;
    private String cel;
    private String cesApMaterno;
    private String cesApPaterno;
    private String cesComprobanteDom;
    private String cesIdentificacion;
    private String cesionario;
    private String cesNombre;
    private String claveLada;
    private String codigoPostal;
    private String colonia;
    private String comprobanteDom;
    private String correo;
    private String CURP;
    private String dia;
    private String entidadFederativa;
    private String entreCalle;
    private String fechaCesion;
    private String identificacion;
    private String lugarCambio;
    private String marcaEquipo;
    private String mes;
    private String meses;
    private String modeloIRD;
    private String municipio;
    private String no;
    private String noClave;
    private String noContrato;
    private String noCuenta;
    private String noExt;
    private String noInt;
    private String nombre2Ref;
    private String nombreDistrib;
    private String nombreRef;
    private String noSerieIRD;
    private String noTarjetaInt;
    private String otrasReferencias;
    private String otroTel;
    private String parentesco1;
    private String parentesco2;
    private String personaFisica;
    private String personaMoral;
    private String pfActividadEmp;
    private String poblacion;
    private String recargas;
    private String repLegalApMat;
    private String repLegalApPat;
    private String repLegalNom;
    private String RFC;
    private String si;
    private String tel2Ref;
    private String telCasa;
    private String telOficina;
    private String telRef;
    private String yCalle;
    private String tipoPersonaSHCP;

    public CambioTitularDatos() {
        super();
        ano= "";
        calle= "";
        cantidad= "";
        cantidadLetra= "";
        caseta= "";
        cedComprobanteDom= "";
        cedente= "";
        cedIdentificacion= "";
        cel= "";
        cesApMaterno= "";
        cesApPaterno= "";
        cesComprobanteDom= "";
        cesIdentificacion= "";
        cesionario= "";
        cesNombre= "";
        claveLada= "";
        codigoPostal= "";
        colonia= "";
        comprobanteDom= "";
        correo= "";
        CURP= "";
        dia= "";
        entidadFederativa= "";
        entreCalle= "";
        fechaCesion= "";
        identificacion= "";
        lugarCambio= "";
        marcaEquipo= "";
        mes= "";
        meses= "";
        modeloIRD= "";
        municipio= "";
        no= "";
        noClave= "";
        noContrato= "";
        noCuenta= "";
        noExt= "";
        noInt= "";
        nombre2Ref= "";
        nombreDistrib= "";
        nombreRef= "";
        noSerieIRD= "";
        noTarjetaInt= "";
        otrasReferencias= "";
        otroTel= "";
        parentesco1= "";
        parentesco2= "";
        personaFisica= "";
        personaMoral= "";
        pfActividadEmp= "";
        poblacion= "";
        recargas= "";
        repLegalApMat= "";
        repLegalApPat= "";
        repLegalNom= "";
        RFC= "";
        si= "";
        tel2Ref= "";
        telCasa= "";
        telOficina= "";
        telRef= "";
        yCalle= "";
    }


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Subrrogacion [autorizoSKY=");
        builder.append(autorizoSKY);
        builder.append(", ");
        if (noCuenta != null) {
            builder.append("noCuenta=");
            builder.append(noCuenta);
            builder.append(", ");
        }
        if (noContrato != null) {
            builder.append("noContrato=");
            builder.append(noContrato);
            builder.append(", ");
        }
        if (nombreDistrib != null) {
            builder.append("nombreDistrib=");
            builder.append(nombreDistrib);
            builder.append(", ");
        }
        if (noClave != null) {
            builder.append("noClave=");
            builder.append(noClave);
            builder.append(", ");
        }
        if (dia != null) {
            builder.append("dia=");
            builder.append(dia);
            builder.append(", ");
        }
        if (mes != null) {
            builder.append("mes=");
            builder.append(mes);
            builder.append(", ");
        }
        if (ano != null) {
            builder.append("ano=");
            builder.append(ano);
            builder.append(", ");
        }
        if (cantidad != null) {
            builder.append("cantidad=");
            builder.append(cantidad);
            builder.append(", ");
        }
        if (cantidadLetra != null) {
            builder.append("cantidadLetra=");
            builder.append(cantidadLetra);
            builder.append(", ");
        }
        if (si != null) {
            builder.append("si=");
            builder.append(si);
            builder.append(", ");
        }
        if (no != null) {
            builder.append("no=");
            builder.append(no);
            builder.append(", ");
        }
        if (cedente != null) {
            builder.append("cedente=");
            builder.append(cedente);
            builder.append(", ");
        }
        if (cesionario != null) {
            builder.append("cesionario=");
            builder.append(cesionario);
            builder.append(", ");
        }
        if (cesApPaterno != null) {
            builder.append("cesApPaterno=");
            builder.append(cesApPaterno);
            builder.append(", ");
        }
        if (cesApMaterno != null) {
            builder.append("cesApMaterno=");
            builder.append(cesApMaterno);
            builder.append(", ");
        }
        if (cesNombre != null) {
            builder.append("cesNombre=");
            builder.append(cesNombre);
            builder.append(", ");
        }
        if (repLegalApPat != null) {
            builder.append("repLegalApPat=");
            builder.append(repLegalApPat);
            builder.append(", ");
        }
        if (repLegalApMat != null) {
            builder.append("repLegalApMat=");
            builder.append(repLegalApMat);
            builder.append(", ");
        }
        if (repLegalNom != null) {
            builder.append("repLegalNom=");
            builder.append(repLegalNom);
            builder.append(", ");
        }
        if (calle != null) {
            builder.append("calle=");
            builder.append(calle);
            builder.append(", ");
        }
        if (noExt != null) {
            builder.append("noExt=");
            builder.append(noExt);
            builder.append(", ");
        }
        if (noInt != null) {
            builder.append("noInt=");
            builder.append(noInt);
            builder.append(", ");
        }
        if (entreCalle != null) {
            builder.append("entreCalle=");
            builder.append(entreCalle);
            builder.append(", ");
        }
        if (yCalle != null) {
            builder.append("yCalle=");
            builder.append(yCalle);
            builder.append(", ");
        }
        if (colonia != null) {
            builder.append("colonia=");
            builder.append(colonia);
            builder.append(", ");
        }
        if (poblacion != null) {
            builder.append("poblacion=");
            builder.append(poblacion);
            builder.append(", ");
        }
        if (municipio != null) {
            builder.append("municipio=");
            builder.append(municipio);
            builder.append(", ");
        }
        if (entidadFederativa != null) {
            builder.append("entidadFederativa=");
            builder.append(entidadFederativa);
            builder.append(", ");
        }
        if (codigoPostal != null) {
            builder.append("codigoPostal=");
            builder.append(codigoPostal);
            builder.append(", ");
        }
        if (otrasReferencias != null) {
            builder.append("otrasReferencias=");
            builder.append(otrasReferencias);
            builder.append(", ");
        }
        if (claveLada != null) {
            builder.append("claveLada=");
            builder.append(claveLada);
            builder.append(", ");
        }
        if (telCasa != null) {
            builder.append("telCasa=");
            builder.append(telCasa);
            builder.append(", ");
        }
        if (telOficina != null) {
            builder.append("telOficina=");
            builder.append(telOficina);
            builder.append(", ");
        }
        if (cel != null) {
            builder.append("cel=");
            builder.append(cel);
            builder.append(", ");
        }
        if (caseta != null) {
            builder.append("caseta=");
            builder.append(caseta);
            builder.append(", ");
        }
        if (otroTel != null) {
            builder.append("otroTel=");
            builder.append(otroTel);
            builder.append(", ");
        }
        if (RFC != null) {
            builder.append("RFC=");
            builder.append(RFC);
            builder.append(", ");
        }
        if (correo != null) {
            builder.append("correo=");
            builder.append(correo);
            builder.append(", ");
        }
        if (nombreRef != null) {
            builder.append("nombreRef=");
            builder.append(nombreRef);
            builder.append(", ");
        }
        if (telRef != null) {
            builder.append("telRef=");
            builder.append(telRef);
            builder.append(", ");
        }
        if (nombre2Ref != null) {
            builder.append("nombre2Ref=");
            builder.append(nombre2Ref);
            builder.append(", ");
        }
        if (tel2Ref != null) {
            builder.append("tel2Ref=");
            builder.append(tel2Ref);
            builder.append(", ");
        }
        if (parentesco1 != null) {
            builder.append("parentesco1=");
            builder.append(parentesco1);
            builder.append(", ");
        }
        if (parentesco2 != null) {
            builder.append("parentesco2=");
            builder.append(parentesco2);
            builder.append(", ");
        }
        if (identificacion != null) {
            builder.append("identificacion=");
            builder.append(identificacion);
            builder.append(", ");
        }
        if (comprobanteDom != null) {
            builder.append("comprobanteDom=");
            builder.append(comprobanteDom);
            builder.append(", ");
        }
        if (modeloIRD != null) {
            builder.append("modeloIRD=");
            builder.append(modeloIRD);
            builder.append(", ");
        }
        if (noSerieIRD != null) {
            builder.append("noSerieIRD=");
            builder.append(noSerieIRD);
            builder.append(", ");
        }
        if (noTarjetaInt != null) {
            builder.append("noTarjetaInt=");
            builder.append(noTarjetaInt);
            builder.append(", ");
        }
        if (CURP != null) {
            builder.append("CURP=");
            builder.append(CURP);
            builder.append(", ");
        }
        if (lugarCambio != null) {
            builder.append("lugarCambio=");
            builder.append(lugarCambio);
        }
        builder.append("]");
        return builder.toString();
    }


    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoContrato(String noContrato) {
        this.noContrato = noContrato;
    }

    public String getNoContrato() {
        return noContrato;
    }

    public void setNombreDistrib(String nombreDistrib) {
        this.nombreDistrib = nombreDistrib;
    }

    public String getNombreDistrib() {
        return nombreDistrib;
    }

    public void setNoClave(String noClave) {
        this.noClave = noClave;
    }

    public String getNoClave() {
        return noClave;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidadLetra(String cantidadLetra) {
        this.cantidadLetra = cantidadLetra;
    }

    public String getCantidadLetra() {
        return cantidadLetra;
    }

    public void setSi(String si) {
        this.si = si;
    }

    public String getSi() {
        return si;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setCedente(String cedente) {
        this.cedente = cedente;
    }

    public String getCedente() {
        return cedente;
    }

    public void setCesionario(String cesionario) {
        this.cesionario = cesionario;
    }

    public String getCesionario() {
        return cesionario;
    }

    public void setCesApPaterno(String cesApPaterno) {
        this.cesApPaterno = cesApPaterno;
    }

    public String getCesApPaterno() {
        return cesApPaterno;
    }

    public void setCesApMaterno(String cesApMaterno) {
        this.cesApMaterno = cesApMaterno;
    }

    public String getCesApMaterno() {
        return cesApMaterno;
    }

    public void setCesNombre(String cesNombre) {
        this.cesNombre = cesNombre;
    }

    public String getCesNombre() {
        return cesNombre;
    }

    public void setRepLegalApPat(String repLegalApPat) {
        this.repLegalApPat = repLegalApPat;
    }

    public String getRepLegalApPat() {
        return repLegalApPat;
    }

    public void setRepLegalApMat(String repLegalApMat) {
        this.repLegalApMat = repLegalApMat;
    }

    public String getRepLegalApMat() {
        return repLegalApMat;
    }

    public void setRepLegalNom(String repLegalNom) {
        this.repLegalNom = repLegalNom;
    }

    public String getRepLegalNom() {
        return repLegalNom;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCalle() {
        return calle;
    }

    public void setNoExt(String noExt) {
        this.noExt = noExt;
    }

    public String getNoExt() {
        return noExt;
    }

    public void setNoInt(String noInt) {
        this.noInt = noInt;
    }

    public String getNoInt() {
        return noInt;
    }

    public void setEntreCalle(String entreCalle) {
        this.entreCalle = entreCalle;
    }

    public String getEntreCalle() {
        return entreCalle;
    }

    public void setYCalle(String yCalle) {
        this.yCalle = yCalle;
    }

    public String getYCalle() {
        return yCalle;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getColonia() {
        return colonia;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setEntidadFederativa(String entidadFederativa) {
        this.entidadFederativa = entidadFederativa;
    }

    public String getEntidadFederativa() {
        return entidadFederativa;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setOtrasReferencias(String otrasReferencias) {
        this.otrasReferencias = otrasReferencias;
    }

    public String getOtrasReferencias() {
        return otrasReferencias;
    }

    public void setClaveLada(String claveLada) {
        this.claveLada = claveLada;
    }

    public String getClaveLada() {
        return claveLada;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }

    public String getTelCasa() {
        return telCasa;
    }

    public void setTelOficina(String telOficina) {
        this.telOficina = telOficina;
    }

    public String getTelOficina() {
        return telOficina;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public String getCel() {
        return cel;
    }

    public void setCaseta(String caseta) {
        this.caseta = caseta;
    }

    public String getCaseta() {
        return caseta;
    }

    public void setOtroTel(String otroTel) {
        this.otroTel = otroTel;
    }

    public String getOtroTel() {
        return otroTel;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getRFC() {
        return RFC;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNombreRef(String nombreRef) {
        this.nombreRef = nombreRef;
    }

    public String getNombreRef() {
        return nombreRef;
    }

    public void setTelRef(String telRef) {
        this.telRef = telRef;
    }

    public String getTelRef() {
        return telRef;
    }

    public void setNombre2Ref(String nombre2Ref) {
        this.nombre2Ref = nombre2Ref;
    }

    public String getNombre2Ref() {
        return nombre2Ref;
    }

    public void setTel2Ref(String tel2Ref) {
        this.tel2Ref = tel2Ref;
    }

    public String getTel2Ref() {
        return tel2Ref;
    }

    public void setParentesco1(String parentesco1) {
        this.parentesco1 = parentesco1;
    }

    public String getParentesco1() {
        return parentesco1;
    }

    public void setParentesco2(String parentesco2) {
        this.parentesco2 = parentesco2;
    }

    public String getParentesco2() {
        return parentesco2;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setComprobanteDom(String comprobanteDom) {
        this.comprobanteDom = comprobanteDom;
    }

    public String getComprobanteDom() {
        return comprobanteDom;
    }

    public void setModeloIRD(String modeloIRD) {
        this.modeloIRD = modeloIRD;
    }

    public String getModeloIRD() {
        return modeloIRD;
    }

    public void setNoSerieIRD(String noSerieIRD) {
        this.noSerieIRD = noSerieIRD;
    }

    public String getNoSerieIRD() {
        return noSerieIRD;
    }

    public void setNoTarjetaInt(String noTarjetaInt) {
        this.noTarjetaInt = noTarjetaInt;
    }

    public String getNoTarjetaInt() {
        return noTarjetaInt;
    }


    public void setAutorizoSKY(boolean autorizoSKY) {
        this.autorizoSKY = autorizoSKY;
    }

    public boolean isAutorizoSKY() {
        return autorizoSKY;
    }

    public void setCedComprobanteDom(String cedComprobanteDom) {
        this.cedComprobanteDom = cedComprobanteDom;
    }

    public String getCedComprobanteDom() {
        return cedComprobanteDom;
    }

    public void setCedIdentificacion(String cedIdentificacion) {
        this.cedIdentificacion = cedIdentificacion;
    }

    public String getCedIdentificacion() {
        return cedIdentificacion;
    }

    public void setCesComprobanteDom(String cesComprobanteDom) {
        this.cesComprobanteDom = cesComprobanteDom;
    }

    public String getCesComprobanteDom() {
        return cesComprobanteDom;
    }

    public void setCesIdentificacion(String cesIdentificacion) {
        this.cesIdentificacion = cesIdentificacion;
    }

    public String getCesIdentificacion() {
        return cesIdentificacion;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getCURP() {
        return CURP;
    }

    public void setFechaCesion(String fechaCesion) {
        this.fechaCesion = fechaCesion;
    }

    public String getFechaCesion() {
        return fechaCesion;
    }

    public void setLugarCambio(String lugarCambio) {
        this.lugarCambio = lugarCambio;
    }

    public String getLugarCambio() {
        return lugarCambio;
    }

    public void setMarcaEquipo(String marcaEquipo) {
        this.marcaEquipo = marcaEquipo;
    }

    public String getMarcaEquipo() {
        return marcaEquipo;
    }

    public void setMeses(String meses) {
        this.meses = meses;
    }

    public String getMeses() {
        return meses;
    }

    public void setPersonaFisica(String personaFisica) {
        this.personaFisica = personaFisica;
    }

    public String getPersonaFisica() {
        return personaFisica;
    }

    public void setPersonaMoral(String personaMoral) {
        this.personaMoral = personaMoral;
    }

    public String getPersonaMoral() {
        return personaMoral;
    }

    public void setPfActividadEmp(String pfActividadEmp) {
        this.pfActividadEmp = pfActividadEmp;
    }

    public String getPfActividadEmp() {
        return pfActividadEmp;
    }

    public void setRecargas(String recargas) {
        this.recargas = recargas;
    }

    public String getRecargas() {
        return recargas;
    }

    public void setTipoPersonaSHCP(String tipoPersonaSHCP) {
        this.tipoPersonaSHCP = tipoPersonaSHCP;
    }

    public String getTipoPersonaSHCP() {
        return tipoPersonaSHCP;
    }

    public void setAnoVencimiento(String anoVencimiento) {
        this.anoVencimiento = anoVencimiento;
    }

    public String getAnoVencimiento() {
        return anoVencimiento;
    }

    public void setMesVencimiento(String mesVencimiento) {
        this.mesVencimiento = mesVencimiento;
    }

    public String getMesVencimiento() {
        return mesVencimiento;
    }

    public void setNoTDC(String noTDC) {
        this.noTDC = noTDC;
    }

    public String getNoTDC() {
        return noTDC;
    }

    public void setTipoTDC(String tipoTDC) {
        this.tipoTDC = tipoTDC;
    }

    public String getTipoTDC() {
        return tipoTDC;
    }
}
