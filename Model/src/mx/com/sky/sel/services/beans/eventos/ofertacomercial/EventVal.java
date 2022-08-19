package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

import java.sql.Timestamp;

public class EventVal implements Serializable{
    @SuppressWarnings("compatibility:-3264600046114814188")
    private static final long serialVersionUID = -8996498974116166327L;
    private Integer languagecode;
    private Integer ppveventid;
    private Timestamp expirydate;
    private String shortdisplay;
    private String displayvalue;
    private String alternatetitle;
    private String channeltitle;
    private String description1;
    private String description2;
    private String ppvclass;
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EventVal [");
        if (languagecode != null) {
            builder.append("languagecode=");
            builder.append(languagecode);
            builder.append(", ");
        }
        if (ppveventid != null) {
            builder.append("ppveventid=");
            builder.append(ppveventid);
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
            builder.append(", ");
        }
        if (alternatetitle != null) {
            builder.append("alternatetitle=");
            builder.append(alternatetitle);
            builder.append(", ");
        }
        if (channeltitle != null) {
            builder.append("channeltitle=");
            builder.append(channeltitle);
            builder.append(", ");
        }
        if (description1 != null) {
            builder.append("description1=");
            builder.append(description1);
            builder.append(", ");
        }
        if (description2 != null) {
            builder.append("description2=");
            builder.append(description2);
            builder.append(", ");
        }
        if (ppvclass != null) {
            builder.append("ppvclass=");
            builder.append(ppvclass);
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
     * @return the ppveventid
     */
    public Integer getPpveventid() {
        return ppveventid;
    }

    /**
     * @param ppveventid the ppveventid to set
     */
    public void setPpveventid(Integer ppveventid) {
        this.ppveventid = ppveventid;
    }

    /**
     * @return the expirydate
     */
    public Timestamp getExpirydate() {
        return expirydate;
    }

    /**
     * @param expirydate the expirydate to set
     */
    public void setExpirydate(Timestamp expirydate) {
        this.expirydate = expirydate;
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

    /**
     * @return the alternatetitle
     */
    public String getAlternatetitle() {
        return alternatetitle;
    }

    /**
     * @param alternatetitle the alternatetitle to set
     */
    public void setAlternatetitle(String alternatetitle) {
        this.alternatetitle = alternatetitle;
    }

    /**
     * @return the channeltitle
     */
    public String getChanneltitle() {
        return channeltitle;
    }

    /**
     * @param channeltitle the channeltitle to set
     */
    public void setChanneltitle(String channeltitle) {
        this.channeltitle = channeltitle;
    }

    /**
     * @return the description1
     */
    public String getDescription1() {
        return description1;
    }

    /**
     * @param description1 the description1 to set
     */
    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    /**
     * @return the description2
     */
    public String getDescription2() {
        return description2;
    }

    /**
     * @param description2 the description2 to set
     */
    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    /**
     * @return the ppvclass
     */
    public String getPpvclass() {
        return ppvclass;
    }

    /**
     * @param ppvclass the ppvclass to set
     */
    public void setPpvclass(String ppvclass) {
        this.ppvclass = ppvclass;
    }


}
