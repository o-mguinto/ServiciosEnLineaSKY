package mx.com.sky.sel.utils;

import java.io.Serializable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorCurp implements  Serializable{
    @SuppressWarnings("compatibility:-3527821058196247462")
    private static final long serialVersionUID = 1475238242131899871L;

    public ValidadorCurp() {
        super();
    }
    public final static String REGEX_CURP = 
            "[A-Z][A,E,I,O,U,X][A-Z]{2}[0-9]{2}[0-1][0-9][0-3][0-9][M,H][A-Z]{2}[B,C,D,F,G,H,J,K,L,M,N,Ñ,P,Q,R,S,T,V,W,X,Y,Z]{3}[0-9,A-Z][0-9]";

        public boolean validarCurp(String textoCurp){
            boolean curpValido = false;
            if(textoCurp !=null && !textoCurp.isEmpty()){
                if(textoCurp.length()==18){
                    Pattern pattern = Pattern.compile(REGEX_CURP);
                    Matcher matcher = pattern.matcher(textoCurp);
                    curpValido = matcher.find();
                }
            }else{//como no es requerido, si está vacio se considera valido
                return true;
            }
            return curpValido;
        }
}
