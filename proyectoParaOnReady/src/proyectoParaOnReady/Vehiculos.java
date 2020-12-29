package proyectoParaOnReady;

import java.text.DecimalFormat;


public class Vehiculos implements Comparable<Vehiculos> {

	
	private String Marca;
	
	private String Modelo;

	private double Precio;
	
	

	
	public Vehiculos(String marca, String modelo, double precio) {
		super();
		this.Marca = marca;
		this.Modelo = modelo;
		this.Precio = precio;
	}
	
	
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	DecimalFormat formatea = new DecimalFormat("###,###.##");
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}


@Override
	public String toString() {
		return "Marca: "+ getMarca() + " // " + "Modelo: " + getModelo() + " // " + "Precio: $" + formatea.format(getPrecio());
	}





	public int compareTo(Vehiculos o) {
        if (Precio  > o.getPrecio()) {
            return -1;
        }
        if (Precio < o.getPrecio()) {
            return 1;
        }
        return 0;
    }
}
	
	
	
	
	

