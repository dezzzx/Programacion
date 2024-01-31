package EJERCICIO01;




import javax.swing.JOptionPane;


public class Calculadora_Impuestos {

	public static void main(String[] args) {
		
		boolean salir = false;
		int cantidad = 10;
		int cantidad1 =10;
		Calculadora[] Productos = new Calculadora[cantidad];
		int contador = 0;
		while (!salir) {
			String[] opciones = { "Añadir Producto ( " + cantidad1 + " )", "Lista de Producto", "Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Selecciona una opción:", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0:
				try {
				if (contador < cantidad) {
					Productos[contador] = new Calculadora();
					Productos[contador].dame_nombre(JOptionPane.showInputDialog("Nombre:"));
					Productos[contador].dame_precio(Double.parseDouble(JOptionPane.showInputDialog("¿Cual es  precio sin impuestos ?")));
					contador++;
					cantidad1--;
				} else {
					JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos empleados.", null,
							JOptionPane.ERROR_MESSAGE);
				}
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
			}
				break;
			case 1:
					Calculadora.mostrarLista(Productos);
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

class Calculadora{
	private final String [] nombre;
	private final double impuesto;
	private double [] precio;
	private int contador;
	public Calculadora(){
		contador = 0;
		nombre = new String [10];
		this.impuesto = 1.15;
		precio = new double [10];
		
		
	}
	public void dame_nombre(String nombre) {
		this.nombre[contador]=nombre;
	}
	public void dame_precio(double precio) {
		precio= impuesto*precio;
		Double precioRedondeado = Math.round(precio * 100.0) / 100.0;
        this.precio[contador] = precioRedondeado;
        contador++;
	}
	public String dime_nombre(){
		return nombre[contador-1];
	}
	
	 public double dime_precio() {
	        return precio[contador-1];
	    }

	public static void mostrarLista(Calculadora[] Productos) {
		StringBuilder Lista = new StringBuilder("Lista de productos:\n");
		for (int i = 0; i < Productos.length; i++) {
        	if(Productos[i] != null) {
        		Lista.append((i+1)+"\n Nombre : ").append(Productos[i].dime_nombre())
                .append("\n Precio (Con impuestos): ").append(Productos[i].dime_precio())
                .append("\n----------------------\n");
        } }
		JOptionPane.showMessageDialog(null, Lista.toString(), "Contactos ingresados", JOptionPane.INFORMATION_MESSAGE);
	}
}
