package Ejercicio8;

public class Factura implements Imprimible {

	private int nFactura;
	private int codigoCliente;
	
	public Factura(int nFactura, int codigoCliente) {
		this.nFactura = nFactura;
		this.codigoCliente = codigoCliente;
	}

	@Override
    public void informeLargo() {
        System.out.println("Informe largo de Factura: Numero de Facturas = " + nFactura + ", Codigo Cliente = " + codigoCliente);
    }

    @Override
    public void informeCorto() {
        System.out.println("Informe corto de Factura: Numero de Facturas = " + nFactura);
    }

}
