package habitation;

public class HabitationIndividuelle extends Habitation {

	private int nbPieces;
	private boolean piscine;

	public HabitationIndividuelle(String proprietaire, String adresse, double surface, int nbPieces, boolean piscine) {
		super(proprietaire, adresse, surface);
		this.setNbPieces(nbPieces);
		this.setPiscine(piscine);
	}

	public int getNbPieces() {
		return this.nbPieces;
	}

	public boolean getPiscine() {
		return this.piscine;
	}

	public void setNbPieces(int nbPieces) {
		this.nbPieces = nbPieces;
	}

	public void setPiscine(boolean piscine) {
		this.piscine = piscine;
	}

	public double impot() {
		if (this.getPiscine()) {
			return ((100 * this.getNbPieces()) + 500);
		}
		else {
			return (100 * this.getNbPieces());
		}
	}

	public void affiche() {
		super.affiche();
		System.out.println("Nombre de Pièces : " + this.getNbPieces() + "\nExistence d'une piscine : " + ((this.getPiscine()) ? "Oui" : "Non"));
	}

}