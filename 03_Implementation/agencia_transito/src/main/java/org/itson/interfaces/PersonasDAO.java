/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.interfaces;

import java.util.List;
import org.itson.dominio.Persona;

/**
 *
 * @author Toled
 */
public interface PersonasDAO extends DAO<Persona> {

    Persona getByRFC(String RFC);
    
    List<Persona> getByNombre(String nombre);
    
    List<Persona> getByAnho(int anho);

}
