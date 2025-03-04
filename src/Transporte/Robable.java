package Transporte;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface representing a robable object with a motor.
 */
public interface Robable extends ConMotor {

    /**
     * Attempts to steal the motor based on the given province and zone IDs.
     *
     * @param provinciaId the ID of the province (must be between 1 and 5 inclusive)
     * @param zonaId the ID of the zone (must be between 1 and 5 inclusive)
     * @return {@code true} if the motor was successfully stolen, {@code false} otherwise
     */
    default boolean robarMotor(int provinciaId, int zonaId) {
        
        if (provinciaId < 1 || provinciaId > 5 || zonaId < 1 || zonaId > 5) {
            return false;
        }

        ArrayList<Double> delincuencia = new ArrayList<>(List.of(0.1, 0.2, 0.4, 0.6, 0.9));
        
        double probRobo = delincuencia.get(zonaId-1);
        
        return Math.random() > probRobo;
    }
}
