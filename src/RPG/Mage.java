package RPG;

public class Mage extends Personnages {
	public Mage() {
		initialisation();
		this.vitalite = 30;
		this.vitaliteMax = 30;
		this.attaque = 5;
		this.defense = 5;
		this.initiative = 0;
		this.critique = 5;
		this.mana = 20;
		this.manaMax = 20;
	}

}
