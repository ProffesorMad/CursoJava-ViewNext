package Prueba.com;

abstract class Vehiculo {
	
    protected final String matricula;
    protected final int numeroRuedas;

    public Vehiculo(String matricula, int numeroRuedas) {
        this.matricula = matricula;
        this.numeroRuedas = numeroRuedas;
    }

    // Getter
    
    public String getMatricula() {
        return matricula;
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }
}
