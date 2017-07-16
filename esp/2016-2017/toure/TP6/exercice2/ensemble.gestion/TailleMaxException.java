package ensemble.gestion;

public class TailleMaxException extends Exception {
    public TailleMaxException(){
        super("la taille max d'un ensemble : inférieure à 100");
    }
}