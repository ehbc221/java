public class Tri {

    public static void bubble(int[] t) {
        int l = t.length, tampon;
        for (int i = 0; i < l-1; i++) {
            for (int j = 0; j < l-i-1; j++) {
                if (t[j] < t[j+1]) {
                    tampon = t[j];
                    t[j] = t[j+1];
                    t[j+1] = tampon;
                }
            }
        }
    }

    public static void afficherTableau(int[] t) {
        System.out.print("t = {");
        for (int i = 0, l = t.length; i < l; i++) {
            System.out.print(" " + t[i]);
        }
        System.out.println(" }");
    }

    public static void main(String[] args) {
        int[] t = {11, 8, 7, 2, 14};
        System.out.print("Avant tri : ");
        afficherTableau(t);
        bubble(t);
        System.out.print("Après tri : ");
        afficherTableau(t);
    }

}
