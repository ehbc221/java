import java.util.Scanner;
public class Exercice2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int v[] = {2, 3, 7, 6, 9, 11, 12, 15, 18, 17, 14, 13, 12, 7, 8, 7, 5, 3, 2, 1, 1, 0, 2, 8, 11, 13, 12, 11, 6, 3};
        int nb=v.length, H=025;
		System.out.println("Voici l'histogramme de v[] :\n");
        histog(v, nb);
        do {
		    System.out.print("\nDonnez la hauteur H : ");
		    H = sc.nextInt();
        } while (H <= 0);
		System.out.println("\nVoici l'histogramme de v[] en fonction de la hauteur H :\n");
        histog(v, nb, H);
    }
     public static void histog(int v[], int nb) {
        int max=v[0];
        for (int i = 1; i < nb; i++) {
            if (v[i] > max)  {
                max = v[i];
            }
        }
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < nb; j++) {
                if (i < (max - v[j])) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
         }
     }
     public static void histog(int v[], int nb, int H) {
        int max=v[0];
        for (int i = 1; i < nb; i++) {
            if (v[i] > max)  {
                max = v[i];
            }
        }
        for (int i = 0; i < nb; i++) {
            v[i] = v[i] * H / max;
        }
        for (int i = 0; i <= H; i++) {
            for (int j = 0; j < nb; j++) {
                if (i < (H - v[j])) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
         }
    }
}