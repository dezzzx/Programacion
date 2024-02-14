package Ejercicio01;

public class Circulo extends Figura{
	 private double radio;
	    private final double PI = 3.14159;
	    
	    public Circulo(double radio) {
	        this.radio = radio;
	    }
	    
	    public double calcularArea() {
	        return PI * radio * radio;
	    }

}
