package edu.unisabana.pizzafactory.model.interfaces;

/**
 * Interfaz que define el comportamiento de un moldeador.
 * Las clases que implementen esta interfaz deben proporcionar la implementación
 * de los métodos {@link #moldearPizzaPequena()} y {@link #moldearPizzaMediana()},
 * que permiten moldear las pizzas en tamaños específicos.
 *
 * @author andresazcona
 */
public interface Moldeador {

    /**
     * Método para moldear una pizza pequeña.
     * La implementación de este método debe realizar las acciones necesarias para
     * moldear una pizza de tamaño pequeño.
     */
    void moldearPizzaPequena();

    /**
     * Método para moldear una pizza mediana.
     * La implementación de este método debe realizar las acciones necesarias para
     * moldear una pizza de tamaño mediano.
     */
    void moldearPizzaMediana();
}
