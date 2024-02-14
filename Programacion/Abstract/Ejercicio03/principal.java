package Ejercicio03;

public class principal {
	public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        
        perro.Sonido();
        perro.mover();
        
        gato.Sonido();
        gato.mover();
    }
}
