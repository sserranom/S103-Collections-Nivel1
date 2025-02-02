package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;

//1. Crea una clase llamada Month con un atributo "name" (que almacenará el nombre del mes del año).

public class Month {
	
		private String nombre;
		
		public Month(String nombre) {
			
			this.nombre = nombre;	
			
		}
		
		public void setNombre() {
			
			this.nombre = nombre;
			
		}
		
		public String getNombre() {
			
			return nombre;
			
		}
		
		public boolean equals(Object obj) {
			
		    if (this == obj) return true;
		    if (obj == null || getClass() != obj.getClass()) return false;
		    Month meses = (Month) obj;
		    return nombre.equals(meses.nombre);
		    
		}
		
		public int hashCode() {
		    return nombre.hashCode();
		
			
		}
		
}
	
	
	
	
	





