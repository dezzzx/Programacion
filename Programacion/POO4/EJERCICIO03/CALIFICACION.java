package EJERCICIO03;

import javax.swing.JOptionPane;

public class CALIFICACION {
	private String[] asignatura;
	private int[] curso;
	private double[] nota;
	private String [] calificacion;
	private String []grado;
	private int contador;

	public CALIFICACION() {
		asignatura = new String[10];
		curso = new int[10];
		nota = new double[10];
		calificacion = new String[10];
		grado = new String[10];
		contador = 0;
		;
	}

	public void confiNota(double nota) {
		String calificacion;
		if (nota >= 0 && nota > 4) {
			calificacion = "F";
		} else if (nota >= 4 && nota < 5) {
			calificacion = "D";
		} else if (nota >= 5 && nota < 6) {
			calificacion = "C";
		} else if (nota >= 6 && nota < 9) {
			calificacion = "B";
		} else if (nota >= 9 && nota <= 10) {
			calificacion = "A";
		} else {
			calificacion = "nula";
		}
		this.calificacion[contador]=calificacion;
		this.nota[contador] = nota;
		contador++;
	}

	public void confiCurso(int curso) {
		String grado = null;
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
		this.grado[contador]= grado;
		this.curso[contador] = curso;
	}
	public static void mostrarLista(CALIFICACION[] asignaturas) {
		StringBuilder Lista= new StringBuilder("Lista de asignaturas \n");
        
        
        for (int i = 0; i < asignaturas.length; i++) {
        	if(asignaturas[i] != null) {
        		Lista.append((i+1)+"\n Asignatura : ").append(asignaturas[i].dime_asignatura())
                .append("\n Nota: ").append(asignaturas[i].dime_Nota())
                .append("\n Curso: ").append(asignaturas[i].dime_grado())
                .append("\n Calificacion: ").append(asignaturas[i].dime_calificacion())
                .append("\n----------------------\n");
        } }
        JOptionPane.showMessageDialog(null, Lista.toString(), "Lista de Asignaturas", JOptionPane.INFORMATION_MESSAGE);
	}
	public void dame_asignatura(String nombre) {
		this.asignatura[contador] = nombre;
	}
	public static int eliminarAlumno(CALIFICACION[] asignaturas, int indice, int contador) {

		for (int i = indice - 1; i < contador - 1; i++) {
			asignaturas[i] = asignaturas[i + 1];
		}

		asignaturas[contador - 1] = null;
		contador--;
		return contador;
	}
	
	public String dime_asignatura() {
		return asignatura[contador - 1];
	}
	public int dime_curso() {
		return curso[contador - 1];
	}
	public String dime_grado() {
		return calificacion[contador-1];
	}
	public String dime_calificacion() {
		return calificacion[contador-1];
	}

	public double dime_Nota() {
		return nota[contador - 1];
	}

}
