package hertpoly;

public class Entier implements Affichable {

	private int valeur;

	public Entier(int valeur) {
		this.setValeur(valeur);
	}

	public int getValeur() {
		return this.valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public void affiche() {
		System.out.println(this.getValeur());
	}
	
}