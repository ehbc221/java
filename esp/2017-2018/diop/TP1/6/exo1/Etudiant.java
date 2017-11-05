public class Etudiant
{
    
	private String nom;
	private String prenom;
	private int age;
	private String niveau;
    private String filiere;
    
	public Etudiant()
	{
		nom = "inconnu";
		prenom = "inconnu";
		age = 0;
		niveau = "inconnu";
		filiere = "inconnu";
    }
    
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getAge() {
		return age;
	}
	public String getNiveau() {
		return niveau;
	}
	public String getFiliere() {
		return filiere;
	}
	// Méthode pour imprimer sur la console l’identité d’un étudiant
	public String affiche()
	{
		String infos = prenom + " " + nom + " " + age + " " + niveau + " " + filiere;
		return infos;
	}
}
