package Transporte;

/**
 * The Avion class represents an airplane, which is a type of vehicle.
 * It extends the Vehiculo class and implements the Robable interface.
 */
public final class Avion extends Vehiculo implements Robable {
    
    private String matricula;

    /**
     * Default constructor for the Avion class.
     */
    public Avion() {
    }

    /**
     * Parameterized constructor for the Avion class.
     * 
     * @param velocidadMaxima The maximum speed of the airplane.
     * @param marca The brand of the airplane.
     * @param modelo The model of the airplane.
     * @param matricula The registration number of the airplane.
     */
    public Avion(int velocidadMaxima, String marca, String modelo, String matricula){
        super(velocidadMaxima, marca, modelo);
        this.matricula = matricula;
    }

    /**
     * Gets the registration number of the airplane.
     * 
     * @return The registration number of the airplane.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Sets the registration number of the airplane.
     * 
     * @param matricula The new registration number of the airplane.
     */
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    /**
     * Describes the airplane by printing its details.
     */
    @Override
    public void describir() {
        System.out.println(
            "Avión de la marca "+marca+" modelo "+modelo+
            " y matrícula "+matricula+".\n"+
            "Este avión posee una velocidad máxima de "+velocidadMaxima+"km/h.");
    }

    /**
     * Starts the engine of the airplane.
     */
    @Override
    public void encenderMotor() {
        System.out.println("El motor del avión está encendido.");
    }
}
