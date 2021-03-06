package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class SommeDeTableaux {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		int[] array1 = new int[] { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = new int[] { -1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, -1 };
//		Créé un tableau qui contient la somme des 2 précédents tableaux
		int sum1 = 0;
		for (int a = 0; a < array1.length; a++) {
			sum1 = sum1 + array1[a];
		}
		System.out.println("Somme des éléments du premier tableau : " + sum1);

		int sum2 = 0;
		for (int b = 0; b < array2.length; b++) {
			sum2 = sum2 + array2[b];
		}
		System.out.println("Somme des éléments du second tableau : " + sum2);

		int sum3 = sum1 + sum2;
		int[] arraySum = new int[] { sum3 };
		for (int c = 0; c < arraySum.length; c++) {
			System.out.println("Somme des éléments des deux tableaux : " + arraySum[c]);
		}
	}
}