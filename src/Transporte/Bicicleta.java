public class Bicicleta extends Vehiculo implements SinMotor {

    // Implementacion del metodo abstracto encenderMotor de la superclase Vehiculo
    @Override
    public void encenderMotor() {
        throw new UnsupportedOperationException("Las bicicletas no tienen motor.");
    }

    // Atributos propios de la clase Bicicleta
    String marca;
    String modelo;
    
    // constructor de la clase Bicicleta, hereda el constructor
    // de la clase vehiculo para el atributo velocidadMaxima
    public Bicicleta(int velocidadMaxima, String marca, String modelo) {
        super(velocidadMaxima);
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos get de la clase Bicicleta
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Implementacion del metodo abstracto decribir de la superclase Vehiculo
    public void describir() {
        System.out.println("Esta es una bicicleta de la marca " + marca +" Posee una velocidad máxima es " + velocidadMaxima + " km/h.");
    }

    // Implementacion del metodo usarFuerzaHumana de la interfaz SinMotor
    public void usarFuerzaHumana() {
        System.out.println(
                "Usando fuerza humana para mover la bicicleta");
    }
}
