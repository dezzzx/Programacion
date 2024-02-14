package Ejercicio04;

public class PersistenciaArchivo  extends Persistencia {

	    public void guardarDatos(String datos) {
	       
	        System.out.println("Guardando datos en un archivo: " + datos);
	    }

	    public String cargarDatos() {

	        System.out.println("Cargando datos desde un archivo");
	        return "Datos cargados desde el archivo";
	    }
	}


