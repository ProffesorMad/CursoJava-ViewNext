package Ejercicio8;

public class GestionDeImpresion {
	
	public static void main(String[] args) {
        
		// Instanciar un objeto de cada clase
		
        Pagina pagina = new Pagina(3, 27);
        Factura factura = new Factura(1453, 6003058);

        // Llamar a los métodos de informeLargo e informeCorto para cada objeto
        
        System.out.println("\n");
        pagina.informeLargo();
        pagina.informeCorto();
        System.out.println("\n");
        factura.informeLargo();
        factura.informeCorto();
    }
}
