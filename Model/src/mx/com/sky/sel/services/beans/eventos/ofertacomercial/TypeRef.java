package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class TypeRef implements Serializable{
    @SuppressWarnings("compatibility:-893879761823146082")
    private static final long serialVersionUID = -3143227257357841202L;
    private Integer ppvtypeid;
    private Integer isdefault;
    private Integer isinternal;


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TypeRef [");
        if (ppvtypeid != null) {
            builder.append("ppvtypeid=");
            builder.append(ppvtypeid);
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
