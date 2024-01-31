package EJERCICIO05;

import javax.swing.JOptionPane;

public class CONTACTOS {
	private String[] nombre;
	private int[] numero;
	private String[] correo;
	private int contador;
	public CONTACTOS() {
		nombre = new String[10];
		numero = new int[10];
		correo = new String [10];
		contador=0;
	}
	public void dame_nombre(String nombre) {
		this.nombre[contador] = nombre;
	}
	public void dame_numero (int numerotel) {
		
		 if (numerotel > 99999999) {
	            this.numero[contador] = numerotel;
	        } else {
	            JOptionPane.showMessageDialog(null, "El numero debe tener nueve numeros");
	            dame_numero(Integer.parseInt(JOptionPane.showInputDialog("Numero invalido")));
	        }
		
	}
	public void dame_correo(String correo) {
		if (correo.contains("@gmail.com")) {
            this.correo[contador] = correo;
            contador++;
        } else {
            System.out.println("El correo debe contener '@gmail.com'. Ingrese de nuevo.");
            
	}
}
	public String dime_nombre() {
		return nombre[contador-1];
	}
	public int dime_numero() {
		return numero[contador-1];
	}
	public String dime_correo() {
		return correo[contador-1];
	}
	public static void mostrarLista(CONTACTOS[] contactos) {
		StringBuilder Lista = new StringBuilder("Contactos ingresados:\n");
		for (int i = 0; i < contactos.length; i++) {
        	if(contactos[i] != null) {
        		Lista.append((i+1)+"\n Nombre : ").append(contactos[i].dime_nombre())
                .append("\n Numero: ").append(contactos[i].dime_numero())
                .append("\n Correo: ").append(contactos[i].dime_correo())
                .append("\n----------------------\n");
        } }
		JOptionPane.showMessageDialog(null, Lista.toString(), "Contactos ingresados", JOptionPane.INFORMATION_MESSAGE);
	}
	public static int eliminarcontacto(CONTACTOS[] contactos, int indice, int contador) {

		for (int i = indice - 1; i < contador - 1; i++) {
			contactos[i] = contactos[i + 1];
		}

		contactos[contador - 1] = null;
		contador--;
		return contador;
	}
}
	
