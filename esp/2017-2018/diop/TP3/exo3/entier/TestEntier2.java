package entier;

public class TestEntier2 {

	public static void main(String[] args) throws ErrConstException, ErrSomException, ErrDiffException, ErrProdException {
		Entier e1 = new Entier(17);
		Entier e2 = new Entier(49);
		try {
			int e3 = Entier.somme(2147483647, 2147483647);
			int e4 = Entier.difference(2147483647, 2147483647);
			int e5 = Entier.produit(2147483647, 2147483647);
		}
		catch(ErrSomException e) {
			System.out.println("Erreur dans l'opération de somme !" + e);
		}
		catch(ErrDiffException e) {
			System.out.println("Erreur dans l'opération de différence !" + e);
		}
		catch(ErrProdException e) {
			System.out.println("Erreur dans l'opération de produit !" + e);
		}
	}
	
}