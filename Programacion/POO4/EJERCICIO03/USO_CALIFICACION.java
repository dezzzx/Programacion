package EJERCICIO03;

import javax.swing.JOptionPane;



public class USO_CALIFICACION {
	public static void main(String[] args) {
	boolean salir = false;
	int cantidad=10;
	int contador=0;
	CALIFICACION[] asignaturas = new CALIFICACION[cantidad];
	
	
	
	while(!salir) {
		 String[] opciones = {"Añadir Empleado (max. "+cantidad+" )", "Ver boletin", "Salir"};
        int seleccion = JOptionPane.showInternalOptionDialog(null, "Selecciona una opción:","Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,opciones,opciones[0]);
		
        switch (seleccion) {
        case 0:
        	if (contador < cantidad) {
        		asignaturas[contador] = new CALIFICACION(); 
        		String Cursolectura = JOptionPane.showInputDialog("Ingrese el curso de la asignatura:");
        		int curso = Integer.parseInt(Cursolectura);
        		asignaturas[contador].confiCurso(curso);
                asignaturas[contador].dame_asignatura(JOptionPane.showInputDialog("Introduce el nombre de la asignatura"));
                String notalectura = JOptionPane.showInputDialog("Ingrese la nota de la asignatura:");
                double nota = Double.parseDouble(notalectura);
                asignaturas[contador].confiNota(nota);
                contador++;
            } else {
                JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos empleados.", null, JOptionPane.ERROR_MESSAGE);
            }
        case 1:
        	CALIFICACION.mostrarLista(asignaturas);
        	 String[] opcionesEliminar = {"Eliminar Alumno", "Cancelar"};
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
	                            contador = CALIFICACION.eliminarAlumno(asignaturas, indiceEliminar, contador);
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
