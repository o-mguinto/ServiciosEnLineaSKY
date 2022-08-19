package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class TypeVal implements Serializable{
    @SuppressWarnings("compatibility:-8236334270017330083")
    private static final long serialVersionUID = 5241412996164246250L;
    private Integer languagecode;
    private Integer ppvtypeid;
    private String shortdisplay;
    private String displayvalue;


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TypeVal [");
        if (languagecode != null) {
            builder.append("languagecode=");
            builder.append(languagecode);
            builder.append(", ");
        }
        if (ppvtypeid != null) {
            builder.append("ppvtypeid=");
            builder.append(ppvtypeid);
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
     * @return the ppvtypeid
     */
    public Integer getPpvtypeid() {
        return ppvtypeid;
    }

    /**
     * @param ppvtypeid the ppvtypeid to set
     */
    public void setPpvtypeid(Integer ppvtypeid) {
        this.ppvtypeid = ppvtypeid;
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
