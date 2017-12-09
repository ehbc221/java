package etudiant;

public class NoteEtudiantIncorrecteException extends Exception {

	public NoteEtudiantIncorrecteException() {
		System.out.println("Vous essayez d'ajouter une note invalide !");
	}

}