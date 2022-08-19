package mx.com.sky.sel.services.beans.utils;

import java.io.Serializable;

public class Menu implements Serializable {
    @SuppressWarnings("compatibility:2666671562435459948")
    private static final long serialVersionUID = -1134287649351763389L;
    protected Integer pmid;
    protected String pmcode;
    protected String pmdescription;
    protected Integer parentmenu;
    protected String pumvisible;
    protected Integer pumid;
    protected String pmparentmenu;
    protected Boolean visible;

    /**
     *
     */
    public Menu() {
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
    * @see java.lang.Object#toString()
    */

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Menu [");
        if (pmcode != null) {
            builder.append("pmcode=");
            builder.append(pmcode);
            builder.append(", ");
        }
        if (pumvisible != null) {
            builder.append("pumvisible=");
            builder.append(pumvisible);
            builder.append(", ");
        }
        if (pmdescription != null) {
            builder.append("pmdescription=");
            builder.append(pmdescription);
            builder.append(", ");
        }
        if (pmid != null) {
            builder.append("pmid=");
            builder.append(pmid);
            builder.append(", ");
        }
        if (pumid != null) {
            builder.append("pumid=");
            builder.append(pumid);
            builder.append(", ");
        }
        if (parentmenu != null) {
            builder.append("parentmenu=");
            builder.append(parentmenu);
            builder.append(", ");
        }
        if (pmparentmenu != null) {
            builder.append("pmparentmenu=");
            builder.append(pmparentmenu);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the pmid
     */
    public Integer getPmid() {
        return pmid;
    }

    /**
     * @param pmid the pmid to set
     */
    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    /**
     * @return the pmcode
     */
    public String getPmcode() {
        return pmcode;
    }

    /**
     * @param pmcode the pmcode to set
     */
    public void setPmcode(String pmcode) {
        this.pmcode = pmcode;
    }

    /**
     * @return the pmdescription
     */
    public String getPmdescription() {
        return pmdescription;
    }

    /**
     * @param pmdescription the pmdescription to set
     */
    public void setPmdescription(String pmdescription) {
        this.pmdescription = pmdescription;
    }

    /**
     * @return the parentmenu
     */
    public Integer getParentmenu() {
        return parentmenu;
    }

    /**
     * @param parentmenu the parentmenu to set
     */
    public void setParentmenu(Integer parentmenu) {
        this.parentmenu = parentmenu;
    }

    /**
     * @return the pumvisible
     */
    public String getPumvisible() {
        return pumvisible;
    }

    /**
     * @param pumvisible the pumvisible to set
     */
    public void setPumvisible(String pumvisible) {
        this.pumvisible = pumvisible;
    }

    /**
     * @return the pumid
     */
    public Integer getPumid() {
        return pumid;
    }

    /**
     * @param pumid the pumid to set
     */
    public void setPumid(Integer pumid) {
        this.pumid = pumid;
    }

    /**
     * @return the pmparentmenu
     */
    public String getPmparentmenu() {
        return pmparentmenu;
    }

    /**
     * @param pmparentmenu the pmparentmenu to set
     */
    public void setPmparentmenu(String pmparentmenu) {
        this.pmparentmenu = pmparentmenu;
    }

    public Boolean isVisible() {
        if (pumvisible.equalsIgnoreCase("T")) {
            return true;
        } else {
            return false;
        }
    }

    public void setVisible(boolean visible) {
        if (visible) {
            pumvisible = "T";
        } else {
            pumvisible = "F";
        }
    }


    public void setVisible(Boolean visible) {
        if (visible) {
            pumvisible = "T";
        } else {
            pumvisible = "F";
        }
    }

    public Boolean getVisible() {
        if (pumvisible.equalsIgnoreCase("T")) {
            return true;
        } else {
            return false;
        }
    }
}
