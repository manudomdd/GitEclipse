package ejercicioexamen;

import java.util.*;

public class Ejercicio2 {
	
	public static void main (String[] args) {
		
		var sc = new Scanner(System.in);
		
		int entradasPrincipal = 1000;
		int entradasPlatea = 200;
		int entradasVip = 25;
		int option;
		
		do {
			System.out.println("Selecciona una opcion: ");
			System.out.println("1. Mostrar numero de entradas libres.");
			System.out.println("2. Vender entradas.");
			System.out.println("3. Salir");
			option = sc.nextInt();
			
			switch (option) {
			case 1: 
				int resultado = 0;
				resultado = entradasPrincipal + entradasPlatea + entradasVip;
				System.out.println("El numero de entradas libres es " + resultado);
				System.out.println("Hay " + entradasPrincipal + " entradas para la zona principal, " + entradasPlatea + " para la zona Platea y " + entradasVip + " para la zona VIP");
				break;
			case 2: 
				System.out.println("Selecciona la zona de la entrada a vender: ");
				System.out.println("1. Zona principal.");
				System.out.println("2. Zona platea.");
				System.out.println("3. Zona Vip");
				int opccion = sc.nextInt();
				
				switch (opccion) {
				case 1: 
					System.out.println("¿Cuantas entradas quieres vender?: ");
					int numEntradas = sc.nextInt();
					if (numEntradas > entradasPrincipal) {
						System.out.println("No hay suficientes entradas disponibles para la venta.");
						break;
					} else {
						entradasPrincipal -= numEntradas;
						System.out.println("Entradas vendidas.");
					}
					break;
				case 2: 
					System.out.println("¿Cuantas entradas quieres vender?: ");
					int numEntradasPlatea = sc.nextInt();
					if (numEntradasPlatea > entradasPlatea) {
						System.out.println("No hay suficientes entradas disponibles para la venta.");
						break;
					} else {						
						entradasPlatea -= numEntradasPlatea;
						System.out.println("Entradas vendidas.");
					}
					break;
				case 3: 
					System.out.println("¿Cuantas entradas quieres vender?: ");
					int numEntradasVip = sc.nextInt();
					if (numEntradasVip > entradasVip) {						
						System.out.println("No hay suficientes entradas disponibles para la venta.");
						break;
					} else {
						entradasVip -= numEntradasVip;
						System.out.println("Entradas vendidas.");
					}
					break;
				default: 
					System.out.println("Selecciona una opcion correcta");
					break;
				}
			}
		} while (option != 3);
		
		System.out.println("Programa finalizado");
		sc.close();
	}	
}