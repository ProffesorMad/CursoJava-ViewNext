package Ejercicio9.com;

public class Araña extends Animal {
	
    public Araña() {
        super(8);
    }

    @Override
    public void comer() {
        System.out.println("Las arañas comen mosquitos.");
    }
}
