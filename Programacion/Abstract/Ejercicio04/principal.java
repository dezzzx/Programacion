package Ejercicio04;

public class principal {
	public static void main(String[] args) {
        PersistenciaArchivo persistenciaArchivo = new PersistenciaArchivo();
        PersistenciaBaseDeDatos persistenciaBaseDatos = new PersistenciaBaseDeDatos();
        
        persistenciaArchivo.guardarDatos("Datos a guardar en el archivo");
        String datosDesdeArchivo = persistenciaArchivo.cargarDatos();
        System.out.println(datosDesdeArchivo);
        
        persistenciaBaseDatos.guardarDatos("Datos a guardar en la base de datos");
        String datosDesdeBaseDatos = persistenciaBaseDatos.cargarDatos();
        System.out.println(datosDesdeBaseDatos);
    }
}
