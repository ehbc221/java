import etudiant.*;

public class TestEtudiant {
	
	public static void main (String args []) throws IllegalAccessException, IllegalArgumentException {
		Classe L1maths = new Classe(2);
		L1maths.ajouterEtudiant(new Etudiant ("Sene", "Pierre", 12, "L1", "Maths"));
		L1maths.ajouterEtudiant(new EtudiantEtranger ("Tall", "Moussa", 20 , "L1", "Maths", "Mauritanie"));
		L1maths.afficherListe();
	}

}