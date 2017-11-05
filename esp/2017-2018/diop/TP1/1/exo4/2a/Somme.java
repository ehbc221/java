public class Somme {

    public static int somme(int[] tab) {
        int somme = 0;
        for (int i = 0, taille = tab.length; i < taille; i++)
            somme += tab[i];
        return somme;
    }
    
    public static int produit(int[] tab) {
        int produit = 1;
        for (int i = 0, taille = tab.length; i < taille; i++)
            produit *= tab[i];
        return produit;
    }
    
    public static int moyenne(int[] tab) {
        int somme = somme(tab), taille = tab.length, moyenne = somme / taille;
        return moyenne;
    }

}
