package Ejercicio2;

import java.util.ListIterator;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*******Creamos la Lista y le añadimos los numeros del 1 -100 *******\n");
		
		List<Integer> numbers = new ArrayList<>();
		
		for(int i=0; i<=100; i++) {
			
			numbers.add(i);
		}	
		
		for (Integer num : numbers) {
			
			System.out.print(num + " ");
		}
		
		System.out.println("\n\n******* Creamos la Segunda Lista y añadimos los Elementos de la primer Lista en orden Inverso Utilizando ListIterator*******\n");
		
		List<Integer> numbers2 = new ArrayList<>();
		
		ListIterator<Integer> iterador = numbers.listIterator(numbers.size());
		
			while(iterador.hasPrevious()) {
				numbers2.add(iterador.previous());
		    }
			
			for (Integer num2 : numbers2) {				
				System.out.print(num2 + " ");
			}
			
	}
	    
}
