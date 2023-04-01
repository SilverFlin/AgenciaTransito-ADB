/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.utils;

import at.favre.lib.crypto.bcrypt.BCrypt;

/**
 *
 * @author Toled
 */
public class Encriptador {

    private static final int COST = 12;

    public static String encriptar(String txt) {
        String bcryptHashString = BCrypt.withDefaults().hashToString(COST, txt.toCharArray());
        return bcryptHashString;
    }

    public static boolean validar(String intento, String hashedPassword) {
        BCrypt.Result result = BCrypt.verifyer().verify(intento.toCharArray(), hashedPassword);
        return result.verified;
    }
}
