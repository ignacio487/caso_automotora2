package controlador;

import java.util.ArrayList;
import java.util.Vector;
import modelo.Cliente;
import modelo.Vehiculo;

public class Automotora {
	private Vector<Cliente> cliente = new Vector<Cliente>();
	private Vector<Vehiculo> vehiculo = new Vector<Vehiculo>();

	public ArrayList<Vehiculo> listaDeVehiculos(Vehiculo vehiculo) {
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		for (Vehiculo vehiculo2 : vehiculo) {
			lista.add(vehiculo2);
		}
		return lista;
	}

	public void agregarCliente(Cliente cliente) {
		cliente.add(cliente);
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		vehiculo.add(vehiculo);
	}

	public Vehiculo buscarVehiculo(String marca) {
		for (Vehiculo vehiculo1: vehiculo) {
			if (vehiculo1.getMarca().equalsIgnoreCase(marca)) {
				return vehiculo1;
			}
		}
		return null;
	}
}