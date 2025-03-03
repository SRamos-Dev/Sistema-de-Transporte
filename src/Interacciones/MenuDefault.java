package Interacciones;

import Transporte.Avion;
import Transporte.Barco;
import Transporte.Bicicleta;
import Transporte.Coche;

public class MenuDefault {
    public void runDefault() {

        Coche car = new Coche(180, "Mazda", "CX-30", "AHF6541");
        Bicicleta bike = new Bicicleta(50, "BWIN", "Rockrider 340");
        Barco ship = new Barco(80, "Bavaria", "VISION46", "7-LU-2-000-10", "Adrastea");
        Avion plane = new Avion(1060, "Boing", "747", "EC-GRP");


        //ADICION DE LINEA DE TEXTO POR CADA VEHICULO PARA QUE SEA MAS VISUAL
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

        System.out.println("------- B A R C O -------" );
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