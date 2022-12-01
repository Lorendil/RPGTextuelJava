package RPG;

public class Voleur extends Personnages {
	public Voleur() {
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

}