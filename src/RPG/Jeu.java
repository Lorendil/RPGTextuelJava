package RPG;

public class Jeu {
	public static void main(String[] args) {
		int salle = 1;

		MecanismesDeJeu partie = new MecanismesDeJeu();

		partie.menuDeJeu();

		while (salle < 21) {
			partie.salle(salle);
			partie.intersalles();
			salle += 1;
		}
		System.out.println("Bravo, vous avez gagné la partie !");
	}
}
