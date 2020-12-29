package proyectoParaOnReady;

import java.text.DecimalFormat;

public class Motos extends Vehiculos {

	//atributtes
		private int Cilindrada;
		
		
		
	public Motos(String marca, String modelo, double precio, int Cilindrada) {
		super(marca, modelo, precio);
		// TODO Auto-generated constructor stub
		this.Cilindrada = Cilindrada;
	}


	DecimalFormat formatea = new DecimalFormat("###,###.00");
	@Override
	public String toString() {
		return "Marca: "+ getMarca() + " // " + "Modelo: " + getModelo() + " // " + "Cilindrada: " + getCilindrada()+"cc" +" // " +  "Precio: $" + formatea.format(getPrecio());
	}

	public int getCilindrada() {
		return Cilindrada;
	}



	public void setCilindrada(int cilindrada) {
		Cilindrada = cilindrada;
	}
	
	
	


	
	
	
	
	
	
	
	
}
