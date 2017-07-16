package ensemble.gestion;

public class OrdreException extends Exception {
    public OrdreException(){
        super("l'ensemble doit être ordonné : un élément dérange l'ordre");
    }
}