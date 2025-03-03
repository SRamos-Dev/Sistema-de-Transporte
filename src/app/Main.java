import Transporte.Avion;
import Transporte.Barco;
import Transporte.Bicicleta;
import Transporte.Coche;

public class Main {

    public static void main(String[] args) {
        Coche car = new Coche(180, "Mazda", "CX-30", "AHF6541");
        Bicicleta bike = new Bicicleta(50, "BWIN", "Rockrider 340");
        Barco ship = new Barco(80, "Bavaria", "VISION46", "7-LU-2-000-10", "Adrastea");
        Avion plane = new Avion(1060, "Boing", "747", "EC-GRP");

        car.describir();
        bike.describir();
        ship.describir();
        plane.describir();
    }
}