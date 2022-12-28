package RPG;

public class Jeu {
	public static void main(String[] args) {
		int salle = 1;
		boolean statutPartie = true;

		MecanismesDeJeu partie = new MecanismesDeJeu();

		partie.showMainMenu();
		System.out.println(partie.joueur);
		partie.joueur.heal(-100);
		System.out.println(partie.joueur);

		while (salle < 21 && statutPartie) {
			partie.salle(salle);
			partie.intersalles();
			salle += 1;
			if (partie.joueur.vitalite <= 0) {
				System.out.println("Vous avez péri, partie terminée");
				statutPartie = false;
			}
		}
		if (salle == 21){
			System.out.println("Bravo, vous avez gagné la partie !");
		}
	}
}
