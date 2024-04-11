package Ejercicio8;

public class Pagina implements Imprimible {

	private int nPagina;
	private int nLineas;
	
	public Pagina(int nPagina, int nLineas) {
		this.nPagina = nPagina;
		this.nLineas = nLineas;
	}

	@Override
	public void informeLargo() {
		System.out.println("Informe largo de Página: Numeros de Paginas = " + nPagina + ", Numero de Lineas = " + nLineas);
    }
		
	@Override
	public void informeCorto() {
		System.out.println("Informe corto de Página: Numeros de Paginas = " + nPagina);
	}

}
