package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

public class ProviderRef implements Serializable{
    @SuppressWarnings("compatibility:4470550716939407078")
    private static final long serialVersionUID = 323473417867708209L;
    private Integer ppvproviderid;
    private Integer isdefault;
    private Integer isinternal;
    private String address1;
    private String address2;
    private String address3;
    private String phonenumber;
    private String contactname;

    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ProviderRef [");
        if (ppvproviderid != null) {
            builder.append("ppvproviderid=");
            builder.append(ppvproviderid);
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
            builder.append(", ");
        }
        if (address1 != null) {
            builder.append("address1=");
            builder.append(address1);
            builder.append(", ");
        }
        if (address2 != null) {
            builder.append("address2=");
            builder.append(address2);
            builder.append(", ");
        }
        if (address3 != null) {
            builder.append("address3=");
            builder.append(address3);
            builder.append(", ");
        }
        if (phonenumber != null) {
            builder.append("phonenumber=");
            builder.append(phonenumber);
            builder.append(", ");
        }
        if (contactname != null) {
            builder.append("contactname=");
            builder.append(contactname);
        }
        builder.append("]");
        return builder.toString();
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

    /**
     * @return the address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param address1 the address1 to set
     */
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    /**
     * @return the address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param address2 the address2 to set
     */
    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    /**
     * @return the address3
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * @param address3 the address3 to set
     */
    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    /**
     * @return the phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber the phonenumber to set
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return the contactname
     */
    public String getContactname() {
        return contactname;
    }

    /**
     * @param contactname the contactname to set
     */
    public void setContactname(String contactname) {
        this.contactname = contactname;
    }


}
