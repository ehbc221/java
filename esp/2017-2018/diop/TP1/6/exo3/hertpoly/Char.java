package hertpoly;

public class Char implements Affichable {

	private char valeur;

	public Char(char valeur) {
		this.setValeur(valeur);
	}

	public char getValeur() {
		return this.valeur;
	}

	public void setValeur(char valeur) {
		this.valeur = valeur;
	}

	public void affiche() {
		System.out.println(this.getValeur());
	}
	
}