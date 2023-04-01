package org.itson.utils;

/**
 *
 * @author Toled
 */
public final class ValidacionesFormularios {

    private ValidacionesFormularios() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Valida si un texto no sobrepasa un límite dado un rango.
     *
     * @param texto
     * @param limiteInferior
     * @param limiteSuperior
     * @return Verdadero si el texto no sobrepasa.
     * @throws UnsupportedOperationException
     */
    public static boolean isLongitudTextoValida(
            final String texto,
            final int limiteInferior,
            final int limiteSuperior
    ) throws UnsupportedOperationException {
        if (limiteInferior >= limiteSuperior) {
            String errorMsg = "Limite inferior debe ser menor";
            throw new UnsupportedOperationException(errorMsg);
        }
        // Expresión regular que valida un string de 1 a 100 caracteres
        String regexValoresNumericos = "^.{1,100}$";
        // Validar el texto con la expresión regular
        return texto.matches(regexValoresNumericos);
    }

    /**
     * Valida si un texto no sobrepasa un límite.
     *
     * @param texto
     * @param limiteSuperior
     * @return Verdadero si el texto no sobrepasa.
     * @throws UnsupportedOperationException
     */
    public static boolean isLongitudTextoValida(
            final String texto,
            final int limiteSuperior
    ) throws UnsupportedOperationException {
        return isLongitudTextoValida(texto, 0, limiteSuperior);
    }

}
