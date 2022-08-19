package mx.com.sky.sel.beans.vetv;

import java.io.Serializable;
import java.sql.Timestamp;

public class DataVeTV implements Serializable {
    @SuppressWarnings("compatibility:-6040914771809545824")
    private static final long serialVersionUID = 6893247379631308602L;
    private int diasFinRecarga;
        private String fechaFinRecarga;

    public DataVeTV() {
        super();
    }

    public void setDiasFinRecarga(int diasFinRecarga) {
        this.diasFinRecarga = diasFinRecarga;
    }

    public int getDiasFinRecarga() {
        return diasFinRecarga;
    }

    public void setFechaFinRecarga(String fechaFinRecarga) {
        this.fechaFinRecarga = fechaFinRecarga;
    }

    public String getFechaFinRecarga() {
        return fechaFinRecarga;
    }
    }
