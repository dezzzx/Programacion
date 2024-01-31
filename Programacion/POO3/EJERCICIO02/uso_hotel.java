package EJERCICIO02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class uso_hotel {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		Scanner escaner = new Scanner(System.in);
		int exit = 3;
		int seleccion;
		int opcion;
		do {
			try {
				System.out.println("Seleccione qué quiere hacer: 1-Reservar 2-Cancelar Reserva 3-Salir");
				opcion = escaner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println(" incorrecto");
				escaner.next();
				continue;
			}
			switch (opcion) {
			case 1:
				do {
					hotel.mostrarMapa();
					try {
						System.out.println("¿Qué habitación quiere?");
						seleccion = escaner.nextInt();

						if (hotel.verificarDisponibilidad(seleccion)) {
							hotel.reservarHabitacion(seleccion);
							System.out.println("Reserva exitosa para la habitación " + seleccion);
						} else {
							System.out.println(
									"La habitación seleccionada no está disponible o no existe. Por favor, elija otra.");
						}
					} catch (InputMismatchException e) {
						System.out.println(" incorrecto");
						escaner.next();
						continue;
					}
					try {
						System.out.println("¿Desea hacer otra reserva? (1-Cualquier numero, 0-No)");
						exit = escaner.nextInt();
					} catch (InputMismatchException e) {
						System.out.println(" incorrecto");
						escaner.next();
						continue;
					}

				} while (exit != 0);
				break;
			case 2:
				try {
					hotel.mostrarMapa();
					System.out.println("Ingrese el número de habitación a cancelar:");
					int habitacionCancelar = escaner.nextInt();
					hotel.cancelarReserva(habitacionCancelar);
					System.out.println("Reserva cancelada para la habitación " + habitacionCancelar);
				} catch (InputMismatchException e) {
					System.out.println(" incorrecto");
					escaner.next();
					continue;
				}
				break;
			case 3:
				exit=1;
				break;
			default:
				System.out.println("Formato no válido");

			}
			
		} while (exit != 1);
		escaner.close();
		System.out.println("Programa finalizado");
	}

}
