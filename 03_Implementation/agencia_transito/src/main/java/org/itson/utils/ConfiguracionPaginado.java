package org.itson.utils;

/**
 *
 * @author Luis Toledo n Misael Marchena
 */
public class ConfiguracionPaginado {

    int limite;
    int numPagina;
    int offset;

    /**
     * Constructor por defecto. Ajusta el número de la página a 0 y el límite a
     * 5.
     */
    public ConfiguracionPaginado() {
        this.numPagina = 0;
        this.limite = 5;
        this.calcOffset();
    }

    /**
     * Constructor principal.
     *
     * @param limite int Límite del paginado
     * @param numPagina int Número de página
     */
    public ConfiguracionPaginado(int limite, int numPagina) {
        this.limite = limite;
        this.numPagina = numPagina;
        this.calcOffset();
    }

    /**
     * Regresa el offset.
     *
     * @return el offset.
     */
    public int getOffset() {
        calcOffset();
        return offset;
    }

    /**
     * Regresa el límite del paginado.
     *
     * @return límite del paginado.
     */
    public int getLimite() {
        return limite;
    }

    /**
     * Calcula el offset del paginado.
     */
    private void calcOffset() {
        this.offset = (this.limite * this.numPagina);
    }

    /**
     * Aumenta en 1 la página actual.
     */
    public void avanzarPag() {
        numPagina++;
    }

    /**
     * Reduce en 1 la página actual.
     */
    public void retrocederPag() {
        if (this.numPagina != 0) {
            this.numPagina--;
        }
    }
}
