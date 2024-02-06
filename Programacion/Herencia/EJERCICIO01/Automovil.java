package EJERCICIO01;

public class Automovil extends Vehiculo{
	private int octanaje;
	private String tipodeCombustible;
	//Constructor
	public Automovil(String Marca,String Modelo, int año,int octanaje,String tipodeCombustible) {
		super(Marca,Modelo,año);
		this.octanaje=octanaje;
		this.tipodeCombustible=tipodeCombustible;
	}
	public void MostrarDatos() {
		System.out.println(" Marca: "+getMarca()+"\n Modelo: "+getModelo()+"\n Año :"+getaño()+"\n Octanaje: "+octanaje+"\n Combustible "+tipodeCombustible);
	}


}
