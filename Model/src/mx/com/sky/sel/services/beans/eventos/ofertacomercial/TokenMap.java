package mx.com.sky.sel.services.beans.eventos.ofertacomercial;

import java.io.Serializable;

import java.sql.Timestamp;

public class TokenMap implements Serializable{
    @SuppressWarnings("compatibility:-6414698569441341119")
    private static final long serialVersionUID = -5492060867490622001L;
    private Integer ppvproviderid;
    private Integer token;
    private String customertype;
    private Timestamp startdate;
    private Timestamp enddate;
    private Integer currencycode;
    private String price;
    private String ordertype;


    /** (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TokenMap [");
        if (ppvproviderid != null) {
            builder.append("ppvproviderid=");
            builder.append(ppvproviderid);
            builder.append(", ");
        }
        if (token != null) {
            builder.append("token=");
            builder.append(token);
            builder.append(", ");
        }
        if (customertype != null) {
            builder.append("customertype=");
            builder.append(customertype);
            builder.append(", ");
        }
        if (startdate != null) {
            builder.append("startdate=");
            builder.append(startdate);
            builder.append(", ");
        }
        if (enddate != null) {
            builder.append("enddate=");
            builder.append(enddate);
            builder.append(", ");
        }
        if (currencycode != null) {
            builder.append("currencycode=");
            builder.append(currencycode);
            builder.append(", ");
        }
        if (price != null) {
            builder.append("price=");
            builder.append(price);
            builder.append(", ");
        }
        if (ordertype != null) {
            builder.append("ordertype=");
            builder.append(ordertype);
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
     * @return the enddate
     */
    public Timestamp getEnddate() {
        return enddate;
    }

    /**
     * @param enddate the enddate to set
     */
    public void setEnddate(Timestamp enddate) {
        this.enddate = enddate;
    }

    /**
     * @return the currencycode
     */
    public Integer getCurrencycode() {
        return currencycode;
    }

    /**
     * @param currencycode the currencycode to set
     */
    public void setCurrencycode(Integer currencycode) {
        this.currencycode = currencycode;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the ordertype
     */
    public String getOrdertype() {
        return ordertype;
    }

    /**
     * @param ordertype the ordertype to set
     */
    public void setOrdertype(String ordertype) {
        this.ordertype = ordertype;
    }


}
