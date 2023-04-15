package org.itson.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import org.itson.excepciones.EncriptacionException;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
@Converter
public class NombreConverter implements AttributeConverter<String, String> {

    /**
     * Encripta el nombre y regresa el hash generado.
     *
     * @param nombre nombre a convertir.
     * @return El hash generado a partir del nombre
     */
    @Override
    public String convertToDatabaseColumn(String nombre) {
        try {
            return new Encriptador().encriptar(nombre);
        } catch (EncriptacionException ex) {
            throw new RuntimeException("Error al encriptar");
        }
    }

    /**
     * Desencripta el hash y regresa el valor desencriptado.
     *
     * @param hash hash a regresar a su estado normal.
     * @return El valor desencriptado.
     */
    @Override
    public String convertToEntityAttribute(String hash) {
        try {
            return new Encriptador().desencriptar(hash);
        } catch (EncriptacionException ex) {
            throw new RuntimeException("Error al desencriptar");
        }
    }

}
