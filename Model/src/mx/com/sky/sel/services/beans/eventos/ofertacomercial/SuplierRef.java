package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class SuplierRef implements Serializable{
    @SuppressWarnings("compatibility:8628745212873624283")
    private static final long serialVersionUID = 8845796395586610517L;
    private Integer ppvsupplierid;
    private Integer isdefault;
    private Integer isinternal;


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("SuplierRef [");
        if (ppvsupplierid != null) {
            builder.append("ppvsupplierid=");
            builder.append(ppvsupplierid);
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
