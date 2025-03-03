import Interacciones.Menu;
import Interacciones.MenuCustom;


public class Main {

    public static void main (String[] args){

    Menu menu = new Menu(Menu.title);
    MenuCustom menuCustom = new MenuCustom();
    Menu.entryMenu();
    menu.runMenu();
    menuCustom.runCustom();
    System.out.println("\n"+"Gracias por utilizar el programa!, CERRANDO...\n");
    }
}