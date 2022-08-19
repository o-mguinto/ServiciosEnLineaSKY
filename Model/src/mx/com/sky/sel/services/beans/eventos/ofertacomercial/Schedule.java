package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

import java.sql.Timestamp;

public class Schedule implements Serializable{
    @SuppressWarnings("compatibility:1527212528262641741")
    private static final long serialVersionUID = -8136041298794124347L;
    private Integer ppveventid;
    private Timestamp expirydate;
    private Timestamp firstorderdate;
    private Timestamp lastorderdate;
    private Timestamp startdate;
    private Timestamp canceldate;
    private String channel;
    private Integer billclass;
    private Integer token;
    private Integer freeminutes;
    private Integer previewminutes;
    private Integer ppvproviderid;
    private Integer downloadrequired;
    private Integer isdeleted;
    private String customertype;
    private Integer ispackage;

    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Schedule [");
        if (ppveventid != null) {
            builder.append("ppveventid=");
            builder.append(ppveventid);
            builder.append(", ");
        }
        if (channel != null) {
            builder.append("channel=");
            builder.append(channel);
            builder.append(", ");
        }
        if (billclass != null) {
            builder.append("billclass=");
            builder.append(billclass);
            builder.append(", ");
        }
        if (token != null) {
            builder.append("token=");
            builder.append(token);
            builder.append(", ");
        }
        if (freeminutes != null) {
            builder.append("freeminutes=");
            builder.append(freeminutes);
            builder.append(", ");
        }
        if (previewminutes != null) {
            builder.append("previewminutes=");
            builder.append(previewminutes);
            builder.append(", ");
        }
        if (ppvproviderid != null) {
            builder.append("ppvproviderid=");
            builder.append(ppvproviderid);
            builder.append(", ");
        }
        if (downloadrequired != null) {
            builder.append("downloadrequired=");
            builder.append(downloadrequired);
            builder.append(", ");
        }
        if (isdeleted != null) {
            builder.append("isdeleted=");
            builder.append(isdeleted);
            builder.append(", ");
        }
        if (customertype != null) {
            builder.append("customertype=");
            builder.append(customertype);
            builder.append(", ");
        }
        if (ispackage != null) {
            builder.append("ispackage=");
            builder.append(ispackage);
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
     * @return the firstorderdate
     */
    public Timestamp getFirstorderdate() {
        return firstorderdate;
    }

    /**
     * @param firstorderdate the firstorderdate to set
     */
    public void setFirstorderdate(Timestamp firstorderdate) {
        this.firstorderdate = firstorderdate;
    }

    /**
     * @return the lastorderdate
     */
    public Timestamp getLastorderdate() {
        return lastorderdate;
    }

    /**
     * @param lastorderdate the lastorderdate to set
     */
    public void setLastorderdate(Timestamp lastorderdate) {
        this.lastorderdate = lastorderdate;
    }

    /**
     * @return the startdate
     */
    public Timestamp getStartdate() {
        return startdate;
    }

    /**
     * @param startdate the startdate to set
     */
    public void setStartdate(Timestamp startdate) {
        this.startdate = startdate;
    }

    /**
     * @return the canceldate
     */
    public Timestamp getCanceldate() {
        return canceldate;
    }

    /**
     * @param canceldate the canceldate to set
     */
    public void setCanceldate(Timestamp canceldate) {
        this.canceldate = canceldate;
    }

    /**
     * @return the channel
     */
    public String getChannel() {
        return channel;
    }

    /**
     * @param channel the channel to set
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * @return the billclass
     */
    public Integer getBillclass() {
        return billclass;
    }

    /**
     * @param billclass the billclass to set
     */
    public void setBillclass(Integer billclass) {
        this.billclass = billclass;
    }

    /**
     * @return the token
     */
    public Integer getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(Integer token) {
        this.token = token;
    }

    /**
     * @return the freeminutes
     */
    public Integer getFreeminutes() {
        return freeminutes;
    }

    /**
     * @param freeminutes the freeminutes to set
     */
    public void setFreeminutes(Integer freeminutes) {
        this.freeminutes = freeminutes;
    }

    /**
     * @return the previewminutes
     */
    public Integer getPreviewminutes() {
        return previewminutes;
    }

    /**
     * @param previewminutes the previewminutes to set
     */
    public void setPreviewminutes(Integer previewminutes) {
        this.previewminutes = previewminutes;
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
     * @return the downloadrequired
     */
    public Integer getDownloadrequired() {
        return downloadrequired;
    }

    /**
     * @param downloadrequired the downloadrequired to set
     */
    public void setDownloadrequired(Integer downloadrequired) {
        this.downloadrequired = downloadrequired;
    }

    /**
     * @return the isdeleted
     */
    public Integer getIsdeleted() {
        return isdeleted;
    }

    /**
     * @param isdeleted the isdeleted to set
     */
    public void setIsdeleted(Integer isdeleted) {
        this.isdeleted = isdeleted;
    }

    /**
     * @return the customertype
     */
    public String getCustomertype() {
        return customertype;
    }

    /**
     * @param customertype the customertype to set
     */
    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

    /**
     * @return the ispackage
     */
    public Integer getIspackage() {
        return ispackage;
    }

    /**
     * @param ispackage the ispackage to set
     */
    public void setIspackage(Integer ispackage) {
        this.ispackage = ispackage;
    }


}
