package fr.algorithmie;

/**
 * @author Félix Gaillard
 *
 */

public class RechercheMin {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
//		Recherche le plus petit élément du tableau 
		int min = array[0];
		for (int a = 0; a<array.length; a++) {
			if(array[a] < min)
				min = array[a];
		}
		System.out.println("Plus petit élément du tableau : " + min);

	}
}