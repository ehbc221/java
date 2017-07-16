package ensemble.gestion;

public class EntierOrd {
    // Les attributs
    private int taille;
    private int [] ensemble = new int [100];

    // Constructeur
    public EntierOrd(int taille, int []tab) throws TailleMaxException{
        this.taille = tab.length;
        if (taille > 100) {
            throw new TailleMaxException();
        }
        for (int i = 0; i < tab.length; i++) {
            this.ensemble[i] = tab[i];
        }
    }

    /*
        Fonction pour trier un tableau avec la méthode de tri par sélection

        - D'abord, on parcourt le tableau élément par élément (jusqu'à l'avant dernier)
        - Puis, pour chaque élément, on cherche si dans le reste du tableau on a un élément plus petit que lui
            - Dans le cas écheant, on enregistre sa position
            - Et après avoir parcouru le reste du tableau, on permute ces 2 éléments
        - Enfin, on passe à l'élément suivant (s'il éxiste)
    */
    public static void triParSelection (int tableau[], int taille) {
        int minimum, tampon;
        for (int i = 0; i < tableau.length - 1; i++) {
            minimum = i;
            for (int j = i+1; j < tableau.length; j++) {
                if (tableau[j] < tableau[minimum]) {
                    minimum = j;
                }
            }
            if (minimum != 0) {
                tampon = tableau[i];
                tableau[i] = tableau[minimum];
                tableau[minimum] = tampon;
            }
        }
    }

    // Les autres méthodes
    public void insertion (int x) throws TailleMaxException{
        if (this.taille == 100) {
            throw new TailleMaxException();
        }
        this.ensemble[this.taille] = x;
        this.taille++;
    }
    public void suppression(int x) {
        for (int i = 0; i < this.taille; i++) {
            if (this.ensemble == x) {
                for (j == i; j <= this.taille; j++) {
                    this.ensemble[j-1] = this.ensemble[j];
                }
                this.taille--;
            }
        }
    }
    public boolean appartient(int x) {
        for (int i = 0; i < this.taille; i++) {
            if (this.ensemble == x) {
                return true;
            }
        }
        return false;
    }
    public EntierOrd unionEnsemble(EntierOrd e) throws TailleMaxException, TailleEnsUnionException{
        if ((this.taille + e.taille) > 100) {
            throw new TailleEnsUnionException();
        }
        int taille = this.taille + e.taille;
        int [] tab = new int [taille];
        for (int i = 0; i < this.taille; i++) {
            tab[i] = this.ensemble[i];
        }
        for (int i = 0, j = this.taille; i < e.taille; i++) {
            tab[j] = e.ensemble[i];
            j++;
        }
        triParSelection(tab, taille);
        EntierOrd union = new EntierOrd(taille, tab);
    }
    public EntierOrd intersectionEnsemble(EntierOrd e){
        int taille = 0;
        int [] tab = new int [taille];
        for (int i = 0; i < this.taille; i++) {
            tab[i] = this.ensemble[i];
        }
        for (int i = 0, j = this.taille; i < e.taille; i++) {
            tab[j] = e.ensemble[i];
            j++;
        }
        triParSelection(tab, taille);
        EntierOrd union = new EntierOrd(taille, tab);
    }
    public String toString(){
        String chaine = new String();
        for (int i = 0; i < this.taille; i++) {
            chaine += this.element[i];
        }
    }
}