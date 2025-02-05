package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList<Month> months = new ArrayList<>();
		
		ManageMonths operation = new ManageMonths(months);
			
			months.add(new Month("Enero"));
			months.add(new Month("Febrero"));
			months.add(new Month("Marzo"));
			months.add(new Month("Abril"));
			months.add(new Month("Mayo"));
			months.add(new Month("Junio"));
			months.add(new Month("Julio"));
				
			months.add(new Month("Septiembre"));
			months.add(new Month("Octubre"));
			months.add(new Month("Noviembre"));
			months.add(new Month("Diciembre"));
				
		System.out.println("******* Meses del Año excluyendo Agosto ******* \n");
		
		operation.showMonths();
			
		System.out.println("\nCuando agregamos Agosto en su indice especifico, los elementos que siguen \n"
				+ "se desplazan automaticamente una posicion, esto mantiene el orden correcto en el ArrayList\n");
		
		months.add(7, new Month("Agosto"));
		operation.showMonths();
				
		System.out.println("\n*******Convertimos el ArrayList en un HashSet, Intentamos agregar nuevamente los meses de Noviembre y Diciembre******* \n"
				+ "*******Recorremos el HashSet con un Iterador, vemos que no fueron agregados******* \n"
				+ "*******por lo que comprobamos que no admite duplicados *******\n");
				
		HashSet<Month> months_hs = new HashSet<>(months); 
				
		months_hs.add(new Month("Noviembre"));
		months_hs.add(new Month("Diciembre"));
				
		Iterator<Month> iterador = months_hs.iterator();
				
		while(iterador.hasNext()) {
					Month meses_i = iterador.next();
					System.out.println(meses_i.getName());
		}							
	}

}
