package Transporte;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface representing Sprites for different vehicles and zones.
 */
public interface Sprites {
    
    /**
     * Returns the sprite representation of a vehicle based on the given vehicle index.
     *
     * @param vehiculo the index of the vehicle
     * @return the sprite representation of the vehicle
     */
    public default String spriteVehiculos(int vehiculo){
        ArrayList<String> spritesVehiculo = new ArrayList<>(List.of(
            // Coche 
            "                   ___..............._\r\n" + //
            "             __.. ' _'.\"\"\"\"\"\"\\\\\"\"\"\"\"\"\"\"- .`-._\r\n" + //
            " ______.-'         (_) |      \\\\           ` \\\\`-. _\r\n" + //
            "/_       --------------'-------\\\\---....______\\\\__`.`  -..___\r\n" + //
            "| T      _.----._           Xxx|x...           |          _.._`--. _\r\n" + //
            "| |    .' ..--.. `.         XXX|XXXXXXXXXxx==  |       .'.---..`.     -._\r\n" + //
            "\\_j   /  /  __  \\  \\        XXX|XXXXXXXXXXX==  |      / /  __  \\ \\        `-.\r\n" + //
            " _|  |  |  /  \\  |  |       XXX|\"\"'            |     / |  /  \\  | |          |\r\n" + //
            "|__\\_j  |  \\__/  |  L__________|_______________|_____j |  \\__/  | L__________J\r\n" + //
            "     `'\\ \\      / ./__________________________________\\ \\      / /___________\\\r\n" + //
            "        `.`----'.'   dp                                `.`----'.'\r\n" + //
            "          `\"\"\"\"'                                         `\"\"\"\"'",
            // Bicicleta
            "   ,\r\n" + //
            ".-/c-.,__\r\n" + //
            "(_)'==(_)",
            // Barco
            "         __/___            \r\n" + //
            "          _____/______|           \r\n" + //
            "  _______/_____\\_______\\_____     \r\n" + //
            "  \\              < < <       |    \r\n" + //
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
            // Avion   
            "           ______\r\n" + //
            "            _\\ _~-\\___\r\n" + //
            "    =  = ==(____AA____D\r\n" + //
            "                \\_____\\___________________,-~~~~~~~`-.._\r\n" + //
            "                /     o O o o o o O O o o o o o o O o  |\\_\r\n" + //
            "                `~-.__        ___..----..                  )\r\n" + //
            "                      `---~~\\___________/------------`````\r\n" + //
            "                      =  ===(_________D"
        ));
        return spritesVehiculo.get(vehiculo);
    }
    
    /**
     * Returns the sprite representations of the current and next zones based on the given province and zone indices.
     *
     * @param provinciaId the index of the province
     * @param zonaId the index of the current zone
     * @param zonaSiguiente the index of the next zone
     * @return an array containing the sprite representations of the current and next zones
     */
    public default String[] spriteZonas(int provinciaId, int zonaId, int zonaSiguiente, int vehiculo){

        ArrayList<ArrayList<String>> zonas = new ArrayList<>();
        zonas.add(new ArrayList<>(
            List.of("Albufereta", "Cabo de las Huertas", "San Blas-Estacion", "Virgen del Remedio", "Juan XXIII"))); // Alicante
        zonas.add(new ArrayList<>(List.of("Sarria", "Pedralbes", "Eixample", "El Raval", "La Mina")));
        zonas.add(new ArrayList<>(List.of("Salamanca", "Chamberi", "Retiro", "Usera", "Vallecas")));
        zonas.add(new ArrayList<>(List.of("La Flota", "Monteagudo", "San Andres", "El Carmen", "Lo Campano")));
        zonas.add(new ArrayList<>(
            List.of("Nervion", "Triana", "Los Remedios", "Cerro del Aguila", "Las Tres Mil Viviendas")));
        ArrayList<String> zonasProvincia = zonas.get(provinciaId-1);
        ArrayList<String> zonasProvincia2 = zonas.get(provinciaId-1);                                
        ArrayList<String> spritesZonaActual = new ArrayList<>(List.of(

            // Coche
            " ____________________________________________\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "                                              \n"+
            "          "+zonasProvincia.get(zonaId-1)+"          \n"+
            "                                              \n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|____________________________________________|\n",

            // Bicicleta
            " ____________________________________________\n"+
            "           "+zonasProvincia.get(zonaId-1)+"       \n"+
            "|____________________________________________|\n",

            // Barco
            " ___________________________________________\n"+
            "|                                           |\n"+
            "           "+zonasProvincia.get(zonaId-1)+"        \n"+
            "                                             \n"+
            "|___________________________________________|\n",

            // Avion
            " ___________________________________________\n"+
            "|                                           |\n"+
            "|                                           |\n"+
            "|                                           |\n"+
            "                                             \n"+
            "           "+zonasProvincia.get(zonaId-1)+"         \n"+
            "                                             \n"+
            "|                                           |\n"+
            "|___________________________________________|\n"
        ));

        ArrayList<String> spritesZonaSiguiente = new ArrayList<>(List.of(

            // Coche
            " ____________________________________________\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "                                              \n"+
            "          "+zonasProvincia2.get(zonaSiguiente)+" \n"+
            "                                              \n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|                                            |\n"+
            "|____________________________________________|\n",

            // Bicicleta
            " ____________________________________________\n"+
            "           "+zonasProvincia2.get(zonaSiguiente)+"       \n"+
            "|____________________________________________|\n",

            // Barco
            " ___________________________________________\n"+
            "|                                           |\n"+
            "           "+zonasProvincia2.get(zonaSiguiente)+"        \n"+
            "                                             \n"+
            "|___________________________________________|\n",

            // Avion
            " ___________________________________________\n"+
            "|                                           |\n"+
            "|                                           |\n"+
            "|                                           |\n"+
            "                                             \n"+
            "           "+zonasProvincia2.get(zonaSiguiente)+"         \n"+
            "                                             \n"+
            "|                                           |\n"+
            "|___________________________________________|\n"
        ));
        String[] spritesUbicacion = {spritesZonaActual.get(vehiculo-1), spritesZonaSiguiente.get(vehiculo-1)};
        return spritesUbicacion ;
    }
}
