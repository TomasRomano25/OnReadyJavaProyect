package proyectoParaOnReady;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Vehiculos> ListaDeVehiculos = new ArrayList<Vehiculos>();

		Vehiculos a1 = new Autos("Peugeot", "206", 200000.00, 4);
		Vehiculos m1 = new Motos("Honda", "Titan", 60000.00, 125);
		Vehiculos a2 = new Autos("Peugeot", "208", 250000.00, 5);
		Vehiculos m2 = new Motos("Yamaha", "YBR", 80500.50, 160);

		ListaDeVehiculos.add(a1);
		ListaDeVehiculos.add(m1);
		ListaDeVehiculos.add(a2);
		ListaDeVehiculos.add(m2);
		
		String Modeloy = null;
		String marcay = null;
		String contieneY = null;

		for (int i = 0; i < ListaDeVehiculos.size(); i++) {

			Vehiculos y = ListaDeVehiculos.get(i);

			if (y.getMarca().contains("Y")) {
				marcay = y.getMarca();
				Modeloy = y.getModelo();

			}

		}
		
		int VehiculoMasBarato = ListaDeVehiculos.size() - 1;
		
		
		for (Vehiculos Vehiculo : ListaDeVehiculos) {

			System.out.println(Vehiculo.toString());

		}
		Collections.sort(ListaDeVehiculos);
		System.out.println("=============================");
		System.out.println("Vehículo más caro: " + ListaDeVehiculos.get(0).getMarca() +" " + ListaDeVehiculos.get(0).getModelo());
		System.out.println("Vehiculo mas barato: " + ListaDeVehiculos.get(VehiculoMasBarato).getMarca() +" "+ ListaDeVehiculos.get(VehiculoMasBarato).getModelo());
		System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + marcay + " " + Modeloy);
			System.out.println("=============================");
			System.out.println("Vehículos ordenados por precio de mayor a menor:");

		for (Vehiculos Vehiculo : ListaDeVehiculos) {

			System.out.println(Vehiculo.getMarca()+" "+ Vehiculo.getModelo());

		}
	}

}
