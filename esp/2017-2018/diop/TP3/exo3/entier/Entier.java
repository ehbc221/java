package entier;

public class Entier {

	private int entier;
	private final int maxInt = 2147483647;

	public Entier(int entier) throws ErrConstException {
		if (entier < 0) {
			throw new ErrConstException();
		}
		else {
			this.setN(entier);
		}
	}

	public int getN() {
		return this.entier;
	}

	public void setN(int entier) {
		this.entier = entier;
	}

	public static int somme(int entier1, int entier2) throws ErrSomException {
		if (entier1 + entier2 > maxInt) {
			throw new ErrSomException(entier1 + entier2);
		}
		else {
			return entier1 + entier2;
		}
	}

	public static int difference(int entier1, int entier2) throws ErrDiffException {
		if (entier1 - entier2 > maxInt) {
			throw new ErrDiffException(entier1 - entier2);
		}
		else {
			return entier1 - entier2;
		}
	}

	public static int produit(int entier1, int entier2) throws ErrProdException {
		if (entier1 * entier2 > maxInt) {
			throw new ErrProdException(entier1 * entier2);
		}
		else {
			return entier1 * entier2;
		}
	}

}