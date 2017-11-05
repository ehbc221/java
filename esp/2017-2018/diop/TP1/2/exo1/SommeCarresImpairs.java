public class SommeCarresImpairs {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Nombre de paramètres incorrect.");
        }
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Le paramètre saisi n'est pas un nombre.");
        }
        int nombre = 1, somme = 0;
        for (int i = 0; i < n; i++) {
            somme += nombre * nombre;
            nombre += 2;
        }
        System.out.println(somme);
    }
    
}