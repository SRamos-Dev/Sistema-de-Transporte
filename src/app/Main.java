package app;

import Transporte.Coche; 
import Transporte.Bicicleta;
import Transporte.Barco;
import Transporte.Avion;

public class Main {

    public static void main (String[] args){

        Coche coche1 = new Coche(195, "Toyota", "AE86");
        coche1.arrancar();
        coche1.encenderMotor();
        coche1.describir();

        Bicicleta bicicleta1 = new Bicicleta(80, "Orbea", "OIZ M-LTD");
        bicicleta1.arrancar();
        bicicleta1.usarFuerzaHumana();
        bicicleta1.describir();

        Barco barco1 = new Barco(58, "Incat", "045");
        barco1.arrancar();
        barco1.encenderMotor();
        barco1.describir();

        Avion avion1 = new Avion(492, "Airbus", "Beluga XL");
        avion1.arrancar();
        avion1.encenderMotor();
        avion1.describir();

        System.out.println(avion1.getMarca());
    }
}
