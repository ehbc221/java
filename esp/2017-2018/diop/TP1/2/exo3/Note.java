import java.util.*;

public class Note {

    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int nombre = 0;
        do {
            try {
                System.out.print("Donnez le nombre de notes : ");
                nombre = sc.nextInt();
            } catch (Exception e) {
                throw new InputMismatchException("Vous n'avez pas saisi un nombre.");
            }
        } while (nombre <= 0);
        int [] notes = new int[nombre];
        for (int i = 0, j = 1; i < nombre; i++, j++) {
            do {
                try {
                    System.out.print("Donnez la note numero " + j + " : ");
                    notes[i] = sc.nextInt();
                } catch (Exception e) {
                    throw new InputMismatchException("Vous n'avez pas saisi un nombre.");
                }
                if (notes[i] < 0 || notes[i] > 20)
                    System.out.print("Veuillez saisir une note valide svp (comprise entre 0 et 20) : ");
            } while (notes[i] < 0 || notes[i] > 20);
        }
        int meilleur = 0, mauvaise = 20, somme = 0, moyenne = 0;
        for (int i = 0; i < nombre; i++) {
            if (notes[i] > meilleur)
                meilleur = notes[i];
            if (notes[i] < mauvaise)
                mauvaise = notes[i];
            somme += notes[i];
        }
        moyenne = somme / nombre;
        System.out.println("Meilleur note : " + meilleur);
        System.out.println("Plus mauvaise note : " + mauvaise);
        System.out.println("Moyenne de toutes les notes : " + moyenne);
    }

}
