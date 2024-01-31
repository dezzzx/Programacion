package EJERCICIO01;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Uso_RelojAlarma {

	public static void main(String[] args) {
		Scanner escaner = new Scanner(System.in);
		RelojAlarma relojAlarma = new RelojAlarma();
		LocalTime horaActual = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String hora = horaActual.format(formatter);
		int opcion=0;
		int horañadida;
		int minutoañadido;
		boolean exit=false;
		int contadordealarmas=10;
		do {
			try {
				System.out.println(hora);
				System.out.println("Selecciona una opcion  1-Añadir Alarma(maximo de "+contadordealarmas+") 2-Ver Alarmas 3-Activar alarmas 4-Desactivar alarmas 5-Salir ");
				
				opcion = escaner.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Introduce la hora:");
				horañadida = escaner.nextInt();

				if (horañadida >= 0 && horañadida <= 24) {
					System.out.println("Introduce los minutos:");
					minutoañadido = escaner.nextInt();

					if (minutoañadido >= 0 && minutoañadido <= 60) {
						boolean sonarAlarma;	
						sonarAlarma = false;		
						relojAlarma.añadirAlarma(horañadida, minutoañadido, sonarAlarma);
						System.out.println("Alarma añadida con éxito.");
						contadordealarmas--;
					} else {
						System.out.println("Valor incorrecto para los minutos.");
					}
				} else {
					System.out.println("Valor incorrecto para la hora.");
				}
				System.out.println();
				break;
			case 2:
				relojAlarma.veralarmas();
				System.out.println();
				break;
			case 3:
				relojAlarma.activarAlarmas();
				break;
			case 4:
				relojAlarma.desactivarAlarmas();
				break;
			case 5:
				exit=true;
				break;
			default:
				System.out.println("Formato incorrecto");
			}
		} catch (InputMismatchException e) {
			System.out.println(" incorrecto");
			escaner.next();
			continue;
		}
		} while (!exit);
		escaner.close();
		System.out.println("Programa finalizado");
	}
}