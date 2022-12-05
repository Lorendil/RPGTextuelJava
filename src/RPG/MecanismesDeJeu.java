package RPG;

import java.util.Random;

public class MecanismesDeJeu {
    void combat (Personnages joueur, Creature adversaire){

    }

    int calculDesDegats(Personnages attaquant, Personnages defenseur){
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

    void salle(int numeroDeLaSalle){
        if (numeroDeLaSalle == 5 || numeroDeLaSalle == 10 || numeroDeLaSalle == 15) {
            System.out.println("Vous gagnez un niveau, sélectionnez votre bonus");
        }

    }
    void intersalles(){

    }
    void menuDeJeu(){

    }
    void equipement(){
        
    }

}