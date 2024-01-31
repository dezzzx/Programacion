package EJERCICIO05;

import javax.swing.JOptionPane;

public class USO_CONTACTO {

	public static void main(String[] args) {
		boolean salir = false;
		int cantidad=10;
		CONTACTOS[] contactos = new CONTACTOS[cantidad];
		int contador=0;
		
		
		while(!salir) {
			 String[] opciones = {"Añadir Contacto (max. "+cantidad+" )", "Lista de contactos", "Salir"};
            int seleccion = JOptionPane.showInternalOptionDialog(null, "Selecciona una opción:","Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,opciones,opciones[0]);
			
            switch (seleccion) {
            case 0:
            	if (contador < cantidad) {
            		contactos[contador] = new CONTACTOS();
            		
            		contactos[contador].dame_nombre(JOptionPane.showInputDialog("Nombre:"));
            		try {
            		contactos[contador].dame_numero(Integer.parseInt(JOptionPane.showInputDialog("Número de teléfono :")));
            		} catch (NumberFormatException e) {
            			 JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
            			 contactos[contador].dame_numero(Integer.parseInt(JOptionPane.showInputDialog("Número de teléfono :")));
            			 return;
            		}
            		contactos[contador].dame_correo(JOptionPane.showInputDialog("Correo (debe contener '@gmail.com'):"));
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos empleados.", null, JOptionPane.ERROR_MESSAGE);
                }
            	break;
            case 1:
            	CONTACTOS.mostrarLista(contactos);
            	String[] opcionesEliminar = {"Eliminar Contacto", "Cancelar"};
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
                    String indiceEliminarInput = JOptionPane.showInputDialog("Ingrese el índice del Contacto a eliminar (1-" + (10 - contador) + "):");
                    if (indiceEliminarInput == null) {
                        JOptionPane.showMessageDialog(null, "Eliminación de contacto cancelada.");
                        break;
                    }

                    try {
                        int indiceEliminar = Integer.parseInt(indiceEliminarInput);
                        if (indiceEliminar > 0 && indiceEliminar <= (10 - contador)) {
                            contador = CONTACTOS.eliminarcontacto(contactos, indiceEliminar, contador);
                            JOptionPane.showMessageDialog(null, "Contacto eliminado.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Índice inválido.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
                    }
            	}
            	break;
            case 2:
            	salir=true;
            	break;
            default:
            	break;
            }}

	}

}
