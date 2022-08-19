package mx.com.sky.sel.utils;

public class Constantes {
    public Constantes() {
        super();
    }
    public static final String APLICATIVO = "SEL";
    public static final String SESION_BT = "sesionBT";
    public static final String DIR_PROPS_CODIGO = "mx.com.sky.sel.resources.sel_front_end";
    public static final String DIR_VERSION_CODIGO = "mx/bluetelecomm/sel/resources/version.properties";
    public static final String PAIS = "MEX";
    public static final String NOMBRE_COOKIE = "U0tZX1NFTF9US05"; /* Definir como se genera el nombre de la Cookie */
    public static final Integer DURACION_COOKIE = 7776000; /* El total de segundos en 3 meses */
    public static final Integer TAMANIO_TARJETA = 16;
    public static final Integer TAMANIO_TARJETA_AMEX = 15;
    public static final Integer TAMANIO_MINIMO_CONTRASENIA = 10;
    public static final Integer TAMANIO_BINES = 6;
    public static final Integer BITS_AES = 16;
    public static final String ES_ACTIVO = "ACTIVO"; 
    /* Login */
    public static final String URL_MI_CUENTA = "/adfAuthentication?success_url=/faces/cuenta";
    public static final String URL_PROMOCIONES = "/adfAuthentication?success_url=/faces/promociones";
    public static final String URL_CAPTURA_DATOS = "/adfAuthentication?success_url=/faces/capturaDatos";
    public static final String URL_LOGOUT = "/adfAuthentication?logout=true&end_url=/faces/bienvenido";
    public static final Integer RANGO_ANIO_VENCIMIENTO_TARJETAS = 10;
    public static final String PRODUCTO_USUARIO_SKY = "SKY";
    
    /* Alta y Actualizacion de Datos Fiscales */
    public static final String URL_CAPTCHA = "https://www.google.com/recaptcha/api/siteverify";
    public static final String TIPO_FACTURA = "Papel y OTA";
    public static final String OPERACION_PETICION_ALTA = "Alta";
    public static final String OPERACION_PETICION_MODIFICACION = "Modificacion";
    public static final String DESCRIPCION_DATOS_FISCALES = "Actualizacion de Informacion Fiscal BlueTelecomm";
    public static final String METODO_ENVIO = "Correo";
    public static final String TIPO_TARJETA_CREDITO = "01";
    
    /* Banderas para ocultar o mostrar opciones del Menu */
    public static final String CLAVE_ACTIVA_CONSUMO_DATOS = "ACTIVA_CONSUMO_DATOS";
    
    /* Banderas para la Validacion de Multicanal */
    public static final String CLAVE_ACTIVA_CHAT = "ACTIVA_CHAT";
    public static final String CLAVE_ACTIVA_CENTRO_AYUDA = "ACTIVA_CENTRO_AYUDA";
    public static final String CLAVE_ACTIVA_DEJANOS_DATOS = "ACTIVA_DEJANOS_DATOS";
    public static final String CLAVE_ACTIVA_EMAIL = "ACTIVA_EMAIL";
    
}
