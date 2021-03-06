package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class AffichagePartiel {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
//		Combine une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
		for (int a : array) {
			if (a > 3) {
				System.out.println("Entiers supérieurs à 3 : " + a);
			}
		}
//		Combine une boucle et un test afin de n'afficher que les entiers pairs
		for (int b = 0; b < array.length; b++) {
			if (array[b] % 2 == 0) {
				System.out.println("Entiers pairs : " + array[b]);
			}
		}
//		Combine une boucle et un test de manière à n’afficher que les valeurs correspondant aux index pairs
		for (int c = 1; c < array.length; c = c + 2) {
			System.out.println("Valeur des index impairs : " + array[c]);
		}
//		Combine une boucle et un test de manière à n’afficher que les entiers impairs
		for (int d = 0; d < array.length; d++) {
			if (array[d] % 2 == 1) {
				System.out.println("Entiers impairs : " + array[d]);
			}
		}
	}
}