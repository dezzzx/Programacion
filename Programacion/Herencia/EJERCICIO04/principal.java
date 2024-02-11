package EJERCICIO04;

public class principal {

	public static void main(String[] args) {
		Figura[] figuras = new Figura[2];
        figuras[0] = new Circulo(3);
        figuras[1] = new Rectangulo(4, 5);

        for (Figura figura : figuras) {
            System.out.println("Área: " + figura.calcularArea());
        }
    }
	}


