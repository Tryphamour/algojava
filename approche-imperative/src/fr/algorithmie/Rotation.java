package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class Rotation {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] array = { 1, 15, 3, 8, 7, 4, 2, 28, 1, 17, 2, 3, 0, 14, 4 };
		int n = 1;
		System.out.println("Tableau de départ : ");
		for (int a = 0; a < array.length; a++) {
			System.out.println(array[a] + " ");
		}
		for (int a = 0; a < n; a++) {
			int b, last;
			last = array[array.length - 1];
			for (b = array.length - 1; b > 0; b--) {
				array[b] = array[b-1];
			}
			array[0] = last;
		}
		System.out.println("Tableau après une rotation vers la droite : ");
		for(int a=0; a<array.length;a++) {
			System.out.println(array[a] + " ");
		}
	}
}