package fr.boucles;

/**
 * @author Félix Gaillard
 *
 */
public class ExerciceTableauEntier {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String args[]) {
//		Tableau contenant tous les entiers de 1 à 10
		int[] tableauEntiers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

//		Affiche le premier élément du tableau
		System.out.println("Premier élément du tableau : " + tableauEntiers[0]);

//		Affiche la longueur du tableau
		System.out.println("Longueur du tableau : " + tableauEntiers.length);

//		Affiche le dernier élément du tableau
		System.out.println("Dernier élément du tableau : " + tableauEntiers[tableauEntiers.length - 1]);

//		Modifie la valeur de l'élément d'index 4 et lui donne la valeur 8
		tableauEntiers[4] = 8;
		System.out.println("Nouvelle valeur de l'élément d'index 4 : " + tableauEntiers[4]);
	}
}