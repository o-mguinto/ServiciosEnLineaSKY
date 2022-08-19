package mx.com.sky.sel.services.beans.canal;

import java.io.Serializable;

public class PrecioCanal implements Serializable {
    @SuppressWarnings("compatibility:-787098512456374505")
    private static final long serialVersionUID = 9061866529416775631L;
    private String costo;
    private String pagoOportuno;

    public PrecioCanal() {
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof PrecioCanal)) {
            return false;
        }
        final PrecioCanal other = (PrecioCanal)object;
        if (!(costo == null ? other.costo == null :
              costo.equals(other.costo))) {
            return false;
        }
        if (!(pagoOportuno == null ? other.pagoOportuno == null :
              pagoOportuno.equals(other.pagoOportuno))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((costo == null) ? 0 : costo.hashCode());
        result =
                PRIME * result + ((pagoOportuno == null) ? 0 : pagoOportuno.hashCode());
        return result;
    }


    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getCosto() {
        return costo;
    }

    public void setPagoOportuno(String pagoOportuno) {
        this.pagoOportuno = pagoOportuno;
    }

    public String getPagoOportuno() {
        return pagoOportuno;
    }
}
