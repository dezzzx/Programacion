package EJERCICIO02;

import javax.swing.JOptionPane;

public class CalculadoraSimple {

	public static void main(String[] args) {
		boolean salir = false;
		Calculadora calcular = new Calculadora();
		double numero1;
		double numero2;
		while (!salir) {
			String[] opciones = { "Suma", "Resta", "Division", "Multiplicacion", "Raiz Cuadrada", "Raiz Cubica",
					"Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Calculadora :", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0: // Suma
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro numero"));
					calcular.suma(numero2, numero2);
					JOptionPane.showMessageDialog(null, "El resultado es "+calcular.dime_resultado());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 1: // Resta
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro numero"));
					calcular.resta(numero2, numero2);
					JOptionPane.showMessageDialog(null, "El resultado es "+calcular.dime_resultado());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 2: // Division
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro numero"));
					calcular.division(numero1, numero2);
					JOptionPane.showMessageDialog(null, "El resultado es "+calcular.dime_resultado()+" y su resto es "+calcular.dime_resto());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 3: // Multiplicacion
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					numero2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce otro numero"));
					calcular.multiplicacion(numero1, numero2);
					JOptionPane.showMessageDialog(null, "El resultado es "+calcular.dime_resultado());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 4: // Raiz Cuadrada
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					calcular.Raiz(numero1);
					JOptionPane.showMessageDialog(null, "El resultado es "+calcular.dime_resultado());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 5: // Raiz Cubica
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					calcular.Raiz3(numero1);
					JOptionPane.showMessageDialog(null, "El resultado es "+calcular.dime_resultado());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 6:
				salir = true;
				break;
			default:
				break;
			}
		}

	}

}

class Calculadora {
	private double resultado;
	private double resto;

	public void suma(double numero1, double numero2) {
		Double suma = numero1 + numero2;
		Double Redondeado = Math.round(suma * 100.0) / 100.0;
		this.resultado = Redondeado;
	}
	public void resta(double numero1, double numero2) {
		Double resta = numero1 + numero2;
		Double Redondeado = Math.round(resta * 100.0) / 100.0;
		this.resultado = Redondeado;
	}
	public void multiplicacion(double numero1, double numero2) {
		Double multiplicacion = numero1 * numero2;
		Double Redondeado = Math.round(multiplicacion * 100.0) / 100.0;
		this.resultado = Redondeado;
	}
	public void division(double numero1, double numero2) {
		Double division = numero1 / numero2;
		Double resto= numero1 % numero2;
		Double Redondeado1 = Math.round(division* 100.0) / 100.0;
		Double Redondeado2 = Math.round(resto* 100.0) / 100.0;
		this.resultado = Redondeado1;
		this.resto=Redondeado2;
	}
	public void Raiz(double numero) {
		Double Raiz = Math.sqrt(numero);
		Double Redondeado = Math.round(Raiz* 100.0) / 100.0;
		this.resultado = Redondeado;
	}
	public void Raiz3(double numero) {
		Double Raiz = Math.cbrt(numero);
		Double Redondeado = Math.round(Raiz* 100.0) / 100.0;
		this.resultado = Redondeado;
	}
	public double dime_resultado() {
		return resultado;
	}
	public double dime_resto() {
		return resto;
	}
	
}