package Ejercicio7;

public class GuitarraElectrica extends Guitarra{

	protected int potencia;
	
	public GuitarraElectrica(String nombre, String tipo, int numeroCuerdas) {
		super(nombre, tipo, numeroCuerdas);
		// TODO Auto-generated constructor stub
	}
	
	public GuitarraElectrica(String nombre, String tipo, int numeroCuerdas, int potencia) {
		super(nombre, tipo, numeroCuerdas);
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "GuitarraElectrica --> Potencia = " + potencia + "  Numero de Cuerdas = " + numeroCuerdas + "  Nombre = " + nombre
				+ "  Tipo=" + tipo ;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando la guitarra eléctrica.");
	}

}