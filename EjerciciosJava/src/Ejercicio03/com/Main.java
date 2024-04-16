package Ejercicio03.com;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos de prueba
        Ordenador ordenador1 = new Ordenador(001, "Lenovo ThinkPad", 799.99, 10, "Intel Core i5", 8, 512);
        Telefono telefono1 = new Telefono(002, "iPhone 13", 999.99, 5, "Apple");

        // Mostrar la información de los productos
        System.out.println("Ordenador:");
        System.out.println(ordenador1);

        System.out.println("\nTeléfono móvil:");
        System.out.println(telefono1);
    }
}
