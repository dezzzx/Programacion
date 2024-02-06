package EJERCICIO05;

public class DispositivoElectronico {
	private String fabricante;
    private int añoDeFabricacion;

    public  DispositivoElectronico(String fabricante, int añoDeFabricacion) {
        this.fabricante = fabricante;
        this.añoDeFabricacion = añoDeFabricacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAñoDeFabricacion() {
        return añoDeFabricacion;
    }

    public void setAñoDeFabricacion(int añoDeFabricacion) {
        this.añoDeFabricacion = añoDeFabricacion;
    }
}
