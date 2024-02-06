package EJERCICIO01;

public class Vehiculo {
		private int año;
		private String Marca;
		private String Modelo;
		public Vehiculo(String Marca,String Modelo,int año) {
			this.Marca=Marca;
			this.Modelo=Modelo;
			this.año=año;
		}
		public String getMarca() {
			return Marca;
			
		}
		public String getModelo() {
			return Modelo;
		}
		public int getaño() {
			return año;
		}

}
