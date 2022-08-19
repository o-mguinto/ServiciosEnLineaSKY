package mx.com.sky.sel.log;
import java.io.Serializable;

import org.apache.log4j.Logger;

public class LogServicios implements Serializable {
    @SuppressWarnings("compatibility:4429725674911638070")
    private static final long serialVersionUID = 5698656163056230749L;

    public LogServicios() {
        super();
    }

    private static Logger log = Logger.getLogger(LogServicios.class);

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
                      ((Throwable)mensaje).getMessage() + "]", (Throwable)mensaje);
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
