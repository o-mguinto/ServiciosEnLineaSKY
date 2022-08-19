package mx.com.sky.sel.utils;

import java.io.Serializable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import mx.com.sky.sel.log.LogPC;


public class ValidadorEstructuraContrasenia implements Validator, Serializable{
    @SuppressWarnings("compatibility:376238018501181390")
    private static final long serialVersionUID = 2173695456450339444L;

    public ValidadorEstructuraContrasenia() {
        super();
    }
    public void validate(FacesContext facesContext, UIComponent uIComponent, Object object) throws ValidatorException {       
    String contrasenia = object.toString();      
     if(contrasenia!=null && !contrasenia.isEmpty() && contrasenia.length()>= 8){
        Pattern pattern =  Pattern.compile("\\S*[A-Z]+\\S*");
        Matcher  matcher = pattern.matcher(contrasenia);
        if(!matcher.matches()){
            throw new ValidatorException(new FacesMessage("","Introduzca por lo menos una mayúscula."));
        }else{
            pattern =  Pattern.compile("\\S*[a-z]+\\S*");
            matcher = pattern.matcher(contrasenia);
            if(!matcher.matches()){                  
                throw new ValidatorException(new FacesMessage("","Introduzca por lo menos una minúscula."));
            }else{
                pattern =  Pattern.compile("\\S*\\d+\\S*");
                matcher = pattern.matcher(contrasenia);
                if(!matcher.matches()){
                    throw new ValidatorException(new FacesMessage("","Introduzca por lo menos un digito."));
                }else{                      
                    pattern =  Pattern.compile("\\S*[^(A-Za-z0-9 )]+\\S*");
                    matcher = pattern.matcher(contrasenia);
                    if(!matcher.matches()){
                        throw new ValidatorException(new FacesMessage("","Introduzca por lo menos un carácter especial."));
                    }else{
                        pattern = Pattern.compile("[A-Za-z0-9!#%^*()\\-_=+~'\":;?|{}\\[\\],.<>$@]+");
                        matcher = pattern.matcher(contrasenia);
                        if(!matcher.matches()){
                            throw new ValidatorException(new FacesMessage("","La contraseña puede contener letras, números y los símbolos:\n ! # % ^ * ( ) - _ = + ~ ' \" : ; ? | { } [ ] , . < > $ @"));
                        }else{
                            LogPC.println(this, "Contraseña valida");
                        }
                    } 
                } 
            }
        }      
    
    } else {
        LogPC.println(this, "Sin valores de contraseña");
    }
    }
}
