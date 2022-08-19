package mx.com.sky.sel.utils;

import java.io.Serializable;

import javax.faces.context.FacesContext;

import javax.servlet.http.HttpServletRequest;

import mx.com.sky.sel.log.LogPC;

public class AgentUtil implements Serializable {
    @SuppressWarnings("compatibility:1989107249648214998")
    private static final long serialVersionUID = 7666521566888292167L;
    private String phoneFamily;
    private String smartPhone = "smartphone";
    private String tablet = "tablet";
    private String default_skin = "escritorio";
    private String string_skin = "";

    public AgentUtil() {
    }

    /**
     * Used for skinning. Can be used in page definition for
     * agent specific rendering.
     */
    public String getPhoneFamily() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest req = (HttpServletRequest)fc.getExternalContext().getRequest();
        String agent = req.getHeader("User-Agent");
        if (agent != null && agent.indexOf("iPhone") > -1) {
            string_skin = smartPhone;
        } else if (agent != null && agent.indexOf("Android") > -1) {
            if (agent.contains("Kindle Fire")) {
                string_skin = tablet;
            } else if (agent.contains("Sprint APA")) {
                string_skin = smartPhone;
            } else if (agent.contains("SM-N900T")) {
                //Samsung Galaxy Note 3
                string_skin = tablet;
            } else if (agent.contains("GT-N7100")) {
                //Samsung Galaxy Note II
                string_skin = tablet;
            } else if (agent.contains("SAMSUNG-SGH-I717")) {
                //Samsung Galaxy Note
                string_skin = tablet;
            } else if (agent.contains("SCH-I800")) {
                //Samsung Galaxy Tab 7.7 8.9 10.1
                string_skin = tablet;
            } else if (agent.contains("GT-I9300")) {
                //Samsung Galaxy SIII , Galaxy Nexus
                string_skin = smartPhone;
            } else if (agent.contains("GT-I9000")) {
                //Samsung Galaxy S , SII , W
                string_skin = smartPhone;
            } else if (agent.contains("GT-I9000")) {
                //Samsung Galaxy S , SII , W , S4
                string_skin = smartPhone;
            } else if (agent.contains("HTC")) {
                string_skin = smartPhone;
            } else if (agent.contains("Nexus 5")) {
                string_skin = smartPhone;
            } else if (agent.contains("Nexus 4")) {
                string_skin = smartPhone;
            } else if (agent.contains("LT28at")) {
                // Sony Xperia
                string_skin = smartPhone;
            } else if (agent.contains("SonyEricssonST25i")) {
                // Sony Xperia
                string_skin = smartPhone;
            } else if (agent.contains("SonyC6903")) {
                // Sony Xperia Z Z1
                string_skin = smartPhone;
            } else if (agent.contains("mobile")) {
                string_skin = smartPhone;
            } else if (agent.contains("Mobile")) {
                string_skin = smartPhone;
            } else {
                string_skin = tablet;
            }
        } else if (agent != null && agent.indexOf("PlayBook") > -1) {
            string_skin = tablet;
        } else if (agent != null && agent.indexOf("BB10") > -1) {
            string_skin = smartPhone;
        } else if (agent != null && agent.indexOf("Symbian") > -1) {
            string_skin = smartPhone;
        } else if (agent != null && agent.indexOf("iPhone") > -1) {
            string_skin = smartPhone;
        } else if (agent != null && agent.indexOf("iPod") > -1) {
            string_skin = smartPhone;
        } else if (agent != null && agent.indexOf("BlackBerry") > -1) {
            string_skin = smartPhone;
        } else if (agent != null && agent.indexOf("Windows Phone") > -1) {
            string_skin = smartPhone;
        } else if (agent != null && agent.indexOf("iPad") > -1) {
            string_skin = tablet;
        } else {
            string_skin = default_skin;
        }
        return string_skin;
    }


    public String getDispositivo() {
        FacesContext fc = FacesContext.getCurrentInstance();
        HttpServletRequest req = (HttpServletRequest)fc.getExternalContext().getRequest();
        String agent = req.getHeader("User-Agent");
        String dispositivo = "";
        if (agent != null && agent.indexOf("iPhone") > -1) {
            dispositivo = "SMARTPHONE_IPHONE";
        } else if (agent != null && agent.indexOf("Android") > -1) {
            if (agent.contains("Kindle Fire")) {
                dispositivo = "TABLET_ANDROID_KINDLE";
            } else if (agent.contains("Sprint APA")) {
                dispositivo = "SMARTPHONE_SPRINT_APA";
            } else if (agent.contains("SM-N900T")) {
                //Samsung Galaxy Note 3
                dispositivo = "TABLET_SM-N900T";
            } else if (agent.contains("GT-N7100")) {
                //Samsung Galaxy Note II
                dispositivo = "TABLET_GT-N7100";
            } else if (agent.contains("SAMSUNG-SGH-I717")) {
                //Samsung Galaxy Note
                dispositivo = "TABLET_SAMSUNG-SGH-I717";
            } else if (agent.contains("SCH-I800")) {
                //Samsung Galaxy Tab 7.7 8.9 10.1
                dispositivo = "TABLET_SCH-I800";
            } else if (agent.contains("GT-I9300")) {
                //Samsung Galaxy SIII , Galaxy Nexus
                dispositivo = "SMARTPHONE_GT-I9300";
            } else if (agent.contains("GT-I9000")) {
                //Samsung Galaxy S , SII , W, S4
                dispositivo = "SMARTPHONE_GT-I9000";
            } else if (agent.contains("HTC")) {
                dispositivo = "SMARTPHONE_HTC";
            } else if (agent.contains("Nexus 5")) {
                dispositivo = "SMARTPHONE_NEXUS_5";
            } else if (agent.contains("Nexus 4")) {
                dispositivo = "SMARTPHONE_NEXUS_4";
            } else if (agent.contains("LT28at")) {
                // Sony Xperia
                dispositivo = "SMARTPHONE_SONYXPERIA";
            } else if (agent.contains("SonyEricssonST25i")) {
                // Sony Xperia
                dispositivo = "SMARTPHONE_SONYXPERIA";
            } else if (agent.contains("SonyC6903")) {
                // Sony Xperia Z Z1
                dispositivo = "SMARTPHONE_SONYXPERIA";
            } else if (agent.contains("mobile")) {
                dispositivo = "SMARTPHONE";
            } else if (agent.contains("Mobile")) {
                dispositivo = "SMARTPHONE";
            } else {
                dispositivo = "TABLET";
            }
        } else if (agent != null && agent.indexOf("PlayBook") > -1) {
            dispositivo = "TABLET_PLAYBOOK";
        } else if (agent != null && agent.indexOf("BB10") > -1) {
            dispositivo = "SMARTPHONE_BB10";
        } else if (agent != null && agent.indexOf("Symbian") > -1) {
            dispositivo = "SMARTPHONE_SYMBIAN";
        } else if (agent != null && agent.indexOf("iPod") > -1) {
            dispositivo = "IPOD";
        } else if (agent != null && agent.indexOf("BlackBerry") > -1) {
            dispositivo = "SMARTPHONE_BLACKBERRY";
        } else if (agent != null && agent.indexOf("Windows Phone") > -1) {
            dispositivo = "SMARTPHONE_WINDOWS_PHONE";
        } else if (agent != null && agent.indexOf("iPad") > -1) {
            dispositivo = "IPAD";
        } else {
            dispositivo = "PC";
        }
        LogPC.println(this, dispositivo);
        return dispositivo;
    }

    public void setPhoneFamily(String phoneFamily) {
        this.phoneFamily = phoneFamily;
    }

    }
