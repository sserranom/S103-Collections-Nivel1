package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Month> meses = new ArrayList<>();
		
		//2 . Añade 11 objetos Month (cada uno con su atributo diferente) en un ArrayList, a excepción del objeto con atributo "Agost"
			
				meses.add(new Month("Enero"));
				meses.add(new Month("Febrero"));
				meses.add(new Month("Marzo"));
				meses.add(new Month("Abril"));
				meses.add(new Month("Mayo"));
				meses.add(new Month("Junio"));
				meses.add(new Month("Julio"));
				
				meses.add(new Month("Septiembre"));
				meses.add(new Month("Octubre"));
				meses.add(new Month("Noviembre"));
				meses.add(new Month("Diciembre"));
			
			
		//Imprimo los elementos del ArrayList agregados pero excluyendo el mes de agosto	
				
			System.out.println("******* Meses del Año excluyendo Agosto ******* \n");
			
			int columna = meses.size();
			for (int i=0; i<columna/2; i++) {
				
				System.out.print(String.format("%-20s", i+1 + "-->" + meses.get(i).getNombre()));
				
				if(i + columna/2 < columna) {
					
					System.out.println((i+1 + columna/2) + "--> " + meses.get(i + columna / 2).getNombre());
					
				}else {
					
					System.out.println();
				}
			}
			
			
			/* 3.  Después, efectúa la inserción en el sitio que corresponde a este mes y demuestra que 
			ArrayList mantiene el orden correcto.*/
			
				meses.add(7, new Month("Agosto"));
			
				System.out.println();
				System.out.println("******* Meses del Año Completos ******* \n");
				
				int columna1 = meses.size();
				for (int i=0; i<columna1/2; i++) {
					
					System.out.print(String.format("%-20s", i+1 + "-->" + meses.get(i).getNombre()));
					
					if(i + columna1/2 < columna) {
						
						System.out.println((i+1 + columna1/2) + "--> " + meses.get(i + columna1 / 2).getNombre());
						
					}else {
						
						System.out.println();
					}
				}
				
				System.out.println("Cuando agregamos Agosto en su indice especifico, los elementos que siguen \n"
						+ "se desplazan automaticamente una posicion, esto mantiene el orden correcto en el ArrayList\n");
				
				
			//4. Convierte ArrayList del ejercicio anterior en un HashSet y asegúrate de que no permite duplicados.
				
				HashSet<Month> mesesConvertidos = new HashSet<>(meses); 
				
				mesesConvertidos.add(new Month("Noviembre"));
				mesesConvertidos.add(new Month("Diciembre"));
			
				
			//5. Recorre la lista con un for 
				System.out.println("******* Intentamos agregar nuevamente los meses de Noviembre y Diciembre******* \n"
						+ "*******Recorremos el HashSet con un For each, vemos que no fueron agregados******* \n"
						+ "*******por lo que comprobamos que no admite duplicados *******\n");
				
				for (Month mes : mesesConvertidos) {
					
					System.out.println(mes.getNombre());
				}

				
				// 6. Recorre la lista con un iterador.
				
				System.out.println("\n*******Recorremos la Lista con un Iterador *******\n");
				
				Iterator<Month> iterador = meses.iterator();
				
				while(iterador.hasNext()) {
					Month meses_i = iterador.next();
					System.out.println(meses_i.getNombre());
				}
;				
				
	}

}
