package ejercicio3;

import java.util.Objects;

public class Productos {
	
	private String nombre; 
	private int stock; 
	private double precio;
	
	public Productos(String nombre, int stock, double precio) {
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Productos [nombre=" + nombre + ", stock=" + stock + ", precio=" + precio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, precio, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Productos other = (Productos) obj;
		return Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && stock == other.stock;
	}
	
	
	
	
	
	

}
