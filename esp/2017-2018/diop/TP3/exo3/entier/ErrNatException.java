package entier;

public class ErrNatException extends Exception {

	public ErrNatException() {
		System.out.println("Le produit est trop grand pour un entier !");
	}

}