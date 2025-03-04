package Transporte;

/**
 * Interface ConMotor representa un objeto que tiene un motor.
 */
public interface ConMotor {
    
    /**
     * Enciende el motor y muestra un mensaje en la consola.
     */
    default void encenderMotor(){
        System.out.println("El motor esta encendido.");
    }
}
