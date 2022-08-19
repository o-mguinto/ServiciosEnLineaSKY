package mx.com.sky.sel.services.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import mx.com.sky.sel.log.LogPC;
import org.apache.myfaces.trinidad.model.UploadedFile;

public class Files implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * @param sourceFile
     * @param targetFile
     */
    public synchronized static void upload(UploadedFile sourceFile, String targetFile) {
        LogPC.println("Files", "Upload File " + targetFile);
        if (sourceFile != null) {
            InputStream is01 = null;
            String hostname = "";
            try {
                hostname = getServerName();
                is01 = sourceFile.getInputStream();

                if (is01 != null) {

                    LogPC.println("Files", "Copiando Archivos en skyweb LOCAL " + targetFile);
                    copiarArchivo(is01, targetFile);
                    if (hostname.equalsIgnoreCase("skyselw1")) {
                        LogPC.println("Files", "Trasladando Archivo de skyselw1 a Skyselw2 " + targetFile);
                        trasladarArchivo(targetFile, "skyselw2");
                        trasladarArchivo(targetFile, "skyselw3");
                    } else if (hostname.equalsIgnoreCase("skyselw2")) {
                        LogPC.println("Files", "Trasladando Archivo de skyselw2 a skyselw1 " + targetFile);
                        trasladarArchivo(targetFile, "skyselw1");
                        trasladarArchivo(targetFile, "skyselw3");
                    } else if (hostname.equalsIgnoreCase("skyselw3")) {
                        LogPC.println("Files", "Trasladando Archivo de skyselw2 a skyselw3 " + targetFile);
                        trasladarArchivo(targetFile, "skyselw1");
                        trasladarArchivo(targetFile, "skyselw2");
                    } else {
                        LogPC.printlnWarn("Files", "Error host desconocido [" + hostname + "]");
                    }
                }
            } catch (Exception e) {
                LogPC.printlnError(e);
            }
        }
    }


    /**
     * Copia archivos
     * @param fileOrigen
     * @param targetFile
     * @return true si hizo el copiado correcto y false si no
     */
    public static boolean copiarArchivo(InputStream fileOrigen, String targetFile) {
        boolean copiadoCorrecto = true;
        BufferedInputStream bufferOrigen = null;
        BufferedOutputStream bufferTarget = null;

        try {
            println("Copiando archivo server local " + targetFile);
            //1 abrir origen

            //2 abrir destino
            FileOutputStream fisTarget = new FileOutputStream(targetFile);

            //abrimos un buffer para cada uno
            println("Almacenando en Buffer " + targetFile);
            bufferOrigen = new BufferedInputStream(fileOrigen);

            bufferTarget = new BufferedOutputStream(fisTarget);

            //para leer
            byte[] array = new byte[1000];


            println("Leyendo en Buffer " + targetFile);
            int leidos = bufferOrigen.read(array);
            println("Escribiendo Buffer " + targetFile);
            while (leidos > 0) {
                //escribir en destino
                bufferTarget.write(array, 0, leidos);

                leidos = bufferOrigen.read(array);
            }
            println("Cerrando copiado " + targetFile);

            //crear archivo destino

        } catch (IOException e) {
            println("ERROR copiando " + targetFile);
            LogPC.printlnError(e);
            copiadoCorrecto = false;
        } finally {
            if (bufferOrigen != null) {
                try {
                    bufferOrigen.close();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }

            if (bufferTarget != null) {
                try {
                    bufferTarget.flush();
                    bufferTarget.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            println("Termina copiado " + targetFile);
        }
        return copiadoCorrecto;

    }

    public static boolean trasladarArchivo(String targetFile, String server) {
        Process process = null;
        boolean envioCorrecto = true;
        String exec = "scp " + targetFile + " webadm@" + server + ":" + targetFile;
        LogPC.println("Ejecutando Comando ",exec);
        try {
            process = Runtime.getRuntime().exec(exec);
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while(br.ready())
                LogPC.println("Saldia Comando" ,br.readLine());
        } catch (IOException e) {
            envioCorrecto = false;
            LogPC.printlnError(e);
        } catch (Exception e) {
            envioCorrecto = false;
            LogPC.printlnError(e);
        }
        return envioCorrecto;
    }

    private static String getServerName() {
        String hostname = "";
        try {
            InetAddress addr = InetAddress.getLocalHost();
            byte[] ipAddr = addr.getAddress();
            hostname = addr.getHostName();
            println("hostname=" + hostname);
        } catch (UnknownHostException e) {
        }
        return hostname;
    }


    private static void println(String mensaje) {
        LogPC.println("Files", mensaje);
    }

}
