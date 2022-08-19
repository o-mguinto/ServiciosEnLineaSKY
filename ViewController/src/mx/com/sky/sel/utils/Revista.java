package mx.com.sky.sel.utils;

import java.io.File;
import java.io.Serializable;

import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

import mx.com.sky.sel.log.LogPC;


public class Revista implements Serializable{
    @SuppressWarnings("compatibility:-8045803951659762635")
    private static final long serialVersionUID = 1322899025978994086L;

    private String defaultRevista;
    private String revista01;
    private String revista02;
    private String revista03;
    private String revista04;
    // Revista 05 es la del mes siguiente
    private String revista05;
    private String uploadPath;
    
    private String imgRevista01;
    private String imgRevista02;
    private String imgRevista03;
    private boolean mostrarRevista03;

    public Revista() {
        super();
        mostrarRevista03 = false;
        init();
        cargarImgRevistas();
    }

    private void init() {
        Parametros parametros = new Parametros();
        String url = parametros.getUrlImgRevistas();
        uploadPath = parametros.getUploadPath();
        Format formatter;
        int year = 0;
        int month = 0;
        Date date = null;
        String sFormat = "";
        // The year
        date = Calendar.getInstance().getTime();

        formatter = new SimpleDateFormat("yyyy"); // 02
        sFormat = formatter.format(date);
        year = Integer.parseInt(sFormat);

        formatter = new SimpleDateFormat("MM"); // 02
        sFormat = formatter.format(date);
        month = Integer.parseInt(sFormat);

        NumberFormat formatterN = new DecimalFormat("00");
        String sNumber = formatterN.format(month);


        if (month == 1) {
            revista01 = "revista_" + (year - 1) + "_10.png";
            revista02 = "revista_" + (year - 1) + "_11.png";
            revista03 = "revista_" + (year - 1) + "_12.png";
            revista04 = "revista_" + year + "_01.png";
            revista05 = "revista_" + year + "_02.png";
        } else if (month == 2) {
            revista01 = "revista_" + (year - 1) + "_11.png";
            revista02 = "revista_" + (year - 1) + "_12.png";
            revista03 = "revista_" + year + "_01.png";
            revista04 = "revista_" + year + "_02.png";
            revista05 = "revista_" + year + "_03.png";
        } else if (month == 3) {
            revista01 = "revista_" + (year - 1) + "_12.png";
            revista02 = "revista_" + year + "_01.png";
            revista03 = "revista_" + year + "_02.png";
            revista04 = "revista_" + year + "_03.png";
            revista05 = "revista_" + year + "_04.png";
        } else {
            sNumber = formatterN.format(month - 3);
            revista01 = "revista_" + year + "_" + sNumber + ".png";
            sNumber = formatterN.format(month - 2);
            revista02 = "revista_" + year + "_" + sNumber + ".png";
            sNumber = formatterN.format(month - 1);
            revista03 = "revista_" + year + "_" + sNumber + ".png";
            revista04 = "revista_" + year + "_" + sFormat + ".png";
            if ((month + 1) > 12) {
                revista05 = "revista_" + (year + 1) + "_01.png";
            } else {
                sNumber = formatterN.format(month + 1);
                revista05 = "revista_" + year + "_" + sNumber + ".png";
            }
        }

        revista01 = url + revista01;
        revista02 = url + revista02;
        revista03 = url + revista03;
        revista04 = url + revista04;
        revista05 = url + revista05;
        defaultRevista = url + "default.png";
    }
    
    private void cargarImgRevistas() {
        String revistaMesSiguiente = "";
        imgRevista01 = getRevista03();
        imgRevista02 = getRevista04();
        imgRevista03 = getRevista05();

        revistaMesSiguiente = getUploadPath()  + imgRevista03;

        File f = new File(revistaMesSiguiente);

        if (!f.exists()) {
            LogPC.println(this,
                          "imgRevista03 NO EXISTE:" + revistaMesSiguiente);
            imgRevista03 = getDefaultRevista();
            mostrarRevista03 = false;
        } else {
            LogPC.println(this, "imgRevista03 EXISTE:" + revistaMesSiguiente);
            mostrarRevista03 = true;
        }
    }

    public void setRevista01(String revista01) {
        this.revista01 = revista01;
    }

    public String getRevista01() {
        return revista01;
    }

    public void setRevista02(String revista02) {
        this.revista02 = revista02;
    }

    public String getRevista02() {
        return revista02;
    }

    public void setRevista03(String revista03) {
        this.revista03 = revista03;
    }

    public String getRevista03() {
        return revista03;
    }

    public void setRevista04(String revista04) {
        this.revista04 = revista04;
    }

    public String getRevista04() {
        return revista04;
    }

    public void setRevista05(String revista05) {
        this.revista05 = revista05;
    }

    public String getRevista05() {
        return revista05;
    }

    public void setDefaultRevista(String defaultRevista) {
        this.defaultRevista = defaultRevista;
    }

    public String getDefaultRevista() {
        return defaultRevista;
    }

    public void setUploadPath(String uploadPath) {
        this.uploadPath = uploadPath;
    }

    public String getUploadPath() {
        return uploadPath;
    }


    public void setImgRevista01(String imgRevista01) {
        this.imgRevista01 = imgRevista01;
    }

    public String getImgRevista01() {
        return imgRevista01;
    }

    public void setImgRevista02(String imgRevista02) {
        this.imgRevista02 = imgRevista02;
    }

    public String getImgRevista02() {
        return imgRevista02;
    }

    public void setImgRevista03(String imgRevista03) {
        this.imgRevista03 = imgRevista03;
    }

    public String getImgRevista03() {
        return imgRevista03;
    }

    public void setMostrarRevista03(boolean mostrarRevista03) {
        this.mostrarRevista03 = mostrarRevista03;
    }

    public boolean isMostrarRevista03() {
        return mostrarRevista03;
    }
}
