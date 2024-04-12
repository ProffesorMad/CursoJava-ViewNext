package Ejercicio7;

public class GuitarraElectrica extends Guitarra {
	
    private int potencia;
    
    public GuitarraElectrica(String nombre, String tipo, int numCuerdas, int potencia) {
        super(nombre, tipo, numCuerdas);
        this.potencia = potencia;
    }
    
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra eléctrica");
    }

	public int getPotencia() {
		return potencia;
	}
}
