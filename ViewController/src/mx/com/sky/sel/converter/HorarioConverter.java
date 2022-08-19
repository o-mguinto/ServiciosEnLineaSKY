package mx.com.sky.sel.converter;

import java.util.Collection;
import java.util.Collections;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.apache.myfaces.trinidad.convert.ClientConverter;


public class HorarioConverter implements Converter, ClientConverter{
    
    
    //public static final String CONVERTER_ID = "HorarioConverter";
    
    
    public HorarioConverter() {
        super();
    }
    
    
    public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2)
      {
        Double d = null;
        System.out.println("String arg2 " + arg2);
        if("Por la ma\u00f1ana".equals(arg2))
          d = new Double(1);
        else if("Por la tarde".equals(arg2))
          d = new Double(2);
        else if("Abierto".equals(arg2))
          d = new Double(3);
        else
          d = new Double(arg2);
        return d;
      }

      public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2)
      {
        if(arg2 instanceof Double){
            System.out.println("Object arg2 " + arg2); 
          String dou =((Double) arg2).toString();  
          if(dou.equals("1.0"))
                //try {
                    //String temp = "Por la maÃ±ana";
                    //dou = new String(temp.getBytes(), "UTF-8");
                    dou = "Por la ma\u00f1ana";
                //} catch (UnsupportedEncodingException e) {
                    //System.out.println(e);
                //}
            else if(dou.equals("2.0"))
            dou = "Por la tarde";
          else if(dou.equals("3.0"))
            dou = "Abierto";
          return dou;
        }
        else
          return arg2.toString();
      }

      public String getClientConversion(FacesContext arg0, UIComponent arg1)
      {
        return ("new SimpleHorarioRefformatter()");
      }

      public Collection<String> getClientImportNames()
      {
          return Collections.emptySet();
      }

      public String getClientLibrarySource(FacesContext context)
      {
        return context.getExternalContext().getRequestContextPath() + 
                   "/resources/js/simpleHorarioConverter.js";    
      }
      
      public String getClientScript(FacesContext arg0, UIComponent arg1)
      {
        return null;
      }
}
