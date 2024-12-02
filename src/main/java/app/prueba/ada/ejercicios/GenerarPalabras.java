package app.prueba.ada.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerarPalabras {
	
	public static void main(String[] args) {
		
		List<String> palabras= generarPalabras(5, 5);
		
		for (String string : palabras) {
			System.out.println(string);
		}
	}

	public static List<String> generarPalabras(int numPalabras,int tamañoPalabra) {
		
		char[] caracteres = {
                'w', 'e', 'r', 'f', 'b', 'h', 'j', 'i', 'u', 'y', 't', 'r', 'e', 'd', 'f', 'g', 'u', 't', 'r', 'e',
                's', 'd', 'f', 'g', 'y', 'u', 'i', 'o', 'l', 'k', 'm', 'n', 'b', 'v', 'f', 'r', 'e', 'w', 's', 'x',
                'f', 'g', 'y', 'u', 'i', 'k', 'm', 'n', 'b', 'v', 'f', 'r', 'e', 'w', 'w', 'r', 't', 'y', 'u', 'i',
                'o', 'k', 'm', 'n', 'b', 'v', 'd', 'w', 's', 'x', 'c', 'f', 'g', 'h', 'u', 'i', 'o', 'p', 'l', 'k',
                'n', 'b', 'v', 'f', 'd', 'e', 'w', 'a', 'z', 'x', 'c', 'g', 'h', 'u', 'i', 'o', 'p', 'u', 'y', 't',
                'r', 'e', 'w', 'q', 's', 'd', 'f', 'g', 'k', 'j', 'b', 'v', 'c', 'x'
        };
		
		List<String> palabras = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i = 0; i < numPalabras; i++) {
			StringBuilder palabra = new StringBuilder();
			for (int j = 0; j < tamañoPalabra; j++) {
				int indice= random.nextInt(caracteres.length);
				palabra.append(caracteres[indice]);
			}
			
			palabras.add(palabra.toString());
		}
		return palabras;
	}
	
}
