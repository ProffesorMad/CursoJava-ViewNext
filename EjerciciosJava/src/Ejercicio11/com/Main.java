package Ejercicio11.com;

public class Main {
	
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        // Asignar objetos de las clases Lavadora y Television en posiciones del array
        
        electrodomesticos[0] = new Lavadora(200, 50);
        electrodomesticos[1] = new Television(40, true, 500, "negro", 'A', 30);
        electrodomesticos[2] = new Lavadora(300, 40);
        electrodomesticos[3] = new Television(50, false, 600, "blanco", 'B', 50);
        electrodomesticos[4] = new Electrodomestico(150, "rojo", 'C', 25);
        electrodomesticos[5] = new Lavadora(250, 35);
        electrodomesticos[6] = new Television(55, true, 800, "azul", 'D', 60);
        electrodomesticos[7] = new Lavadora(400, 45);
        electrodomesticos[8] = new Television(30, false, 700, "gris", 'E', 40);
        electrodomesticos[9] = new Electrodomestico(200, "negro", 'F', 20);

        // Variables para almacenar precios
        
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisiones = 0;

        // Recorrer el array y ejecutar el método precioFinal() de cada objeto
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Television) {
                precioTotalTelevisiones += electrodomestico.precioFinal();
            }
            precioTotalElectrodomesticos += electrodomestico.precioFinal();
        }

        // Mostrar los precios totales
        
        System.out.println("Precio total de electrodomesticos: " + precioTotalElectrodomesticos + " €");
        System.out.println("Precio total de lavadoras: " + precioTotalLavadoras + " €");
        System.out.println("Precio total de televisiones: " + precioTotalTelevisiones + " €");
    }
}
