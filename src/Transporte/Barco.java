package Transporte;

/**
 * La clase Barco representa un tipo de vehículo que es un barco.
 * Extiende la clase Vehiculo e implementa la interfaz Robable.
 * 
 * Esta clase contiene información sobre la matrícula y el nombre del barco,
 * así como métodos para describir el barco y encender su motor.
 * 
 * @see Vehiculo
 * @see Robable
 */
public class Barco extends Vehiculo implements Robable {
    
    private String matricula;
    private String nombre;

     // CONSTRUCTOR VACIO
     public Barco() {
     }

    public Barco(int velocidadMaxima, String marca, String modelo, String matricula, String nombre){
        super(velocidadMaxima, marca, modelo);
        this.matricula = matricula;
        this.nombre = nombre;
        }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void describir() {
        System.out.println(
            "Barco de la marca "+marca+"y modelo "+modelo+
            " con matrícula "+matricula+"."+"\n"+
            "Este barco posee una velocidad máxima de "+velocidadMaxima+
            " km/h y lleva el nombre de "+nombre+".");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del barco está encendido.");
    }
}
