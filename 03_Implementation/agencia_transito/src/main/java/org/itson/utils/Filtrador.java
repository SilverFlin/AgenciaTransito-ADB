package org.itson.utils;

import java.util.LinkedList;
import java.util.List;
import org.itson.dominio.Persona;
import org.itson.dominio.Tramite;

/**
 *
 * @author Toled
 */
public final class Filtrador {

    private Filtrador() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Agarra una lista de trámites y los filtra según el nombre del tramitante.
     *
     * @param tramites Los tramites a filtra.
     * @param nombre El nombre con el que se va a comparar.
     * @return La lista de tramites filtrados.
     */
    public static List<Tramite> filtrarTramitesPorNombreTramitante(
            final List<Tramite> tramites,
            final String nombre
    ) {
        List<Tramite> tramitesFiltrados = new LinkedList<>();

        for (Tramite tramite : tramites) {
            Persona tramitante = tramite.getTramitante();
            String nombreTramitante = tramitante.getNombres();

            if (nombreTramitante.contains(nombre)) {
                tramitesFiltrados.add(tramite);
            }
        }

        return tramitesFiltrados;
    }

    /**
     * Agarra una lista de Personas y los filtra según el nombre.
     *
     * @param personas Los tramites a filtra.
     * @param nombre El nombre con el que se va a comparar.
     * @return La lista de tramites filtrados.
     */
    public static List<Persona> filtrarPersonaNombre(
            final List<Persona> personas,
            final String nombre
    ) {
        List<Persona> personasFiltradas = new LinkedList<>();

        for (Persona persona : personas) {
            String nombrePersona = persona.getNombres();

            if (nombrePersona.contains(nombre)) {
                personasFiltradas.add(persona);
            }
        }

        return personasFiltradas;
    }

}
