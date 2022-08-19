package mx.com.sky.sel.utils;

public class UtilsException extends Exception {
    @SuppressWarnings("compatibility:2732286544764700180")
    private static final long serialVersionUID = 626482689239035152L;

    public UtilsException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public UtilsException(Throwable throwable) {
        super(throwable);
    }

    public UtilsException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public UtilsException(String string) {
        super(string);
    }

    public UtilsException() {
        super();
    }
}
