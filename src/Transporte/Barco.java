package Transporte;

public class Barco extends Vehiculo implements ConMotor {
    
    public Barco(int velocidadMaxima, String marca, String modelo){
        super(velocidadMaxima, marca, modelo);
    }

    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setVelocidadMaxima(int velocidadMaxima){
        if(velocidadMaxima >= 0){ 
            this.velocidadMaxima = velocidadMaxima;
        } else {
            System.out.println("La velocidad no puede ser negativa.");
        } 
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void describir(){
        System.out.println("El barco "+marca+" "+modelo+" alcanza una velocidad maxima de "+velocidadMaxima+" nudos.");
    }
}