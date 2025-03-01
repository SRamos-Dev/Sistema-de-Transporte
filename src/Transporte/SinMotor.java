public interface SinMotor {
    public void usarFuerzaHumana();

public interface SinMotor {
    default void usarFuerzaHumana(){
        System.out.println("Usando fuerza humana");
    }
}
