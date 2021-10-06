package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class FirstLast {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		int[] array = { 1, 15, 3, 8, 7, 4, 2, 28, 1, 17, 2, 3, 0, 14, 4 };
		if (array.length >= 1) {
			System.out.println("Le tableau contient au moins 1 élément");
		} else if (array[0] == array[array.length] - 1) {
			System.out.println("Le premier élément et le dernier élément ont la même valeur");
		} else {
			System.out.println("Le tableau ne contient pas d'élément");
		}
	}
}	