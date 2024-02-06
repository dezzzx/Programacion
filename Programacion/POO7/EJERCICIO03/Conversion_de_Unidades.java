package EJERCICIO03;

import javax.swing.JOptionPane;


public class Conversion_de_Unidades {

	public static void main(String[] args) {
		boolean salir = false;
		Conversion conversor = new Conversion();
		double numero1;
		while (!salir) {
			String[] opciones = { "Kilometros->MIllas", "Millas->Kilometros", "Celsius->Fahrenheit", "Fahrenheit->Celsius","Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Conversor :", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0: // Kilometros->MIllas //
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					conversor.KmMillas(numero1);
					JOptionPane.showMessageDialog(null, "El resultado es "+conversor.dime_Millas()+" millas");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 1: // Millas->Kilometros
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					conversor.MillasKm(numero1);
					JOptionPane.showMessageDialog(null, "El resultado es "+conversor.dime_Km()+" Km");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 2: //Celsius->Fahrenheit
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					conversor.CelsiusFahrenheit(numero1);
					JOptionPane.showMessageDialog(null, "El resultado es "+conversor.dime_Fahrenheit()+"Fª");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 3: //Fahrenheit->Celsius
				try {
					numero1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un numero"));
					conversor.FarenheitCelius(numero1);
					JOptionPane.showMessageDialog(null, "El resultado es "+conversor.dime_Celsius()+"Cª");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 4:
				salir = true;
				break;
			default:
				break;
			}
		}

	}

}
class Conversion{
	private final double conversor;
	private double Fahrenheit;
	public double Celsius;
	private double Km;
	private double Millas;
	
	public Conversion() {
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
	public Double dime_Fahrenheit() {
		return Fahrenheit;
	}
	public void KmMillas(Double km) {
		double kilometros;
		kilometros=km/1.609344;
		Double Redondeado = Math.round(kilometros * 100.0) / 100.0;
		this.Millas=Redondeado;
	}
	public Double dime_Millas() {
		return Millas;
	}
	public void MillasKm(Double Milla) {
		double Millas;
		Millas=Milla/1.609344;
		Double Redondeado = Math.round(Millas * 100.0) / 100.0;
		this.Km=Redondeado;
	}
	public Double dime_Km() {
		return Km;
	}
}
