package Ejercicio6;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado
    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
    }

    // Constructor con la capacidad máxima de la cafetera
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
    }

    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

    // Getter para la capacidad máxima
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    // Setter para la capacidad máxima
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    // Getter para la cantidad actual
    public int getCantidadActual() {
        return cantidadActual;
    }

    // Setter para la cantidad actual
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // Método para llenar la cafetera
    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;
        System.out.println("La cafetera ha sido llenada");
    }

    // Método para servir una taza con la capacidad indicada
    public void servirTaza(int capacidadTaza) {
        if (cantidadActual >= capacidadTaza) {
            cantidadActual -= capacidadTaza;
            System.out.println("Se ha servido una taza de café");
        } else {
            System.out.println("No hay suficiente café");
            vaciarCafetera();
        }
    }

    // Método para vaciar la cafetera
    public void vaciarCafetera() {
        cantidadActual = 0;
        System.out.println("La cafetera ha sido vaciada");
    }

    // Método para agregar café a la cafetera
    public void agregarCafe(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
            System.out.println("Se puso café en la máquina");
        } else {
            System.out.println("No se puede agregar más cafe");
        }
    }
}

