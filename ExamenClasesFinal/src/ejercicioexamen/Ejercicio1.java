package ejercicioexamen;

import java.util.*;
import java.util.Arrays;


public class Ejercicio1 {
	
	public static void main (String[] args) {
		
		var sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase: ");
		String frase = sc.nextLine().trim();
		
		int contadorPalabras = 1; //se inicializa a 1 para contar la primera palabra, ya que no tiene espacio previo.
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contadorPalabras++;
			}
		}
		
		System.out.println("La frase introducida tiene " + contadorPalabras + " palabras.");
		
		
		
		int count = 0; 
		
		int cantidadPalabras = palabras.length;

        // Variables para las palabras de mayor y menor longitud
        String palabraMayor = "";
        String palabraMenor = palabras[0];

        for (String palabra : palabras) {
            if (palabra.length() > palabraMayor.length()) {
                palabraMayor = palabra;
            }
            if (palabra.length() < palabraMenor.length()) {
                palabraMenor = palabra;
            }
        }

        // Resultados
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
        System.out.println("Palabra de mayor longitud: \"" + palabraMayor + "\" con " + palabraMayor.length() + " caracteres.");
        System.out.println("Palabra de menor longitud: \"" + palabraMenor + "\" con " + palabraMenor.length() + " caracteres.");
    }
}		
	}
}
