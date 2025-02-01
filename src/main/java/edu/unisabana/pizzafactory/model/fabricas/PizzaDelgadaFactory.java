package edu.unisabana.pizzafactory.model.fabricas;

// Importación de las interfaces necesarias para la fábrica de pizza
import edu.unisabana.pizzafactory.model.interfaces.PizzaFactory;
import edu.unisabana.pizzafactory.model.interfaces.Amasador;
import edu.unisabana.pizzafactory.model.interfaces.Moldeador;
import edu.unisabana.pizzafactory.model.interfaces.Horneador;

// Importación de las implementaciones específicas para la pizza delgada
import edu.unisabana.pizzafactory.model.implementaciones.AmasadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementaciones.MoldeadorPizzaDelgada;
import edu.unisabana.pizzafactory.model.implementaciones.HorneadorPizzaDelgada;

/**
 * Fábrica específica para la creación de pizzas delgadas.
 * Implementa la interfaz {@link PizzaFactory} para proporcionar las
 * instancias adecuadas de amasador, moldeador y horneador.
 *
 * @author andresazcona & cesarvefe
 */
public class PizzaDelgadaFactory implements PizzaFactory {

    /**
     * Crea y devuelve un objeto de tipo {@link AmasadorPizzaDelgada},
     * que se encargará de amasar la masa de la pizza delgada.
     *
     * @return instancia de {@link AmasadorPizzaDelgada}
     */
    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaDelgada();
    }

    /**
     * Crea y devuelve un objeto de tipo {@link MoldeadorPizzaDelgada},
     * que se encargará de moldear la pizza delgada en la forma deseada.
     *
     * @return instancia de {@link MoldeadorPizzaDelgada}
     */
    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaDelgada();
    }

    /**
     * Crea y devuelve un objeto de tipo {@link HorneadorPizzaDelgada},
     * que se encargará de hornear la pizza delgada a la temperatura y tiempo adecuados.
     *
     * @return instancia de {@link HorneadorPizzaDelgada}
     */
    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaDelgada();
    }
}
