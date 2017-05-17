public class Exercice9 {

    /*
        Ecrire un programme java qui permet de convertir un nombre entier positif d’une base à une autre.
        Pour la représentation interne, on pourra utiliser un tableau d’entiers pour représenter les coefficients. Le
        premier élément du tableau sera la base utilisée, et le dernier élément sera -1. Donc pour représenter le
        chiffre 43 (base 10) en binaire on aura dans le tableau (lecture de gauche à droite pour les bits de mot) :
                                                    T = [2,1,1,0,1,0,1,-1]
    */

    // Constante pour définir l'ordre
    final static int ORDRE = 3;

    // Fonction pour calculer la somme d'une ligne
    public static int sommeLigne(int carre[][], int ligne) {
        int resultat = 0;
        for (int colonne = 0; colonne < ORDRE; colonne++) {
            resultat += carre[ligne][colonne];
        }
        return resultat;
    }

    // Fonction pour calculer la somme d'une colonne
    public static int sommeColonne(int carre[][], int colonne) {
        int resultat = 0;
        for (int ligne = 0; ligne < ORDRE; ligne++) {
            resultat += carre[ligne][colonne];
        }
        return resultat;
    }

    // Fonction pour calculer la somme d'une diagonale
    public static int sommeDiagonale1(int carre[][]) {
        int resultat = 0;
        for (int cellule = 0; cellule < ORDRE; cellule++) {
            resultat += carre[cellule][cellule];
        }
        return resultat;
    }

    // Fonction pour calculer la somme de l'autre diagonale (inverse)
    public static int sommeDiagonale2(int carre[][]) {
        int resultat = 0;
        for (int cellule = ORDRE - 1; cellule >= 0; cellule--) {
            resultat += carre[ORDRE - 1 - cellule][cellule];
        }
        return resultat;
    }

    // Fonction pour vérifier si un carré est magique ou non
    public static boolean estMagique(int carre[][]) {
        int sommeMagique = ORDRE * ( ORDRE * ORDRE + 1) / 2;
        boolean testLigne = true, testColonne = true, testDiagonales = false;
        for (int cellule = 0; cellule < ORDRE; cellule++) {
            if (sommeLigne(carre, cellule) != sommeMagique) {
                testLigne = false;
            }
            if (sommeColonne(carre, cellule) != sommeMagique) {
                testColonne = false;
            }
        }
        if ((sommeDiagonale1(carre) == sommeMagique) && (sommeDiagonale2(carre) == sommeMagique)) {
            testDiagonales = true;
        }
        return (testLigne && testColonne && testDiagonales);
    }

    // Fonction pour essayer de placer un numero passé en paramètre dans le carré magique
    public static void placer(int carre[][], int numero) {
        if (numero == ORDRE * ORDRE + 1) {
            if (estMagique(carre)) {
                afficherCarre(carre);
            }
        }
        else {
            for (int ligne = 0; ligne < ORDRE; ligne++) {
                for (int colonne = 0; colonne < ORDRE; colonne++) {
                    if (carre[ligne][colonne] == 0) {
                        carre[ligne][colonne] = numero;
                        placer(carre, numero + 1);
                        carre[ligne][colonne] = 0;
                    }
                }
            }
        }
    }

    public static void afficherCarre(int carre[][]) {
        System.out.println("\nCarre magique :");
		for (int ligne = 0; ligne < ORDRE; ligne++) {
			for (int colonne = 0; colonne < ORDRE; colonne++) {
				System.out.print(carre[ligne][colonne]);
                if (colonne != ORDRE - 1) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("\n");
                }
			}
		}
    }

    public static void main(String[] args) {
        int numero = 1, carre[][] = new int[ORDRE][ORDRE];
        for (int ligne = 0; ligne < ORDRE; ligne ++) {
            for (int colonne = 0; colonne < ORDRE; colonne ++) {
                carre[ligne][colonne] = 0;
            }
        }
        System.out.println("Voici tous les arrangements possibles du carre magique d'ordre 3 (matrice de 3x3) :");
        placer(carre, numero);
    }

}