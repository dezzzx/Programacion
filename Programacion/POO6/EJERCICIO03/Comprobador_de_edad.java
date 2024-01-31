package EJERCICIO03;

import javax.swing.JOptionPane;


public class Comprobador_de_edad {

	public static void main(String[] args) {
		boolean salir = false;
		int numero;
		while (!salir) {
			String[] opciones = { "Comprobar", "Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "¿Puede votar?", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0:
				try {
					numero=Integer.parseInt(JOptionPane.showInputDialog("Comprobador de si puede votar"));
					Comprobador comprobador = new Comprobador(numero);
					JOptionPane.showMessageDialog(null, "Usted"+comprobador.verificar()+"puede votar");
				
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
class Comprobador{
	private final int edad;
	public Comprobador(int edad) {
		this.edad=edad;
	}
	public String verificar() {
		String mensaje;
		if(edad>=18) {
			mensaje = " si ";
		}else {
			 mensaje = " no ";
		}
		return mensaje;
		
	}
	
}
