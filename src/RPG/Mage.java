package RPG;

import java.util.HashMap;
import java.util.Map;

public class Mage extends Personnages {
	Map<String, String> grimoire;

	public Mage() {
		super(1);

		initialisation();
		this.vitalite = 30;
		this.vitaliteMax = 30;
		this.attaque = 5;
		this.defense = 2;
		this.initiative = 5;
		this.critique = 5;
		this.mana = 25;
		this.manaMax = 25;
		this.grimoire = new HashMap<String, String>();
		this.grimoire.put("Etincelle", "Lance des étincelles sur l'adversaire");
	}

	void description() {
		// Permet d'afficher la description du personnage
		System.out.println(
				"Le mage est un personnage jouant autour de la magie et de différents sorts et armes magiques, il ne possède que des vêtements rudimentaires");
	}

	void listeDesSorts() {
		for (Map.Entry<String, String> entree : this.grimoire.entrySet()) {
			System.out.println(entree.getKey() + " : " + entree.getValue());
		}

	}

}
