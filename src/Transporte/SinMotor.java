package Transporte;

public interface SinMotor {
    
    default void usarFuerzaHumana(){
        System.out.println("Usando fuerza humana para moverse.");
    }
}