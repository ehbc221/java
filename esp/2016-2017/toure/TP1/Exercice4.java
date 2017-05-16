import java.util.Scanner;

/**
 * Exercice4
 */
public class Exercice4 {

    // On souhaite écrire une fonction de calcul des n premiers nombres parfaits. Un nombre est dit parfait s’il est égal à la somme de ses diviseurs, 1 compris.
    public static boolean testNombreParfait(int nombre) {
        boolean test = false;
        int somme = 0;
        if (nombre ==  0 || nombre == 1) {
            return true;
        }
        for (int i = 1; i < nombre; i++) {
                somme += (nombre % i == 0) ? i : 0;
        }
        return test = (nombre == somme) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;
        boolean test;
        System.out.print("Donner un nombre pour tester si c'est un nombre parfait ou non : ");
        nombre = sc.nextInt();
        test = testNombreParfait(nombre);
        if (test) {
            System.out.println(nombre + " est bien un nombre parfait.");
        }
        else {
            System.out.println(nombre + " n'est pas un nombre parfait.");
        }
    }

}