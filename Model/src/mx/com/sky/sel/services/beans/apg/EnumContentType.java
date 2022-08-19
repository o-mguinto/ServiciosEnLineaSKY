package mx.com.sky.sel.services.beans.apg;

public enum EnumContentType {


    EP("EPISODE"),
    MV("MOVIES"),
    SP("SPORTS"),
    SH("SHOWS"),
    EPISODE_NO_DISPONIBLE("000");
    
    private String contentType;

    EnumContentType(String contentType) {
        this.contentType = contentType;
    }
    
    public String getValue(){
        return this.contentType;
    }
    
}