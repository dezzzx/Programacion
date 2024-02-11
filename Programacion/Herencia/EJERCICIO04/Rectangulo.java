package EJERCICIO04;

public class Rectangulo extends Figura {
	double base;
    double altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    double calcularArea() {
        return base * altura;
    }
}
