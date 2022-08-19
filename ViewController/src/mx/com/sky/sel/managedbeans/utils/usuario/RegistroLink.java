package mx.com.sky.sel.managedbeans.utils.usuario;

import java.io.Serializable;

public class RegistroLink implements Serializable{
    @SuppressWarnings("compatibility:-6106925013526915353")
    private static final long serialVersionUID = -2756263558840863147L;

    private String cadenaLink;
    public RegistroLink() {
        super();
    }

    public void setCadenaLink(String cadenaLink) {
        this.cadenaLink = cadenaLink;
    }

    public String getCadenaLink() {
        return cadenaLink;
    }
}
