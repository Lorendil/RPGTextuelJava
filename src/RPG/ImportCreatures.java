package RPG;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportCreatures {
	public static void main(String[] args) throws Exception {

		String ligne = "";
		String splitBy = "	";
		String testRarete;
		int numeroLigne = 0;
		Creature newCreature = new Creature();
		Map<String, List>bestiaire = new HashMap<>();
		List<Creature> listeCommun = new ArrayList<Creature>();
		List<Creature> listePeuCommun = new ArrayList<Creature>();
		List<Creature> listeRare = new ArrayList<Creature>();
		List<Creature> listeUnique = new ArrayList<Creature>();

		try (BufferedReader br = new BufferedReader(new FileReader("RPGTextuelJava/src/RPG/creatures.csv"))) {
			while ((ligne = br.readLine()) != null) {
				String[] listeDesCreatures = ligne.split(splitBy);
				//System.out.println("Nom : " + listeDesCreatures[0] + " - Rareté : " + listeDesCreatures[1]);

				if (numeroLigne > 0) {
					testRarete = listeDesCreatures[1].toString();
					System.out.println(numeroLigne + " - " + testRarete);

					if (testRarete == "Commun"){
						System.out.println("Commun");
						newCreature.nom = listeDesCreatures[0];
						newCreature.rarete = listeDesCreatures[1];
						newCreature.vitalite = Integer.parseInt(listeDesCreatures[2]);
						newCreature.attaque = Integer.parseInt(listeDesCreatures[3]);
						newCreature.defense = Integer.parseInt(listeDesCreatures[4]);
						newCreature.initiative = Integer.parseInt(listeDesCreatures[5]);
						newCreature.critique = Integer.parseInt(listeDesCreatures[6]);
						newCreature.mana = Integer.parseInt(listeDesCreatures[7]);
						listeCommun.add(newCreature);
					}
					else if(listeDesCreatures[1] == "Peu Commun"){
						newCreature.nom = listeDesCreatures[0];
						newCreature.rarete = listeDesCreatures[1];
						newCreature.vitalite = Integer.parseInt(listeDesCreatures[2]);
						newCreature.attaque = Integer.parseInt(listeDesCreatures[3]);
						newCreature.defense = Integer.parseInt(listeDesCreatures[4]);
						newCreature.initiative = Integer.parseInt(listeDesCreatures[5]);
						newCreature.critique = Integer.parseInt(listeDesCreatures[6]);
						newCreature.mana = Integer.parseInt(listeDesCreatures[7]);
						listePeuCommun.add(newCreature);

					}
					else if(listeDesCreatures[1] == "Rare"){
						newCreature.nom = listeDesCreatures[0];
						newCreature.rarete = listeDesCreatures[1];
						newCreature.vitalite = Integer.parseInt(listeDesCreatures[2]);
						newCreature.attaque = Integer.parseInt(listeDesCreatures[3]);
						newCreature.defense = Integer.parseInt(listeDesCreatures[4]);
						newCreature.initiative = Integer.parseInt(listeDesCreatures[5]);
						newCreature.critique = Integer.parseInt(listeDesCreatures[6]);
						newCreature.mana = Integer.parseInt(listeDesCreatures[7]);
						listeRare.add(newCreature);

					}
					else if(listeDesCreatures[1] == "Unique"){
						newCreature.nom = listeDesCreatures[0];
						newCreature.rarete = listeDesCreatures[1];
						newCreature.vitalite = Integer.parseInt(listeDesCreatures[2]);
						newCreature.attaque = Integer.parseInt(listeDesCreatures[3]);
						newCreature.defense = Integer.parseInt(listeDesCreatures[4]);
						newCreature.initiative = Integer.parseInt(listeDesCreatures[5]);
						newCreature.critique = Integer.parseInt(listeDesCreatures[6]);
						newCreature.mana = Integer.parseInt(listeDesCreatures[7]);
						listeUnique.add(newCreature);

					}
				}
				numeroLigne += 1;
			}
			
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(listeUnique);
		bestiaire.put("Commun", listeCommun);
		bestiaire.put("Peu Commun", listePeuCommun);
		bestiaire.put("Rare", listeRare);
		bestiaire.put("Unique", listeUnique);

	}
}
