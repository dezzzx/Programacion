package Ejercicio05;

public class principal {
	 public static void main(String[] args) {
	        Empleado empleado1 = new EmpleadoTiempoCompleto(3000);
	        Empleado empleado2 = new EmpleadoTiempoParcial(20, 15);

	        System.out.println("Salario del empleado a tiempo completo: $" + empleado1.calcularSalario());
	        System.out.println("Salario del empleado a tiempo parcial: $" + empleado2.calcularSalario());
	    }
}
