public class Occ {

    public static void main(String[] args) {
        int taille = args.length;
        boolean trouve = false;
        if (taille > 1) {
            for (int i = 1; i < taille; i++) {
                if (args[0].equals(args[i]))
                    trouve = true;
            }
        }
        if (trouve)
            System.out.println("Trouve");
        else
            System.out.println("Non trouve");
    }

}
