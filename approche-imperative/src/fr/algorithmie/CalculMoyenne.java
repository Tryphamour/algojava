package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class CalculMoyenne {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
//		Calcul la moyenne des éléments du tableau
		int length = array.length;
		int sum = 0;
		for (int a = 0; a < array.length; a++) {
			sum += array[a];
		}
		int average = sum / length;
		System.out.println("Moyenne des éléments du tableau : " + average);
	}
}