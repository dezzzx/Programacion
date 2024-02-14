package Ejercicio05;

public class EmpleadoTiempoCompleto extends Empleado {
    private double salario;

    public EmpleadoTiempoCompleto(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return salario;
    }
}
