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
        System.out.println("On a j = " + j + ", d'où n = " + n + " et s = " + s);
        System.out.println("L'équation devient donc : " + j + " = 2^" + n + " (2 X " + s + " + 1)\n");
    }

    public static void main(String[] args) {
        long j = 22, k = 17, l = 21, m = 36, n = 16;
        calculEquation(j);
        calculEquation(k);
        calculEquation(l);
        calculEquation(m);
        calculEquation(n);
    }

}