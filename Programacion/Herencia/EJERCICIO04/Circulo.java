package EJERCICIO04;

public class Circulo extends Figura {

 double radio;

Circulo(double radio) {
    this.radio = radio;
}

double calcularArea() {
    return Math.PI * radio * radio;
}
}
