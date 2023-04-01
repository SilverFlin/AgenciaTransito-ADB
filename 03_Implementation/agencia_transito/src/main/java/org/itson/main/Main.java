/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.main;

import java.util.List;
import java.util.Random;
import org.itson.temptest.*;//Borrar

/**
 *
 * @author Toled
 */
public class Main {

    public static void main(String[] args) {
        TestTramitesDAO.probarTramitesDAO();
    }

    // Pseudo-pruebas 
    // TODO pasar a unit test
    public static <T> void imprimirLista(List<T> lista) {
        for (Object obj : lista) {
            System.out.println(obj);
        }
    }

    public static String getRandomNumber(int digCount) {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(digCount);
        for (int i = 0; i < digCount; i++) {
            sb.append((char) ('0' + rnd.nextInt(10)));
        }
        return sb.toString();
    }

}
