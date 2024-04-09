package Ejercicio1;

public class Partido {

	private String equipoL;
	private String equipoV;
	private int golesL;
	private int golesV; 
	
	public Partido(String equipoL, String equipoV, int golesL, int golesV) {
		this.equipoL = equipoL;
		this.equipoV = equipoV;
		this.golesL = golesL;
		this.golesV = golesV;
	}	
	
	@Override
    public String toString() {
        return equipoL + " " + golesL + " - " + golesV + " " + equipoV;
    }

	public String getEquipoL() {
		return equipoL;
	}
	
	public String getEquipoV() {
		return equipoV;
	}
	
	public int golesL() {
		return golesL;
	}
	
	public int golesV() {
		return golesV;
	}
	
	
	
}
