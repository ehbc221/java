public class Calc {

    public static void main(String[] args) throws ArithmeticException, IllegalArgumentException, NumberFormatException, UnsupportedOperationException {
        if (args.length != 3) {
            throw new IllegalArgumentException("Nombre de paramètres incorrect.");
        }
        int nombre1 = 0, nombre2 = 0;
        try {
            nombre1 = Integer.parseInt(args[0]);
            nombre2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Veuillez saisir des nombres corrects.");
        }
        int resultat = 0;
        switch (args[1]) {
            case "+":
                resultat = nombre1 + nombre2;
                break;
            case "-":
                resultat = nombre1 - nombre2;
                break;
            case "x":
                resultat = nombre1 * nombre2;
                break;
            case "/":
                if (nombre2 == 0)
                    throw new ArithmeticException("Impossible de diviser un nombre par 0.");
                resultat = nombre1 / nombre2;
                break;
            default:
                throw new UnsupportedOperationException("L'opérateur est invalide.");
        }
        System.out.println(resultat);
    }
    
}
