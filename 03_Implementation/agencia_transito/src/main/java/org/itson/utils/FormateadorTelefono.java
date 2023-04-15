package org.itson.utils;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
public class FormateadorTelefono {

    /**
     * Telefono ya con el formato aplicado.
     */
    private String telefono;

    /**
     * Longitud necesaria para formatear. La longitud es según números
     * telefonicos de México.
     */
    private static final int LONGITUD_TELEFONO = 10;

    /**
     * Tamaño de la primer separación del teléfono con formato. (55) 1234 1234
     */
    private static final int TAMANHO_GRUPO_INICIAL = 2;
    /**
     * Tamaño del resto de separaciones del teléfono con formato. 55 (1234)
     * (1234)
     */
    private static final int TAMANHO_GRUPO = 4;

    /**
     *  Método que aplica un formato a la cadena ingresada.
     * 
     * @param rawTelefono Cadena de teléfono al que se desea poner formato.
     */
    public FormateadorTelefono(
            final String rawTelefono
    ) throws IllegalArgumentException {
        this.validarFormato(rawTelefono);
        this.aplicarFormato(rawTelefono);
    }

    /**
     * Regresa el teléfono ya con el formato aplicado.
     *
     * @return el teléfono formateado.
     */
    public String getTelefono() {
        return this.telefono;
    }

    private void aplicarFormato(final String rawTelefono) {
        int posicionActual = 0;
        String espacio = " ";
        String telefonoFormateado = "(";

        telefonoFormateado += rawTelefono.substring(
                posicionActual, posicionActual + TAMANHO_GRUPO_INICIAL);

        posicionActual += TAMANHO_GRUPO_INICIAL;
        telefonoFormateado += ')' + espacio;

        telefonoFormateado += rawTelefono.substring(
                posicionActual, posicionActual + TAMANHO_GRUPO);

        posicionActual += TAMANHO_GRUPO;
        telefonoFormateado += espacio;

        telefonoFormateado += rawTelefono.substring(
                posicionActual, posicionActual + TAMANHO_GRUPO);

        this.telefono = telefonoFormateado;
    }

    private void validarFormato(final String rawTelefono) {
        if (rawTelefono.length() != LONGITUD_TELEFONO) {
            String errorMsg = "Teléfono debe tener 10 caracteres";
            throw new IllegalArgumentException(errorMsg);
        }
        if (!Validaciones.isNumeric(rawTelefono)) {
            String errorMsg = "Teléfono debe tener solo dígitos";
            throw new IllegalArgumentException(errorMsg);
        }
    }

}
