import java.util.Scanner;
/*
    @author: El Hadj Babacar Cissé
*/
public class Tri {

    /*
        Fonction principale (main) pour tester les différents algorithmes de tri

    */
    public static void main(String[] args) {
        /*
            Déclaration, initialisation et affichage du tableau initial
        */
        int tableauInitial[] = new int[20];
        int taille = 20;
        System.out.println("\nExercice : 6 algorithmes de tri.");
        System.out.println("NB : ces algorithmes trient les tableaux par ordre croissant (juste par convention, car aucune précision n'ayant été apportée à ce sujet).");
        /*
            Fonction pour trier un tableau avec la méthode de tri à bulles
        */
        tableauInitial = initialiserTableau();
        System.out.println("\n1) Tableau initial :");
        afficherTableau(tableauInitial, taille);
        triABulles(tableauInitial, taille);
        System.out.println("Tableau après le tri à bulles :");
        afficherTableau(tableauInitial, taille);
        /*
            Fonction pour trier un tableau avec la méthode de tri par insertion
        */
        tableauInitial = initialiserTableau();
        System.out.println("\n2) Tableau initial :");
        afficherTableau(tableauInitial, taille);
        triParInsertion(tableauInitial, taille);
        System.out.println("Tableau après le tri par insertion :");
        afficherTableau(tableauInitial, taille);
        /*
            Fonction pour trier un tableau avec la méthode de tri par sélection
        */
        tableauInitial = initialiserTableau();
        System.out.println("\n3) Tableau initial :");
        afficherTableau(tableauInitial, taille);
        triParSelection(tableauInitial, taille);
        System.out.println("Tableau après le tri par sélection :");
        afficherTableau(tableauInitial, taille);
        /*
            Fonction pour trier un tableau avec la méthode de tri fusion
        */
        tableauInitial = initialiserTableau();
        System.out.println("\n4) Tableau initial :");
        afficherTableau(tableauInitial, taille);
        triFusion(tableauInitial, 0, taille-1);
        System.out.println("Tableau après le tri fusion :");
        afficherTableau(tableauInitial, taille);
        /*
            Fonction pour trier un tableau avec la méthode de tri par comptage
        */
        tableauInitial = initialiserTableau();
        System.out.println("\n5) Tableau initial :");
        afficherTableau(tableauInitial, taille);
        triParComptage(tableauInitial, maxOf(tableauInitial));
        System.out.println("Tableau après le tri par comptage :");
        afficherTableau(tableauInitial, taille);
        /*
            Fonction pour trier un tableau avec la méthode de tri cocktail (variante du tri à bulles)
        */
        tableauInitial = initialiserTableau();
        System.out.println("\n6) Tableau initial :");
        afficherTableau(tableauInitial, taille);
        triCocktail(tableauInitial, taille);
        System.out.println("Tableau après le tri cocktail :");
        afficherTableau(tableauInitial, taille);
        System.out.println("");
    }

    /*
        Fonction pour initialiser notre tableau (valeurs prises aléatoirement pour tester les différents algorithmes de tri)

    */
    public static int[] initialiserTableau() {
        int tableauInitial[] = {9, 18, 4, 2, 0, 5, 18, 3, 19, 23, 0, 17, 18, 44, 12, 16, 7, 6, 11, 20};
        return tableauInitial;
    }

    /*
        Fonction pour trouver la valeur maximale d'un tableau

        - D'abord, on suppose que le premier élément est le maximum
        - Puis, on parcourt le tableau élément par élément
        - Ensuite on vérifie si l'élément courant est supérieur au maximum
            - Dans le cas échéant, cet élément devient le maximum
        - Enfin, on retourne le maximum
    */
    public static int maxOf(int tableau[]) {
        int taille = tableau.length, max = tableau[0];
        for (int i = 1; i < taille; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    /*
        Fonction pour afficher les éléments d'un tableau

        - D'abord, on parcourt le tableau
        - Puis on affiche chaque élément rencontré
    */
    public static void afficherTableau(int tableau[], int taille) {
        for (int i = 0; i < taille; i++) {
            System.out.print("\t" + tableau[i]);
        }
        System.out.println("");
    }

    /*
        Fonction pour trier un tableau avec la méthode de tri à bulles

        - D'abord, on parcours le tableau élément par élément (jusqu'à l'avant dernier)
        - Puis, pour chaque élément, on vérifie s'il est supérieur à son successeur
        - Ensuite, dans le cas écheant, on permute ces 2 éléments
        - Enfin, on répète ce processus jusqu'à ce qu'il n'y ait plus aucun élément à permuter (ainsi, le tableau est trié)
    */
    public static void triABulles (int tableau[], int taille) {
        boolean permutter;
        int tampon;
        do {
            permutter = false;
            for (int i = 0; i < taille - 1; i++) {
                if (tableau[i] > tableau[i+1]) {
                    tampon = tableau[i];
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = tampon;
                    permutter = true;
                }
            }
        } while (permutter);
    }

    /*
        Fonction pour trier un tableau avec la méthode de tri par insertion

        - D'abord, on parcourt le tableau élément par élément à partir du 2ème élément (s'il éxiste)
        - Puis, pour chaque élément, on le compare avec les éléments précédents
        - Ensuite, les éléments précédents sont décalés de la gauche vers la droite tant qu'ils sont supérieurs à l'élément sélectionné auparavant
        - Enfin, on place cet élément sélectionné dans la case en obtenue et on passe à la élément suivant (s'il éxiste)
    */
    public static void triParInsertion (int tableau[], int taille) {
        int compteur, element;
        for (int i = 1; i < taille; i++) {
            element = tableau[i];
            compteur = i - 1;
            while (compteur >= 0 && tableau[compteur] > element) {
                tableau[compteur+1] = tableau[compteur];
                compteur--;
            }
            tableau[compteur + 1] = element;
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

    /*
        Fonction pour trier un tableau avec la méthode de tri fusion

        L'algorithme est naturellement décrit de façon récursive.
        - Si le tableau n'a qu'un élément, il est déjà trié.
        - Sinon, on sépare le tableau en deux parties à peu près égales.
        - Ensuite, on trie récursivement les deux parties avec l'algorithme du tri fusion.
        - Enfin, on fusionne les deux tableaux triés en un tableau trié.
    */
    public static void triFusion (int tableau[], int debut, int fin)
    {
        int milieu;
        if(debut < fin) {
            milieu = (debut+fin) / 2;
            triFusion(tableau, debut, milieu);
            triFusion(tableau, milieu + 1, fin);
            fusionner (tableau, debut, milieu, fin);
        }
    }
    public static void fusionner (int tableau[], int debut, int milieu, int fin)
    {
        int tableauTemporaire[] = (int[]) tableau.clone(); 
        int i1 = debut, i2 = milieu + 1, i = debut;
        while (i1 <= milieu && i2 <= fin) {
            if(tableauTemporaire[i1] <= tableauTemporaire[i2]) {
                tableau[i] = tableauTemporaire[i1];
                i1++;
            }
            else {
                tableau[i] = tableauTemporaire[i2];
                i2++;
            }
            i++;
        }
        if (i <= fin) {
                while(i1 <= milieu) {
                tableau[i] = tableauTemporaire[i1];
                i1++;
                i++;
            }
            while(i2 <= fin) {
                tableau[i] = tableauTemporaire[i2];
                i2++;
                i++;
            }
        }
    }

    /*
        Fonction pour trier un tableau avec la méthode de tri par comptage

        - D'abord, on initialise le tableau de comptage avec une taille égale à la valeur maximale du tableau initial
        - Ensuite, on parcourt le tableau initial et pour chaque valeur, un incrémente le compteur correspondant dans le tableau de comptage
        - Enfin, le tableau étant trié, on parcourt le tableau de comptage et on met chaque valeur dans le tableau initial
    */
    public static void triParComptage(int tableau[], int borneSuperieure) {
        int tabComptage[] = new int[borneSuperieure + 1];
        int taille = tableau.length, x = 0;
        for (int i = 0; i < taille; i++) {
            tabComptage[tableau[i]]++;
        }
        for (int i = 0; i <= borneSuperieure; i++) {
            for (int j = 0; j < tabComptage[i]; j++) {
                tableau[x++] = i;
            }
        }
    }

    /*
        Fonction pour trier un tableau avec la méthode de tri cocktail (variante du tri à bulles)

        - D'abord, on initialise le début au premier élément et la fin à l'avant dernier
        - Puis, on boucle une première fois de "debut" à "fin" et on permute chaque élément avec son successeur s'il est supérieur à ce dernier
            - (ainsi, le plus grand élément se trouve à la fin du tableau et on décrémente "fin" c-a-d qu'on ne prend plus en compte cet élément car déjà trié)
        - Ensuite, on boucle une seconde fois de "fin" à "debut" et on permute chaque élément avec son predecesseur s'il est inférieur à ce dernier
            - (ainsi, le plus petit élément se trouve au début du tableau et on incrémente "debut" c-a-d qu'on ne prend plus en compte cet élément car déjà trié)
        - Enfin, on répète ces étapes tant qu'un tri a été éffectué
            - (ainsi, si aucun tri n'a été éffectué, celà veut dire que le tableau a été trié en entier)
    */
    public static void triCocktail(int tableau[], int taille) {
        boolean echanger = true;
        int tampon, debut = 0, fin = taille - 2;
        while (echanger == true) {
            echanger = false;
            for (int i = debut; i <= fin; i++) {
                if (tableau[i] > tableau[i+1]) {
                    tampon = tableau[i];
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = tampon;
                    echanger = true;
                }
            }
            fin -= 1;
            for (int i = fin; i >= debut; i--) {
                if (tableau[i] > tableau[i+1]) {
                    tampon = tableau[i];
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = tampon;
                    echanger = true;
                }
            }
            debut += 1;
        }
    }

}