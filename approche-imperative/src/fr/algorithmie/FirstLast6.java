package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class FirstLast6 {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		int[] array = { 1, 15, 3, 8, 7, 4, 2, 28, 1, 17, 2, 3, 0, 14, 4 };
		if (array.length >= 1) {
			System.out.println("Le tableau contient au moins 1 élément");
		} else if (array[0] == 6 || array[array.length-1] == 6) {
			System.out.println("Le premier élément ou le dernier élément du tableau vaut 6");
		} else {
			System.out.println("Le tableau ne contient pas d'élément");
		}
	}
}
