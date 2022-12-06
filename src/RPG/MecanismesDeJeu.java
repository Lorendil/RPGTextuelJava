package RPG;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class MecanismesDeJeu {
	void combat(Personnages joueur, Creature adversaire) {

	}

	int calculDesDegats(Personnages attaquant, Personnages defenseur) {
		int bonusAttaquant = 0;
		int bonusDefenseur = 0;
		Random randomizer = new Random();
		int testCrit = 0;
		int total;

		testCrit = randomizer.nextInt(100) + 1;
		if (attaquant.critique >= testCrit) {
			bonusAttaquant = (attaquant.attaque / 2);
		}

		total = (attaquant.attaque + bonusAttaquant) - (defenseur.defense + bonusDefenseur);

		return total;
	}

	void salle(int numeroDeLaSalle) {
		if (numeroDeLaSalle == 5 || numeroDeLaSalle == 10 || numeroDeLaSalle == 15) {
			System.out.println("Vous gagnez un niveau, sélectionnez votre bonus");
		}

	}

	void intersalles() {

	}

	public static Scanner scannerMenu;

	public Personnages showMainMenu() {
		// Permet d'afficher le menu principal, avant une nouvelle partie
		Personnages joueur = null;
		int choice = 0;
		Boolean stepValide = false;

		System.out.println(
				"Bienvenue dans ce RPG textuel où vous incarnez un personnage parmis 3 classes et où vous entrerez dans 20 étages et affronter des monstres");

		while (!stepValide) {
			System.out.println("1 : Lancer le jeu");
			try (Scanner scannerMenu = new Scanner(System.in)) {

				choice = scannerMenu.nextInt();
			}

			catch (InputMismatchException e) {
				System.out.println("Oupsie c'est pas un chiffre qui est renseigné");
				stepValide = false;
			}
			if (choice == 1 | choice == 2) {
				stepValide = true;
			} else {
				System.out.println("Ce choix n'est pas disponible");
			}
		}
		if (choice == 1) {
			choice = 0;
			stepValide = false;

			while (!stepValide) {
				System.out.println("Choisissez la classe de votre personnage !\n"
						+ "1 : Guerrier \n2 : Mage \n3 : Voleur \n4 : Description des classes");
				try (Scanner scannerMenu = new Scanner(System.in)) {

					choice = scannerMenu.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Oupsie c'est pas un chiffre qui est renseigné");
					stepValide = false;
				}
			}
			if (choice == 1) {
				joueur = new Guerrier();
				stepValide = true;
			} else if (choice == 2) {
				joueur = new Mage();
				stepValide = true;
			} else if (choice == 3) {
				joueur = new Voleur();
				stepValide = true;
			}
		}
		return joueur;

	}

	void showPauseMenu() {
		// Permet d'afficher le menu principal pendant les phases hors combat

	}

	void showFightMenu() {
		// Permet d'afficher les choix pendant le combat

	}

	void equipement() {

	}

}