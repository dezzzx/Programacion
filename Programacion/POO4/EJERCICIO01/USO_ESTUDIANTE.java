package EJERCICIO01;

import javax.swing.JOptionPane;

public class USO_ESTUDIANTE {

	public static void main(String[] args) {
		boolean salir = false;
		int cantidad=10;
		ESTUDIANTE[] estudiantes = new ESTUDIANTE[cantidad];
		int contador=0;
		
		
		while(!salir) {
			 String[] opciones = {"Añadir Alumno (max. "+cantidad+" )", "Ver Lista","Quitar Alumno", "Salir"};
            int seleccion = JOptionPane.showInternalOptionDialog(null, "Selecciona una opción:","Menú", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,opciones,opciones[0]);
			
            switch (seleccion) {
            case 0:
            	if (contador < cantidad) {
            		estudiantes[contador] = new ESTUDIANTE(); 
                    estudiantes[contador].setNombre(JOptionPane.showInputDialog("Introduce el nombre del Alumno"));
                    estudiantes[contador].dime_Apellido(JOptionPane.showInputDialog("Introduce el apellido del Alumno"));
                    String edadlectura = JOptionPane.showInputDialog("Ingrese la edad del Alumno:");
                    int edad = Integer.parseInt(edadlectura);
                    estudiantes[contador].dime_edad(edad);
                    String notalectura = JOptionPane.showInputDialog("Ingrese la nota del Alumno:");
                    double nota = Double.parseDouble(notalectura);
                    estudiantes[contador].confiNota(nota);
                    String cursolectura = JOptionPane.showInputDialog("Ingrese el curso del Alumno:");
                    int curso = Integer.parseInt(cursolectura);
                    estudiantes[contador].confiCurso(curso);
                    contador++;
                } else {
                    JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos alumnos.", null, JOptionPane.ERROR_MESSAGE);
                }
                break;
            case 1:
                	ESTUDIANTE.mostrarLista(estudiantes);
                break;
            case 2:
            	ESTUDIANTE.mostrarLista(estudiantes);
                int indiceEliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice del alumno a eliminar (1-" + (10 - contador) + "):"));
                if (indiceEliminar > 0 && indiceEliminar <= (10 - contador)) {
                    contador = ESTUDIANTE.eliminarAlumno(estudiantes, indiceEliminar, contador);
                    JOptionPane.showMessageDialog(null, "Alumno eliminado.");
                } else {
                    JOptionPane.showMessageDialog(null, "Índice inválido.");
                }
            	break;
            case 3:
                salir = true;
                break;
            default:
                break;
        }
		

	}

}
}
