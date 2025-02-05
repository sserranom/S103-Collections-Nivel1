package Ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class ManageMonths {
	
	private ArrayList<Month>  months;

	public ManageMonths(ArrayList<Month> months) {
		
		this.months = months;
		
	}
	
	public void showMonths() {
		
		int columns = months.size();
		for (int i=0; i<columns/2; i++) {
			System.out.print(String.format("%-20s", i+1 + "-->" + months.get(i).getName()));
			
			if(i + columns/2 < columns) {	
				System.out.println((i+1 + columns/2) + "--> " + months.get(i + columns / 2).getName());
			}else {
				System.out.println();
			}
		}
	}
	


}
