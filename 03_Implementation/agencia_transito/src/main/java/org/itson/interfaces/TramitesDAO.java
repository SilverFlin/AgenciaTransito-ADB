/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.itson.interfaces;

import java.util.List;
import org.itson.dominio.Tramite;
import org.itson.utils.FiltrosTramites;

/**
 *
 * @author Toled
 */
public interface TramitesDAO extends DAO<Tramite> {

    List<Tramite> getAll(FiltrosTramites filtros);
}
