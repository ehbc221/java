import java.util.Scanner;
import java.lang.Math;

/**
 * Exercice8
 */
public class Exercice8 {

    public static void sousEnsembles(String tableau[]) {
        int compteur = 0, taille = 0;
        taille = tableau.length;
        compteur = (int) Math.pow(2, compteur);
        for (int i = 0; i < compteur; i++) {
            if (i == 0) {
                System.out.println("@");
            }
            for (int j = 0; j < taille; j++) {
                System.out.print(tableau[j]);
            }
        }
    }

    public static void main(String[] args) {
        String tableau[] = {"o", "1", "e"};
    }

}