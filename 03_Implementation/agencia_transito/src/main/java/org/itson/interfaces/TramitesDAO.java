package org.itson.interfaces;

import java.util.List;
import org.itson.daos.ParametrosTramitesDTO;
import org.itson.dominio.Tramite;

/**
 *
 * @author Toled
 */
public interface TramitesDAO extends DAO<Tramite> {

    /**
     * Consigue las personas de la base de datos que coincidan los filtros
     * aplicados.
     *
     * @param filtros
     * @return Lista de tramites que coincidieron.
     */
    List<Tramite> getAll(ParametrosTramitesDTO filtros);
}
