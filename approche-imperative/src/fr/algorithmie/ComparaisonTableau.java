package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class ComparaisonTableau {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };
		int sum = 0;
//		Trouve les éléments en commun entre les deux tableaux
		for (int a = 0; a < array1.length; a++) {
			for (int b = 0; b < array2.length; b++) {
				if (array1[a] == array2[b]) {
					++sum;
					System.out.println("Eléments en commun entre les deux tableaux : " + array1[a]);
					System.out.println("Nombre d'éléments en commun entre les deux tableaux : " + sum);
					break;
				}
			}
		}
	}
}