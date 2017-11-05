public class Palindrome {

    public static void afficherTableau(int numero, int[] tableau) {
        System.out.print("Tableau " + numero + " : {");
        for (int i = 0, taille = tableau.length; i < taille; i++) {
            System.out.print(" " + tableau[i]);
        }
        System.out.print(" } => ");
    }

    public static boolean tableauPalindrome(int[] tableau) {
        int taille = tableau.length;
        if (taille == 0)
            return true;
        if (taille == 1)
            return false;
        for (int i = 0; i < taille; i++) {
            if (tableau[i] != tableau[taille - i - 1])
                return false;
        }
        return true;
    }

    public static void afficherChaine(int numero, String chaine) {
        System.out.print("Chaine " + numero + " : { " + chaine + " } => ");
    }

    public static boolean chainePalindrome(String chaine) {
        int taille = chaine.length();
        if (taille == 0)
            return true;
        if (taille == 1)
            return false;
        for (int i = 0; i < taille; i++) {
            if (chaine.charAt(i) != chaine.charAt(taille - i - 1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tableau1 = {}, tableau2 = {1}, tableau3 = {1, 3}, tableau4 = {1, 0, 0, 1}, tableau5 = {1, 2, 0, 2, 1};
        String chaine1 = "", chaine2 = "B", chaine3 = "ca", chaine4 = "anna", chaine5 = "radar";
        //Tableaux
        afficherTableau(1, tableau1);
        if (tableauPalindrome(tableau1))
            System.out.println("True");
        else
        System.out.println("False");
        afficherTableau(2, tableau2);
        if (tableauPalindrome(tableau2))
            System.out.println("True");
        else
        System.out.println("False");
        afficherTableau(3, tableau3);
        if (tableauPalindrome(tableau3))
            System.out.println("True");
        else
        System.out.println("False");
        afficherTableau(4, tableau4);
        if (tableauPalindrome(tableau4))
            System.out.println("True");
        else
        System.out.println("False");
        afficherTableau(5, tableau5);
        if (tableauPalindrome(tableau5))
            System.out.println("True");
        else
        System.out.println("False");
        // chaines
        afficherChaine(1, chaine1);
        if (chainePalindrome(chaine1))
            System.out.println("True");
        else
        System.out.println("False");
        afficherChaine(2, chaine2);
        if (chainePalindrome(chaine2))
            System.out.println("True");
        else
        System.out.println("False");
        afficherChaine(3, chaine3);
        if (chainePalindrome(chaine3))
            System.out.println("True");
        else
        System.out.println("False");
        afficherChaine(4, chaine4);
        if (chainePalindrome(chaine4))
            System.out.println("True");
        else
        System.out.println("False");
        afficherChaine(5, chaine5);
        if (chainePalindrome(chaine5))
            System.out.println("True");
        else
        System.out.println("False");
    }

}