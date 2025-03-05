package Transporte;

/**
 * La clase Coche representa un tipo de vehículo que puede ser robado.
 * Extiende la clase Vehiculo e implementa la interfaz Robable.
 * 
 * @see Vehiculo
 * @see Robable
 */
public class Coche extends Vehiculo implements Robable {

    private String matricula;

    /**
     * Constructor vacío de la clase Coche.
     */
    public Coche() {
    }

    /**
     * Constructor de la clase Coche con parámetros.
     * 
     * @param velocidadMaxima La velocidad máxima del coche.
     * @param marca La marca del coche.
     * @param modelo El modelo del coche.
     * @param matricula La matrícula del coche.
     */
    public Coche(int velocidadMaxima, String marca, String modelo, String matricula){
        super(velocidadMaxima, marca, modelo);
        this.matricula = matricula;
    }

    /**
     * Obtiene la matrícula del coche.
     * 
     * @return La matrícula del coche.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del coche.
     * 
     * @param matricula La nueva matrícula del coche.
     */
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    /**
     * Describe las características del coche.
     */
    @Override
    public void describir() {

        System.out.println(
            "Automovil de la marca "+marca+
            " modelo "+modelo+" y con matricula "+matricula+".\n"+
            "Este automovil posee una velocidad máxima de "+velocidadMaxima+"km/h.");
    }

    /**
     * Enciende el motor del coche.
     */
    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche está encendido.");
    }
}