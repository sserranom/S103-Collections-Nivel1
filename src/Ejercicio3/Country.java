package Ejercicio3;

public class Country {

	private String countryName;
	private String capitalCity;

	public Country(String countryName, String capitalCity) {
		this.countryName = countryName;
		this.capitalCity = capitalCity;
	}

	public String getCountryName() {
		return countryName;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	@Override
	public String toString() {
		return countryName + ": " + capitalCity;
	}

}
