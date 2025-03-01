package Transporte;

public class Barco extends Vehiculo implements ConMotor {
    
    public Barco(int velocidadMaxima, String marca, String modelo){
        super(velocidadMaxima, marca, modelo);
    }

    public void describir(){
        System.out.println("El barco "+marca+" "+modelo+" alcanza una velocidad maxima de "+velocidadMaxima+" nudos.");
    }
}