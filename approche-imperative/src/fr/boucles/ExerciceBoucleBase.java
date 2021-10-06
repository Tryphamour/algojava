package fr.boucles;

/**
 * @author Félix Gaillard
 *
 */

public class ExerciceBoucleBase {
	
	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
//		Affiche tous les chiffres de 1 à 10
		for (int chiffresDeUnADix = 1; chiffresDeUnADix <= 10; chiffresDeUnADix++) {
			System.out.println("Tous les chiffres de 1 à 10 : " + chiffresDeUnADix);
		}
//		Affiche 20 fois mon nom et mon prénom
		for (int nomPrenom = 0; nomPrenom < 20; ++nomPrenom) {
			System.out.println("Nom et Prénom : Gaillard Félix");
		}
//		Affiche les éléments pairs de 2 à 100
		for (int nombrePair = 1; nombrePair <= 100; nombrePair++) {
			if (nombrePair % 2 == 0) {
				System.out.println("Eléments pairs de 2 à 100 : " + nombrePair);
			}
		}
//		Affiche les éléments impairs de 1 à 99
		for (int nombreImpair = 1; nombreImpair <= 99; nombreImpair++) {
			if (nombreImpair % 2 == 1) {
				System.out.println("Eléments impairs de 1 à 99 : " + nombreImpair);
			}
		}
	}
}