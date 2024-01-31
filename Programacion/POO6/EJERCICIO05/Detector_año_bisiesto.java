package EJERCICIO05;

import javax.swing.JOptionPane;

public class Detector_año_bisiesto {

	public static void main(String[] args) {
		boolean salir = false;
		int numero;

		while (!salir) {
			String[] opciones = { "Comprobar", "Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Detector de año bisisesto y no bisiesto",
					"Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0:
				try {
					numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un año"));
					if (numero >= 0) {
						Detector detector = new Detector(numero);
						
						JOptionPane.showMessageDialog(null,
								"El año  " + numero + " " + detector.dime_detector() + ".");
					} else {
						JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 1:
				salir = true;
				break;
			default:
				break;
			}
		}

	}

}

class Detector {
	private final int año;
	private String QueEs;

	public Detector(int año) {
		this.año = año;
	}

	public String dime_detector() {
		if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0) {
			QueEs = "es bisisiesto";
		} else {
			QueEs = "no es bisisiesto";
		}
		return QueEs;
	}
}
