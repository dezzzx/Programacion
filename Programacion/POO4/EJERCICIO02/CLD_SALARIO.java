package EJERCICIO02;


public class CLD_SALARIO {
	private String[] nombre;
	private String[] apellido;
	private int[] Horas;
	private double[] Salario;
	private int contador;

	public CLD_SALARIO() {
		nombre = new String[5];
		apellido = new String[5];
		Horas = new int[5];
		Salario = new double[5];
		contador = 0;

	}
	public void dame_Horas(int horas) {
		this.Horas[contador] = horas;
		contador++;
	}
	public void dame_Salario(int horas) {
		double salario=47.5;
		this.Salario[contador] = salario*horas;
	}

	

	public void dame_Nombre(String nombre) {
		this.nombre[contador] = nombre;
	}

	public void dame_Apellido(String apellido) {
		this.apellido[contador] = apellido;
	}

	public int dime_Contador() {
		return contador;
	}

	public int dime_Horas() {
		return Horas[contador - 1];
	}

	public String dime_Nombre() {
		return nombre[contador - 1];
	}

	public double dime_Salario() {
		return Salario[contador - 1];
	}

	public String dime_Apellido() {
		return apellido[contador - 1];
	}

	public static int eliminarEmpleado(CLD_SALARIO[] empleados, int indice, int contador) {

		for (int i = indice - 1; i < contador - 1; i++) {
			empleados[i] = empleados[i + 1];
		}

		empleados[contador - 1] = null;
		contador--;
		return contador;
	}

	public static void mostrarLista(CLD_SALARIO[] empleados) {
		System.out.println("Lista de Salarios:");
		for (int i = 0; i < empleados.length; i++) {
			if (empleados[i] != null) {
				System.out
						.println((i + 1) + " Nombre: " + empleados[i].dime_Nombre() + " " + empleados[i].dime_Apellido()
								+ " | Horas : " + empleados[i].dime_Horas() + "| Salario: " + empleados[i].dime_Salario());
			}
		}
	}

}
