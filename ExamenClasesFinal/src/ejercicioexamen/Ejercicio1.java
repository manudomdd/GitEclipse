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
		
		int[] palabras = new int[contadorPalabras]; 
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				count++; 
			} else {
				break;
			}
			palabras[i] = count;
		}
		
		int indiceMayor = palabras[0];
		int indiceFinal = 0;
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i] > indiceMayor) {
				indiceFinal = palabras[i];
			}
		}
		
		System.out.println("La palabra mas larga tiene " + indiceFinal + " caracteres.");				
	}
}
