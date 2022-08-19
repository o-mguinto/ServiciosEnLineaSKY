package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class ContentRef implements Serializable{
    @SuppressWarnings("compatibility:7202619682849473132")
    private static final long serialVersionUID = 7474389758479782545L;
    private Integer ppvcontentid;
    private Integer isdefault;
    private Integer isinternal;


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ContentRef [");
        if (ppvcontentid != null) {
            builder.append("ppvcontentid=");
            builder.append(ppvcontentid);
            builder.append(", ");
        }
        if (isdefault != null) {
            builder.append("isdefault=");
            builder.append(isdefault);
            builder.append(", ");
        }
        if (isinternal != null) {
            builder.append("isinternal=");
            builder.append(isinternal);
        }
        builder.append("]");
        return builder.toString();
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
     * @return the isdefault
     */
    public Integer getIsdefault() {
        return isdefault;
    }

    /**
     * @param isdefault the isdefault to set
     */
    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    /**
     * @return the isinternal
     */
    public Integer getIsinternal() {
        return isinternal;
    }

    /**
     * @param isinternal the isinternal to set
     */
    public void setIsinternal(Integer isinternal) {
        this.isinternal = isinternal;
    }


}
