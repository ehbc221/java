package entier;

public class ErrDiffException extends Exception, ErrNatException {

	public ErrDiffException() {
		System.out.println("La différence est trop grande pour un entier !");
	}

}