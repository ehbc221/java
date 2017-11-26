import habitation.*;

public class TestHabitationIndividuelle {
	
	public static void main(String[] args) {
		HabitationIndividuelle hab = new HabitationIndividuelle("El Hadj Babacar Cissé", "Hann Mariste", 3000, 7, true);
		hab.affiche();
		System.out.println("Impot : " + hab.impot() + "F");
	}

}