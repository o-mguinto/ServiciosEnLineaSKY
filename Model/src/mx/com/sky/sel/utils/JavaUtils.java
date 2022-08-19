package mx.com.sky.sel.utils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;

import java.sql.Timestamp;

import java.text.DecimalFormat;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

//import mx.com.sky.sel.log.LogPC;
import mx.com.sky.sel.log.LogServicios;

import sun.misc.BASE64Encoder;


public class JavaUtils implements Serializable {
    @SuppressWarnings("compatibility:-2154668379533806907")
    private static final long serialVersionUID = 8277745118873921670L;

    public JavaUtils() {
        super();
    }

    private static DatatypeFactory df = null;
    static {
        try {
            df = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException dce) {
            throw new IllegalStateException("Exception while obtaining DatatypeFactory instance", dce);
        }
    }

    /**
     * Regresa Date la fecha Actual
     * @return
     */
    public static Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }

    /**
     * Regresa la fecha en formato XMLGregorianCalendar
     * @param date Date
     * @return XMLGregorianCalendar
     */
    public static XMLGregorianCalendar asXMLGregorianCalendar(java.util.Date date) {
        if (date == null) {
            return null;
        } else {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTimeInMillis(date.getTime());
            return df.newXMLGregorianCalendar(gc);
        }
    }

    /**
     * Regresa la fecha en formato XMLGregorianCalendar
     * @param date
     * @return XMLGregorianCalendar
     */
    public static XMLGregorianCalendar asXMLGregorianCalendar(Timestamp date) {
        if (date == null) {
            return null;
        } else {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTimeInMillis(date.getTime());
            return df.newXMLGregorianCalendar(gc);
        }
    }

    /**
     * Regresa la fecha en formato XMLGregorianCalendar
     * @param date
     * @return XMLGregorianCalendar
     */
    public static XMLGregorianCalendar asXMLGregorianCalendar(String date) {
        if (date == null) {
            return null;
        } else {
            return df.newXMLGregorianCalendar(date);
        }
    }

    /**
     * Regresa la fecha en formato Date
     * @param xgc XMLGregorianCalendar
     * @return Date
     */
    public static java.util.Date asDate(XMLGregorianCalendar xgc) {
        if (xgc == null) {
            return null;
        } else {
            return xgc.toGregorianCalendar().getTime();
        }
    }

    /**
     * Regresa la fecha en formato Timestamp
     * @param xgc XMLGregorianCalendar
     * @return Timestamp
     */
    public static Timestamp asTimestamp(XMLGregorianCalendar xgc) {
        if (xgc == null) {
            return null;
        } else {
            return new Timestamp(xgc.toGregorianCalendar().getTimeInMillis());
        }
    }

    /**
     * Regresa la fecha en formato Timestamp
     * @param String date in XMLGregorianCalendar format sample: 2013-02-06T14:13:05-05:00
     * @return Timestamp
     */
    public static Timestamp asTimestamp(String date) {
        if (date == null) {
            return null;
        } else {
            return new Timestamp(asXMLGregorianCalendar(date).toGregorianCalendar().getTimeInMillis());
        }
    }

    /**
     * Regresa la fecha en formato String formato[dd/MM/yyyy]
     * @param time Timestamp
     * @return String
     */
    public static String asString(Timestamp time) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        if (time == null) {
            return "";
        }
        return sdf.format(time);
    }

    /**
     * FORMATO STRING yyyyMMddHHmmss
     * @return Cadena formato yyyyMMddHHmmss
     */
    public static String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return sdf.format(Calendar.getInstance().getTime());
    }

    /**
     * Regresa el String con el pattenr de la fecha "dd/MM/yyyy"
     * @return String
     */
    public String getDatePattern() {
        return "dd/MM/yyyy";
    }

    /**
     * Regresa el Date con la fecha actual
     * @return
     */
    public static Date getDate() {
        return Calendar.getInstance().getTime();
    }

    /**
     * Regresa el String en formato #0.00
     * @param moneda String
     * @return
     */
    public static String asMoneda(String moneda) {
        if (moneda == null) {
            return "0.00";
        }
        String montoDosDecimales = moneda;
        double montoD = 0;
        java.text.DecimalFormat df = null;
        try {
            df = new java.text.DecimalFormat("#0.00");
            montoD = Double.parseDouble(moneda);
            montoDosDecimales = df.format(montoD);
        } catch (Exception e) {
            montoDosDecimales = moneda;
        }
        return montoDosDecimales;
    }

    /**
     * Regresa el String en formato #0.00
     * @param montoD Double
     * @return
     */
    public static String asMoneda(double montoD) {
        String montoDosDecimales = "";
        java.text.DecimalFormat df = null;
        try {
            df = new java.text.DecimalFormat("#0.00");
            montoDosDecimales = df.format(montoD);
        } catch (Exception e) {
            montoDosDecimales = montoD + "";
        }
        return montoDosDecimales;
    }

    /**
     * Regresa el String en formato #,###,##0.00
     * @param monto
     * @return
     */
    public static String formatMoneda(String monto) {
        String resultado = "";
        if (monto == null) {
            return "0.00";
        }
        double montoD = 0;
        DecimalFormat df = null;
        try {
            df = new DecimalFormat("#,###,##0.00");
            montoD = Double.parseDouble(monto);
            resultado = df.format(montoD);
        } catch (Exception e) {
            resultado = monto;
        }
        return resultado;
    }

    /**
     * Compara si la fecha es menor a 6 meses atr\u00E1s.
     * @param fecha en Timestamp
     * @return true si la fecha es menor a 6 meses atr\u00E1s - false caso contrario.
     */
    public static boolean compararTimestampMenor6Meses(Timestamp fecha) {
        // create a calendar
        Calendar cal = Calendar.getInstance();
        Calendar calFecha = Calendar.getInstance();
        calFecha.clear();
        calFecha.setTimeInMillis(fecha.getTime());

        // subtract 2 months from the calendar
        cal.add(Calendar.MONTH, -6);
        return cal.compareTo(calFecha) <= 0;
    }

    /**
     * Compara si la fecha es menor a 6 meses atr\u00E1s.
     * @param fecha en Timestamp
     * @return true si la fecha es menor a 6 meses atr\u00E1s - false caso contrario.
     */
    public static boolean compararTimestampMenor6Meses(XMLGregorianCalendar fecha) {
        return compararTimestampMenor6Meses(asTimestamp(fecha));
    }


    public static String removeSpecialCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') | c == '.' || c == '_') {
                sb.append(c);
            } else {
                sb.append('_');
            }
        }
        return sb.toString();
    }

    /**
     * Convierte un archivo leido en InputStream en String base 64.
     * @param fileInputStream Archivo
     * @return String base 64 con el archivo
     * @throws Exception
     */
    public static String convertFile(InputStream fileInputStream) throws Exception {
        BASE64Encoder base64 = null;
        String base64String = "";
        byte[] fileBase64 = null;
        try {
            base64 = new BASE64Encoder();
            fileBase64 = getBytes(fileInputStream);
            base64String = base64.encode(fileBase64);
        } catch (Exception e) {
            throw new Exception(e);
        }
        return base64String;
    }
    /**
     * Obtiene los bytes de un archivo en formato InputStream
     * @param is
     * @return
     * @throws IOException
     */
    private static byte[] getBytes(InputStream is) throws IOException {

        int len;
        int size = 1024;
        byte[] buf;

        if (is instanceof ByteArrayInputStream) {
            size = is.available();
            buf = new byte[size];
            len = is.read(buf, 0, size);
        } else {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            buf = new byte[size];
            while ((len = is.read(buf, 0, size)) != -1) {
                bos.write(buf, 0, len);
            }
            buf = bos.toByteArray();
        }
        return buf;
    }

    public static void main(String[] args) {
        LogServicios.println("JavaUtils", JavaUtils.removeSpecialCharacters("Blue to Go Video Everywhere promoci\u00F3n 4 y el sastr\u00E9"));
    }
    }
