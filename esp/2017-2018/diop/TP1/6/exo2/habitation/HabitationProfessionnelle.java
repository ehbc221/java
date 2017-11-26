package habitation;

public class HabitationProfessionnelle extends Habitation {

	private int nombreEmployes;

	public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int nombreEmployes) {
		super(proprietaire, adresse, surface);
		this.setNombreEmployes(nombreEmployes);
	}

	public int getNombreEmployes() {
		return this.nombreEmployes;
	}

	public void setNombreEmployes(int nombreEmployes) {
		this.nombreEmployes = nombreEmployes;
	}

	public double impot() {
		return ((2 * super.getSurface()) + (1000 * (this.getNombreEmployes() / 10)));
	}

	public void affiche() {
		super.affiche();
		System.out.println("Nombre d'Employés : " + this.getNombreEmployes());
	}

}