package EJERCICIO04;

import javax.swing.JOptionPane;


public class Inventario {
	private String[] nombre;
	private int[] cantidad;
	private double[] precio;
	private int contador;
	public Inventario() {
		nombre = new String[10];
		cantidad = new int[10];
		precio = new double[10];
		contador=0;
	}
	public void dame_nombre(String nombre) {
		this.nombre[contador] = nombre;
	}
	public void dame_cantidad(int cantidad) {
		this.cantidad[contador]= cantidad;
	}
	public void dame_precio(double precio) {
		this.precio[contador]=precio;
		contador++;
	}
	public String dime_nombre() {
		return nombre[contador - 1];
	}
	public int dime_cantidad() {
		return cantidad[contador - 1];
	}
	public double dime_precio() {
		return precio[contador - 1];
	}
	public static int eliminarproducto(Inventario[] prodcutos, int indice, int contador) {

		for (int i = indice - 1; i < contador - 1; i++) {
			prodcutos[i] = prodcutos[i + 1];
		}

		prodcutos[contador - 1] = null;
		contador--;
		return contador;
	}
	public static void mostrarLista(Inventario[] productos) {
		StringBuilder Lista= new StringBuilder("Lista de prodctos\n");
        
        
        for (int i = 0; i < productos.length; i++) {
        	if(productos[i] != null) {
        		Lista.append((i+1)+"\n Nombre : ").append(productos[i].dime_nombre())
                .append("\n Cantidad: ").append(productos[i].dime_cantidad())
                .append("\n Precio (en euros): ").append(productos[i].dime_precio())
                .append("\n----------------------\n");
        } }
        JOptionPane.showMessageDialog(null, Lista.toString(), "Lista de procdutos", JOptionPane.INFORMATION_MESSAGE);
	}
}
