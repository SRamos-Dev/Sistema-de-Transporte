package Interacciones;

import java.util.Scanner;

public interface MenuStep1 {

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String LIGHT_YELLOW = "\u001B[93m";
    public static final String YELLOW = "\u001B[33m";
    public static final String YELLOW_BACKGROUND = "\u001B[43m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BOLD = "\u001B[1m";
    public static final String UNBOLD = "\u001B[21m";

    // DECLARACION DE SCANNER
    Scanner user = new Scanner(System.in);

    public default void runMenu() {

        boolean execute;

        while (true) {
            System.out.println(
                    CYAN + BOLD +
                            "\n SELECCIONA EL TIPO DE PROGRAMA QUE DESEAS EJECUTAR: \n\n" +
                            RESET +
                            BLUE + "1. " + GREEN + "Experiencia personalizada \n" +
                            BLUE + "2. " + GREEN + "Experiencia por defecto \n\n" +
                            BLUE + "3. " + GREEN + "Salir \n"
                            + RESET);

            int programType = revisarEntrada(3);

            execute = (programType == 1 || programType == 2) ? true : false;
            if (!execute) {
                System.out.println("\n" +
                        "Gracias por utilizar el programa!, CERRANDO...\n");
                break;
            }
            if (programType == 1) {
                MenuCustom menuCustom = new MenuCustom();
                menuCustom.runCustom();
            }
            if (programType == 2) {
                MenuDefault menuDefault = new MenuDefault();
                menuDefault.runDefault();
            } else
                return;

        }
        // SCANNER CLOSE
        user.close();
    }

    public static int revisarEntrada() {
        while (true) {
            if (user.hasNextInt()) {
                return user.nextInt();
            } else {
                System.out.println("Ingresa el número en Enteros");
                user.next(); // limpiamos la entrada invalida
            }
        }
    }

    public static int revisarEntrada(int opcion) {
        while (true) {
            if (user.hasNextInt()) {
                int num = user.nextInt();
                if (num <= opcion) {
                    return num;
                } else {
                    System.out.println("Ingrese un numero valido");
                }

            } else {
                System.out.println("Ingresa un número valido");
                user.next(); // limpiamos la entrada invalida
            }
        }
    }

    /*
     * / public default void runMenu() {
     * 
     * int programType = 0;
     * 
     * do {
     * System.out.println(
     * CYAN + BOLD +
     * "\n SELECCIONA EL TIPO DE PROGRAMA QUE DESEAS EJECUTAR: \n\n" +
     * RESET +
     * BLUE + "1. " + GREEN + "Experiencia personalizada \n" +
     * BLUE + "2. " + GREEN + "Experiencia por defecto \n\n" +
     * BLUE + "3. " + GREEN + "Salir \n"
     * + RESET);
     * 
     * programType = user.nextInt();
     * 
     * switch (programType) {
     * case 1:
     * MenuCustom menuCustom = new MenuCustom();
     * menuCustom.runCustom();
     * break;
     * 
     * case 2:
     * MenuDefault menuDefault = new MenuDefault();
     * menuDefault.runDefault();
     * break;
     * 
     * case 3:
     * System.out.println("\n" +
     * "Gracias por utilizar el programa!, CERRANDO...\n");
     * break;
     * 
     * }
     * } while (programType != 3);
     * 
     * 
     * }
     */

}
