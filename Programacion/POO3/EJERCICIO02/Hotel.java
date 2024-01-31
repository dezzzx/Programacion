package EJERCICIO02;


public class Hotel {
    int numhabitacionesindv = 5;
    int numhabitacionesdobles = 10;
    int numhabitacionesuites = 5;
    private int[] habitacionIndv = new int[numhabitacionesindv];
    private int[] habitacionDoble = new int[numhabitacionesdobles];
    private int[] habitacionSuite = new int[numhabitacionesuites];

    public Hotel() {
        
    	 for (int i = 0; i < numhabitacionesindv ; i++) {
             habitacionIndv[i] = 1;
         }
         for (int i = 0; i < numhabitacionesdobles; i++) {
             habitacionDoble[i] = 1;
         }
         for (int i = 0; i < numhabitacionesuites; i++) {
             habitacionSuite[i] = 1;
         }
    }

   

    public void mostrarMapa() {
        String nombre=null;

        for (int i = 1; i <= numhabitacionesindv + numhabitacionesdobles+numhabitacionesuites; i++) {
            System.out.print("|      ");
            if(i<=5) {
            	nombre="  Indiv";
            }else if(i>5&& i<=15) {
            	if(i<10) {
            		nombre="  Doble";
            	}else {
            		nombre=" Doble";
            	}
            	
            }else {
            	nombre=" Suite";
            }
            System.out.print(i+" Habitacion "+ nombre);
           
            if (i <= numhabitacionesindv) {
                System.out.print((habitacionIndv[i - 1] == 1) ? " Libre" : " Reservada");
            } else if (i <= numhabitacionesindv + numhabitacionesdobles) {
                System.out.print((habitacionDoble[i - numhabitacionesindv - 1] == 1) ? " Libre" : " Reservada");
            } else { 
                System.out.print((habitacionSuite[i - numhabitacionesindv - numhabitacionesdobles - 1] == 1) ? " Libre" : " Reservada");
            }
            System.out.println(" ");
        }
        return;
    }
    

    public boolean verificarDisponibilidad(int habitacion) {
        if (habitacion >= 1 && habitacion <= numhabitacionesindv) {
            return habitacionIndv[habitacion - 1] == 1;
        } else if (habitacion >= numhabitacionesindv + 1 && habitacion <= numhabitacionesindv + numhabitacionesdobles) {
            return habitacionDoble[habitacion - numhabitacionesindv - 1] == 1;
        } else if (habitacion >= numhabitacionesindv + numhabitacionesdobles + 1 && habitacion <= numhabitacionesindv + numhabitacionesdobles + numhabitacionesuites) {
            return habitacionSuite[habitacion - numhabitacionesindv - numhabitacionesdobles - 1] == 1;
        } else {
            return false;
        }
    }

   public void reservarHabitacion(int habitacion) {
        if (verificarDisponibilidad(habitacion)) {
            if (habitacion >= 1 && habitacion <= numhabitacionesindv) {
                habitacionIndv[habitacion - 1] = 0; 
            } else if (habitacion >= numhabitacionesindv + 1 && habitacion <= numhabitacionesindv + numhabitacionesdobles) {
                habitacionDoble[habitacion - numhabitacionesindv - 1] = 0;
            } else if (habitacion >= numhabitacionesindv + numhabitacionesdobles + 1 && habitacion <= numhabitacionesindv+ numhabitacionesdobles + numhabitacionesuites) {
                habitacionSuite[habitacion - numhabitacionesindv - numhabitacionesdobles - 1] = 0;
            }
        }
    }

    public void cancelarReserva(int habitacion) {
        if (habitacion >= 1 && habitacion <= numhabitacionesindv) {
            habitacionIndv[habitacion - 1] = 1; 
        } else if (habitacion >= numhabitacionesindv + 1 && habitacion <= numhabitacionesindv + numhabitacionesdobles) {
            habitacionDoble[habitacion - numhabitacionesindv - 1] = 1; 
        } else if (habitacion >= numhabitacionesindv + numhabitacionesdobles + 1 && habitacion <= numhabitacionesindv + numhabitacionesdobles + numhabitacionesuites) {
            habitacionSuite[habitacion - numhabitacionesindv - numhabitacionesdobles - 1] = 1;
        }
        return;
    }
}



