package mx.com.sky.sel.enums;

public enum CodigoPais {
    MX("MXN", "MXP", "Mexico", false),
    CR("CRC", "DLS-CR", "Costa Rica", true),
    GT("GTQ", "DLS-GT", "Guatemala", true),
    HN("HNL", "DLS-HN", "Honduras", true),
    NI("NIO", "DLS-NI", "Nicaragua", true),
    PA("USD", "DLS-PA", "Panama", true),
    DO("DOP", "DOP", "Republica Dominicana", false),
    SV("USD", "DLS-SV", "El Salvador", true);

    private final String monedaISO;
    private final String codigoMoneda;
    private final String nombrePais;
    private final boolean isCentroAmerica;

    CodigoPais(String monedaISO, String codigoMoneda, String nombrePais, boolean isCentroAmerica){
            this.monedaISO = monedaISO;
            this.codigoMoneda = codigoMoneda;
            this.nombrePais = nombrePais;
            this.isCentroAmerica = isCentroAmerica;
    }

    public String getMonedaISO() {return monedaISO;}
    public String getCodigoMoneda() {return codigoMoneda;}
    public String getNombrePais() {return nombrePais;}
    public boolean getIsCentroAmerica() {return isCentroAmerica;}
}
