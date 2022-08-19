package mx.com.sky.sel.managedbeans.encusatisfaccion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EncuestaSatisfaccion implements Serializable {
    @SuppressWarnings("compatibility:-9048787953368093612")
    private static final long serialVersionUID = -4598205416757749134L;
    private Satisfaccion preg1;
    private Satisfaccion preg2;
    private Satisfaccion preg3;
    private Satisfaccion preg4;
    private Satisfaccion preg5;
    private Satisfaccion preg6;

    public EncuestaSatisfaccion() {
        super();
        preg1 = new Satisfaccion();
        preg2 = new Satisfaccion();
        preg3 = new Satisfaccion();
        preg4 = new Satisfaccion();
        preg5 = new Satisfaccion();
        preg6 = new Satisfaccion();

        preg1.setNoPregunta(1);
        preg1.setPregunta("Â¿Cu\u00E1l fue su raz\u00F3n principal para visitar Servicios en L\u00EDnea SKY el d\u00EDa de hoy?");
        
        preg2.setNoPregunta(2);
        preg2.setPregunta("Â¿Encontraste f\u00E1cilmente la informaci\u00F3n necesaria en esta visita?");
        
        preg3.setNoPregunta(3);
        preg3.setPregunta("Â¿Accede a Servicios en L\u00EDnea SKY a trav\u00E9s de alg\u00FAn dispositivo m\u00F3vil?");
        
        preg4.setNoPregunta(4);
        preg4.setPregunta("Â¿Resolvimos tu necesidad?");
        
        preg5.setNoPregunta(5);
        preg5.setPregunta("Â¿C\u00F3mo evaluar\u00EDa el portal Servicios en L\u00EDnea SKY?");
        
        preg6.setNoPregunta(6);
        preg6.setPregunta("Â¿Recomendar\u00EDa el portal Servicios en L\u00EDnea SKY?");

    }
    
    public void setFolio(String folio){
        preg1.setFolio(folio);
        preg2.setFolio(folio);
        preg3.setFolio(folio);
        preg4.setFolio(folio);
        preg5.setFolio(folio);
        preg6.setFolio(folio);
    }
    
    public void setDatos(String pais,String userID,String cuentaSKY,String paquete){
        preg1.setCuentaSKY(cuentaSKY);
        preg1.setPais(pais);
        preg1.setPaquete(paquete);
        preg1.setUserID(userID);
        
        preg2.setCuentaSKY(cuentaSKY);
        preg2.setPais(pais);
        preg2.setPaquete(paquete);
        preg2.setUserID(userID);
        
        preg3.setCuentaSKY(cuentaSKY);
        preg3.setPais(pais);
        preg3.setPaquete(paquete);
        preg3.setUserID(userID);
        
        preg4.setCuentaSKY(cuentaSKY);
        preg4.setPais(pais);
        preg4.setPaquete(paquete);
        preg4.setUserID(userID);
        
        preg5.setCuentaSKY(cuentaSKY);
        preg5.setPais(pais);
        preg5.setPaquete(paquete);
        preg5.setUserID(userID);
        
        preg6.setCuentaSKY(cuentaSKY);
        preg6.setPais(pais);
        preg6.setPaquete(paquete);
        preg6.setUserID(userID);
        
    }

    public List<Satisfaccion> obtenerListaSatisfaccion() {
        List<Satisfaccion> lista = new ArrayList<Satisfaccion>();
        lista.add(preg1);
        lista.add(preg2);
        lista.add(preg3);
        lista.add(preg4);
        lista.add(preg5);
        lista.add(preg6);
        return lista;
    }

    public void setPreg1(Satisfaccion preg1) {
        this.preg1 = preg1;
    }

    public Satisfaccion getPreg1() {
        return preg1;
    }

    public void setPreg2(Satisfaccion preg2) {
        this.preg2 = preg2;
    }

    public Satisfaccion getPreg2() {
        return preg2;
    }

    public void setPreg3(Satisfaccion preg3) {
        this.preg3 = preg3;
    }

    public Satisfaccion getPreg3() {
        return preg3;
    }

    public void setPreg4(Satisfaccion preg4) {
        this.preg4 = preg4;
    }

    public Satisfaccion getPreg4() {
        return preg4;
    }

    public void setPreg5(Satisfaccion preg5) {
        this.preg5 = preg5;
    }

    public Satisfaccion getPreg5() {
        return preg5;
    }

    public void setPreg6(Satisfaccion preg6) {
        this.preg6 = preg6;
    }

    public Satisfaccion getPreg6() {
        return preg6;
    }
}
