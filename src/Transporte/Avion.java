
final public class Avion extends Vehiculo implements ConMotor{
    
    public Avion(int velocidadMaxima) {
            super(velocidadMaxima);
        }
    
    @Override
    public void encenderMotor() {
        System.out.println("El motor del avión está encendido.");
    }

    @Override
    public void describir() {
        System.out.println("Soy un avión que vuela a "+ this.velocidadMaxima + "km/h");
    }


}
