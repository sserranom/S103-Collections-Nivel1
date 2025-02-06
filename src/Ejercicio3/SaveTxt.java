package Ejercicio3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SaveTxt {

	String fileName = "recursos/classificacio.txt";
	String userName;
	int points;
	LocalDate date;

	public SaveTxt(String userName, int points, LocalDate date) {

		this.userName = userName;
		this.points = points;
		this.date = date;
	}

	public void save() {

		try (FileWriter writer = new FileWriter(fileName, true)) {
			writer.write("Usuario: " + userName + "  " + "Puntuación: " + points + "  " + "Fecha: " + date + "\n");
			System.out.println("Texto guardado correctamente en " + fileName);
		} catch (IOException e) {
			System.out.println("Ocurrió un error al guardar el archivo: " + e.getMessage());
		}

	}
}
