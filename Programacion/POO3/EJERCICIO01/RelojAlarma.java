package EJERCICIO01;


import java.time.LocalTime;
import java.util.Scanner;

public class RelojAlarma {
	private int[] horas;
	private int[] minutos;
	private boolean[] registro;
	private int contadorAlarmas;
	int opcion;
	int horañadida;
	int minutoañadido;

	

	public RelojAlarma() {
		horas = new int[9];
		minutos = new int[9];
		registro = new boolean[9];
		contadorAlarmas = 0;
	}
	public void añadirAlarma(int horas, int minutos, boolean sonar) {
		this.horas[contadorAlarmas] = horas;
		this.minutos[contadorAlarmas] = minutos;
		this.registro[contadorAlarmas] = sonar;
		contadorAlarmas++;
	
	}
	public void activarAlarmas() {
		veralarmas();
		LocalTime horaActual = LocalTime.now();
	    int horaActualInt = horaActual.getHour();
	    int minutoActualInt = horaActual.getMinute();
        System.out.println("Seleccione una alarma para activar (ingrese el número): ");
        Scanner escaner = new Scanner(System.in);
        int seleccion = escaner.nextInt();

        if (seleccion > 0 && seleccion <= contadorAlarmas ) {
        	if (registro[seleccion - 1]==false) {
                registro[seleccion - 1] = true;
                if (horas[seleccion - 1] == horaActualInt && minutos[seleccion - 1] == minutoActualInt) {
                    System.out.println("Alarma " + seleccion + " activada y sonando");
                } else {
                System.out.println("Alarma " + seleccion + " activada");
                }
            } else {
                System.out.println("La alarma " + seleccion + " ya está activada.");
            }
        } else {
            System.out.println("Número de alarma no válido.");
        }
       escaner.close();
	}
	public void desactivarAlarmas() {
		veralarmas();
        System.out.println("Seleccione una alarma para desactivar (ingrese el número): ");
        Scanner escaner = new Scanner(System.in);
        int seleccion = escaner.nextInt();

        if (seleccion > 0 && seleccion <= contadorAlarmas) {
        	if (registro[seleccion - 1]==true) { 
                registro[seleccion - 1] = false;
                System.out.println("¡Alarma " + seleccion + " desactivada!");
            } else {
                System.out.println("La alarma " + seleccion + " ya está desactivada.");
            }
        	 registro[seleccion - 1] = false;
            System.out.println("Alarma " + seleccion + " desactivada");
        } else {
            System.out.println("Número de alarma no válido.");
        }
        escaner.close();
       
	}
	public void veralarmas() {
		for (int i = 0; i < contadorAlarmas; i++) {
			System.out.println("Alarma " + (i + 1) + ": " + horas[i] + ":" + minutos[i] + " - Activada: " + Activacion(registro[i]));
		}
	
	}
	public String Activacion(boolean sonar) {
		return sonar ? "si ": "no";
	}
}
