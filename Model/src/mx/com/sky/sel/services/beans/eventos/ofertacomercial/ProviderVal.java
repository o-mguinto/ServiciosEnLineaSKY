package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class ProviderVal implements Serializable{
    @SuppressWarnings("compatibility:855870066717316848")
    private static final long serialVersionUID = -8525114715711781338L;
    private Integer languagecode;
    private Integer ppvproviderid;
    private String shortdisplay;
    private String displayvalue;


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProviderVal [");
        if (languagecode != null) {
            builder.append("languagecode=");
            builder.append(languagecode);
            builder.append(", ");
        }
        if (ppvproviderid != null) {
            builder.append("ppvproviderid=");
            builder.append(ppvproviderid);
            builder.append(", ");
        }
        if (shortdisplay != null) {
            builder.append("shortdisplay=");
            builder.append(shortdisplay);
            builder.append(", ");
        }
        if (displayvalue != null) {
            builder.append("displayvalue=");
            builder.append(displayvalue);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the languagecode
     */
    public Integer getLanguagecode() {
        return languagecode;
    }

    /**
     * @param languagecode the languagecode to set
     */
    public void setLanguagecode(Integer languagecode) {
        this.languagecode = languagecode;
    }

    /**
     * @return the ppvproviderid
     */
    public Integer getPpvproviderid() {
        return ppvproviderid;
    }

    /**
     * @param ppvproviderid the ppvproviderid to set
     */
    public void setPpvproviderid(Integer ppvproviderid) {
        this.ppvproviderid = ppvproviderid;
    }

    /**
     * @return the shortdisplay
     */
    public String getShortdisplay() {
        return shortdisplay;
    }

    /**
     * @param shortdisplay the shortdisplay to set
     */
    public void setShortdisplay(String shortdisplay) {
        this.shortdisplay = shortdisplay;
    }

    /**
     * @return the displayvalue
     */
    public String getDisplayvalue() {
        return displayvalue;
    }

    /**
     * @param displayvalue the displayvalue to set
     */
    public void setDisplayvalue(String displayvalue) {
        this.displayvalue = displayvalue;
    }


}
