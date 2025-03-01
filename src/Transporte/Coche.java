public class Coche extends Vehiculo implements ConMotor {

    // Atributos propios de la clase Coche
    private String marca, modelo, matricula;

    // Constructor de la clase Coche, hereda el constructor
    // de la clase Vehiculo para el atributo velocidadMaxima
    public Coche(int velocidadMaxima, String marca, String modelo, String matricula) {
        super(velocidadMaxima);
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    // Metodos get de la clase Coche
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    // Implementacion del metodo abstracto decribir de la superclase Vehiculo
    @Override
    public void describir() {
        System.out.println("Automovil de la marca " + marca +
                " modelo " + modelo + " y con matricula " + matricula +
                ". Este automovil posee una velocidad máxima de " + velocidadMaxima +
                "km/h.");
    }

    // Implementacion del metodo encenderMotor de la interfaz ConMotor
    public void encenderMotor() {
        System.out.println("El motor del coche está encendido");
    }

}