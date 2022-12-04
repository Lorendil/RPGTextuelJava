package RPG;

public class Guerrier extends Personnages {
	public Guerrier() {
		super(1);
		initialisation();
		this.vitalite = 50;
		this.vitaliteMax = 50;
		this.attaque = 10;
		this.defense = 10;
		this.initiative = 0;
		this.critique = 5;
		this.mana = 0;
		this.manaMax = 0;
	}

}
