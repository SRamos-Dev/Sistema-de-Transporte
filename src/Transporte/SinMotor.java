package Transporte;

/**
 * Interface SinMotor representa un medio de transporte que no utiliza motor.
 */
public interface SinMotor {
    
    /**
     * Método por defecto que simula el uso de fuerza humana para moverse.
     */
    default void usarFuerzaHumana(){
        System.out.println("Usando fuerza humana para moverse.");
    }
}