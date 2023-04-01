/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.interfaces;

import org.itson.dominio.Vehiculo;

/**
 *
 * @author Toled
 */
public interface VehiculosDAO extends DAO<Vehiculo> {
    
    Vehiculo getByMatricula(String Matricula);
}
