public class Somme {

    public static int somme(int[] tab) {
        int somme = 0;
        for (int i = 0, taille = tab.length + 1; i < taille; i++)
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

    public static void main(String[] args) {
        int[] tableau = {1, 23, 12, -4, 6, 89, 2};
        int somme, produit, moyenne;
        System.out.println("Le tableau : {1, 23, 12, -4, 6, 89, 2}");
        somme = somme(tableau);
        System.out.println("La somme du tableau donne: " + somme);
        produit = produit(tableau);
        System.out.println("Le produit du tableau donne: " + produit);
        moyenne = moyenne(tableau);
        System.out.println("La moyenne du tableau donne: " + moyenne);

    }

}
