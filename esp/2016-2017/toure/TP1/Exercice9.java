import java.lang.Math;

/**
 * Exercice9
 */
public class Exercice9 {

    public static void main(String[] args) {
        // {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
        int ordre = 3, ligne = 0, colonne = ordre / 2, sommeMagique = 0, valeurMax = (int)Math.sqrt((double)Integer.MAX_VALUE), carre[][] = new int[3][3];
        for (int n = 1; n <= (ordre * ordre); ordre++) {
            System.out.print(ligne + colonne);
            carre[ligne][colonne] = n;
            if (n % ordre == 0) {
                ligne++;
            }
            else {
                ligne = ((ligne == 0) ? ordre-1 : ligne-1);
                colonne = ((colonne == 0) ? ordre-1 : colonne-1);
            }
        }
        sommeMagique = ordre * ( ordre * ordre + 1) / 2;
        for (ligne = 0; ligne < ordre; ligne++) {
            for (colonne = 0; colonne < ordre; colonne++) {
                System.out.print(carre[ligne][colonne] + "\t");
            }
            System.out.println();
        }
    }

}