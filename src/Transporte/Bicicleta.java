package Transporte;

public class Bicicleta extends Vehiculo implements SinMotor {

    public Bicicleta(int velocidadMaxima, String marca, String modelo){
        super(velocidadMaxima, marca, modelo);
    }

    public void describir(){
        System.out.println("La bicleta "+marca+" "+modelo+" alcanza una velocidad maxima de "+velocidadMaxima+"Kms/h.");
    }
}

