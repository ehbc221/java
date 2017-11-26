package etudiant;

public class Classe
{

	static final int max = 50;

	static int maxEt;
	private Etudiant[] etudiants;
    static int nombreEt;

	public Classe (int nombreEtMax) throws IllegalAccessException {
		if (nombreEtMax <= Classe.max) {
			Classe.maxEt = nombreEtMax;
			this.etudiants = new Etudiant[nombreEtMax];
			Classe.nombreEt = 0;
		}
		else {
			throw new IllegalAccessException("La taille de la classe ne doit pas dépasser " + Classe.max);
		}
    }

	public void ajouterEtudiant(Etudiant e) throws IllegalAccessException, IllegalArgumentException {
		if (Classe.nombreEt >= maxEt) {
			throw new IllegalAccessException("Cette classe est déjè pleine.");
		}
		else {
			if (Classe.nombreEt == 0) {
				etudiants[0] = e;
				Classe.nombreEt++;
			}
			else {
				Etudiant premierEtudiant = etudiants[0];
				if (premierEtudiant.getNiveau().equals(e.getNiveau()) && premierEtudiant.getFiliere().equals(e.getFiliere())) {
					etudiants[Classe.nombreEt] = e;
					Classe.nombreEt++;
				}
				else {
					throw new IllegalArgumentException("Cet étudiant ne peut etre ajouté à cette classe(Pas le meme niveau et/ou la meme filière).");
				}
			}
		}
	}

	public void ajouterEtudiant(EtudiantEtranger e) throws IllegalAccessException, IllegalArgumentException {
		if (Classe.nombreEt >= maxEt) {
			throw new IllegalAccessException("Cette classe est déjè pleine.");
		}
		else {
			if (Classe.nombreEt == 0) {
				etudiants[0] = e;
				Classe.nombreEt++;
			}
			else {
				Etudiant premierEtudiant = etudiants[0];
				if (premierEtudiant.getNiveau().equals(e.getNiveau()) && premierEtudiant.getFiliere().equals(e.getFiliere())) {
					etudiants[Classe.nombreEt] = e;
					Classe.nombreEt++;
				}
				else {
					throw new IllegalArgumentException("Cet étudiant ne peut etre ajouté à cette classe(Pas le meme niveau et/ou la meme filière).");
				}
			}
		}
	}

	public void afficherListe() {
		for (int i=0; i < Classe.nombreEt; i++) {
			this.etudiants[i].affiche();
			System.out.println("");
		}
	}

}