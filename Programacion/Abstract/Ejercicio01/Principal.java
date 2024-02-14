package Ejercicio01;

public class Principal {
	public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Circulo circulo = new Circulo(3);
        
        System.out.println("El área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("El área del círculo: " + circulo.calcularArea());
    }
}
