package mx.com.sky.sel.utils;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


public class Encriptacion implements Serializable {
    @SuppressWarnings("compatibility:556973476212071436")
    private static final long serialVersionUID = 3061225054663966143L;

    public Encriptacion() {
        super();
    }

    public static String encriptar(String parametro) {
        DESKeySpec keySpec = null;
        SecretKeyFactory keyFactory = null;
        SecretKey key = null;
        String encrypedPwd = "";
        try {
            keySpec = new DESKeySpec("ServiciosEnLinea".getBytes("UTF8"));
            keyFactory = SecretKeyFactory.getInstance("DES");
            key = keyFactory.generateSecret(keySpec);
            sun.misc.BASE64Encoder base64encoder = new BASE64Encoder();

            //ENCRIPTAR
            byte[] cleartext = parametro.getBytes("UTF8");
            Cipher cifrado = Cipher.getInstance("DES");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            encrypedPwd = base64encoder.encode(cifrado.doFinal(cleartext));
        } catch (InvalidKeyException e) {
        } catch (UnsupportedEncodingException e) {
        } catch (NoSuchAlgorithmException e) {
        } catch (InvalidKeySpecException e) {
        } catch (NoSuchPaddingException e) {
        } catch (IllegalBlockSizeException e) {
        } catch (BadPaddingException e) {
        }
        return encrypedPwd;
    }

    public static String desencriptar(String parametro) {
        String plainText = "";
        DESKeySpec keySpec = null;
        SecretKeyFactory keyFactory = null;
        SecretKey key = null;


        try {
            keySpec = new DESKeySpec("ServiciosEnLinea".getBytes("UTF8"));
            keyFactory = SecretKeyFactory.getInstance("DES");
            key = keyFactory.generateSecret(keySpec);
            sun.misc.BASE64Decoder base64decoder = new BASE64Decoder();


            //DECRIPTAR
            byte[] encrypedPwdBytes = base64decoder.decodeBuffer(parametro);
            Cipher descifrado =
                Cipher.getInstance("DES"); // cipher is not thread safe
            descifrado.init(Cipher.DECRYPT_MODE, key);
            byte[] plainTextPwdBytes = (descifrado.doFinal(encrypedPwdBytes));
            plainText = new String(plainTextPwdBytes);

        } catch (InvalidKeyException e) {
        } catch (UnsupportedEncodingException e) {
        } catch (NoSuchAlgorithmException e) {
        } catch (InvalidKeySpecException e) {
        } catch (IOException e) {
        } catch (NoSuchPaddingException e) {
        } catch (IllegalBlockSizeException e) {
        } catch (BadPaddingException e) {
        }


        return plainText;
    }
}