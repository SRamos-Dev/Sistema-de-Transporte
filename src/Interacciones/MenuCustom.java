package Interacciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Interacciones.MenuStep1.revisarEntrada;
import Transporte.*;

/**
 * Clase MenuCustom que implementa las interfaces MenuStep1 y Robable.
 * Permite al usuario interactuar con un menú para seleccionar y gestionar
 * diferentes tipos de vehículos.
 */
public class MenuCustom implements MenuStep1, Robable {

        /**
         * Constructor por defecto de la clase MenuCustom.
         */
        public MenuCustom() {
        }

        /**
         * Método principal que ejecuta el menú personalizado.
         * Permite al usuario seleccionar un tipo de vehículo, ingresar sus datos y
         * realizar operaciones con él.
         */
        public void runCustom() {

                Scanner user = new Scanner(System.in);
                int vehiculo;
                String nombreVehiculo = "";
                int provinciaId;
                int zonaId;
                boolean exit = true;
                MenuCustom menu = new MenuCustom();

                // VARIABLES OBJETO PARA UTILIZACION FUERA DE CONDICIONALES
                Coche userCar = new Coche();
                Bicicleta userBike = new Bicicleta();
                Barco userShip = new Barco();
                Avion userPlane = new Avion();

                ArrayList<String> provincias = new ArrayList<>(List.of(
                                "Alicante", "Barcelona", "Madrid", "Murcia", "Sevilla"));

                ArrayList<ArrayList<String>> zonas = new ArrayList<>();
                zonas.add(new ArrayList<>(
                                List.of("Albufereta", "Cabo de las Huertas", "San Blas-Estacion", "Virgen del Remedio",
                                                "Juan XXIII"))); // Alicante
                zonas.add(new ArrayList<>(List.of("Sarria", "Pedralbes", "Eixample", "El Raval", "La Mina")));
                zonas.add(new ArrayList<>(List.of("Salamanca", "Chamberi", "Retiro", "Usera", "Vallecas")));
                zonas.add(new ArrayList<>(List.of("La Flota", "Monteagudo", "San Andres", "El Carmen", "Lo Campano")));
                zonas.add(new ArrayList<>(
                                List.of("Nervion", "Triana", "Los Remedios", "Cerro del Aguila",
                                                "Las Tres Mil Viviendas")));

                System.out.println(
                                CYAN + "\nSelecciona el tipo de vehiculo que tienes.\n\n" +
                                                BLUE + "1. " + GREEN + "Coche\n" +
                                                BLUE + "2. " + GREEN + "Bicicleta\n" +
                                                BLUE + "3. " + GREEN + "Barco\n" +
                                                BLUE + "4. " + GREEN + "Avion\n" + RESET);
                // DECLARACION VARIABLE VEHICULO FUERA DE CONDICIONAL -> DABA ERROR EN EJECUCION
                // OPCION 2 DEFAULT
                vehiculo = revisarEntrada();

                switch (vehiculo) {
                        case 1:
                                // Cambio nombre variables para cada objeto
                                nombreVehiculo = "coche";
                                System.out.println(CYAN + "\nIntroduce los siguientes datos sobre tu coche.\n");
                                System.out.println(YELLOW + "\nMarca:\n" + GREEN);
                                String marcaCar = user.next();
                                System.out.println(YELLOW + "\nModelo:\n" + GREEN);
                                String modeloCar = user.next();
                                System.out.println(YELLOW + "\nMatricula\n" + RESET);
                                String matriculaCar = user.next();
                                System.out.println(YELLOW + "\nVelocidad Maxima:\n" + RED);
                                int velocidadMaximaCar = revisarEntrada();
                                userCar = new Coche(velocidadMaximaCar, marcaCar, modeloCar, matriculaCar);
                                break;

                        // Adicion caso 2: BICICLETA
                        case 2:
                                nombreVehiculo = "Bicicleta";
                                System.out.println(CYAN + "\nIntroduce los siguientes datos sobre tu bicicleta.\n");
                                System.out.println(YELLOW + "\nMarca:\n" + GREEN);
                                String marcaBike = user.next();
                                System.out.println(YELLOW + "\nModelo:\n" + GREEN);
                                String modeloBike = user.next();
                                System.out.println(YELLOW + "\nVelocidad Maxima:\n" + RED);
                                int velocidadMaximaBike = revisarEntrada();
                                userBike = new Bicicleta(velocidadMaximaBike, marcaBike, modeloBike);
                                break;

                        // Adicion caso 3: BARCO
                        case 3:
                                nombreVehiculo = "Barco";
                                System.out.println(CYAN + "\nIntroduce los siguientes datos sobre tu barco.\n");
                                System.out.println(YELLOW + "\nMarca:\n" + GREEN);
                                String marcaShip = user.next();
                                System.out.println(YELLOW + "\nModelo:\n" + GREEN);
                                String modeloShip = user.next();
                                System.out.println(YELLOW + "\nMatricula\n" + RESET);
                                String matriculaShip = user.next();
                                System.out.println(YELLOW + "\nNombre:\n" + CYAN);
                                String nombreShip = user.next();
                                System.out.println(YELLOW + "\nVelocidad Maxima:\n" + RED);
                                int velocidadMaximaShip = revisarEntrada();
                                userShip = new Barco(velocidadMaximaShip, marcaShip, modeloShip, matriculaShip,
                                                nombreShip);
                                break;

                        // Adicion caso 4: AVION
                        case 4:
                                nombreVehiculo = "Avion";
                                System.out.println(CYAN + "\nIntroduce los siguientes datos sobre tu avión.\n");
                                System.out.println(YELLOW + "\nMarca:\n" + GREEN);
                                String marcaPlane = user.next();
                                System.out.println(YELLOW + "\nModelo:\n" + GREEN);
                                String modeloPlane = user.next();
                                System.out.println(YELLOW + "\nMatricula\n" + RESET);
                                String matriculaPlane = user.next();
                                System.out.println(YELLOW + "\nVelocidad Maxima:\n" + RED);
                                int velocidadMaximaPlane = revisarEntrada();
                                userPlane = new Avion(velocidadMaximaPlane, marcaPlane, modeloPlane, matriculaPlane);
                                break;
                }

                System.out.println(
                                CYAN + "\nSeleciona la provincia donde esta estacionado el vehiculo.\n\n" +
                                                BLUE + "1. " + GREEN + "Alicante\n" +
                                                BLUE + "2. " + GREEN + "Barcelona\n" +
                                                BLUE + "3. " + GREEN + "Madrid\n" +
                                                BLUE + "4. " + GREEN + "Murcia\n" +
                                                BLUE + "5. " + GREEN + "Sevilla\n" + RESET);

                provinciaId = revisarEntrada(provincias.size());

                do {
                        System.out.println(CYAN + "\nSelecciona la zona donde se encuentra.\n\n");

                        System.out.println(BLUE + "Zonas de " + provincias.get(provinciaId - 1) + ":");
                        ArrayList<String> zonasProvincia = zonas.get(provinciaId - 1);

                        for (int i = 0; i < zonasProvincia.size(); i++) {
                                System.out.println((BLUE + (i + 1)) + ". " + GREEN + zonasProvincia.get(i) + RESET);
                        }

                        zonaId = (revisarEntrada(zonasProvincia.size()));

                        System.out.println(
                                        CYAN + "\nQue deseas hacer con tu " + nombreVehiculo + "?:\n\n" +
                                                        BLUE + "1. " + GREEN + "Encender motor\n" +
                                                        BLUE + "2. " + GREEN + "Desplazarlo a otra zona\n" +
                                                        BLUE + "3. " + GREEN + "Recibir una descripcion de este\n"
                                                        + RESET);

                        int operacionVehiculo = revisarEntrada(3);
                        if (operacionVehiculo == 1) {
                                boolean arrancarMotor = menu.robarMotor(provinciaId, zonaId);
                                System.out.println(arrancarMotor ? GREEN + "\nEnhorabuena el motor esta arrancado\n"
                                                : RED + "\nVAYA!, parece que te han hecho el truco rumano.\n" +
                                                                "Unos ladrones de " + provincias.get(provinciaId - 1)
                                                                + " te han robado el motor.\n" +
                                                                "Lo siento..." + RESET);
                                exit = false;
                        }
                        // ADICION OPCION 2 SUBMENU CUSTOMIZABLE
                        else if (operacionVehiculo == 2) {
                                System.out.println(CYAN + "\nSelecciona la zona a donde quieres desplazarlo.\n\n");

                                System.out.println(BLUE + "Zonas de " + provincias.get(provinciaId - 1) + ":");
                                ArrayList<String> zonasProvincia2 = zonas.get(provinciaId - 1);

                                for (int i = 0; i < zonasProvincia2.size(); i++) {
                                        System.out.println((BLUE + (i + 1)) + ". " + GREEN + zonasProvincia2.get(i)
                                                        + RESET);
                                }

                                int zonaSiguiente = (user.nextInt() - 1);

                                String[] zonasArray = userCar.spriteZonas(provinciaId, zonaId, zonaSiguiente, vehiculo);
                                String zonaAnterior = zonasArray[0];
                                String zonaPosterior = zonasArray[1];
                                System.out.println(
                                                RED + zonaAnterior + "\n" + CYAN + userCar.spriteVehiculos(vehiculo - 1)
                                                                + "\n\n" + YELLOW + zonaPosterior + RESET);
                                break;
                        }

                        // CONDICIONAL PARA MOSTRAR EN PANTALLA EL METODO DESCRIBIR() DE ACUERDO AL
                        // VEHICULO INGRESADO POR USUARIO
                        else {
                                switch (vehiculo) {
                                        case 1:
                                                System.out.println(YELLOW + "------- C O C H E ------- ");
                                                userCar.describir();
                                                System.out.println(GREEN + "Se encuentra en la provincia de " + CYAN
                                                                + provincias.get(provinciaId - 1) + GREEN
                                                                + " y en la zona de " + PURPLE
                                                                + zonas.get(provinciaId - 1).get(zonaId - 1) + RESET);
                                                break;

                                        case 2:
                                                System.out.println(YELLOW + "------- B I C I C L E T A -------");
                                                userBike.describir();
                                                System.out.println(GREEN + "Se encuentra en la provincia de " + CYAN
                                                                + provincias.get(provinciaId - 1) + GREEN
                                                                + " y en la zona de " + PURPLE
                                                                + zonas.get(provinciaId - 1).get(zonaId - 1) + RESET);
                                                break;

                                        case 3:
                                                System.out.println(YELLOW + "------- B A R C O -------");
                                                userShip.describir();
                                                System.out.println(GREEN + "Se encuentra en la provincia de " + CYAN
                                                                + provincias.get(provinciaId - 1) + GREEN
                                                                + " y en la zona de " + PURPLE
                                                                + zonas.get(provinciaId - 1).get(zonaId - 1) + RESET);
                                                break;

                                        case 4:
                                                System.out.println(YELLOW + "------- A V I O N -------");
                                                userPlane.describir();
                                                System.out.println(GREEN + "Se encuentra en la provincia de " + CYAN
                                                                + provincias.get(provinciaId - 1) + GREEN
                                                                + " y en la zona de " + PURPLE
                                                                + zonas.get(provinciaId - 1).get(zonaId - 1) + RESET);
                                                break;
                                }
                                exit = false;
                        }
                } while (exit);

                // Volver a Menu
                Menu menuBack = new Menu(Menu.title);
                menuBack.runMenu();
                user.close();
        }

}
