package EJERCICIO04;
//Ejercicio 04
import javax.swing.JOptionPane;

public class Validador {

	public static void main(String[] args) {
		boolean salir = false;

		while (!salir) {
			String[] opciones = { "Validacio numero entero", "Validacion de numero decimal", "Validacion por rango del 1 al 10",
					"Fahrenheit->Celsius", "Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Validacion :", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 1:

				try {
					String inputEntero = JOptionPane.showInputDialog("Ingrese un número entero:");
					if (Validacion.esNumeroEntero(inputEntero)) {
						JOptionPane.showMessageDialog(null, "Es un número entero válido.");
					} else {
						JOptionPane.showMessageDialog(null, "No es un número entero válido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 2:
				try {
					String inputDecimal = JOptionPane.showInputDialog("Ingrese un número decimal:");
					if (Validacion.esNumeroDecimal(inputDecimal)) {
						JOptionPane.showMessageDialog(null, "Es un número decimal válido.");
					} else {
						JOptionPane.showMessageDialog(null, "No es un número decimal válido.");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
				}
				break;
			case 3:
				try {
					String inputNumero = JOptionPane.showInputDialog("Ingrese un número:");
					if (Validacion.esNumeroDecimal(inputNumero)) {
						double numero = Double.parseDouble(inputNumero);
						if (Validacion.estaEnRango(numero, 1.0, 10.0)) {
							JOptionPane.showMessageDialog(null, "El número está en el rango de 1.0 a 10.0.");
						} else {
							JOptionPane.showMessageDialog(null, "El número no está en el rango de 1.0 a 10.0.");
						}
					} else {
						JOptionPane.showMessageDialog(null,
								"Ingrese un número decimal válido para la verificación del rango.");
					}
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
class Validacion{
	 public static boolean esNumeroEntero(String cadena) {
	        try {
	            Integer.parseInt(cadena);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	    public static boolean esNumeroDecimal(String cadena) {
	        try {
	            Double.parseDouble(cadena);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	    public static boolean estaEnRango(double numero, double rangoInicio, double rangoFin) {
	        return numero >= rangoInicio && numero <= rangoFin;
	    }
}
