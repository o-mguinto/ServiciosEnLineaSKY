package mx.com.sky.sel.utils;

import java.io.Serializable;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RememberMe implements Serializable{
    @SuppressWarnings("compatibility:5344773298009561174")
    private static final long serialVersionUID = -5934333401366664642L;

    /**
     * @param response
     * @param cookieName
     * @param cookieValue
     */
    public static void remember(HttpServletResponse response,String cookieName,String cookieValue,int age){
        if( cookieValue.length() > 47 ) {
            System.out.println("Longitud del cookieValue: " + cookieValue.length());
            System.out.println("cookieValue es mayor a 47, se recortara...");
            cookieValue = cookieValue.substring(0, 47);
            System.out.println("Nueva longitud cookieValue: " + cookieValue.length());
        }
        Cookie cookie;
        cookie = new Cookie(cookieName,RememberMeEncriptacion.encriptar(cookieValue));
        cookie.setPath("/");
        cookie.setMaxAge(age);
        response.addCookie(cookie); 
    }
    
    public static Cookie leerCookie(HttpServletRequest request,String name){
        Cookie[] cookies = request.getCookies();
        for(Cookie c:cookies){
            if(c.getName().equals(name)){
                return c;
            }
        }
        return new Cookie("NotFound","null");
    }
    
    public static String[] leerDatos(Cookie cookie){
        return RememberMeEncriptacion.desencriptar(cookie.getValue()).split("\\|");
    }
    
    }