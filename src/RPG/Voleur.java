package RPG;

public class Voleur extends Personnages {
	public Voleur() {
		super(1);
		initialisation();
		this.vitalite = 30;
		this.vitaliteMax = 30;
		this.attaque = 5;
		this.defense = 5;
		this.initiative = 10;
		this.critique = 25;
		this.mana = 0;
		this.manaMax = 0;
	}

	void description() {
		System.out.println(
				"Le voleur est un personnage jouant autour de la priorité d'attaque et des coups critiques, il possède une faible armure lui permettant d'encaisser quelques dégâts");
	}

}