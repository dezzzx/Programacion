package Ejercicio04;

public class PersistenciaBaseDeDatos extends Persistencia {

    public void guardarDatos(String datos) {
        
        System.out.println("Guardando datos en la base de datos: " + datos);
    }

    public String cargarDatos() {

        System.out.println("Cargando datos desde la base de datos");
        return "Datos cargados desde la base de datos";
    }
}


