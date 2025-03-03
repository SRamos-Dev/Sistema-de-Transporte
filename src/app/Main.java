package app;


import Interacciones.Menu;


public class Main {

    public static void main (String[] args){

    Menu menu = new Menu(Menu.title);
    Menu.entryMenu();
    menu.runMenu();
    }
}