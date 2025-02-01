package edu.unisabana.pizzafactory.model.implementaciones;

// Importación de la interfaz Horneador, que define el comportamiento para hornear la pizza
import edu.unisabana.pizzafactory.model.interfaces.Horneador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Implementación de la interfaz {@link Horneador} para pizzas integrales.
 * Esta clase define el proceso específico de horneado para una pizza integral.
 *
 * @author andresazcona
 */
public class HorneadorPizzaIntegral implements Horneador {

    /**
     * Método que ejecuta el proceso de horneado para una pizza integral.
     * Registra un mensaje en el log para indicar que se está horneando la pizza.
     * <p>
     * También incluye una referencia al código que llamaría a un microcontrolador
     * encargado de realizar el proceso de horneado físico.
     */
    @Override
    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
                .log(Level.INFO, "[~~] Horneando la pizza integral con masa integral.");

        // CODIGO DE LLAMADO AL MICROCONTROLADOR
    }
}
