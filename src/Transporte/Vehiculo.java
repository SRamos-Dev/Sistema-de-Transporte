package Transporte;

/**
 * Clase abstracta que representa un vehículo.
 * Implementa la interfaz Sprites.
 */
public abstract class Vehiculo implements Sprites {
    protected int velocidadMaxima;
    protected String marca;
    protected String modelo;

    /**
     * Constructor vacío.
     */
    public Vehiculo() {
    }

    /**
     * Constructor con parámetros.
     * 
     * @param velocidadMaxima La velocidad máxima del vehículo. Se evalua si es negativo se inicializa con 0.
     * @param marca           La marca del vehículo.
     * @param modelo          El modelo del vehículo.
     */
    public Vehiculo(int velocidadMaxima, String marca, String modelo) {

        if (velocidadMaxima < 0) {
            this.velocidadMaxima = 0;

        } else
            this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Obtiene la velocidad máxima del vehículo.
     * 
     * @return La velocidad máxima.
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * Obtiene la marca del vehículo.
     * 
     * @return La marca.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Obtiene el modelo del vehículo.
     * 
     * @return El modelo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Establece la velocidad máxima del vehículo.
     * 
     * @param velocidadMaxima La velocidad máxima a establecer.
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima >= 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        }
    }

    /**
     * Establece la marca del vehículo.
     * 
     * @param marca La marca a establecer.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Establece el modelo del vehículo.
     * 
     * @param modelo El modelo a establecer.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Arranca el vehículo.
     */
    public void arrancar() {
        System.out.println("El vehiculo esta en marcha.");
    }

    /**
     * Método abstracto para describir el vehículo.
     * Debe ser implementado por las clases derivadas.
     */
    public abstract void describir();
}
