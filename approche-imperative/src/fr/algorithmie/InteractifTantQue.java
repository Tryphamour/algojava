package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Félix Gaillard
 *
 */

public class InteractifTantQue {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ecrivez un chiffre entre 1 et 10 : ");
		int nb = isInRange(sc, sc.nextInt());
		System.out.println("Le nombre que vous avez choisi est " + nb);
		sc.close();
	}

	public static int isInRange(Scanner scanner, int num) {
		if (num < 1 || num > 10) {
			System.out.println("ERREUR. Veuillez écrire un chiffre entre 1 et 10 : ");
			num = scanner.nextInt();
			isInRange(scanner, num);
		}
		return num;
	}
}
