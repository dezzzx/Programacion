package EJERCICIO01;

public class ESTUDIANTE {
	private String[] nombre;
	private String[] apellido;

	private int[] edad;
	private int[] curso;
	private double[] nota;
	private String [] calificacion;
	private String grado;
	private int contador;

	public ESTUDIANTE() {
		nombre = new String[10];
		apellido = new String[10];
		calificacion = new String[10];
		edad = new int[10];
		curso = new int[10];
		nota = new double[10];
		contador = 0;
	}

	public void setNombre(String nombre) {
		this.nombre[contador] = nombre;
	}

	public void dime_Apellido(String Apellido) {
		this.apellido[contador] = Apellido;
	}

	public void dime_edad(int edad) {
		this.edad[contador] = edad;
	}

	public void confiNota(double nota) {
		String calificacion;
		if (nota < 5 && nota >= 0) {
			calificacion = "Suspenso";
		} else if (nota >= 5 && nota <= 10) {
			calificacion = "Aprobado";
		} else {
			calificacion = "Imposible";
		}
		this.calificacion[contador]=calificacion;
		this.nota[contador] = nota;
	}

	public void confiCurso(int curso) {
		switch (curso) {
		case 1:
			grado = "1º";
			break;
		case 2:
			grado = "2º";
			break;
		case 3:
			grado = "3º";
			break;
		case 4:
			grado = "4º";
			break;
		}
		
		this.curso[contador] = curso;
		contador++;
	}

	public String dame_Nombre() {
		return nombre[contador - 1];
	}

	public String dame_Apellido() {
		return apellido[contador - 1];
	}

	public int dame_edad() {
		return edad[contador - 1];
	}

	public double setNota() {
		return nota[contador - 1];
	}

	public String setCurso() {
		return "Es de " + grado + " ESO";
	}

	public static void mostrarLista(ESTUDIANTE[] estudiantes) {
		System.out.println("Lista de Alumnos:");
		for (int i = 0; i < estudiantes.length; i++) {
			if (estudiantes[i] != null) {
				System.out.println((i + 1) + " Nombre: " + estudiantes[i].dame_Nombre() + " "
						+ estudiantes[i].dame_Apellido() + " | Edad : " + estudiantes[i].dame_edad() + "| Nota: "
						+ estudiantes[i].setNota() + " " + estudiantes[i].setCurso());
			}
		}
	}

	public static int eliminarAlumno(ESTUDIANTE[] estudiantes, int indice, int contador) {

		for (int i = indice - 1; i < contador - 1; i++) {
			estudiantes[i] = estudiantes[i + 1];
		}

		estudiantes[contador - 1] = null;
		contador--;
		return contador;
	}

}
