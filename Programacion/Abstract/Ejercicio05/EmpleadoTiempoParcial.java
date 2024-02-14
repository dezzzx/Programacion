package Ejercicio05;

public class EmpleadoTiempoParcial extends Empleado {
    private double horas;
    private double tarifa;
    public EmpleadoTiempoParcial(double horas, double tarifa) {
        this.horas = horas;
        this.tarifa = tarifa;
    }
    public double calcularSalario() {
        return horas * tarifa;
    }
}