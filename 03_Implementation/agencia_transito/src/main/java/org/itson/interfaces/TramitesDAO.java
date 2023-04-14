package org.itson.interfaces;

import java.util.List;
import org.itson.daos.ParametrosTramitesDTO;
import org.itson.dominio.Tramite;
import org.itson.utils.ConfiguracionPaginado;

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

    /**
     * Consigue las personas de la base de datos que coincidan los filtros
     * aplicados y una configuración de paginado.
     *
     * @param filtros
     * @param paginado
     * @return Lista de tramites que coincidieron.
     */
    List<Tramite> getAll(ParametrosTramitesDTO filtros,
            ConfiguracionPaginado paginado);

    /**
     * Consigue todos los tramites dada una id de persona con configuración de
     * paginado.
     *
     * @param paginado
     * @param idPersona
     * @return Lista de tramites que coincidieron.
     */
    List<Tramite> getAllByIdPersona(ConfiguracionPaginado paginado,
            Long idPersona);
}
