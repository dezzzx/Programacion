package EJRCICIO03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class USO_RECETACOMIDA {

	public static void main(String[] args) {
		Scanner escaner = new Scanner (System.in);
		int opcion = 0;
	    RECETACOMIDA tortillaReceta = new RECETACOMIDA("Tortilla de Patatas");
        tortillaReceta.agregarIngrediente("Patatas");
        tortillaReceta.agregarIngrediente("Huevos");
        tortillaReceta.agregarIngrediente("Cebolla");
        tortillaReceta.agregarPaso("Pelar y cortar las patatas en rodajas.");
        tortillaReceta.agregarPaso("Batir los huevos en un bol.");
        tortillaReceta.agregarPaso("Añadir las patatas y la cebolla a los huevos batidos.");
        tortillaReceta.agregarPaso("Cocinar la mezcla en una sartén hasta que esté dorada por ambos lados.");
        tortillaReceta.agregarReceta(tortillaReceta);
        do {
        	try {
        	System.out.println("Que desea hacer 1- ver receta 2-quitar ingrediente 3-Salir");
        	opcion = escaner.nextInt();
        	} catch (InputMismatchException e) {
				System.out.println("Formato incorrecto");
				escaner.next();
				continue;
			}
        	switch(opcion) {
        	case 1:
        		tortillaReceta.mostrarRecetas();
        		break;
        	case 2:
        		System.out.println("Ingrese el ingrediente que desea quitar: ");
        		escaner.nextLine();
                String ingredienteQuitar = escaner.nextLine();
                tortillaReceta.quitarIngrediente(ingredienteQuitar);
                break;
        	case 3:
        		opcion=4;
        		break;
        	default:
        		System.out.println("un numero del 1 al 3 no es tan dificil");
        	}
        }while(opcion != 4);
        escaner.close();
        System.out.println("Programa finalizado");
    }


	}

