package mx.com.sky.sel.utils;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Arrays;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

import mx.com.sky.sel.log.LogPC;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class RememberMeEncriptacion implements Serializable {
    @SuppressWarnings("compatibility:8946121956346559774")
    private static final long serialVersionUID = -44407194595871501L;

    public RememberMeEncriptacion() {
        super();
    }

    public static String encriptar(String parametro) {
        String encrypedPwd = "";
        try{
            // Get the Key
            byte[] key = ("ServiciosEnLinea").getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); // use only first 128 bit
        
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            sun.misc.BASE64Encoder base64encoder = new BASE64Encoder();
                // Instantiate the cipher
             Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] encrypted = cipher.doFinal((parametro).getBytes());
            encrypedPwd =base64encoder.encode(encrypted);
            //System.out.println("encrypted string: " + encrypedPwd);
            
        }catch(InvalidKeyException e){
            LogPC.println("RememberMeEncriptacion", e);
        } catch (NoSuchAlgorithmException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (NoSuchPaddingException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (IllegalBlockSizeException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (BadPaddingException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (UnsupportedEncodingException e) {
            LogPC.println("RememberMeEncriptacion", e);
        }

        /*
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
    */
        return encrypedPwd;
        }

    public static String desencriptar(String parametro) {
        String plainText = "";
        DESKeySpec keySpec = null;
        SecretKeyFactory keyFactory = null;
        //SecretKey key = null;
        
        

        try {
            byte[] key = ("ServiciosEnLinea").getBytes("UTF-8");
            MessageDigest sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16); // use only first 128 bit
            
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            sun.misc.BASE64Decoder base64decoder = new BASE64Decoder();
                // Instantiate the cipher
             Cipher cipher = Cipher.getInstance("AES");
            //DESENCRIPTA
            
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
            byte[] encrypedPwdBytes = base64decoder.decodeBuffer(parametro);
            byte[] original = cipher.doFinal(encrypedPwdBytes);
            plainText = new String(original);
            
            
            /*
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
    */
        } catch (InvalidKeyException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (UnsupportedEncodingException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (NoSuchAlgorithmException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (IOException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (NoSuchPaddingException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (IllegalBlockSizeException e) {
            LogPC.println("RememberMeEncriptacion", e);
        } catch (BadPaddingException e) {
            LogPC.println("RememberMeEncriptacion", e);
        }


        return plainText;
    }
    }
