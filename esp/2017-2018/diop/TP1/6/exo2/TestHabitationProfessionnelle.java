import habitation.*;

public class TestHabitationProfessionnelle {
	
	public static void main(String[] args) {
		HabitationProfessionnelle hab = new HabitationProfessionnelle("El Hadj Babacar Cissé", "Hann Mariste", 3000, 200);
		hab.affiche();
		System.out.println("Impot : " + hab.impot() + "F");
	}

}