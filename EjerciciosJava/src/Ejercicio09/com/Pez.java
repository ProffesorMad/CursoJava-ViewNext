package Ejercicio09.com;

public class Pez extends Animal {
	
    public Pez() {
        super(0);
    }

    @Override
    public void comer() {
        System.out.println("Los peces comen placton.");
    }

    @Override
    public void andar() {
        System.out.println("En realidad no ando, nado.");
    }

    public void jugar() {
        System.out.println("Estoy nadando");
    }
}
