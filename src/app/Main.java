package app;

import Transporte.Coche; 
import Transporte.Bicicleta;
import Transporte.Barco;
import Transporte.Avion;

import Interacciones.Menu;


public class Main {

    public static void main (String[] args){

    Menu menu = new Menu(Menu.title);
    Menu.entryMenu();
    menu.runMenu();
    }
}
