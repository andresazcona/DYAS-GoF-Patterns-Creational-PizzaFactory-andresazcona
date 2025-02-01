package edu.unisabana.pizzafactory.model.interfaces;

import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;

/**
 * Interfaz que define los métodos para la creación de objetos relacionados con la preparación de pizzas.
 * La implementación de esta interfaz debe proporcionar los métodos necesarios para crear instancias de
 * {@link Amasador}, {@link Moldeador} y {@link Horneador}, que son responsables de los pasos del proceso de
 * fabricación de la pizza: amasado, moldeado y horneado, respectivamente.
 *
 * @author andresazcona
 */
public interface PizzaFactory {

    /**
     * Método para crear un amasador específico para la pizza.
     * La implementación de este método debe devolver una instancia de un amasador
     * que es responsable de amasar la masa de la pizza.
     *
     * @return una instancia de {@link Amasador}
     */
    Amasador crearAmasador();

    /**
     * Método para crear un moldeador específico para la pizza.
     * La implementación de este método debe devolver una instancia de un moldeador
     * que es responsable de moldear la pizza en su forma correcta.
     *
     * @return una instancia de {@link Moldeador}
     */
    Moldeador crearMoldeador();

    /**
     * Método para crear un horneador específico para la pizza.
     * La implementación de este método debe devolver una instancia de un horneador
     * que es responsable de hornear la pizza una vez que ha sido amasada y moldeada.
     *
     * @return una instancia de {@link Horneador}
     */
    Horneador crearHorneador();
}
