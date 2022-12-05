package RPG;

import java.util.Scanner;

public class Personnages {

	private static Scanner scanNom;

	String nom;
	int level;
	int attaque;
	int defense;
	int initiative;
	int critique;
	int mana;
	int manaMax;
	int vitalite;
	int vitaliteMax;

	public Personnages(int lvl) {
		this.level = lvl;

	}

	public String toString() {
		return ("Nom : " + this.nom + 
				" Niveau : " + this.level + 
				" Vitalité : " + this.vitalite + " / " + this.vitaliteMax +
				" Attaque : " + this.attaque + 
				" Defense : " + this.defense + 
				" Initiative : " + this.initiative + 
				" Critique : " + this.critique + 
				" Mana : " + this.mana + " / " + this.manaMax);

	}

	void initialisation() {
		scanNom = new Scanner(System.in);
		System.out.print("Entrez le nom de votre personnage \n");

		this.nom = scanNom.nextLine();
	}

	void showStats() {
		System.out.println(" Vitalité : " + this.vitalite + "/" + this.vitaliteMax + "\n Attaque : " + this.attaque + "\n Defense : " + this.defense + "\n Initiative : "
				+ this.initiative + "\n Chance de critique : " + this.critique + " %\n Mana : " + this.mana + "/" + this.manaMax);
	}

	void showMainMenu() {
		//Permet d'afficher le menu principal, avant une nouvelle partie

	}

	void showPauseMenu() {
		//Permet d'afficher le menu principal pendant les phases hors combat

	}

	void showFightMenu() {
		//Permet d'afficher les choix pendant le combat

	}

	void heal(int x) {
		this.vitalite += x;
		if (this.vitalite > this.vitaliteMax) {
			this.vitalite = this.vitaliteMax;
		}


	}

}
