package entier;

public class ErrProdException extends Exception, ErrNatException {

	public ErrProdException() {
		System.out.println("Le produit est trop grand pour un entier !");
	}

}