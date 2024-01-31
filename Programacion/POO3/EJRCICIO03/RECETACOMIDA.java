package EJRCICIO03;

import java.util.ArrayList;

public class RECETACOMIDA {

	private ArrayList<RECETACOMIDA> recetas;
	private String nombre;
	private ArrayList<String> ingredientes;
	private ArrayList<String> pasos;

	public RECETACOMIDA(String nombre) {
		this.nombre = nombre;
		this.ingredientes = new ArrayList<>();
		this.pasos = new ArrayList<>();
		this.recetas = new ArrayList<>();
	}

	public void agregarIngrediente(String ingrediente) {
		this.ingredientes.add(ingrediente);
	}

	public void quitarIngrediente(String ingrediente) {
		 if (ingrediente != null && !"Cebolla".equals(ingrediente)) {
		        System.out.println("Intentando quitar: " + ingrediente);

		        if (this.ingredientes.contains(ingrediente)) {
		            this.ingredientes.remove(ingrediente);
		            System.out.println(ingrediente + " ha sido eliminado de la lista de ingredientes de " + this.nombre + ".");
		        } else {
		            System.out.println(ingrediente + " no está en la lista de ingredientes de " + this.nombre + ".");
		            System.out.println("Lista de ingredientes actual: " + this.ingredientes);
		        }
		    } else {
		        System.out.println("No puedes quitar la cebolla de la receta. ¿Eres tonto?");
		    }
	}

	public void agregarPaso(String paso) {
		this.pasos.add(paso);
	}

	public void mostrarReceta() {
		System.out.println("Receta de " + this.nombre + ":");
		System.out.println("Ingredientes:");
		for (String ingrediente : this.ingredientes) {
			System.out.println("- " + ingrediente);
		}
		System.out.println("\nPasos:");
		for (int i = 0; i < this.pasos.size(); i++) {
			System.out.println((i + 1) + ". " + this.pasos.get(i));
		}
	}

	public void GestorRecetas() {
		this.recetas = new ArrayList<>();
	}

	public void agregarReceta(RECETACOMIDA receta) {
		this.recetas.add(receta);
	}

	public void mostrarRecetas() {
		System.out.println("Lista de Recetas:");
		for (RECETACOMIDA receta : this.recetas) {
			receta.mostrarReceta();
			System.out.println();
		}
	}

}
