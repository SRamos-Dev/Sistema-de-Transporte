public class Main {

public static void main(String[] args) {
    Coche car = new Coche(180, "Mazda", "CX-30", "AHF6541");
    Bicicleta bike = new Bicicleta(50, "BWIN", "Rockrider 340");
    Barco ship = new Barco(80, "Bavaria", "7-LU-2-000-10", "Adrastea");
    Avion plane = new Avion(90, "Boing", "EC-GRP");

    car.arrancar();
    car.encenderMotor();
    car.describir();
    
    System.out.println("");
    bike.arrancar();
    bike.usarFuerzaHumana();
    bike.describir();
    
    System.out.println("");
    ship.arrancar();  
    ship.encenderMotor();
    ship.describir();
    
    System.out.println("");
    plane.arrancar();
    plane.encenderMotor();
    plane.describir();
    
    }
}