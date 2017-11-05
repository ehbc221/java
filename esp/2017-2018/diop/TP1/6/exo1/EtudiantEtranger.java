public class EtudiantEtranger extends Etudiant
{
    
    private String paysOrigine;
    
	public EtudiantEtranger()
	{
		super();
		Etudiant();
		this.paysOrigine="inconnu";
    }
    
	public String getPaysOrigine() {
		return paysOrigine;
	}
	public String getNom() {
		return Etudiant.getNom();
	}
	public String getPrenom() {
		return Etudiant.getPrenom();
	}
	public int getAge() {
		return Etudiant.getAge();
	}
	public String getNiveau() {
		return Etudiant.getNiveau();
	}
	public String getFiliere() {
		return Etudiant.getFiliere();
	}
	// Méthode pour imprimer sur la console l’identité d’un étudiant étranger
	public String affiche() {
		String filiere = getfiliere();
		String infosE = super.affiche + " " + filiere;
		return infosE;
	}
}
