package ejercicio3;

import java.util.*;

import java.util.Arrays;

public class Catalogo {
	
	private Productos[] catalogo = new Productos[100];
	

	public Catalogo(Productos[] catalogo) {
		this.catalogo = catalogo;
	}

	public Productos[] getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Productos[] catalogo) {
		this.catalogo = catalogo;
	}

	@Override
	public String toString() {
		return "Catalogo [catalogo=" + catalogo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(catalogo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalogo other = (Catalogo) obj;
		return Arrays.equals(catalogo, other.catalogo);
	}
	
	public void introducirDatos() {
		var sc = new Scanner(System.in);
		System.out.println("Introduce el numero de productos a añadir: ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("Introduzca el nombre del producto: ");
			String nombreNuevo = sc.next();
			System.out.println("Introduzca el stock: ");
			int stockNuevo = sc.nextInt();
			System.out.println("Introduzca el precio: ");
			double precioNuevo = sc.nextDouble();
			
			catalogo[i] = new Productos(nombreNuevo, stockNuevo, precioNuevo);
		}
				
		System.out.println("El catalogo seria: ");
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] != null) {
				System.out.println(catalogo[i]);
			}
		}
}
	public void nuevoProducto () {
		var sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del producto: ");
		String nombreNuevo = sc.nextLine();
		System.out.println("Introduzca el stock: ");
		int stockNuevo = sc.nextInt();
		System.out.println("Introduzca el precio: ");
		double precioNuevo = sc.nextDouble();
		
		Productos nuevoProducto = new Productos(nombreNuevo, stockNuevo, precioNuevo);
		
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] == null) {
				catalogo[i] = nuevoProducto;
				break;
			} 
		}
		
		System.out.println("El nuevo catalogo seria: ");
		
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] != null)
				System.out.println(catalogo[i]);
		}
		
	}
	public void buscarProducto() {
		var sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del producto a buscar: ");
		String nombre = sc.nextLine();
		for (int i = 0; i < catalogo.length; i++) {
			if (nombre.equalsIgnoreCase(catalogo[i].getNombre())) {
				System.out.println("El producto se encuentra en el catalogo.");
				break;
			} else {
				System.out.println("No se ha encontrado dicho producto en el catalogo.");
				break;
			}
				
			
		}
		
	}
	
	public void modificarInformacion() {
		var sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del producto a modificar: ");
		String nombre = sc.nextLine();
		for (int i = 0; i < catalogo.length; i++) {
			if (nombre.equalsIgnoreCase(catalogo[i].getNombre())) {
				System.out.println("Introduzca que quiere modificar: ");
				System.out.println("1. Cantidad de stock.");
				System.out.println("2. Precio.");
				int option = sc.nextInt();
				switch (option) {
				case 1: 
					System.out.println("Introduzca la nueva cantidad de stock: ");
					int nuevaCantidad = sc.nextInt();
					catalogo[i].setStock(nuevaCantidad);
					System.out.println("Cantidad modificada.");
					System.out.println(catalogo[i]);
					break;
				case 2: 
					System.out.println("Introduzca el nuevo precio: ");
					int nuevoPrecio = sc.nextInt();
					catalogo[i].setPrecio(nuevoPrecio);
					System.out.println("Precio modificado.");
					System.out.println(catalogo[i]);
				default:
					System.out.println("Introduzca un nuevo valido.");
				}
				break;
			} else {
				System.out.println("Articulo no encontrado.");
			}
		}
	}
	
	public void eliminarProducto() {
		var sc = new Scanner(System.in);
		System.out.println("Introduce el nombre del producto a eliminar: ");
		String nombre = sc.nextLine();
		for (int i = 0; i < catalogo.length; i++) {
			if (nombre.equalsIgnoreCase(catalogo[i].getNombre())) {
				catalogo[i] = null;
				break;
			}
		}
		
		System.out.println("El nuevo catalogo seria: ");
		
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] != null) {
				System.out.println(catalogo[i]);
			}
		}
	}
	
	public void valorTotal() {
		double resultado = 0;
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] == null) {
				continue;
			} else {
				resultado += catalogo[i].getPrecio();
			}
		}
		
		System.out.println("El valor total del inventario es: " + resultado + " euros.");
	}
	
	public void roturaStock() {
		Productos[] listaStock = new Productos[100];
		
		for (int i = 0; i < catalogo.length; i++) {
			if (catalogo[i] == null) {
				continue;
			} else if (catalogo[i].getStock() < 50) {
				listaStock[i] = catalogo[i];
			}
		}
		
		System.out.println("Los articulos por debajo del limite de stock son: ");
		
		for (int i = 0; i < listaStock.length; i++) {
			if (listaStock[i] == null) {
				continue; 
			} else {
				System.out.println(listaStock[i]);
			}
		}
	}
	
	
	

}
