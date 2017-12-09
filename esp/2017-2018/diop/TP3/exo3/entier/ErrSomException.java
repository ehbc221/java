package entier;

public class ErrSomException extends Exception, ErrNatException {

	public ErrSomException() {
		System.out.println("La somme est trop grande pour un entier !");
	}

}