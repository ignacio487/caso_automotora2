package modelo;

public class Vehiculo {
	private String nombre;
	private int a�o;
	private String precio;
	private int kilometrosRecorridos;
	private String color;
	private String marca;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�o() {
		return this.a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public int getKilometrosRecorridos() {
		return this.kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void Vehiculos(String nombre, int a�o, String precio, int kilometrosRecorridos, String color, String marca) {
		throw new UnsupportedOperationException();
	}
}