package mx.com.sky.sel.services.beans.corporativos;
import java.io.Serializable;

public class CuentaCV implements Serializable{
    @SuppressWarnings("compatibility:3463772294236696265")
    private static final long serialVersionUID = 6942873691234743446L;
    protected String cuentaSKY;
    protected String rowId;
    protected String smartCard;

    /**
     *
     */
    public CuentaCV() {
        // TODO Auto-generated constructor stub
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result =
                prime * result + ((cuentaSKY == null) ? 0 : cuentaSKY.hashCode());
        result = prime * result + ((rowId == null) ? 0 : rowId.hashCode());
        result =
                prime * result + ((smartCard == null) ? 0 : smartCard.hashCode());
        return result;
    }


    /* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CuentaCV other = (CuentaCV)obj;
        if (cuentaSKY == null) {
            if (other.cuentaSKY != null)
                return false;
        } else if (!cuentaSKY.equals(other.cuentaSKY))
            return false;
        if (rowId == null) {
            if (other.rowId != null)
                return false;
        } else if (!rowId.equals(other.rowId))
            return false;
        if (smartCard == null) {
            if (other.smartCard != null)
                return false;
        } else if (!smartCard.equals(other.smartCard))
            return false;
        return true;
    }


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CuentaCV [");
        if (cuentaSKY != null) {
            builder.append("cuentaSKY=");
            builder.append(cuentaSKY);
            builder.append(", ");
        }
        if (smartCard != null) {
            builder.append("smartCard=");
            builder.append(smartCard);
            builder.append(", ");
        }
        if (rowId != null) {
            builder.append("rowId=");
            builder.append(rowId);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * @return the cuentaSKY
     */
    public String getCuentaSKY() {
        return cuentaSKY;
    }

    /**
     * @param cuentaSKY the cuentaSKY to set
     */
    public void setCuentaSKY(String cuentaSKY) {
        this.cuentaSKY = cuentaSKY;
    }

    /**
     * @return the rowId
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * @param rowId the rowId to set
     */
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * @return the smartCard
     */
    public String getSmartCard() {
        return smartCard;
    }

    /**
     * @param smartCard the smartCard to set
     */
    public void setSmartCard(String smartCard) {
        this.smartCard = smartCard;
    }


}

