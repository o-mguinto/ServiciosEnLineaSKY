package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class ContentValue implements Serializable{
    @SuppressWarnings("compatibility:-7032105450090343640")
    private static final long serialVersionUID = 3160624880454074511L;
    private Integer languagecode;
    private Integer ppvcontentid;
    private String shortdisplay;
    private String displayvalue;
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContentValue [");
        if (languagecode != null) {
            builder.append("languagecode=");
            builder.append(languagecode);
            builder.append(", ");
        }
        if (ppvcontentid != null) {
            builder.append("ppvcontentid=");
            builder.append(ppvcontentid);
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
     * @return the ppvcontentid
     */
    public Integer getPpvcontentid() {
        return ppvcontentid;
    }

    /**
     * @param ppvcontentid the ppvcontentid to set
     */
    public void setPpvcontentid(Integer ppvcontentid) {
        this.ppvcontentid = ppvcontentid;
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
