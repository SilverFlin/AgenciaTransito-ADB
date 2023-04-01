/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.daos;

import java.util.List;
import java.util.Optional;
import org.itson.excepciones.PersistenciaException;

/**
 *
 * @author Toled
 */
public interface DAO<T> {
    
    Optional<T> get(long id);
    
    List<T> getAll();
    
    void save(T t) throws PersistenciaException;
    
    void update(T t, String[] params) ;
    
    void delete(T t);
}
