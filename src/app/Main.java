package app;

import Interacciones.Menu;

/**
 * Main class to run the application.
 */
public class Main {

    /**
     * The main method to start the application.
     * 
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu(Menu.title);
        Menu.entryMenu();
        menu.runMenu();
    }
}