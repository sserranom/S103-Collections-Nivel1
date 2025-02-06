package Ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ManageCountry {

	String path = "recursos/countries.txt";
	Map<String, Country> countries = new HashMap<>();

	public void loadCountries() {

		try {
			List<String> lines = Files.readAllLines(Paths.get(path));

			for (String line : lines) {
				String[] parts = line.split(" ", 2);

				if (parts.length == 2) {
					String countryName = parts[0];
					String capitalCity = parts[1];

					Country country = new Country(countryName, capitalCity);
					countries.put(countryName, country);
				}
			}

			System.out.println("...Se ha cargado las Base de datos de Paises \n");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public String showRandomCountry() {
		Random rand = new Random();

		Object[] keys = countries.keySet().toArray();
		String randomCountry = (String) keys[rand.nextInt(keys.length)];
		Country country = countries.get(randomCountry);
		return country.getCountryName();

	}

	public String getCapitalCity(String countryName) {
		Country country = countries.get(countryName);
		return (country != null) ? country.getCapitalCity() : "País no encontrado";
	}

}

