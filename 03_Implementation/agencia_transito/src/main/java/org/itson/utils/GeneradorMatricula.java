package org.itson.utils;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public final class GeneradorMatricula {

    /**
     * Separador utilizado en la matricula.
     */
    private static final char SEPARADOR = '-';

    private GeneradorMatricula() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Genera la matricula con formato AAA-111.
     *
     * @return la matricula.
     */
    public static String generar() {
        String primerSeccion = generarPrimerSeccion();
        String segundaSeccion = generarSegundaSeccion();
        return primerSeccion + SEPARADOR + segundaSeccion;
    }

    /**
     * Genera la primer sección de la matrícula: AAA.
     *
     * Tres caracteres aleatorios en mayúsculas de la A a la Z.
     *
     * @return la primer sección de la matricula.
     */
    private static String generarPrimerSeccion() {
        final int cantidad = 3;
        return Randomizador.getRandomLetras(cantidad);
    }

    /**
     * Genera la segunda sección de la matrícula: 111.
     *
     * Tres digitos aleatorios.
     *
     * @return la primer sección de la matricula.
     */
    private static String generarSegundaSeccion() {
        final int cantidad = 3;
        return Randomizador.getRandomStringNumber(cantidad);
    }
}
