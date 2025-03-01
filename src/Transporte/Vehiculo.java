public abstract class Vehiculo {
    //Atributo de la clase vehiculo protected porque sera heredado
    protected int velocidadMaxima;

    //Constructor de la clase vehiculo
    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo get de la clase vehiculo
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    //Metodo arrancar() de la clase vehiculo
    public void arrancar(){
        System.out.println("El vehiculo esta en marcha");
    }

    //Metodo abstracto de la clase vehiculo
    public abstract void describir();



}
