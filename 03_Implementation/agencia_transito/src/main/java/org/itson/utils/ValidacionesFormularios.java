package org.itson.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public final class ValidacionesFormularios {

    private ValidacionesFormularios() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Valida si un texto no sobrepasa un límite dado un rango.
     *
     * @param texto texto a validar
     * @param limiteInferior limite inferior
     * @param limiteSuperior limite superior
     * @return Verdadero si el texto no sobrepasa.
     * @throws UnsupportedOperationException UnsupportedOperationException
     */
    public static boolean isLongitudTextoValida(
            final String texto,
            final int limiteInferior,
            final int limiteSuperior
    ) throws UnsupportedOperationException {
        if (limiteInferior >= limiteSuperior) {
            String errorMsg = "Limite inferior debe ser menor al superior.";
            throw new UnsupportedOperationException(errorMsg);
        }

        if (limiteInferior < 1) {
            String errorMsg = "Limite inferior debe ser al menos uno.";
            throw new UnsupportedOperationException(errorMsg);
        }

        // Expresión regular que valida un string de 1 a 100 caracteres
        String regexValoresNumericos
                = "^.{" + limiteInferior + "," + limiteSuperior + "}$";
        // Validar el texto con la expresión regular
        return texto.matches(regexValoresNumericos);
    }

    /**
     * Valida si un texto no sobrepasa un límite.
     *
     * @param texto texto a evaluar
     * @param limiteSuperior limite superior
     * @return Verdadero si el texto no sobrepasa.
     * @throws UnsupportedOperationException UnsupportedOperationException
     */
    public static boolean isLongitudTextoValida(
            final String texto,
            final int limiteSuperior
    ) throws UnsupportedOperationException {
        return isLongitudTextoValida(texto, 1, limiteSuperior);
    }

    /**
     * Método que valida que el la marca y línea contenga de 3 a 40 caracteres,
     * siendo estos: letras, números y espacios.
     *
     * @param s Cadena de texto.
     * @return coincidencia entre los validadores y la cadena de texto.
     */
    public static boolean validaMarcaLinea(final String s) {
        String patron
                = "(([a-z]|[A-Z]|[0-9])|([ '-]([a-z]|[A-Z]|[0-9]))){3,40}";

        Pattern p = Pattern.compile(patron);

        Matcher matcher = p.matcher(s);

        return matcher.matches();
    }

    /**
     * Método que valida que el color contenga de 3 a 40 caracteres, siendo
     * estos: letras y espacios.
     *
     * @param s Cadena de texto.
     * @return coincidencia entre los validadores y la cadena de texto.
     */
    public static boolean validaColor(final String s) {
        String patron = "(([a-z]|[A-Z])|([ '-]([a-z]|[A-Z]))){3,40}";

        Pattern p = Pattern.compile(patron);

        Matcher matcher = p.matcher(s);

        return matcher.matches();
    }

    /**
     * Método que valida que el modelo contenga 4 caracteres, siendo estos:
     * números.
     *
     * @param s Cadena de texto.
     * @return coincidencia entre los validadores y la cadena de texto.
     */
    public static boolean validaModelo(final String s) {
        String patron = "(([0-9])){4}";

        Pattern p = Pattern.compile(patron);

        Matcher matcher = p.matcher(s);

        return matcher.matches();
    }

    /**
     * Método que valida que el número de serie contenga 6 caracteres, siendo
     * estos: números y letras.
     *
     * @param s Cadena de texto.
     * @return coincidencia entre los validadores y la cadena de texto.
     */
    public static boolean validaNumeroSerie(final String s) {
        String patron = "(([0-9]|[A-Z])){6}";

        Pattern p = Pattern.compile(patron);

        Matcher matcher = p.matcher(s);

        return matcher.matches();
    }

}
