package Interacciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Transporte.Avion;
import Transporte.Barco;
import Transporte.Bicicleta;
import Transporte.Coche;
import Transporte.Robable;

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

                switch (vehiculo = user.nextInt()) {
                        case 1:
                                nombreVehiculo = "coche";
                                System.out.println("\nIntroduce los siguientes datos sobre tu coche.\n");
                                System.out.println("\nMarca:\n");
                                String marca = user.next();
                                System.out.println("\nModelo:\n");
                                String modelo = user.next();
                                System.out.println("\nMatricula\n");
                                String matricula = user.next();
                                System.out.println("\nVelocidad Maxima:\n");
                                int velocidadMaxima = user.nextInt();
                                Coche vehiculoUsuario = new Coche(velocidadMaxima, marca, modelo, matricula);
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

        }

}