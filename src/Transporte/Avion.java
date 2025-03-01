package Transporte;

public final class Avion extends Vehiculo implements ConMotor {
    
    private String matricula;

    public Avion(int velocidadMaxima, String marca, String modelo, String matricula){
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
        System.out.println(
            "Avión de la marca "+marca+" modelo "+modelo+
            " y matrícula "+matricula+".\n"+
            "Este avión posee una velocidad máxima de "+velocidadMaxima+"km/h.");

    }

    @Override
    public void encenderMotor() {
        System.out.println("El motor del avión está encendido.");
    }
}
