package proyectoParaOnReady;

import java.text.DecimalFormat;

public class Autos extends Vehiculos {

	

	//atributes
	
	private int Puertas;
	
	public Autos(String marca, String modelo, double precio, int Puertas) {
		super(marca, modelo, precio);
		this.Puertas = Puertas;
	}

	public int getPuertas() {
		return Puertas;
	}

	public void setPuertas(int puertas) {
		Puertas = puertas;
	}
	
	DecimalFormat formatea = new DecimalFormat("###,###.00");
	@Override 
	
	public String toString() {
		return "Marca: "+ getMarca() + " // " + "Modelo: " + getModelo() + " // " + "Puertas: " + getPuertas() + " // " + "Precio: $" + formatea.format(getPrecio())  ;
	}
	
	
}
