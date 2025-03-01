public interface ConMotor {
    public void encenderMotor();
=======

    default void encenderMotor(){
        System.out.println("El motor está encendido");
    }
}
