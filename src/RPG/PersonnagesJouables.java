package RPG;

import java.util.Scanner;

public class PersonnagesJouables {

	private static Scanner scanNom;

	String nom;
	int attaque;
	int defense;
	int initiative;
	int critique;
	int mana;
	int vitalite;

	public PersonnagesJouables() {
		// On ajouter le this.nom
		initialisation();
	}

	private void initialisation() {
		scanNom = new Scanner(System.in);
		System.out.print("Entrez le nom de votre personnage \n");

		this.nom = scanNom.nextLine();
	}

	void showStats() {
		System.out.println("Vitalité : " + this.vitalite + "\n Attaque : " + this.attaque + "\n Defense : " + this.defense + "\n Initiative : "
				+ this.initiative + "\n Chance de critique : " + this.critique + "\n Mana : " + this.mana);
	}

}
