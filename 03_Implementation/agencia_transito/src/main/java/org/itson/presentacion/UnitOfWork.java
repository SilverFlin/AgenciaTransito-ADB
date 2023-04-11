package org.itson.presentacion;

import org.itson.daos.LicenciasDAOImpl;
import org.itson.daos.PagosDAOImpl;
import org.itson.daos.PersonasDAOImpl;
import org.itson.daos.PlacasDAOImpl;
import org.itson.daos.TramitesDAOImpl;
import org.itson.daos.VehiculosDAOImpl;
import org.itson.interfaces.LicenciasDAO;
import org.itson.interfaces.PagosDAO;
import org.itson.interfaces.PersonasDAO;
import org.itson.interfaces.PlacasDAO;
import org.itson.interfaces.TramitesDAO;
import org.itson.interfaces.VehiculosDAO;

/**
 *
 * @author Toled
 */
public class UnitOfWork {

    /**
     * LicenciaDAO.
     */
    private LicenciasDAO licenciasDAO;
    /**
     * PagosDAO.
     */
    private PagosDAO pagosDAO;
    /**
     * PersonasDAO.
     */
    private PersonasDAO personasDAO;
    /**
     * PlacasDAO.
     */
    private PlacasDAO placasDAO;
    /**
     * TramitesDAO.
     */
    private TramitesDAO tramitesDAO;
    /**
     * VehiculosDAO.
     */
    private VehiculosDAO vehiculosDAO;

    /**
     * Constructor vacío. No inicializa nada.
     */
    public UnitOfWork() {
        // No hace falta hacer nada.
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de LicenciasDAO.
     */
    public LicenciasDAO licenciasDAO() {
        return (licenciasDAO != null) ? licenciasDAO : new LicenciasDAOImpl();
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de PagosDAO.
     */
    public PagosDAO pagosDAO() {
        return (pagosDAO != null) ? pagosDAO : new PagosDAOImpl();
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de PersonasDAO.
     */
    public PersonasDAO personasDAO() {
        return (personasDAO != null) ? personasDAO : new PersonasDAOImpl();
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de PlacasDAO.
     */
    public PlacasDAO placasDAO() {
        return (placasDAO != null) ? placasDAO : new PlacasDAOImpl();
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de TramitesDAO.
     */
    public TramitesDAO tramitesDAO() {
        return (tramitesDAO != null) ? tramitesDAO : new TramitesDAOImpl();
    }

    /**
     * Si no existe la implementación la crea.
     *
     * @return Implementación de VehiculosDAO.
     */
    public VehiculosDAO vehiculosDAO() {
        return (vehiculosDAO != null) ? vehiculosDAO : new VehiculosDAOImpl();
    }
}
