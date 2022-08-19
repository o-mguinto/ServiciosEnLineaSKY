package mx.com.sky.sel.proxyclients.apigateway.headers.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class SeguridadItem implements Serializable {
    @SuppressWarnings("compatibility:-3544610859335662183")
    private static final long serialVersionUID = -2443182356206296177L;
    
    private String sistemaAAutenticar;
    private String Username;
    private String Password;
    
    public SeguridadItem() {
        super();
        this.sistemaAAutenticar="";
        this.Username= "";
        this.Password= "";
    }

    public void setSistemaAAutenticar(String sistemaAAutenticar) {
        this.sistemaAAutenticar = sistemaAAutenticar;
    }
    
    @JsonProperty("SistemaAAutenticar")
    public String getSistemaAAutenticar() {
        return sistemaAAutenticar;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
    @JsonProperty("Username")
    public String getUsername() {
        return Username;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    @JsonProperty("Password")
    public String getPassword() {
        return Password;
    }
}
