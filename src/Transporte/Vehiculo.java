package Transporte;

public abstract class Vehiculo {
    protected int velocidadMaxima;
    protected String marca;
    protected String modelo;

    // CONSTRUCTOR VACIO
    public Vehiculo() {
    };

    public Vehiculo(int velocidadMaxima, String marca, String modelo) {
        this.velocidadMaxima = velocidadMaxima;
        this.marca = marca;
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        if (velocidadMaxima >= 0) {
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El vehiculo esta en marcha.");
    }

    public abstract void describir();
}