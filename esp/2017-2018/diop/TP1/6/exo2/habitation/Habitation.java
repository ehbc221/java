package habitation;

public class Habitation {

	private String nomProprietaire;
	private String adresseHabitation;
	private double surface;

	public Habitation(String proprietaire, String adresse, double surface) {
		this.setNomProprietaire(proprietaire);
		this.setAdresseHabitation(adresse);
		this.setSurface(surface);
	}

	public String getNomProprietaire() {
		return this.nomProprietaire;
	}

	public String getAdresseHabitation() {
		return this.adresseHabitation;
	}

	public double getSurface() {
		return this.surface;
	}

	public void setNomProprietaire(String nomProprietaire) {
		this.nomProprietaire = nomProprietaire;
	}

	public void setAdresseHabitation(String adresseHabitation) {
		this.adresseHabitation = adresseHabitation;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public double impot() {
		return (2 * this.getSurface());
	}

	public void affiche() {
		System.out.println("Nom du Proprietaire : " + this.getNomProprietaire() + "\nAdresse de l'Habitation : " + this.getAdresseHabitation() + "\nSurface de l'habitation : " + this.getSurface());
	}

}