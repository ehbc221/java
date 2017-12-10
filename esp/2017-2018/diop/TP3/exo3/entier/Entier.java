package entier;

public class Entier {

	private int entier;

	public Entier(int entier) throws ErrConstException {
		if (entier < 0) {
			throw new ErrConstException("Entier négatif !");
		}
		else {
			this.entier = entier;
		}
	}

	public int getN() {
		return this.entier;
	}

	public static int somme(int entier1, int entier2) throws ErrSomException {
		System.out.println("" + entier1 + " et " + entier2);
		if ((entier1 + entier2) > 2147483647 || (entier1 + entier2) < 0) {
			throw new ErrSomException("Addition Impossible !");
		}
		else {
			System.out.println("-----");
			return (entier1 + entier2);
		}
	}

	public static int difference(int entier1, int entier2) throws ErrDiffException {
		if ((entier1 - entier2) > 2147483647 || (entier1 - entier2) < 0) {
			throw new ErrDiffException("Soustraction Impossible !");
		}
		else {
			return (entier1 - entier2);
		}
	}

	public static int produit(int entier1, int entier2) throws ErrProdException {
		if ((entier1 * entier2) > 2147483647 || (entier1 * entier2) < 0) {
			throw new ErrProdException("Multiplication Impossible !");
		}
		else {
			return (entier1 * entier2);
		}
	}

}
