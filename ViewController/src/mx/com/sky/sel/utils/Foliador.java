package mx.com.sky.sel.utils;
import java.io.Serializable;

import java.util.Calendar;

import mx.com.sky.sel.log.LogPC;


public class Foliador implements Serializable {
    @SuppressWarnings("compatibility:-5953792404862258568")
    private static final long serialVersionUID = -9024652193346111476L;

    public String getFolio() {
        Calendar calendar = Calendar.getInstance();
        String instance = System.getProperty("weblogic.Name");
        instance = instance != null ? instance.substring(6) : "";
        String day = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        String month = String.valueOf(calendar.get(Calendar.MONTH));
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        String id = String.valueOf(((int)(Math.random() * 100)) + 1);
        String folio=instance + day + month + year + id;
        LogPC.println(this,"Folio :"+folio);
        return folio;
    }
}
