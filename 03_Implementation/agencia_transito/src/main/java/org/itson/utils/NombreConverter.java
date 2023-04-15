package org.itson.utils;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import org.itson.excepciones.EncriptacionException;

/**
 *
 * @author Luis Toledo & Misael Marchena
 */
@Converter
public class NombreConverter implements AttributeConverter<String, String> {

    /**
     * Encripta el nombre y regresa el hash generado.
     *
     * @param nombre
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
     * @param hash
     * @return El valor desencriptado.
     */
    @Override
    public String convertToEntityAttribute(String hash) {
        try {
            System.out.println(new Encriptador().desencriptar(hash));
            return new Encriptador().desencriptar(hash);
        } catch (EncriptacionException ex) {
            throw new RuntimeException("Error al desencriptar");
        }
    }

}
