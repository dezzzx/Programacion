package Ejercicio01;

public class Rectangulo extends Figura {
	private double base;
    private double altura;
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double calcularArea() {
        return base * altura;
    }
}

