package RPG;

public class Guerrier extends Personnages {
	public Guerrier() {
		super(1);
		initialisation();
		this.vitalite = 50;
		this.vitaliteMax = 50;
		this.attaque = 10;
		this.defense = 10;
		this.initiative = 5;
		this.critique = 5;
		this.mana = 0;
		this.manaMax = 0;
	}

	void description(){
		//Permet d'afficher la description du personnage
		System.out.println("Le guerrier est un personnage jouant autour du combat frontal affrontant ses capacités face à celles de ses adversaires, il possède plus de puissance et d'armure que les autres personnages");
	}

}
