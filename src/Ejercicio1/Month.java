package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;

public class Month {
	
		private String name;
	
		public Month(String name) {	
			this.name = name;	
		}
		
		public void setName() {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		@Override
		public boolean equals(Object obj) {
			
		    if (this == obj) return true;
		    if (obj == null || getClass() != obj.getClass()) return false;
		    Month months = (Month) obj;
		    return months.equals(months.name);
		    
		}
		
		@Override
		public int hashCode() {
		    return name.hashCode();
		
		}
}
	
	
	
	
	





