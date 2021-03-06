package fr.boucles;

/**
 * @author Félix Gaillard
 *
 */

public class ExerciceBouclesEtTests {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */
	
	public static void main(String args[]) {
//		Affiche l'ensemble des éléments grâce à une boucle
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		for (int a = 0; a < array.length; a++) {
			System.out.println("Ensemble des éléments du tableau array : " + array[a]);
		}
//		Affiche l'ensemble des éléments dans l'ordre inverse du tableau
		for (int b = array.length - 1; b >= 0; b--) {
			System.out.println("Ensemble des éléments dans l'ordre inverse du tableau array : " + array[b]);
		}
//		Combine une boucle et un test afin de n'afficher que les entiers supérieurs à 3
		for (int c : array) {
			if (c > 3) {
				System.out.println("Entiers supérieurs à 3 : " + c);
			}
		}
//		Combine une boucle et un test afin de n'afficher que les entiers pairs
		for (int d = 0; d < array.length; d++) {
			if (array[d] % 2 == 0) {
				System.out.println("Entiers pairs : " + array[d]);
			}
		}
//		Combine une boucle et un test afin de n'afficher que la valeur des index pairs
		for (int e = 0; e < array.length; e = e + 2) {
			System.out.println("Valeur des index pairs : " + array[e]);
		}
//		Combine une boucle et un test afin de n'afficher que les entiers impairs
		for (int f = 0; f < array.length; f++) {
			if (array[f] % 2 == 1) {
				System.out.println("Entiers impairs : " + array[f]);
			}
		}
	}
}