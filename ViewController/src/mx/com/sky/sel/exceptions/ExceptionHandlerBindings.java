package mx.com.sky.sel.exceptions;

import oracle.adf.model.BindingContext;
import oracle.adf.model.RegionBinding;
import oracle.adf.model.adapter.AdapterException;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCErrorHandlerImpl;
import oracle.adf.model.binding.DCErrorMessage;

import org.apache.log4j.Logger;


public class ExceptionHandlerBindings extends DCErrorHandlerImpl
{
    private static Logger log = Logger.getLogger(ExceptionHandlerBindings.class);
    private String causaError;
    
    public ExceptionHandlerBindings()
    {
        super(true);
    }

    public ExceptionHandlerBindings(boolean b)
    {
        super(b);
    }

    public void reportException(DCBindingContainer dcbindings, Exception e)
    {
        if (e == null || !(e instanceof AdapterException))
        {
            causaError = "Ocurrió un error durante el flujo del programa, favor de contactar al administrador.";
            log.error("ExceptionHandlerBindings: ",e);
        } 
        else
        {
            causaError = e.getCause().getMessage();
            if (causaError.substring(0, 54).equals("El cliente ha recibido un fallo de SOAP del servidor: "))
                causaError = causaError.substring(54);
        }
        
       log.error("ExceptionHandlerBindings: Ocurrió un error durante el flujo del programa " + causaError, e);
      //  super.reportException(dcbindings, e);
    }

    public DCErrorMessage getDetailedDisplayMessage(BindingContext ctx, RegionBinding ctr, Exception ex)
    {
        return null;
    }

    public String getDisplayMessage(BindingContext bc, Exception e)
    {
        return causaError;
    }
}
