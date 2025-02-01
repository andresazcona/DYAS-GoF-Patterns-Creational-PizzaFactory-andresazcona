package edu.unisabana.pizzafactory.model.interfaces;

/**
 * Interfaz que define el comportamiento de un amasador.
 * La clase que implemente esta interfaz debe proporcionar la implementación
 * del método {@link #amasar()} para realizar el proceso de amasado de la pizza.
 *
 * @author andresazcona
 */
public interface Amasador {

    /**
     * Método para amasar la pizza.
     * La implementación de este método debe realizar las acciones necesarias para
     * amasar la masa de la pizza.
     */
    void amasar();
}
