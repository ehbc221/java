package entier;

public class TestEntier1 {

	public static void main(String[] args) throws ErrNatException {
		Entier e1 = new Entier(37);
		Entier e2 = new Entier(72);
		try {
			int e3 = Entier.somme(2147483647, 2147483647);
		}
		catch(ErrNatException e) {
			System.out.println("Erreur dans l'opération sur les entier !" + e);
		}
	}
	
}