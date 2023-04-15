package org.itson.utils;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.itson.excepciones.EncriptacionException;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public final class Encriptador {

    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    private final String KEY = "0MMPLATRMMPLATR0";

    /**
     * Logger.
     */
    private static final Logger LOG
            = Logger.getLogger(Encriptador.class.getName());

    /**
     * Constructor por defecto
     */
    public Encriptador() {
        // No hace falta inicializar nada.
    }

    /**
     *
     * @param input Mensaje a encriptar.
     * @return El hash.
     * @throws org.itson.excepciones.EncriptacionException Encriptacion
     * Exception.
     *
     */
    public String encriptar(String input) throws EncriptacionException {

        try {
            SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
            IvParameterSpec ivSpec = new IvParameterSpec(KEY.getBytes());

            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

            byte[] encryptedBytes = cipher.doFinal(input.getBytes());
            return new String(Base64.getEncoder().encode(encryptedBytes));
        } catch (NoSuchAlgorithmException
                | NoSuchPaddingException
                | InvalidKeyException
                | InvalidAlgorithmParameterException
                | IllegalBlockSizeException
                | BadPaddingException e) {
            LOG.log(Level.SEVERE, e.getMessage());
            throw new EncriptacionException("Error al encriptar");
        }
    }

    /**
     *
     * @param hash El hash a desencriptar.
     * @return El hash desencriptado.
     * @throws org.itson.excepciones.EncriptacionException Encriptacion
     * Exception.
     */
    public String desencriptar(String hash) throws EncriptacionException {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
            IvParameterSpec ivSpec = new IvParameterSpec(KEY.getBytes());
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);
            byte[] decryptedBytes = cipher.doFinal(Base64.getDecoder().decode(hash.getBytes()));
            return new String(decryptedBytes);
        } catch (NoSuchAlgorithmException
                | NoSuchPaddingException
                | InvalidKeyException
                | InvalidAlgorithmParameterException
                | IllegalBlockSizeException
                | BadPaddingException e) {
            LOG.log(Level.SEVERE, e.getMessage());
            throw new EncriptacionException("Error al encriptar");
        }

    }

}
