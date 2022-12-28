package RPG;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MecanismesDeJeu {

	Personnages joueur;
	Map Bestiaire = ImportCreatures.main();

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
	public Creature Monstre(int salle) {
		int difficulte = ThreadLocalRandom.current().nextInt((salle * 4), (61 + (salle * 2)) );
		String rarete;

		if (difficulte <= 60) {
			rarete = "Commun";
		}
		else if (difficulte <= 85) {
			rarete = "Peu Commun";
		}
		else if (difficulte <= 95) {
			rarete = "Rare";
		}
		else {
			rarete = "Unique";
		}
		List <Creature> listeMonstre = new ArrayList<>();
		listeMonstre = (List<Creature>) Bestiaire.get(rarete);
		Creature monstre = listeMonstre.get(ThreadLocalRandom.current().nextInt(0, listeMonstre.size()));
		System.out.println("Les dés ont été tirés, c'est un " + difficulte + " ce qui correspond à un monstre " + rarete);
		System.out.println(monstre);

		return monstre;
	}

	void salle(int numeroDeLaSalle) {
		Monstre(numeroDeLaSalle);


	}

	void intersalles(int numeroDeLaSalle) {
		if (numeroDeLaSalle == 5 || numeroDeLaSalle == 10 || numeroDeLaSalle == 15) {
			System.out.println("Vous gagnez un niveau, sélectionnez votre bonus");
		}

	}

	// public static Scanner scannerMenu;

	public void showMainMenu() {
		// Permet d'afficher le menu principal, avant une nouvelle partie
		Personnages joueur = null;
		int choice = 0;
		Boolean stepValide = false;
		Scanner input; 
		input = new Scanner(System.in);
		

		System.out.println(
				"Bienvenue dans ce RPG textuel où vous incarnez un personnage parmis 3 classes et où vous entrerez dans 20 étages et affronter des monstres");

		while (!stepValide) {
			System.out.println("1 : Lancer le jeu");
			try  {
				choice = input.nextInt();
				
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
				try {

					choice = input.nextInt();
					

				} catch (InputMismatchException e) {
					System.out.println("Oupsie c'est pas un chiffre qui est renseigné");
					stepValide = false;
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
			this.joueur = joueur;
		}
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