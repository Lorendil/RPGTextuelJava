package RPG;

public class Jeu {
	public static void main(String[] args) {
		int salle = 1;

		boolean statutPartie = true;

		MecanismesDeJeu partie = new MecanismesDeJeu();

		partie.showMainMenu();
		System.out.println(partie.joueur);
		// partie.joueur.heal(-100);
		System.out.println(partie.joueur);

		while (salle < 21 && statutPartie) {
			System.out.println("\n Vous entrez dans la salle n°" + salle);
			partie.salle(salle, partie.joueur);
			

			if (partie.joueur.vitalite <= 0) {
				System.out.println("Vous avez péri, partie terminée");
				statutPartie = false;
			}
			else {
				partie.intersalles(salle, partie.joueur);
				salle += 1;
			}
		}
		if (salle == 21){
			System.out.println("Bravo, vous avez gagné la partie !");
		}
	}
}
