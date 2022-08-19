package mx.com.sky.sel.log;

import java.io.Serializable;

import org.apache.log4j.Logger;

public class LogPC implements Serializable {
    @SuppressWarnings("compatibility:8590783301895192178")
    private static final long serialVersionUID = 7927705421419543667L;

    public LogPC() {
        super();
    }

    private static Logger log = Logger.getLogger(LogPC.class);

    public static void println(Object clase, Object mensaje) {
        if (clase instanceof String) {
            log.debug("[" + clase + "] [" + mensaje + "]");
        } else {
            log.debug("[" + clase.getClass().getSimpleName() + "] [" +
                      mensaje + "]");
        }
    }

    public static void printlnWarn(Object clase, Object mensaje) {
        log.warn("[" + clase.getClass().getSimpleName() + "] [" + mensaje +
                 "]");
    }


    public static void printlnError(Object clase, Object mensaje) {
        if (mensaje instanceof Throwable) {
            ((Throwable)mensaje).printStackTrace();
            log.error("[" + clase.getClass().getSimpleName() + "] [" +
                      mensaje + "]", (Throwable)mensaje);
        } else {
            log.error("[" + clase.getClass().getSimpleName() + "] [" +
                      mensaje + "]");
        }
    }

    public static void printlnError(Object clase, Object mensaje,
                                    Throwable error) {
        log.error("[" + clase.getClass().getSimpleName() + "] [" + mensaje +
                  "]", error);
    }

    public static void printlnError(Throwable error) {
        log.error(error.getMessage(), error);
    }
    }
