import java.util.Scanner;

public class Chaine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chaine = new String();
        System.out.print("Saisissez votre chaine : ");
        chaine = sc.nextLine();
        if (chaine.indexOf(' ') >= 0 || chaine.indexOf('\t') >= 0)
            throw new ArrayIndexOutOfBoundsException("Vous avez saisi trop de chaines.");
        int taille = chaine.length();
        System.out.print("Un caractère sur deux : ");
        for (int i = 0; i < taille; i += 2)
            System.out.print(chaine.charAt(i));
        System.out.println(".");
        System.out.println("Le premier caractère : " + chaine.charAt(0) + " et le dernier caractère : " + chaine.charAt(taille-1) + ".");
    }
    
}