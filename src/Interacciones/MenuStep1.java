package Interacciones;
import java.util.Scanner;

public interface MenuStep1 {

    public default void runMenu(){

        Scanner user = new Scanner(System.in);
        boolean execute;

        while(true){
            System.out.println(
            "\n SELECCIONA EL TIPO DE PROGRAMA QUE DESEAS EJECUTAR: \n\n"+
            "1. Experiencia personalizada \n"+
            "2. Experiencia por defecto \n\n"+
            "3. Salir");

            int programType = user.nextInt();
            execute = (programType == 1 || programType ==2 ) ? true : false;
            if (!execute) break;
            
            MenuDefault menuDefault = new MenuDefault();
            menuDefault.runDefault();
        } user.close();
        
    } 
}
