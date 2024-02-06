package EJERCICIO02;

public class Estudiante extends Persona {
	private String[] carrera;
    private int contador;

    public Estudiante(String nombre, String apellido, int edad, String carrera) {
        super();
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        this.carrera = new String[100];
        this.contador = 0;
        this.setCarrera(carrera);
    }

    public void setCarrera(String carrera) {
        this.carrera[contador] = carrera;
        contador++;
    }

    public String getCarrera(int indice) {
        return carrera[indice];
    }
	
}
