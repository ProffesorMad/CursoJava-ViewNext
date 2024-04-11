package Ejercicio7;

public class Flauta extends Instrumento {
	
    String modelo;
    
    public Flauta(String nombre, String tipo, String modelo) {
        super(nombre, tipo);
        this.modelo = modelo;
    }
    
    @Override
    public void tocar() {
        super.tocar();
        System.out.println("Soplando");
    }
}
