public abstract class Vehiculo {
    //Atributo de la clase Vehiculo protected porque sera heredado
    protected int velocidadMaxima;

    //Constructor de la clase Vehiculo
    public Vehiculo(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo get de la clase Vehiculo
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    //Metodo arrancar() de la clase Vehiculo
    public void arrancar(){
        System.out.println("El vehiculo esta en marcha");
    }

    //Metodo abstracto de la clase Vehiculo
    public abstract void describir();

    //Metodo abstracto de la clase Vehiculo
    public abstract void encenderMotor();
    
}
