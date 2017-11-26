package hertpoly;

public class Flottant implements Affichable {

	private float valeur;

	public Flottant(float valeur) {
		this.setValeur(valeur);
	}

	public float getValeur() {
		return this.valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	public void affiche() {
		System.out.println(this.getValeur());
	}
	
}