package Ejercicio03;

public class Perro extends Animal {
	@Override
    public void Sonido() {
        System.out.println("GUAU GUAU");
    }

    public void mover(){
        System.out.println("El perro se mueve ");
    }
}
