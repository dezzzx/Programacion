package EJERCICIO02;

import javax.swing.JOptionPane;

public class Conversor_temperatura {


	public static void main(String[] args) {
		boolean salir = false;
		Conversor conversor =new Conversor();
		double numero;
		while (!salir) {
			String[] opciones = { "Celsius > Fharenheit","Fharenheit > Celsius ", "Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Conversor :", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0:
				try {
					numero=Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Celsius"));
					conversor.CelsiusFahrenheit(numero);
					double Farenheit=conversor.dime_Fharenheit();
					JOptionPane.showMessageDialog(null, "Su valor en Celius es "+Farenheit+" Fº");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 1:
				try {
				numero=Double.parseDouble(JOptionPane.showInputDialog("Introduce la temperatura en Farenheit"));
				conversor.CelsiusFahrenheit(numero);
				double Celsius=conversor.dime_Celsius();
				JOptionPane.showMessageDialog(null, "Su valor en Celius es "+Celsius+" Cº");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 2:
				salir = true;
				break;
			default:
				break;
			}
		}

	}

}
class Conversor{
	private final double conversor;
	private double Fahrenheit;
	public double Celsius;
	
	public Conversor() {
		this.conversor=1.8;
	}
	public void FarenheitCelius(Double Fahrenheit) {
		Fahrenheit= (Fahrenheit-32)*conversor;
		Double TemperaturaRedondeado = Math.round(Fahrenheit * 100.0) / 100.0;
        this.Celsius =TemperaturaRedondeado;
	}
	public Double dime_Celsius() {
		return Celsius;
	}
	public  void CelsiusFahrenheit(Double Celsius) {
		//Fahrenhait=(grados centígrados × 9/5) +32
		Celsius=(Celsius*conversor)+32;
		Double TemperaturaRedondeado = Math.round(Celsius * 100.0) / 100.0;
        this.Fahrenheit =TemperaturaRedondeado;
		
	}
	public Double dime_Fharenheit() {
		return Fahrenheit;
	}
}
