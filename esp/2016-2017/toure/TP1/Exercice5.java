import java.util.Scanner;

/**
 * Exercice5
 */
public class Exercice5 {

    // Ecrire une fonction qui teste si une valeur saisie est premier ou pas.
    public static boolean testNombrePremier(int nombre) {
        boolean test = true;
        int somme = 0;
        if (nombre == 1) {
            return test;
        }
        for (int i = 2; i < nombre; i++) {
                if (nombre % i == 0) {
                    test = false;
                    break;
                }
        }
        return test;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;
        boolean test;
        System.out.print("Donner un nombre pour tester s'il est premier ou pas : ");
        nombre = sc.nextInt();
        test = testNombrePremier(nombre);
        if (test) {
            System.out.println(nombre + " est bien un nombre premier.");
        }
        else {
            System.out.println(nombre + " n'est pas un nombre premier.");
        }
    }

}