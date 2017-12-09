package membre;

public class Membre
{

	private String nom;
	private String prenom;
	private int age;

	public Membre(String nom, String prenom, int age) throws AgeIncorrecteException {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setAge(age);
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

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setAge(int age) throws AgeIncorrecteException {
		if (age < 18 || age > 22) {
			throw new AgeIncorrecteException();
		}
		else {
			this.age = age;
		}
	}

	public void affiche() {
		System.out.println("Membre : " + this.getPrenom() + " " + this.getNom() + ", Age : " + this.getAge());
	}

}