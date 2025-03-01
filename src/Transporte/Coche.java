public class Coche extends Vehiculo implements ConMotor {
    
    private String marca, modelo, matricula;
    private int precio;

    public Coche(int velocidadMaxima, String marca, String modelo, String matricula, int precio){
        super(velocidadMaxima);
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.precio=precio;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getMatricula(){
        return matricula;
    }

    public int getPrecio(){
        return precio;
    }

    public void describir(){
        System.out.println("Automovil de la marca " + marca +
        "modelo " + modelo + "y con matricula " + matricula + 
        ". Este automovil posee una velocidad maxima de " + velocidadMaxima +
        "y un modico precio de " + precio);
    }

    public void encenderMotor(){
        System.out.println("Motor encendico");
    }

}
