package mx.com.sky.sel.services.beans.eventos;

import java.io.Serializable;

public class PPEPermiso implements Serializable {
    @SuppressWarnings("compatibility:4486496522691818043")
    private static final long serialVersionUID = -1263656390681733800L;
    private String canal;
    public PPEPermiso() {
        super();
    }
    

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getCanal() {
        return canal;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof PPEPermiso)) {
            return false;
        }
        final PPEPermiso other = (PPEPermiso)object;
        if (!(canal == null ? other.canal == null : canal.equals(other.canal))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((canal == null) ? 0 : canal.hashCode());
        return result;
    }
}
