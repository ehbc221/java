public class Somme {

    public static void main(String[] args) throws IllegalArgumentException, NumberFormatException {
        if (args.length != 2) {
            throw new IllegalArgumentException("Nombre de paramètres incorrect.");
        }
        int nombre1 = 0, nombre2 = 0;
        try {
            nombre1 = Integer.parseInt(args[0]);
            nombre2 = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Veuillez saisir des nombres corrects.");
        }
        int resultat = nombre1 + nombre2;
        System.out.println(nombre1 + " + " + nombre2 + " = " + resultat);
    }
    
}
