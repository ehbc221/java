import java.util.Scanner;

/**
 * Exercice3
 */
public class Exercice3 {

    // Ecrire et tester une fonction qui multiplie deux valeurs saisies a et b et affiche le résultat de la multiplication.
    public static void multiplierEtAfficher(int a, int b) {
        int produit = 0;
        if (b % 2 == 0) {
            produit = a * (b - 1) + a;
        }
        else if (b % 2 != 0 && b != 0) {
            produit = 2 * a * b / 2;
        }
        System.out.println("La multiplication de " + a + " par " + b + " donne " + produit + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.print("Donnez a : ");
        a = sc.nextInt();
        System.out.print("Donnez b : ");
        b = sc.nextInt();
        multiplierEtAfficher(a, b);
    }

}