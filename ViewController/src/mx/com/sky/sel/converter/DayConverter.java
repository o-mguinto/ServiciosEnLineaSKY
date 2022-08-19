package mx.com.sky.sel.converter;

import java.util.Collection;
import java.util.Collections;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.apache.myfaces.trinidad.convert.ClientConverter;

public class DayConverter implements ClientConverter,
                                     Converter {
    public DayConverter() {
        super();
    }

    public Object getAsObject(FacesContext facesContext,
                              UIComponent uIComponent, String string) {
        String hora = string.split(":")[0];
        String minuto = string.split(":")[1];
        Integer minutoDelDia = Integer.parseInt(hora) * 60 +Integer.parseInt(minuto);
        return minutoDelDia.doubleValue();
    }

    public String getAsString(FacesContext facesContext,
                              UIComponent uIComponent, Object object) {
        int minutoDelDia = ((Double)object).intValue();
        int hora = minutoDelDia / 60;
        int minuto = minutoDelDia % 60;
        String horaS = hora < 10 ? "0"+hora:hora+"";
        String minutoS = minuto < 10 ? "0"+minuto:minuto+"";
        
        return horaS.concat(":").concat(minutoS);
        
    }

    public String getClientLibrarySource(FacesContext facesContext) {
        return facesContext.getExternalContext().getRequestContextPath() + 
                                 "/resources/js/sliderDateConverter.js"; 
    }

    public Collection<String> getClientImportNames() {
        return Collections.emptySet();
    }

    public String getClientScript(FacesContext facesContext,
                                  UIComponent uiComponent) {
        return null;
    }

    public String getClientConversion(FacesContext facesContext,
                                      UIComponent uiComponent) {
        return ("new SliderDateReformatter()");
    }
}
