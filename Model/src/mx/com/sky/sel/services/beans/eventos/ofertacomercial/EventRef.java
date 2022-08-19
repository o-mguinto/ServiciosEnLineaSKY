package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

import java.sql.Timestamp;

public class EventRef implements Serializable{
    @SuppressWarnings("compatibility:317215434207549375")
    private static final long serialVersionUID = 8326211582607715468L;
    private Integer ppveventid;
    private Timestamp expirydate;
    private Integer subjectmatterrating;
    private Integer duration;
    private Integer specialevent;
    private Timestamp providerdate;
    private Integer providereventid;
    private Integer ppvproviderid;
    private Integer ppvtypeid;
    private Integer ppvsupplierid;
    private Integer ppvcontentid;
    private Integer ppvgenreid;
    private Integer csrgroupid;
    private Integer freeevent;
    private String servicetype;
    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EventRef [");
        if (ppveventid != null) {
            builder.append("ppveventid=");
            builder.append(ppveventid);
            builder.append(", ");
        }
        if (subjectmatterrating != null) {
            builder.append("subjectmatterrating=");
            builder.append(subjectmatterrating);
            builder.append(", ");
        }
        if (duration != null) {
            builder.append("duration=");
            builder.append(duration);
            builder.append(", ");
        }
        if (specialevent != null) {
            builder.append("specialevent=");
            builder.append(specialevent);
            builder.append(", ");
        }
        if (providereventid != null) {
            builder.append("providereventid=");
            builder.append(providereventid);
            builder.append(", ");
        }
        if (ppvproviderid != null) {
            builder.append("ppvproviderid=");
            builder.append(ppvproviderid);
            builder.append(", ");
        }
        if (ppvtypeid != null) {
            builder.append("ppvtypeid=");
            builder.append(ppvtypeid);
            builder.append(", ");
        }
        if (ppvsupplierid != null) {
            builder.append("ppvsupplierid=");
            builder.append(ppvsupplierid);
            builder.append(", ");
        }
        if (ppvcontentid != null) {
            builder.append("ppvcontentid=");
            builder.append(ppvcontentid);
            builder.append(", ");
        }
        if (ppvgenreid != null) {
            builder.append("ppvgenreid=");
            builder.append(ppvgenreid);
            builder.append(", ");
        }
        if (csrgroupid != null) {
            builder.append("csrgroupid=");
            builder.append(csrgroupid);
            builder.append(", ");
        }
        if (freeevent != null) {
            builder.append("freeevent=");
            builder.append(freeevent);
            builder.append(", ");
        }
        if (servicetype != null) {
            builder.append("servicetype=");
            builder.append(servicetype);
        }
        builder.append("]");
        return builder.toString();
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
     * @return the subjectmatterrating
     */
    public Integer getSubjectmatterrating() {
        return subjectmatterrating;
    }

    /**
     * @param subjectmatterrating the subjectmatterrating to set
     */
    public void setSubjectmatterrating(Integer subjectmatterrating) {
        this.subjectmatterrating = subjectmatterrating;
    }

    /**
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * @return the specialevent
     */
    public Integer getSpecialevent() {
        return specialevent;
    }

    /**
     * @param specialevent the specialevent to set
     */
    public void setSpecialevent(Integer specialevent) {
        this.specialevent = specialevent;
    }

    /**
     * @return the providerdate
     */
    public Timestamp getProviderdate() {
        return providerdate;
    }

    /**
     * @param providerdate the providerdate to set
     */
    public void setProviderdate(Timestamp providerdate) {
        this.providerdate = providerdate;
    }

    /**
     * @return the providereventid
     */
    public Integer getProvidereventid() {
        return providereventid;
    }

    /**
     * @param providereventid the providereventid to set
     */
    public void setProvidereventid(Integer providereventid) {
        this.providereventid = providereventid;
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
     * @return the ppvsupplierid
     */
    public Integer getPpvsupplierid() {
        return ppvsupplierid;
    }

    /**
     * @param ppvsupplierid the ppvsupplierid to set
     */
    public void setPpvsupplierid(Integer ppvsupplierid) {
        this.ppvsupplierid = ppvsupplierid;
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
     * @return the ppvgenreid
     */
    public Integer getPpvgenreid() {
        return ppvgenreid;
    }

    /**
     * @param ppvgenreid the ppvgenreid to set
     */
    public void setPpvgenreid(Integer ppvgenreid) {
        this.ppvgenreid = ppvgenreid;
    }

    /**
     * @return the csrgroupid
     */
    public Integer getCsrgroupid() {
        return csrgroupid;
    }

    /**
     * @param csrgroupid the csrgroupid to set
     */
    public void setCsrgroupid(Integer csrgroupid) {
        this.csrgroupid = csrgroupid;
    }

    /**
     * @return the freeevent
     */
    public Integer getFreeevent() {
        return freeevent;
    }

    /**
     * @param freeevent the freeevent to set
     */
    public void setFreeevent(Integer freeevent) {
        this.freeevent = freeevent;
    }

    /**
     * @return the servicetype
     */
    public String getServicetype() {
        return servicetype;
    }

    /**
     * @param servicetype the servicetype to set
     */
    public void setServicetype(String servicetype) {
        this.servicetype = servicetype;
    }


}
