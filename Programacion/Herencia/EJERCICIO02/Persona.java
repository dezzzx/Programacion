package EJERCICIO02;

public class Persona {
	private String[] nombre;
    private String[] apellido;
    private int[] edad;
    private int contador;

    public Persona() {
        nombre = new String[100];
        apellido = new String[100];
        edad = new int[100];
        contador = 0;
    }

    public void setNombre(String nombre) {
        this.nombre[contador] = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido[contador] = apellido;
    }

    public void setEdad(int edad) {
        this.edad[contador] = edad;
    }

    public String getNombre(int indice) {
        return nombre[indice];
    }

    public String getApellido(int indice) {
        return apellido[indice];
    }

    public int getEdad(int indice) {
        return edad[indice];
    }

    public void incrementarContador() {
        contador++;
    }
}
