package Transporte;

public class Coche extends Vehiculo implements ConMotor {

    private String matricula;

    public Coche(int velocidadMaxima, String marca, String modelo, String matricula){
        super(velocidadMaxima, marca, modelo);
        this.matricula = matricula;
       }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override
    public void describir() {
        System.out.println("Automovil de la marca "+marca+
                " modelo "+modelo+" y con matricula "+matricula+
                ". Este automovil posee una velocidad máxima de "+velocidadMaxima+"km/h.");
    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del coche está encendido");
    }
}