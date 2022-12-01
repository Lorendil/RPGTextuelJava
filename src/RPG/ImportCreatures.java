package RPG;

import java.io.*;

public class ImportCreatures {
	public static void main(String[] args) throws Exception {

		String ligne = "";
		String splitBy = "	";

		try (BufferedReader br = new BufferedReader(new FileReader("RPGTextuelJava/src/RPG/creatures.csv"))) {
			while ((ligne = br.readLine()) != null) {
				String[] listeDesCreatures = ligne.split(splitBy);
				System.out.println("Nom : " + listeDesCreatures[0] + " - Rareté : " + listeDesCreatures[1]);
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}
}
