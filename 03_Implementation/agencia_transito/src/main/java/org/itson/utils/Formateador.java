package org.itson.utils;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public final class Formateador {

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
    public static String formatoDinero(final Double cantidad) {
        final int decimales = 2;
        final int base = 10;
        Double scale = Math.pow(base, decimales);
        Double redondeado = Math.round(cantidad * scale) / scale;
        return '$' + redondeado.toString();
    }
}
