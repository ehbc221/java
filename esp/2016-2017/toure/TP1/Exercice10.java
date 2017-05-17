import java.util.Scanner;

/**
 * Exercice10
 */
public class Exercice10 {

    /*
        Tout entier positif j peut être écrit sous la forme :
                        j = 2 n (2s + 1), avec n, s ∊ N.
        Etant donné un entier j, écrire un programme java qui calcule n et s satisfaisant à l‘équation.
    */
    public static void calculEquation(long j) {
        long n = 0, s = 0, j_copie = j;
        if ((j_copie % 2) != 0) {
            // n = 0;
            s = (j_copie - 1) / 2;
        }
        else {
            n = 1;
            while ((j_copie / 2 % 2) == 0) {
                n++;
                j_copie /= 2;
            }
            s = ((j_copie / 2) - 1) / 2;
        }
        afficherResultat(j, n, s);
    }

    // Fonction pour afficher le résultat après la résolution de l'équation
    public static void afficherResultat(long j, long n, long s) {
        System.out.println("j = 2^n (2s + 1)");
        System.out.println("On a j = " + j + ", d'ou n = " + n + " et s = " + s);
        System.out.println("L'equation devient donc : " + j + " = 2^" + n + " (2 X " + s + " + 1)\n");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long j = 22;
        String saisie;
        boolean valide = true;
        // Control de saisie sur le nombre
        do {
            valide = true;
            System.out.print("Donnez j : ");
            saisie = sc.nextLine();
            // On teste d'abord si c'est un long qui a été saisi
            try {
                j = Long.parseLong(saisie);
            } catch (NumberFormatException e) {
                valide = false;
            }
            // Si oui, on vérifie qu'il est bien positif(>0)
            if (valide) {
                valide = (j >= 0);
            }
        } while (valide == false);
        calculEquation(j);
    }

}