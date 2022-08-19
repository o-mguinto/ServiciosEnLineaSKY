package mx.com.sky.sel.utils;

import java.io.Serializable;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class EncriptadoTexto implements Serializable {
    @SuppressWarnings("compatibility:-4511025735704224232")
    private static final long serialVersionUID = -3668049138222557896L;

    public EncriptadoTexto() {
        super();
    }
    
    public static String procesarTexto(String texto) throws Exception {
        String respuesta = "";
        String key = "Pr0c3s0R3g1str0S";
        String initv = "R3g1str0Pr0c3s0S";
        String textoProcesar = texto;
        String toProcesar = textoProcesar;
        try {
            javax.crypto.spec.IvParameterSpec iv =
                new javax.crypto.spec.IvParameterSpec(initv.getBytes("UTF-8"));
            javax.crypto.spec.SecretKeySpec _key =
                new javax.crypto.spec.SecretKeySpec(key.getBytes("UTF-8"),
                                                    "AES");
            byte[] plaintext = toProcesar.getBytes();
            if (plaintext.length % 8 != 0) {
                byte[] padded =
                    new byte[plaintext.length + 8 - (plaintext.length % 8)];
                System.arraycopy(plaintext, 0, padded, 0, plaintext.length);
                plaintext = padded;
            }
            javax.crypto.Cipher cipher =
                javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING"); // AES256
            cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, _key, iv);
            byte[] cipherText = cipher.doFinal(plaintext);
            //cipherText = Base64.getEncoder().encode(cipherText);
            //String value = new String(cipherText);
            String value = new BASE64Encoder().encode(cipherText);  
            value = value.replace("+", "_");
            value = value.replace("/", "~");
            value = value.replace("=", "*");
            respuesta = value;
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return respuesta;
    }

    public static String leerTexto(String texto) {
        String respuesta = "";
        String key = "Pr0c3s0R3g1str0S";
        String initv = "R3g1str0Pr0c3s0S";
        String toProcesar = texto;
        toProcesar = toProcesar.replace("_", "+");
        toProcesar = toProcesar.replace("~", "/");
        toProcesar = toProcesar.replace("*", "=");
        try {
            javax.crypto.spec.IvParameterSpec iv =
                new javax.crypto.spec.IvParameterSpec(initv.getBytes("UTF-8"));
            javax.crypto.spec.SecretKeySpec _key =
                new javax.crypto.spec.SecretKeySpec(key.getBytes("UTF-8"),
                                                    "AES");
            sun.misc.BASE64Decoder base64decoder = new BASE64Decoder();
            byte[] plaintext = base64decoder.decodeBuffer(toProcesar);
            if (plaintext.length % 8 != 0) {
                byte[] padded =
                    new byte[plaintext.length + 8 - (plaintext.length % 8)];
                System.arraycopy(plaintext, 0, padded, 0, plaintext.length);
                plaintext = padded;
            }
            javax.crypto.Cipher cipher =
                javax.crypto.Cipher.getInstance("AES/CBC/PKCS5PADDING"); // AES256
            cipher.init(javax.crypto.Cipher.DECRYPT_MODE, _key, iv);
            byte[] cipherText = cipher.doFinal(plaintext);
            respuesta = new String(cipherText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return respuesta;
    }
    
    public static String obtenerParametro(String[] parametros, String clave){
        for (String texto:parametros){
            texto=texto.trim();
            if (texto.split("=")[0].equalsIgnoreCase(clave))
                return texto.split("=")[1];
        }
        return null;
    }
}
