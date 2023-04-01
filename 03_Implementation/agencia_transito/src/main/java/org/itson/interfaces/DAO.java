/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.interfaces;

import java.util.List;
import java.util.Optional;
import org.itson.excepciones.PersistenciaException;

/**
 *
 * @author Toled
 * @param <T>
 */
public interface DAO<T> {

    Optional<T> get(long id);

    List<T> getAll();

    T save(T t) throws PersistenciaException;

    T update(T t, String[] params);

    T delete(T t);
}
