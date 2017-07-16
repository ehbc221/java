package ensemble.gestion;

public class TailleEnsUnionException extends Exception {
    public TailleEnsUnionException(){
        super("la tailleMax d'un ensemble : inférieure à 100");
    }
}