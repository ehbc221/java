import java.util.Scanner;

public class Voyelles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaine = new String();
        System.out.print("Donnez un mot : ");
        chaine = sc.nextLine();
        if (chaine.indexOf(' ') >= 0 || chaine.indexOf('\t') >= 0)
            throw new ArrayIndexOutOfBoundsException("Vous avez saisi trop de chaines.");
        int taille = chaine.length();
        int a = 0, e = 0, i = 0, o = 0, u = 0, y = 0;
        for (int compteur = 0; compteur < taille; compteur++) {
            switch(chaine.charAt(compteur)) {
                case 'a':
                case 'A':
                    a++;
                    break;
                case 'e':
                case 'E':
                    e++;
                    break;
                case 'i':
                case 'I':
                    i++;
                    break;
                case 'o':
                case 'O':
                    o++;
                    break;
                case 'u':
                case 'U':
                    u++;
                    break;
                case 'y':
                case 'Y':
                    y++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Il comporte");
        System.out.println(a + " fois la lettre a");
        System.out.println(e + " fois la lettre e");
        System.out.println(i + " fois la lettre i");
        System.out.println(o + " fois la lettre o");
        System.out.println(u + " fois la lettre u");
        System.out.println(y + " fois la lettre y");
    }
    
}