package hertpoly;

public class HertPoly {

	private Affichable[] tableau;
	static int nombreElements;

	public HertPoly(int taille) {
		this.tableau = new Affichable[taille + 1];
		HertPoly.nombreElements = 0;
	}

	public void ajoutValeur(Affichable a) {
		this.tableau[HertPoly.nombreElements] = a;
		HertPoly.nombreElements++;
	}

	public void affiche() {
		for (int i = 0; i < HertPoly.nombreElements; i++) {
			this.tableau[i].affiche();
		}
	}

}