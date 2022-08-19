package mx.com.sky.sel.services.beans.promociones;
import java.io.Serializable;


public class Pais implements Serializable {
    @SuppressWarnings("compatibility:-5868028258120459605")
    private static final long serialVersionUID = 7624743007597785372L;
    protected String idPais;
    protected String organizationId;
    protected String nombre;


    public Pais() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Pais [");
        if (idPais != null) {
            builder.append("idPais=");
            builder.append(idPais);
            builder.append(", ");
        }
        if (nombre != null) {
            builder.append("nombre=");
            builder.append(nombre);
            builder.append(", ");
        }
        if (organizationId != null) {
            builder.append("organizationId=");
            builder.append(organizationId);
            builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }


    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getOrganizationId() {
        return organizationId;
    }
}
