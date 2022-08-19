package mx.com.sky.sel.utils;

import java.io.Serializable;

public class CantidadLetra implements Serializable {
    @SuppressWarnings("compatibility:963072554650246291")
    private static final long serialVersionUID = -3459901817301891422L;

    /**
     *
     */
    public CantidadLetra() {
        // TODO Auto-generated constructor stub
    }

    private Integer counter = 0;
    private String value = "";
    private String nombreDeMoneda = "PESOS";


    /** Con formato centavos/100MN **/
    public String getCantidadLetra(double cantidadPesos) {

        // this.counter = $num;
        int _counter = (int)cantidadPesos;
        double resto = cantidadPesos - _counter;
        int fraccion = Math.round((int)resto * 100);

        return convertir(_counter) + " " + nombreDeMoneda + " " + fraccion + "/100 MN.";
    }

    private String convertir(Integer _counter) {
        //Limite
        if (_counter > 2000000)
            return "DOS MILLONES";

        switch (_counter) {
        case 0:
            return "CERO";
        case 1:
            return "UN"; //UNO
        case 2:
            return "DOS";
        case 3:
            return "TRES";
        case 4:
            return "CUATRO";
        case 5:
            return "CINCO";
        case 6:
            return "SEIS";
        case 7:
            return "SIETE";
        case 8:
            return "OCHO";
        case 9:
            return "NUEVE";
        case 10:
            return "DIEZ";
        case 11:
            return "ONCE";
        case 12:
            return "DOCE";
        case 13:
            return "TRECE";
        case 14:
            return "CATORCE";
        case 15:
            return "QUINCE";
        case 20:
            return "VEINTE";
        case 30:
            return "TREINTA";
        case 40:
            return "CUARENTA";
        case 50:
            return "CINCUENTA";
        case 60:
            return "SESENTA";
        case 70:
            return "SETENTA";
        case 80:
            return "OCHENTA";
        case 90:
            return "NOVENTA";
        case 100:
            return "CIEN";

        case 200:
            return "DOSCIENTOS";
        case 300:
            return "TRESCIENTOS";
        case 400:
            return "CUATROCIENTOS";
        case 500:
            return "QUINIENTOS";
        case 600:
            return "SEISCIENTOS";
        case 700:
            return "SETECIENTOS";
        case 800:
            return "OCHOCIENTOS";
        case 900:
            return "NOVECIENTOS";

        case 1000:
            return "MIL";

        case 1000000:
            return "UN MILLON";
        case 2000000:
            return "DOS MILLONES";
        }
        if (_counter < 20) {
            return "DIECI" + convertir(_counter - 10);
        }
        if (_counter < 30) {
            return "VEINTI" + convertir(_counter - 20);
        }
        if (_counter < 100) {
            return convertir((int)(_counter / 10) * 10) + " Y " + convertir(_counter % 10);
        }
        if (_counter < 200) {
            return "CIENTO " + convertir(_counter - 100);
        }
        if (_counter < 1000) {
            return convertir((int)(_counter / 100) * 100) + " " + convertir(_counter % 100);
        }
        if (_counter < 2000) {
            return "MIL " + convertir(_counter % 1000);
        }
        if (_counter < 1000000) {
            String var = "";
            var = convertir((int)(_counter / 1000)) + " MIL";
            if (_counter % 1000 != 0) {
                var += " " + convertir(_counter % 1000);
            }
            return var;
        }
        if (_counter < 2000000) {
            return "UN MILLON " + convertir(_counter % 1000000);
        }
        return "";
    }
}
