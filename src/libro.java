public class Libro {

    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor vacío: valores por defecto, disponible = true
    public Libro() {
        this.titulo = "Sin título";
        this.autor = "Autor desconocido";
        this.disponible = true;
    }

    // Constructor con título y autor: queda disponible por defecto
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Constructor completo
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Métodos de comportamiento
    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
        System.out.println("-----------------------------");
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible para prestar.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya estaba disponible.");
        }
    }
}
