package fr.algorithmie;

import java.util.Scanner;

/**
 * @author Félix Gaillard
 *
 */

public class InteractifSommeArithmetique {

	/**
	 * Classe pour un exercice en tp
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ecrivez un chiffre : ");
		int nb = sc.nextInt();
		sc.close();
		System.out.println("Le nombre que vous avez choisi est " + nb);
		for (int i = 1; i < nb; i++) {
			
		}
	}
}