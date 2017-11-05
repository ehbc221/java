import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Devin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inf = 0, sup = 100, nombreAleatoire = 0;
        String resultat = "non";
        do {
            nombreAleatoire = inf + (int)(Math.random() * ((sup - inf) + 1));
            do {
                System.out.print("Est-ce " + nombreAleatoire + " ? ");
                resultat = sc.nextLine();
                if (! (resultat.equals("plus") || resultat.equals("moins") || resultat.equals("oui")))
                    System.out.println("Votre réponse doit etre 'plus', 'moins' ou 'oui'");
            } while (! (resultat.equals("plus") || resultat.equals("moins") || resultat.equals("oui")));
            if (resultat.equals("plus")) {
                if (nombreAleatoire + 1 == sup) {
                    System.out.println("Impossible...");
                    break;
                }
                inf = nombreAleatoire;
            }
            else if(resultat.equals("moins")) {
                if (nombreAleatoire - 1 == inf) {
                    System.out.println("Impossible...");
                    break;
                }
                sup = nombreAleatoire;
            }
        } while (!resultat.equals("oui"));
    }

}
