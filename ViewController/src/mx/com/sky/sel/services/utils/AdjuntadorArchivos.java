package mx.com.sky.sel.services.utils;

import java.io.IOException;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.List;
import mx.com.sky.sel.log.LogPC;

import mx.com.sky.sel.services.beans.utils.ArchivoAdjunto;
import mx.com.sky.sel.utils.JavaUtils;



import org.apache.myfaces.trinidad.model.UploadedFile;

public class AdjuntadorArchivos {
    public static List<ArchivoAdjunto> adjuntarArchivos(List<UploadedFile> archivos,String[] nombreArchivos){
        List<ArchivoAdjunto> listaAdjuntos = new ArrayList<ArchivoAdjunto>();
        InputStream isArchivo = null;
        ArchivoAdjunto archivoAd = null; 
        int index = 0;
        LogPC.println("AdjuntadorArchivos", "adjuntarArchivos N\u00FAmero de archivos: "+archivos.size());
        
        for(UploadedFile archivo:archivos){
            try {
                LogPC.println("AdjuntadorArchivos", "adjuntarArchivos Archivo inputstream: "+archivo.getInputStream());
                if(archivo != null && archivo.getInputStream() != null){
                    LogPC.println("AdjuntadorArchivos", "adjuntarArchivos Archivo:"+nombreArchivos[index]);
                    isArchivo = archivo.getInputStream();
                    archivoAd = new ArchivoAdjunto();
                    archivoAd.setExtension(getExtensionArchivo(archivo.getFilename()));
                    archivoAd.setFileBase64(JavaUtils.convertFile(isArchivo));
                    LogPC.println("AdjuntadorArchivos", "adjuntarArchivos fileBase64:"+archivoAd.getFileBase64());
                    archivoAd.setFileName(nombreArchivos[index]);
                    listaAdjuntos.add(archivoAd);
                    index++;
                }
            }catch (IOException e) {
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        return listaAdjuntos;
    }
    
    private static String getExtensionArchivo(String nombreArchivo) {
        String[] partesNombre = nombreArchivo.split("\\.");
        return partesNombre[partesNombre.length-1];
    }
}
