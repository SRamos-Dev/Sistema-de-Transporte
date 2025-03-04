package Interacciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Transporte.*;

public class MenuCustom implements MenuStep1, Robable {

        public MenuCustom() {
        }

        public void runCustom() {

                Scanner user = new Scanner(System.in);
                int vehiculo;
                String nombreVehiculo = "";
                int provinciaId;
                int zonaId;
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
                                "\nSelecciona el tipo de vehiculo que tienes.\n\n" +
                                                "1. Coche\n" +
                                                "2. Bicicleta\n" +
                                                "3. Barco\n" +
                                                "4. Avion\n");
                // DECLARACION VARIABLE VEHICULO FUERA DE CONDICIONAL -> DABA ERROR EN EJECUCION
                // OPCION 2 DEFAULT
                vehiculo = user.nextInt();

                switch (vehiculo) {
                        case 1:
                                // Cambio nombre variables para cada objeto
                                nombreVehiculo = "coche";
                                System.out.println("\nIntroduce los siguientes datos sobre tu coche.\n");
                                System.out.println("\nMarca:\n");
                                String marcaCar = user.next();
                                System.out.println("\nModelo:\n");
                                String modeloCar = user.next();
                                System.out.println("\nMatricula\n");
                                String matriculaCar = user.next();
                                System.out.println("\nVelocidad Maxima:\n");
                                int velocidadMaximaCar = user.nextInt();
                                userCar = new Coche(velocidadMaximaCar, marcaCar, modeloCar, matriculaCar);
                                break;

                        // Adicion caso 2: BICICLETA
                        case 2:
                                nombreVehiculo = "Bicicleta";
                                System.out.println("\nIntroduce los siguientes datos sobre tu bicicleta.\n");
                                System.out.println("\nMarca:\n");
                                String marcaBike = user.next();
                                System.out.println("\nModelo:\n");
                                String modeloBike = user.next();
                                System.out.println("\nVelocidad Maxima:\n");
                                int velocidadMaximaBike = user.nextInt();
                                userBike = new Bicicleta(velocidadMaximaBike, marcaBike, modeloBike);
                                break;

                        // Adicion caso 3: BARCO
                        case 3:
                                nombreVehiculo = "Barco";
                                System.out.println("\nIntroduce los siguientes datos sobre tu barco.\n");
                                System.out.println("\nMarca:\n");
                                String marcaShip = user.next();
                                System.out.println("\nModelo:\n");
                                String modeloShip = user.next();
                                System.out.println("\nMatricula\n");
                                String matriculaShip = user.next();
                                System.out.println("\nVelocidad Maxima:\n");
                                int velocidadMaximaShip = user.nextInt();
                                System.out.println("\nNombre:\n");
                                String nombreShip = user.next();
                                userShip = new Barco(velocidadMaximaShip, marcaShip, modeloShip, matriculaShip,
                                                nombreShip);
                                break;

                        // Adicion caso 4: AVION
                        case 4:
                                nombreVehiculo = "Avion";
                                System.out.println("\nIntroduce los siguientes datos sobre tu avión.\n");
                                System.out.println("\nMarca:\n");
                                String marcaPlane = user.next();
                                System.out.println("\nModelo:\n");
                                String modeloPlane = user.next();
                                System.out.println("\nMatricula\n");
                                String matriculaPlane = user.next();
                                System.out.println("\nVelocidad Maxima:\n");
                                int velocidadMaximaPlane = user.nextInt();
                                userPlane = new Avion(velocidadMaximaPlane, marcaPlane, modeloPlane,
                                                matriculaPlane);
                                break;
                }

                System.out.println(
                                "\nSeleciona la provincia donde esta estacionado el vehiculo.\n\n" +
                                                "1. Alicante\n" +
                                                "2. Barcelona\n" +
                                                "3. Madrid\n" +
                                                "4. Murcia\n" +
                                                "5. Sevilla\n");

                provinciaId = user.nextInt();

                System.out.println("\nSelecciona la zona donde se encuentra.\n\n");

                System.out.println("Zonas de " + provincias.get(provinciaId - 1) + ":");
                ArrayList<String> zonasProvincia = zonas.get(provinciaId - 1);

                for (int i = 0; i < zonasProvincia.size(); i++) {
                        System.out.println((i + 1) + ". " + zonasProvincia.get(i));
                }

                zonaId = (user.nextInt() - 1);

                System.out.println(
                                "\nQue deseas hacer con tu " + nombreVehiculo + "?:\n\n" +
                                                "1. Encender motor\n" +
                                                "2. Desplazarlo a otra zona\n" +
                                                "3. Recibir una descripcion de este\n");

                int operacionVehiculo = user.nextInt();
                if (operacionVehiculo == 1) {
                        boolean arrancarMotor = menu.robarMotor(provinciaId, zonaId);
                        System.out.println(arrancarMotor ? "\nEnhorabuena el motor esta arrancado\n"
                                        : "\nVAYA!, parece que te han hecho el truco rumano.\n" +
                                                        "unos ladrones de " + provincias.get(provinciaId - 1)
                                                        + " te han robado el motor.\n" +
                                                        "Lo siento...");
                }
                // ADICION OPCION 2 SUBMENU CUSTOMIZABLE
                else if (operacionVehiculo == 2) {
                        System.out.println("\nSelecciona la zona donde se encuentra.\n\n");

                        System.out.println("Zonas de " + provincias.get(provinciaId - 1) + ":");
                        ArrayList<String> zonasProvincia2 = zonas.get(provinciaId - 1);

                        for (int i = 0; i < zonasProvincia2.size(); i++) {
                                System.out.println((i + 1) + ". " + zonasProvincia2.get(i));
                        }

                        zonaId = (user.nextInt() - 1);
                }

                // CONDICIONAL PARA MOSTRAR EN PANTALLA EL METODO DESCRIBIR() DE ACUERDO AL
                // VEHICULO INGRESADO POR USUARIO
                else {
                        switch (vehiculo) {
                                case 1:
                                        System.out.println("------- C O C H E ------- ");
                                        userCar.describir();
                                        System.out.println("Se encuentra en la provincia de "
                                                        + provincias.get(provinciaId - 1) + " y en la zona de "
                                                        + zonas.get(provinciaId - 1).get(zonaId));
                                        break;

                                case 2:
                                        System.out.println("------- B I C I C L E T A -------");
                                        userBike.describir();
                                        System.out.println("Se encuentra en la provincia de "
                                                        + provincias.get(provinciaId - 1) + " y en la zona de "
                                                        + zonas.get(provinciaId - 1).get(zonaId));
                                        break;

                                case 3:
                                        System.out.println("------- B A R C O -------");
                                        userShip.describir();
                                        System.out.println("Se encuentra en la provincia de "
                                                        + provincias.get(provinciaId - 1) + " y en la zona de "
                                                        + zonas.get(provinciaId - 1).get(zonaId));
                                        break;

                                case 4:
                                        System.out.println("------- A V I O N -------");
                                        userPlane.describir();
                                        System.out.println("Se encuentra en la provincia de "
                                                        + provincias.get(provinciaId - 1) + " y en la zona de "
                                                        + zonas.get(provinciaId - 1).get(zonaId));
                                        break;
                        }
                }
                // user.close();
                // Volver a Menu
                Menu menuBack = new Menu(Menu.title);
                menuBack.runMenu();
                user.close();

        }

}
