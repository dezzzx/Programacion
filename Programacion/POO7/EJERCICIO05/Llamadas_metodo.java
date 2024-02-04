package EJERCICIO05;

import javax.swing.JOptionPane;

public class Llamadas_metodo {

	public static void main(String[] args) {
		Contador contador = new Contador();

		for (int i = 0; i < 5; i++) {
            contador.realizarOperacion();
        }

        JOptionPane.showMessageDialog(null, "El método ha sido llamado " + contador.obtenerContadorLlamadas() + " veces.");

	}



}
class Contador{
	private static int contadorLlamadas = 0;

    public static void realizarOperacion() {
        contadorLlamadas++;
        System.out.println("Realizando la operación...");
    }

    public static int obtenerContadorLlamadas() {
        return contadorLlamadas;
    }
}
