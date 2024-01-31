package EJERCICIO04;

import javax.swing.JOptionPane;


public class Calculadora_Descuentos {

	public static void main(String[] args) {
		boolean salir = false;
		int numero;
		Descuentos descuento = new Descuentos ();
		while (!salir) {
			String[] opciones = { "¿Cuantas cajas quiere?", "Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Venta de cajas", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0:
				try {
					numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de Cajas que quiere"));
					if(numero>=0) {
					descuento.establecer_descuento(numero);
					JOptionPane.showMessageDialog(null, "En total es "+descuento.dime_precio()+" $ con un descuento ya aplicado del "+descuento.dime_descuento()+" %");
					}else {
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
class Descuentos{
	private double descuentoAplicado;
	private final double descuento;
	private int cantidad;
	private double precio;
	
	public Descuentos () {
		this.descuento = 0.1;
		
	}
	public void establecer_descuento(int cantidadDada) {
		  this.cantidad = cantidadDada;
	        double precioCaja = 4.99;
	        double descuentoCajas = (precioCaja * 5) * descuento;

	        int cantDescCajas = cantidad / 5;
	        double descuentoCajasApl = (4.99 *( 5*cantDescCajas)) - ( descuentoCajas*cantDescCajas);
	        int descDado = (int) ((cantDescCajas * descuento) * 100);
	        this.descuentoAplicado = descDado;

	        if (cantidad >= 5) {
	            int cajasSinDesc = cantidad - (5 * cantDescCajas);
	            double precio = (cajasSinDesc * 4.99) + descuentoCajasApl;
	            Double Redondeado = Math.round(precio * 100.0) / 100.0;
	            this.precio = Redondeado;
	        } else if (cantidad < 5) {
	            double precio = precioCaja * cantidad;
	            this.precio = precio;
	        }
	}

		
	
	public double dime_precio() {
		return precio;
	}
	public double dime_descuento() {
		return descuentoAplicado;
	}
	
	
}






