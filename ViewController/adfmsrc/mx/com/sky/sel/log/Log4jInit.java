package mx.com.sky.sel.log;

import java.io.Serializable;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.PropertyConfigurator;


public class Log4jInit extends HttpServlet implements Serializable {
    @SuppressWarnings("compatibility:-5918473138918666156")
    private static final long serialVersionUID = -7900526978055151779L;


    public void init() {
        String prefix = getServletContext().getRealPath("/");
        String file = getInitParameter("log4j-init-file");
        // if the log4j-init-file is not set, then no point in trying
        if (file != null) {
            PropertyConfigurator.configure(prefix + file);
        }
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) {
    }
}
