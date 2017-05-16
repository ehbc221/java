import java.util.Scanner;
import java.lang.Math;

/**
 * Exercice6
 */
public class Exercice6 {

    static int MAX = 10;

    /*
        On dénomme nombre de Armstrong un entier naturel qui est égal à la somme des cubes des chiffres qui le composent.
        Ecrire et tester une fonction qui teste et affiche tous les nombres d’Armstrong entre 1 et 1000.
    */
    public static int decomposerNombre(int nombre, int chiffres[]) {
        int compteur = 0;
        while (nombre != 0) {
            chiffres[compteur++] = nombre % 10;
            nombre /= 10;
        }
        return compteur;
    }

    public static boolean testNombreAmstrong(int nombre) {
        boolean test = false;
        int somme = 0, produit = 1, compteur = 0;
        int chiffres[] = new int[MAX];
        compteur = decomposerNombre(nombre, chiffres);
        for (int i = 0; i < compteur; i++) {
            produit = (int) Math.pow(chiffres[compteur-i-1], 3);
            somme += produit;
        }
        if (nombre == somme) {
            test = true;
            System.out.print(nombre + "\t");
        }
        return test;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean test = false, essai = false;
        int nombre = 1000;
        System.out.println("Voici les nombres de Amstrong entre 1 et 1000 :");
        for (int i = 1; i <= nombre; i++) {
            test = testNombreAmstrong(i);
            if (test) {
                essai = true;
            }
        }
        System.out.print("\n");
        if (!essai) {
            System.out.println("Il n'y a aucun nombre de Armstrong entre 1 et 1000.");
        }
    }

}