package Transporte;

import java.util.ArrayList;
import java.util.List;

public interface Robable extends ConMotor {
    default boolean robarMotor(int provinciaId, int zonaId) {
        
        if (provinciaId < 1 || provinciaId > 5 || zonaId < 1 || zonaId > 5) {
            return false;
        }

        ArrayList<Double> delincuencia = new ArrayList<>(List.of(0.1, 0.2, 0.4, 0.6, 0.9));
        
        double probRobo = delincuencia.get(zonaId-1);
        
        return Math.random() > probRobo;
    }
}
