import java.util.Scanner;
public class Exercice3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int v[] = {2, 3, 7, 6, 9, 11, 12, 15, 18, 17, 14, 13, 12, 7, 8, 7, 5, 3, 2, 1, 1, 0, 2, 8, 11, 13, 12, 11, 6, 3};
        int temporaire;
		System.out.println("Voici le tableau v[] :\n");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < v.length-1; i++) {
            temporaire = v[i];
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[i]) {
                    temporaire = v[i];
                    v[i] = v[j];
                    v[j] = temporaire;
                }
            }
        }
		System.out.println("\nVoici le nouveau tableau v[] trié par insertion séquentielle (croissant):\n");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < v.length-1; i++) {
            temporaire = v[i];
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] > v[i]) {
                    temporaire = v[i];
                    v[i] = v[j];
                    v[j] = temporaire;
                }
            }
        }
		System.out.println("\nVoici le nouveau tableau v[] trié par insertion séquentielle (décroissant):\n");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
}