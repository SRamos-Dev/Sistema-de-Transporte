package Transporte;

/**
 * La clase Bicicleta representa una bicicleta que extiende de la clase Vehiculo e implementa la interfaz SinMotor.
 */
public class Bicicleta extends Vehiculo implements SinMotor {

    /**
     * Constructor vacío de la clase Bicicleta.
     */
    public Bicicleta() {
    }

    /**
     * Constructor de la clase Bicicleta con parámetros.
     * 
     * @param velocidadMaxima La velocidad máxima de la bicicleta.
     * @param marca La marca de la bicicleta.
     * @param modelo El modelo de la bicicleta.
     */
    public Bicicleta(int velocidadMaxima, String marca, String modelo){
        super(velocidadMaxima, marca, modelo);
    }
   
    /**
     * Método para describir la bicicleta.
     */
    @Override
    public void describir() {
        System.out.println(
            "Esta es una bicicleta marca "+marca+
            " y modelo "+modelo+".\n"+
            "Posee una velocidad máxima es " + velocidadMaxima + "km/h.");
    }

    /**
     * Método para usar la fuerza humana para mover la bicicleta.
     */
    @Override
    public void usarFuerzaHumana() {
        System.out.println("Usando fuerza humana para mover la bicicleta.");
    }
}
