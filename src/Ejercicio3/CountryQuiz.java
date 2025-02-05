package Ejercicio3;

import java.time.LocalDate;
import java.util.Scanner;

public class CountryQuiz {
	
	private ManageCountry manageCountry;
	private int points;
	private String user;
	
	
	public CountryQuiz(ManageCountry manageCountry) {
		
		this.manageCountry = manageCountry;
		this.points = 0;
		
	}
	
	public void StarQuiz() {
		LocalDate currentDate = LocalDate.now();
		LocalDate date = currentDate.now();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese su Usuario: ");
		user = input.nextLine();
		
		System.out.println("Hola " + user + " Debes acertar la mayor cantidad de Capitales. Tienes 10 intentos.\n");
		
		for(int i=1; i<=10; i++) {
			String displayedCountry = manageCountry.showRandomCountry();
			System.out.println("Cual es la capital de: " + displayedCountry + "?");
			String answer = input.nextLine();
			
			if(answer.equalsIgnoreCase(manageCountry.getCapitalCity(displayedCountry))) {
				points += 1;
			}
		}
		
		System.out.println("Finalizado. " + user + ", obtuviste " + points + " puntos.");
		SaveTxt save = new SaveTxt(user, points, date);
        save.save();
	}

}
