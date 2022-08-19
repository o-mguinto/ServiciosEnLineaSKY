package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class GenereRef implements Serializable{
    @SuppressWarnings("compatibility:3023381231969696190")
    private static final long serialVersionUID = -8169963193834820896L;
    private Integer ppvgenreid;
    private Integer isdefault;
    private Integer isinternal;

    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GenereRef [");
        if (ppvgenreid != null) {
            builder.append("ppvgenreid=");
            builder.append(ppvgenreid);
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
