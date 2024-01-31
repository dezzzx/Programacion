package EJERCICIO01;

import javax.swing.JOptionPane;





public class lista {

	public static void main(String[] args) {
		boolean salir = false;
		int cantidad=10;
		int cantidad1=10;
		
		int contador=0;
		Lista[] lista = new Lista[cantidad];
		while (!salir) {
			 String[] opciones = {"Añadir algo (quedan "+cantidad+" huecos )", "Ver lista", "Salir"};
	            int seleccion = JOptionPane.showInternalOptionDialog(null, "Selecciona una opción:","Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,opciones,opciones[0]);
				
	            switch (seleccion) {
	            case 0:
	            	if (contador < cantidad1) {
	            		try {
	            			lista[contador] = new Lista();
	            			lista[contador].añadiralaLista(JOptionPane.showInputDialog("Que va a añadir"));
	            		} catch (NumberFormatException e) {
	            			 JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");		 
	            			 return;
	            		}
	                    contador++;
	                    cantidad--;
	                } else {
	                    JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos empleados.", null, JOptionPane.ERROR_MESSAGE);
	                }
	            	break;
			case 1:
				Lista.mostrarLista(lista);
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
class Lista{
	private static String[] Listageneral;
	private int contador;
	public Lista() {
		Listageneral= new String [9];
		contador=0;
	}
	public void añadiralaLista(String nombre) {
		Lista.Listageneral[contador]=nombre;
		contador++;
	}
	public String dime_nombre() {
		return Listageneral[contador-1];
	}
	public static void mostrarLista(Lista[] lista) {
		StringBuilder Lista = new StringBuilder("Contactos ingresados:\n");
		for (int i = 0; i < lista.length; i++) {
        	if(lista[i] != null) {
        		Lista.append((i+1)+"\n ").append(lista[i].dime_nombre())
                .append("\n----------------------\n");
        } }
		JOptionPane.showMessageDialog(null, Lista.toString(), "Huecos ingresados", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
