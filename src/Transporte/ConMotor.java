package Transporte;

public interface ConMotor {
    
    default void encenderMotor(){
        System.out.println("El motor esta encendido.");
    }
}  