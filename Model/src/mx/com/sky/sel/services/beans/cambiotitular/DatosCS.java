package mx.com.sky.sel.services.beans.cambiotitular;

import java.io.Serializable;

public class DatosCS implements Serializable {
    @SuppressWarnings("compatibility:-3088708204087197848")
    private static final long serialVersionUID = 2555974738169523600L;
    private String suscriptor;
    private String activacion;
    private String formaDePago;
    private String paquete;
    private String ubicado;
    private String addr="";
    private String addr_num="";
    private String city="";
    private String country="";
    private String province="";
    private String state="";
    private String zip_code="";
    private String addr_name="";
    private String county="";

    
    
    
    public DatosCS() {
        super();
    }

    public void setSuscriptor(String suscriptor) {
        this.suscriptor = suscriptor;
    }

    public String getSuscriptor() {
        return suscriptor;
    }

    public void setActivacion(String activacion) {
        this.activacion = activacion;
    }

    public String getActivacion() {
        return activacion;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setPaquete(String paquete) {
        this.paquete = paquete;
    }

    public String getPaquete() {
        return paquete;
    }

    public void setUbicado() {
        this.ubicado = "Calle: "+this.addr+" No. "+this.addr_num+", Ciudad "+this.city+", "+this.country+", "+"Delegacion/Municipio "+this.county+", Colonia "+this.province+", Estado "+this.state+", CP "+this.zip_code +"  "+ this.addr_name;
    }

    public String getUbicado() {
        return ubicado;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr_num(String addr_num) {
        this.addr_num = addr_num;
    }

    public String getAddr_num() {
        return addr_num;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setAddr_name(String addr_name) {
        this.addr_name = addr_name;
    }

    public String getAddr_name() {
        return addr_name;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCounty() {
        return county;
    }
}
