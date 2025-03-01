public final class Avion extends Vehiculo implements ConMotor {

    // Atributos propios de la clase Avion
    String marca, matricula;

    // Constructor de la clase Avion, hereda el constructor
    // de la clase vehiculo para el atributo velocidadMaxima
    public Avion(int velocidadMaxima, String marca, String matricula) {
        super(velocidadMaxima);
        this.marca = marca;
        this.matricula = matricula;
    }

    // Metodos get de la clase Avion
    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    // Implementacion del metodo abstracto decribir de la superclase Vehiculo
    public void describir() {
        System.out.println("Avión de la marca " + marca +
                " y matrícula " + matricula +
                ". Este avión posee una velocidad máxima de " + velocidadMaxima +
                " km/h.");
    }

    // Implementacion del metodo encenderMotor de la interfaz ConMotor
    public void encenderMotor() {
        System.out.println("El motor del avión está encendido");
    }
}
