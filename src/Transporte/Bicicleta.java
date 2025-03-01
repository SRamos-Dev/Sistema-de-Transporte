public class Bicicleta extends Vehiculo implements SinMotor{

    private String marca;
    private int precio;

    public Bicicleta(int velocidadMaxima, String marca, int precio){
        super(velocidadMaxima);
        this.marca=marca;
        this.precio=precio;
    }

    public String getMarca(){
        return marca;
    }

    public int getPrecio(){
        return precio;
    }

    //Completar metodo hederado
    public void describir(){
        System.out.println("");
    }

    //Completar metodo abstracto
    public void usarFuerzaHumana(){
        System.out.println("");
    }
}
