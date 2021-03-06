package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class InversionContenu {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
//		Créé un tableau arrayCopy et copie tous les éléments de array dans arrayCopy mais dans l'ordre inverse, puis affiche l'ensemble des éléménts des 2 tableaux
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		int[] arrayCopy = new int[array.length];
		for (int a = 0; a < arrayCopy.length; a++) {
			arrayCopy[a] = array[array.length - 1 - a];
			System.out.println("Eléments du tableau arrayCopy : " + arrayCopy[a]);
		}
		for (int b = 0; b < array.length; b++) {
			System.out.println("Eléments du tableau array : " + array[b]);
		}
	}
}