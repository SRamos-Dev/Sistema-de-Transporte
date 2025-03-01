public class Main {

public static void main(String[] args) {
    Coche car = new Coche(180, "Mazda", "CX-30", "AHF6541");
    Bicicleta bike = new Bicicleta(50, "BWIN") ;
    Barco ship = new Barco(80, "Bavaria", "7-LU-2-000-10", "Adrastea");
    Avion plane = new Avion(90, "Boing", "EC-GRP");

    car.describir();
    bike.describir();
    ship.describir();
    plane.describir();

    car.encenderMotor();
    ship.encenderMotor();   
    plane.encenderMotor();

    }
}