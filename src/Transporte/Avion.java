package Transporte;

public final class Avion extends Vehiculo implements ConMotor {
    
    public Avion(int velocidadMaxima, String marca, String modelo){
        super(velocidadMaxima, marca, modelo);
    }

    public void describir(){
        System.out.println("El avion "+marca+" "+modelo+" alcanza una velocidad maxima de "+velocidadMaxima+" nudos.");
    }
}
