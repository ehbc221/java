package entier;

public class ErrNatException extends Exception {

	public ErrNatException(String message) {
		super(message);
	}

}

class ErrSomException extends ErrNatException {
	public ErrSomException(String message) {
		super(message);
	}
}

class ErrDiffException extends ErrNatException {
	public ErrDiffException(String message) {
		super(message);
	}
}

class ErrProdException extends ErrNatException {
	public ErrProdException(String message) {
		super(message);
	}
}

class ErrConstException extends ErrNatException {
	public ErrConstException(String message) {
		super(message);
	}
}
