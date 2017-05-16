/**
 * Exercice2
 */
public class Exercice2 {

    // Constante MAX pour définir la taille maximum des tableau contenant les diviseurs pour le PPCM et le PGCD
    static int MAX = 20;

    // Ecrire et tester dans une méthode Main une fonction pgcd qui calcule et renvoie le PGCD de deux entiers.
    static long pgcd(long m, long n) {
        long x = 0, y = 0;
        if (m > n) {
            x = m;
            m = n;
            n = x;
        }
        do {
            y = m % n;
            m = n;
            n = y;
        } while (y != 0);
        return m;
    }

    // Ecrire et tester dans une méthode Main une fonction ppcm qui calcule et renvoie le PPCM de deux entiers.
    static long ppcm(long m, long n) {
        long x = m, y = n;
        while (m != n) {
            if (m > n) {
                n += y;
            } else if (m < n) {
                m += x;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        long nombre1 = 54, nombre2 = 18, resultat = 0;
        resultat = ppcm(nombre1, nombre2);
        System.out.println("PPCM " + nombre1 + " et " + nombre2 + " = " + resultat + ".");
        resultat = pgcd(nombre1, nombre2);
        System.out.println("PGCD " + nombre1 + " et " + nombre2 + " = " + resultat + ".");
    }

}