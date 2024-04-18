package Prueba.com;

abstract class Vehiculo {
	
    // Propiedades inmutables
	
    private final String matricula;
    

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    // Getters para la matrícula
    
    public String getMatricula() {
        return matricula;
    }
}
