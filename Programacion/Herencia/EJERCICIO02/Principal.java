package EJERCICIO02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		boolean salir = false;
		int cantidad = 10;
		String carrera=null;
		int contador = 0;
		Estudiante[] estudiante = new Estudiante[cantidad];
		while (!salir) {
			String[] opciones = { "Añadir Estudiante (quedan " + cantidad + " huecos )", "Ver lista", "Salir" };
			int seleccion = JOptionPane.showInternalOptionDialog(null, "Validacion :", "Menú",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
			switch (seleccion) {
			case 0:
				if (contador < cantidad) {
					String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
					String apellido = JOptionPane.showInputDialog("Apellido del estudiante:");
					int edad;
					try {
						edad = Integer.parseInt(JOptionPane.showInputDialog("Edad del estudiante:"));
						if (edad < 1) {
							JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido para la edad.");
							break;
						}
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido para la edad.");
						continue;
					}
					
					String[] opciones1 = { "Ingenieria Informatica", "Derecho", "Mediciana", "Biologia", "Quimica",
							"Fisica" };
					int seleccion1 = JOptionPane.showInternalOptionDialog(null, "Selecione una carrera :", "Menú",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones1, opciones1[0]);
					switch (seleccion1) {
					case 0:
						carrera = "Ingenieria Iinformatica";
						JOptionPane.showMessageDialog(null, "Carrera Registrada");
						break;
					case 1:
						carrera = "Derecho";
						JOptionPane.showMessageDialog(null, "Carrera Registrada");
						break;
					case 2:
						carrera = "Medicina";
						JOptionPane.showMessageDialog(null, "Carrera Registrada");
						break;
					case 3:
						carrera = "Biologia";
						JOptionPane.showMessageDialog(null, "Carrera Registrada");
						break;
					case 4:
						carrera = "Quimica";
						JOptionPane.showMessageDialog(null, "Carrera Registrada");
						break;
					case 5:
						carrera = "Fisica";
						JOptionPane.showMessageDialog(null, "Carrera Registrada");
						break;
					default:
						break;

					}
					estudiante[contador] = new Estudiante(nombre, apellido, edad, carrera);
					contador++;
					cantidad--;
				} else {
					JOptionPane.showMessageDialog(null, "No hay más espacio para nuevos estudiantes.", null,
							JOptionPane.ERROR_MESSAGE);
				}
				break;
			case 1:
				StringBuilder listaEstudiantes = new StringBuilder("Lista de Estudiantes:\n");
				for (int i = 0; i < estudiante.length; i++) {
                	if(estudiante[i] != null) {
                    listaEstudiantes.append("Nombre: ").append(estudiante[i].getNombre(i)).append("\n");
                    listaEstudiantes.append("Apellido: ").append(estudiante[i].getApellido(i)).append("\n");
                    listaEstudiantes.append("Edad: ").append(estudiante[i].getEdad(i)).append("\n");
                    listaEstudiantes.append("Carrera: ").append(estudiante[i].getCarrera(i)).append("\n\n") .append("\n----------------------\n");
                }
				}
                JOptionPane.showMessageDialog(null, listaEstudiantes.toString());
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
