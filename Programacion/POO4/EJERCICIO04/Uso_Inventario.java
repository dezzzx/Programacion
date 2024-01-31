package EJERCICIO04;

import javax.swing.JOptionPane;




public class Uso_Inventario {

	
		public static void main(String[] args) {
			boolean salir = false;
			int cantidad=10;
			int contador=0;
			Inventario[] productos = new Inventario[cantidad];
			
			
			
			while(!salir) {
				 String[] opciones = {"Añadir Empleado (max. "+cantidad+" )", "Ver Inventario", "Salir"};
		        int seleccion = JOptionPane.showInternalOptionDialog(null, "Selecciona una opción:","Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,opciones,opciones[0]);
				
		        switch (seleccion) {
		        case 0:
		        	if (contador < cantidad) {
		        		productos[contador] = new Inventario(); 
		        		productos[contador].dame_nombre(JOptionPane.showInputDialog("Introduce el nombre de la asignatura"));
		        		String cantidadlectura = JOptionPane.showInputDialog("Ingrese la cantidad del producto:");
		        		int cantida = Integer.parseInt(cantidadlectura);
		        		productos[contador].dame_cantidad(cantida);
		                
		                String preciolectura = JOptionPane.showInputDialog("Ingrese el precio del producto:");
		                double precio = Double.parseDouble(preciolectura);
		                productos[contador].dame_precio(precio);
		                contador++;
		            } else {
		                JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos empleados.", null, JOptionPane.ERROR_MESSAGE);
		            }
		        case 1:
		        	Inventario.mostrarLista(productos);
		        	String[] opcionesEliminar = {"Eliminar Producto", "Cancelar"};
	        	    int opcionEliminar = JOptionPane.showOptionDialog(
	        	        null,
	        	        "Seleccione una opción:",
	        	        "Opciones",
	        	        JOptionPane.DEFAULT_OPTION,
	        	        JOptionPane.INFORMATION_MESSAGE,
	        	        null,
	        	        opcionesEliminar,
	        	        opcionesEliminar[0]
	        	    );
	            	if (opcionEliminar == 0) {
	                    String indiceEliminarInput = JOptionPane.showInputDialog("Ingrese el índice del prodcuto a eliminar (1-" + (10 - contador) + "):");
	                    if (indiceEliminarInput == null) {
	                        JOptionPane.showMessageDialog(null, "Eliminación de producto cancelada.");
	                        break;
	                    }

	                    try {
	                        int indiceEliminar = Integer.parseInt(indiceEliminarInput);
	                        if (indiceEliminar > 0 && indiceEliminar <= (10 - contador)) {
	                            contador = Inventario.eliminarproducto(productos, indiceEliminar, contador);
	                            JOptionPane.showMessageDialog(null, "Producto eliminado.");
	                        } else {
	                            JOptionPane.showMessageDialog(null, "Índice inválido.");
	                        }
	                    } catch (NumberFormatException e) {
	                        JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
	                    }
	            	}
		        	break;
		        case 3:
		        	salir=true;
		        	break;
		        default:
		        	break;
		        }}
			}
		
	}


