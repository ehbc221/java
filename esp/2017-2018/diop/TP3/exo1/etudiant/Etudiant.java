package etudiant;

public class Etudiant
{

	private String nom;
	private String prenom;
	private int note;

	public Etudiant() throws NoteEtudiantIncorrecteException
	{
		this.setNom("inconnu");
		this.setPrenom("inconnu");
		this.setNote(note);
	}

	public Etudiant(String nom, String prenom, int note) throws NoteEtudiantIncorrecteException {
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setNote(note);
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public int getNote() {
		return this.note;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNote(int note) throws NoteEtudiantIncorrecteException {
		if (note < 0 || note > 20) {
			throw new NoteEtudiantIncorrecteException();
		}
		else {
			this.note = note;
		}
	}

	public void affiche() {
		System.out.println("Etudiant : " + this.getPrenom() + " " + this.getNom() + ", Note : " + this.getNote());
	}

}