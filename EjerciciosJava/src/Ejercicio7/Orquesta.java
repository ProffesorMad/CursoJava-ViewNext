package Ejercicio7;

public class Orquesta {
	
    private Instrumento[] instrumentos;
    private Tambor tambor;
    
    public Orquesta(Instrumento[] instrumentos, Tambor tambor) {
        this.instrumentos = instrumentos;
        this.tambor = tambor;
    }
    
    public void tocarInstrumentos() {
        for (Instrumento instrumento : instrumentos) {
            if (instrumento instanceof Tambor) {
                ((Tambor) instrumento).aporrear();
            } else {
                instrumento.tocar();
            }
        }
    }

	public Tambor getTambor() {
		return tambor;
	}
}
