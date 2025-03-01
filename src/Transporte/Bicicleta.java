package Transporte;

public class Bicicleta extends Vehiculo implements SinMotor {

    public Bicicleta(int velocidadMaxima, String marca, String modelo){
        super(velocidadMaxima, marca, modelo);
    }

   
    @Override
    public void describir() {
        System.out.println(
            "Esta es una bicicleta marca "+marca+
            " y modelo "+modelo+".\n"+
            "Posee una velocidad máxima es " + velocidadMaxima + "km/h."+
            " y modelo "+modelo+
            ". Posee una velocidad máxima es " + velocidadMaxima + "km/h.");
    }

    @Override
    public void usarFuerzaHumana() {
        System.out.println("Usando fuerza humana para mover la bicicleta");
    }
}