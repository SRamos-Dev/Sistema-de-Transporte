package Transporte;

public class Coche extends Vehiculo implements ConMotor {

    public Coche(int velocidadMaxima, String marca, String modelo){
        super(velocidadMaxima, marca, modelo);
    }

    public void describir(){
        System.out.println("El "+marca+" "+modelo+" alcanza una velocidad maxima de "+velocidadMaxima+"Kms/h.");
    }
}