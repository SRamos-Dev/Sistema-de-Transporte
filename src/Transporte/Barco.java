public class Barco extends Vehiculo {
    // Atributos propios de la clase Barco
    private String marca, matricula, nombre;

    // Constructor de la clase Barci, hereda el constructor
    // de la clase Vehiculo para el atributo velocidadMaxima
    public Barco(int velocidadMaxima, String marca, String matricula, String nombre) {
        super(velocidadMaxima);
        this.marca = marca;
        this.matricula = matricula;
        this.nombre = nombre;
    }

    // Metodos get de la clase Barco
    public String getMarca() {
        return marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    // Implementacion del metodo abstracto decribir de la superclase Vehiculo
    @Override
    public void describir() {
        System.out.println("Barco de la marca " + marca +
                " y matrícula " + matricula +
                ". Este barco posee una velocidad máxima de " + velocidadMaxima +
                " km/h y un lleva el nombre de " + nombre + ".");
    }

    // Implementacion del metodo encenderMotor de la interfaz ConMotor
    public void encenderMotor() {
        System.out.println("El motor del avión está encendido");
    }
}
