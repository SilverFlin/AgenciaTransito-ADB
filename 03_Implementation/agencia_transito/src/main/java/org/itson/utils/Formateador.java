package org.itson.utils;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class Formateador {

    private Formateador() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Recibe una cantidad, la redondea a dos decimales y le agrega el signo de
     * dinero.
     *
     * @param cantidad la cantidad de dinero a formatear.
     * @return La cantidad con formato $00.00
     */
    public static String formatoDinero(Double cantidad) {
        final int decimales = 2;
        Double scale = Math.pow(10, decimales);
        Double redondeado = Math.round(cantidad * scale) / scale;
        return '$' + redondeado.toString();
    }
}
