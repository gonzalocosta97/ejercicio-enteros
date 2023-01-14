package ar.com.gonzacostaweb.ejercicio_enteros;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero: ");
		System.out.println();
		
		int numeroIngresado = entrada.nextInt();
		System.out.println();
		
		String numeroACadena = Integer.toString(numeroIngresado);
		
		char[] numeroEnCaracteres = numeroACadena.toCharArray();
		
		int j = 1;
		
		do {
		
			for(int i = 0; i < j ; i++) {
				
				System.out.print(numeroEnCaracteres[i]);
				
			}
						
			System.out.println();
			j++;
		
		} while( j <= numeroEnCaracteres.length);
		
		
		entrada.close();
			
	}
	
}
