public class App {
    public static void main(String[] args) {

        // Constructor vacío
        Vuelo vuelo1 = new Vuelo();
        vuelo1.mostrarInfo();

        // Constructor de ruta
        Vuelo vuelo2 = new Vuelo("AV205", "Bogotá", "Medellín");
        vuelo2.mostrarInfo();

        // Constructor completo
        Vuelo vuelo3 = new Vuelo("LA890", "Cali", "Miami", 120, 180);
        vuelo3.mostrarInfo();

        // Pruebas de embarcar/desembarcar sobre el vuelo completo
        vuelo3.embarcar();
        vuelo3.embarcar();
        vuelo3.mostrarInfo();

        vuelo3.desembarcar();
        vuelo3.mostrarInfo();
    }
}
