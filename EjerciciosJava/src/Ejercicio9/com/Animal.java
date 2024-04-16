package Ejercicio9.com;

public class Animal {
	
    protected int numeroPatas;

    public Animal(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void andar() {
        System.out.println("Este animal anda sobre " + numeroPatas + " patas.");
    }

    public void comer() {
        System.out.println("Este animal come.");
    }
}

