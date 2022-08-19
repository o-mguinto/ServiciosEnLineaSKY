package mx.com.sky.sel.services.exception;

public class ServicioException extends Exception {
    @SuppressWarnings("compatibility:-7319882142455662974")
    private static final long serialVersionUID = -4269587984844873097L;
    private int errorCode;

    /**
     *
     */
    public ServicioException() {
        // TODO Auto-generated constructor stub
        errorCode = 0;
    }

    /**
     * @param arg0
     */
    public ServicioException(String arg0) {
        super(arg0);
        errorCode = 0;
    }

    public ServicioException(String arg0, int errorCode) {
        super(arg0);
        this.errorCode = errorCode;
    }

    /**
     * @param arg0
     */
    public ServicioException(Throwable arg0) {
        super(arg0);
        errorCode = 0;
        // TODO Auto-generated constructor stub
    }

    /**
     * @param arg0
     * @param arg1
     */
    public ServicioException(String arg0, Throwable arg1) {
        super(arg0, arg1);
        errorCode = 0;
        // TODO Auto-generated constructor stub
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
