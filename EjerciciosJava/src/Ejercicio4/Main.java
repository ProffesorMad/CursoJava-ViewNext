package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        
    	// Crear objetos Libro con constructor
        Libro libro1 = new Libro("978-84-376-0494-7", "Cien años de soledad", "Gabriel García Márquez", 432);
        Libro libro2 = new Libro("978-03-074-7472-8", "1984", "George Orwell", 328);

        // Mostrar detalles de los libros por pantalla
        System.out.println("Primer libro:");
        System.out.println(libro1.toString());

        System.out.println("\nSegundo libro:");
        System.out.println(libro2.toString());

        // Determinar cuál de los dos tiene más páginas
        if (libro1.getPaginas() > libro2.getPaginas()) {
            System.out.println("\nEl primer libro tiene más páginas.");
        } else if (libro1.getPaginas() < libro2.getPaginas()) {
            System.out.println("\nEl segundo libro tiene más páginas.");
        } else {
            System.out.println("\nAmbos libros tienen la misma cantidad de páginas.");
        }
    }
}
