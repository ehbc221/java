import etudiant.*;

public class TestNoteEtudiant {
	
	public static void main(String[] args) throws NoteEtudiantIncorrecteException {
		try {
			Etudiant e = new Etudiant("Cissé", "El Hadj Babacar", 21);
		} catch (NoteEtudiantIncorrecteException e) {
			System.out.println("La note de l'étudiant a été changée et mise à 0.");
		}
	}

}