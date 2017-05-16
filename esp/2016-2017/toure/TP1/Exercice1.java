/**
 * Exercice1
 */
public class Exercice1 {

    // Ecrire, et tester dans une méthode Main, une fonction max qui calcule et renvoie le maximum de deux entiers.
    static int max(int x, int y ) {
        return (x > y) ? x : y;
    }

    // Ecrire et tester dans une méthode Main une fonction max qui calcule et renvoie le maximum de trois entiers.
    static int max(int x, int y , int z) {
        if (x >= y && x >= z) {
            return x;
        }
        else if (y >= x && y >= z) {
            return y;
        }
        else if (z >= x && z >= y) {
            return z;
        }
        return x;
    }

    // Ecrire et tester dans une méthode Main une fonction max et une fonction min qui calculent et renvoient respectivement le maximum de quatre entiers et le minimum de ces quatre entiers.

    static int max(int x1, int x2, int x3, int x4) {
        if (x1 >= x2 && x1 >= x3 && x1 >= x4) {
            return x1;
        }
        else if (x2 >= x1 && x2 >= x3 && x2 >= x4) {
            return x2;
        }
        else if (x3 >= x1 && x3 >= x2 && x3 >= x4) {
            return x3;
        }
        else if (x4 >= x1 && x4 >= x2 && x4 >= x3) {
            return x4;
        }
        return x1;
    }

    static int min(int x1, int x2, int x3, int x4) {
        if (x1 <= x2 && x1 <= x3 && x1 <= x4) {
            return x1;
        }
        else if (x2 <= x1 && x2 <= x3 && x2 <= x4) {
            return x2;
        }
        else if (x3 <= x1 && x3 <= x2 && x3 <= x4) {
            return x3;
        }
        else if (x4 <= x1 && x4 <= x2 && x4 <= x3) {
            return x4;
        }
        return x1;
    }

    public static void main(String[] args) {
        int nombre1 = 2, nombre2 = 5, nombre3 = 19, nombre4 = 0, maximum = 0, minimum = 0;
        maximum = max(nombre1, nombre2);
        System.out.println("Le maximum entre " + nombre1 + " et " + nombre2 + " est " + maximum + ".");
        maximum = max(nombre1, nombre2, nombre3);
        System.out.println("Le maximum entre " + nombre1 + ", " + nombre2 + " et " + nombre3 + " est " + maximum + ".");
        maximum = max(nombre1, nombre2, nombre3, nombre4);
        System.out.println("Le maximum entre " + nombre1 + ", " + nombre2 + ", " + nombre3 + " et " + nombre4 + " est " + maximum + ".");
        minimum = min(nombre1, nombre2, nombre3, nombre4);
        System.out.println("Le minimum entre " + nombre1 + ", " + nombre2 + ", " + nombre3 + " et " + nombre4 + " est " + minimum + ".");
    }

}