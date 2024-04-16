package Ejercicio09.com;

public class Main {
	
    public static void main(String[] args) {
        Araña araña = new Araña();
        araña.andar();
        araña.comer();

        Gato gato = new Gato();
        gato.setNombre("Alex");
        gato.andar();
        gato.comer();
        gato.jugar();

        Pez pez = new Pez();
        pez.andar();
        pez.comer();
        pez.jugar();
    }
}