package Ejercicio3;

public class Main {

	public static void main(String[] args) {

		ManageCountry countries = new ManageCountry();
		CountryQuiz quiz = new CountryQuiz(countries);

		countries.loadCountries();
		quiz.StarQuiz();
		
			
	}
		

}
