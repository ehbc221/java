import java.util.Scanner;

/**
 * Exercice11
 */
public class Exercice11 {

    /*
        Ecrire un programme java qui permet de convertir un nombre entier positif d’une base à une autre.
        Pour la représentation interne, on pourra utiliser un tableau d’entiers pour représenter les coefficients. Le
        premier élément du tableau sera la base utilisée, et le dernier élément sera -1. Donc pour représenter le
        chiffre 43 (base 10) en binaire on aura dans le tableau (lecture de gauche à droite pour les bits de mot) :
                                                    T = [2,1,1,0,1,0,1,-1]
    */
    public static int[] convertirEnBase(int nombre, int base, int tableau[]) {
        int tableau_temporaire[] = new int[tableau.length];
        int compteur = 1;
        while (nombre / base > 0) {
            tableau[compteur] = nombre % base;
            compteur++;
            nombre /= base;
        }
        tableau[compteur] = nombre % base;
        return tableau;
    }

    // Fonction pour calculer la taille du tableau qui représentera notre chiffre binaire (taille normale plus 2 car base au début et -1 à la fin)
    public static int calculTailleTableau(int nombre, int base) {
        int compteur = 1;
        while (nombre / base > 0) {
            compteur++;
            nombre /= base;
        }
        compteur += 2;
        return compteur;
    }

    // Fonction pour afficher le tableau (final)
    public static void afficherTableau(int tableau[]) {
        int taille = tableau.length;
        System.out.print("T = [");
        for (int i = 0; i < taille - 1; i++) {
            System.out.print(tableau[i] + ",");
        }
        System.out.print(tableau[taille-1]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre = 0, base = 10, taille = 2;
        String saisie;
        boolean valide = true;
        // Control de saisie sur le nombre
        do {
            valide = true;
            System.out.print("Saisissez le nombre que vous voulez convertir : ");
            saisie = sc.nextLine();
            // On teste d'abord si c'est un entier qui a été saisi
            try {
                nombre = Integer.parseInt(saisie);
            } catch (NumberFormatException e) {
                valide = false;
            }
            // Si oui, on vérifie qu'il est bien positif(>0)
            if (valide) {
                valide = (nombre >= 0);
            }
        } while (valide == false);
        // Control de saisie sur la base
        do {
            valide = true;
            System.out.print("Saisissez la base : ");
            saisie = sc.nextLine();
            // On teste d'abord si c'est un entier qui a été saisi
            try {
                base = Integer.parseInt(saisie);
            } catch (NumberFormatException e) {
                valide = false;
            }
            // Si le nombre est bien un entier, on teste si c'est une base valide (2, 8 ou 16)
            if (valide) {
                valide = (base == 2 || base == 8 || base == 16);
            }
        } while (valide == false);
        taille = calculTailleTableau(nombre, base);
        int tableau[] = new int[taille];
        tableau[0] = base;
        tableau[taille-1] = -1;
        tableau = convertirEnBase(nombre, base, tableau);
        afficherTableau(tableau);
    }

}