import membre.*;

public class TestMembre {
	
	public static void main(String[] args) throws AgeIncorrecteException {
		try {
			Membre e1 = new Membre("Cissé", "El Hadj Babacar", 21);
			Membre e2 = new Membre("Gtiffey", "Pen", 23);
		} catch (AgeIncorrecteException e) {
			System.out.println("Impossible de créer ce membre.");
		}
	}

}