import java.math.*;
/**
 * Exercice7
 */
public class Exercice7 {

    /*
        Soient S1 = {a 0 , a 1 , ... a n−1 } ; et S2 = {b 0 , b 1 , ... b n−1 }, deux séquences d’entier strictement croissantes.
        On vous demande de créer un programme qui détermine le nombre d’éléments communs à ces deux séquences.
        En d’autres termes on demande de calculer la cardinalité de l’ensemble S3 = S1 ⋂ S2.
    */
    public static int nombreElementsCommuns(int S1[], int S2[]) {
        int compteur = 0, taille1 = S1.length, taille2 = S2.length;
        for (int i = 0; i < taille1; i++) {
            for (int j = 0; j < taille2 && S1[i] >= S2[j]; j++) {
                if (S1[i] == S2[j]) {
                    compteur++;
                }
            }
        }
        return compteur;
    }

    // Fonction pour afficher une séquence (séparée par des tabulations)
    public static void afficherSequence(int sequence[]) {
        int taille = sequence.length;
        for (int i = 0; i < taille; i ++) {
            System.out.print("\t" + sequence[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int compteur = 0, S1[] = {1, 3, 4, 6, 18, 24}, S2[] = {1, 2, 4, 5, 8, 9, 10, 14, 19, 24, 35};
        System.out.println("Voici les deux séquences S1 et S2 :");
        System.out.print("S1 : ");
        afficherSequence(S1);
        System.out.print("S2 : ");
        afficherSequence(S2);
        compteur = nombreElementsCommuns(S1, S2);
        System.out.println("Le nombre d'éléments communs à ces deux séquences est : " + compteur + ".");
    }

}