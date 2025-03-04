package Interacciones;

import Transporte.*;

/**
 * The MenuDefault class provides a default menu to demonstrate the
 * functionality
 * of different types of vehicles including a car, bicycle, ship, and plane.
 */
public class MenuDefault {

        /**
         * Runs the default menu which creates instances of various vehicles and
         * demonstrates their functionality by calling their respective methods.
         */
        public void runDefault() {

                Coche car = new Coche(180, "Mazda", "CX-30", "AHF6541");
                Bicicleta bike = new Bicicleta(50, "BWIN", "Rockrider 340");
                Barco ship = new Barco(80, "Bavaria", "VISION46", "7-LU-2-000-10", "Adrastea");
                Avion plane = new Avion(1060, "Boing", "747", "EC-GRP");

                // Addition of a line of text for each vehicle to make it more visual
                System.out.println("------- C  O  C H E ------- ");
                car.arrancar();
                car.encenderMotor();
                car.describir();
                System.out.println();

                System.out.println("------- B I C I C L E T A -------");
                bike.arrancar();
                bike.usarFuerzaHumana();
                bike.describir();
                System.out.println();

                System.out.println("------- B A R C O -------");
                ship.arrancar();
                ship.encenderMotor();
                ship.describir();
                System.out.println();

                System.out.println("------- A V I O N -------");
                plane.arrancar();
                plane.encenderMotor();
                plane.describir();
                System.out.println();
        }
}
