package EJERCICIO02;

import javax.swing.JOptionPane;


public class USO_CLD_SALARIO {

	public static void main(String[] args) {
		boolean salir = false;
		int cantidad=5;
		CLD_SALARIO[] empleados = new CLD_SALARIO[cantidad];
		int contador=0;
		
		
		while(!salir) {
			 String[] opciones = {"Añadir Empleado (max. "+cantidad+" )", "Consultar salario","Quitar Empleado", "Salir"};
            int seleccion = JOptionPane.showInternalOptionDialog(null, "Selecciona una opción:","Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,opciones,opciones[0]);
			
            switch (seleccion) {
            case 0:
            	if (contador < cantidad) {
            		empleados[contador] = new CLD_SALARIO(); 
                    empleados[contador].dame_Nombre(JOptionPane.showInputDialog("Introduce el nombre del Empleado"));
                    empleados[contador].dame_Apellido(JOptionPane.showInputDialog("Introduce el apellido del Empleado"));
                    String Horaslectura = JOptionPane.showInputDialog("Ingrese las horas del Empleado:");
                    int Horas = Integer.parseInt(Horaslectura);
                    empleados[contador].dame_Salario(Horas);
                    empleados[contador].dame_Horas(Horas);
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos empleados.", null, JOptionPane.ERROR_MESSAGE);
                }
            case 1:
            	CLD_SALARIO.mostrarLista(empleados);
            	break;
            case 2:
            	CLD_SALARIO.mostrarLista(empleados);
            	String[] opcionesEliminar = {"Eliminar Empleado", "Cancelar"};
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
	                            contador = CLD_SALARIO.eliminarEmpleado(empleados, indiceEliminar, contador);
	                            JOptionPane.showMessageDialog(null, "Producto eliminado.");
	                        } else {
	                            JOptionPane.showMessageDialog(null, "Índice inválido.");
	                        }
	                    } catch (NumberFormatException e) {
	                        JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido. Inténtalo de nuevo.");
	                    }
	            	}
            case 3:
            	salir=true;
            	break;
            default:
            	break;
            }}
	}

}
