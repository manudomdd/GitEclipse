package ejercicio3;

import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		
		var sc = new Scanner(System.in);
		
		Productos[] catalogo = new Productos[100];
		
		//catalogo[0] = new Productos("Lavadora", 4, 300);
		//catalogo[1] = new Productos("Lavavajillas", 330, 340);
		
		//te lo dejo puesto por si quieres correjir con ellos)
		
		Catalogo lista = new Catalogo(catalogo);
		
		int option;
		
		do {
			System.out.println("Selecciona una opcion: ");
			System.out.println("1. Introducir datos nuevo inventario.");
			System.out.println("2. Nuevo producto.");
			System.out.println("3. Buscar producto.");
			System.out.println("4. Eliminar producto.");
			System.out.println("5. Mostrar valor total del inventario.");
			System.out.println("6. Informe rotura de stock.");
			System.out.println("7. Salir.");
			option = sc.nextInt();
			switch (option) {
			case 1: 
				lista.introducirDatos();
				break;
			case 2: 
				lista.nuevoProducto();
				break;
			case 3: 
				lista.buscarProducto();
				break;
			case 4: 
				lista.eliminarProducto();
				break;
			case 5: 
				lista.valorTotal();
				break;
			case 6:
				lista.roturaStock();
				break;
			}
		} while (option != 7);
		
		System.out.println("Programa finalizado.");
		sc.close();		
	}
}


