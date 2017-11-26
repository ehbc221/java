package etudiant;

public class Etudiant
{

	private String nom;
	private String prenom;
	private int age;
	private String niveau;
	private String filiere;

	public Etudiant()
	{
		this.setNom("inconnu");
		this.setPrenom("inconnu");
		this.setAge(0);
		this.setNiveau("inconnu");
		this.setFiliere("inconnu");
	}

	public Etudiant(String nom, String prenom, int age, String niveau, String filiere)
	{
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
		this.setNiveau(niveau);
		this.setFiliere(filiere);
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public int getAge() {
		return this.age;
	}

	public String getNiveau() {
		return this.niveau;
	}

	public String getFiliere() {
		return this.filiere;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAge( int age) throws IllegalArgumentException {
		if (age > 0) {
			this.age = age;
		}
		else {
			throw new IllegalArgumentException("Impossible d'avoir une age négatif.");
		}
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public void affiche() {
		String infos = new String("\n");
		infos += "Prénom : " + this.getPrenom() + "\n";
		infos += "Nom : " + this.getNom() + "\n";
		infos += "Age : " + this.getAge() + "\n";
		infos += "niveau : " + this.getNiveau() + "\n";
		infos += "Filière : " + this.getFiliere();
		System.out.print(infos);
	}

}