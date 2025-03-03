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

    public default void runMenu() {

        Scanner user = new Scanner(System.in);
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

            int programType = user.nextInt();
            execute = (programType == 1 || programType == 2) ? true : false;
            if (!execute)
                break;

            if (programType == 2) {
                MenuDefault menuDefault = new MenuDefault();
                menuDefault.runDefault();
            } else
                return;

        }

    }
}