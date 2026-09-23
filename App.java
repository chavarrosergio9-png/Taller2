public class App {
    public static void main(String[] args) {

        // Constructor vacío
        Libro libro1 = new Libro();
        libro1.mostrarInfo();

        // Constructor con título y autor
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        libro2.mostrarInfo();

        // Constructor completo
        Libro libro3 = new Libro("El principito", "Antoine de Saint-Exupéry", false);
        libro3.mostrarInfo();

        // Prueba extra de prestar/devolver
        libro2.prestar();
        libro2.mostrarInfo();

        libro3.devolver();
        libro3.mostrarInfo();
    }
}
