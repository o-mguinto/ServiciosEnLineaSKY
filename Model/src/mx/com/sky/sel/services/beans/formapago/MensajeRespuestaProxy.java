package mx.com.sky.sel.services.beans.formapago;
import java.io.Serializable;

public class MensajeRespuestaProxy implements Serializable {
    @SuppressWarnings("compatibility:1055766096986424380")
    private static final long serialVersionUID = 3107047150185975803L;

    private String errorCode;
    private String errorMessage;
    private String beneficioMessage;
    public MensajeRespuestaProxy() {
        super();
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MensajeFormaPago [");
        if (errorCode != null) {
            builder.append("errorCode=");
            builder.append(errorCode);
            builder.append(", ");
        }
        if (errorMessage != null) {
            builder.append("errorMessage=");
            builder.append(errorMessage);
        }
        if (beneficioMessage != null) {
            builder.append("beneficioMessage=");
            builder.append(beneficioMessage);
        }
        builder.append("]");
        return builder.toString();
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setBeneficioMessage(String beneficioMessage) {
        this.beneficioMessage = beneficioMessage;
    }

    public String getBeneficioMessage() {
        return beneficioMessage;
    }
}

